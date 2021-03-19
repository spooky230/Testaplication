package com.lesson.eq_hash;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class ClientFullEquals implements Cloneable{
    private static long idCounter = 0;
    private long id;
    private String name;
    private String country;
    private List<String> purchases;

    private ClientFullEquals() {
    }

    public ClientFullEquals(String name, String country) {
        this.name = name;
        this.country = country;
        idCounter++;
        this.id = idCounter;
        this.purchases = new LinkedList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientFullEquals that = (ClientFullEquals) o;
        return id == that.id && name.equals(that.name)
                && country.equals(that.country)
                && Objects.equals(purchases, that.purchases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, country, purchases);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<String> purchases) {
        this.purchases = purchases;
    }
    @Override
    public ClientFullEquals clone() throws CloneNotSupportedException {
        ClientFullEquals client = new ClientFullEquals();
        client.name = name;
        client.country = country;
        client.id = idCounter;
        client.purchases = new LinkedList<>(purchases);
        return client;
    }
}
