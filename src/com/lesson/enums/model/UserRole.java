package com.lesson.enums.model;

import java.util.EnumSet;
import java.util.Set;

public enum UserRole {
    BANNED(
            EnumSet.of(RolePermissions.WRITE_TO_SUPPORT)),
    ADMIN(
            EnumSet.of(
                    RolePermissions.CREATE_USERS,
                    RolePermissions.DELETE_USERS,
                    RolePermissions.MODIFY_USER_ROLES)),
    MODERATOR(
            EnumSet.of(
                    RolePermissions.DELETE_ANY_COMMENTS,
                    RolePermissions.DELETE_ARTICLES,
                    RolePermissions.BAN_USERS,
                    RolePermissions.UNBAN_USERS)),
    SUPPORT(null),
    USER(
            EnumSet.of(
                    RolePermissions.CREATE_ARTICLES,
                    RolePermissions.UPDATE_ARTICLES,
                    RolePermissions.LEAVE_COMMENTS,
                    RolePermissions.DELETE_OWN_COMMENTS
            ));

    private final Set<RolePermissions> permissions;

    UserRole(Set<RolePermissions> permissions) {
        this.permissions = permissions;
    }

    public Set<RolePermissions> getPermissions() {
        return permissions;
    }

}
