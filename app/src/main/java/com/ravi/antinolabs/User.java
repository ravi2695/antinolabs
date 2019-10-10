package com.ravi.antinolabs;

public class User {
    private int id;
    private String name;
    private int age;
    private String location;
    private int image;

    public User() {
    }

    public User(int id, String name, int age, String location, int image) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.location = location;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public int getImage() {
        return image;
    }
}