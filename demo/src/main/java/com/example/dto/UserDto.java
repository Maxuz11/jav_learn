package com.example.dto;

public class UserDto {
    public Number id;
    public String name;
    public String lastname;

    public UserDto(Number id, String lastname, String name) {
        this.id = id;
        this.lastname = lastname;
        this.name = name;
    }

    public Number getId() {
        return id;
    }
    public void setId(Number id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
}
