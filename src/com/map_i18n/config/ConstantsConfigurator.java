package com.map_i18n.config;

import java.util.Locale;

public class ConstantsConfigurator {
    public static void configure(){
        PropertiesConstants.init("en",ConstantsMode.JAVA_PROPERTIES);
    }
    public static void configure(String locale){
        PropertiesConstants.init(locale,ConstantsMode.JAVA_PROPERTIES);
    }
    public static void configure(String locale, String mode){
        PropertiesConstants.init(locale,ConstantsMode.valueOf(mode.toUpperCase()));
    }
}
