package org.example;

public class demo {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "org.example.demo{" +
                "name='" + name + '\'' +
                '}';
    }
}
