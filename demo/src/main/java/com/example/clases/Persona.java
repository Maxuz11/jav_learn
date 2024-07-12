package com.example.clases;

public class Persona {
    private String name;
    private String lastname;
    private String rut;

    public Persona(String name, String lastname, String rut) {
        this.name = name;
        this.lastname = lastname;
        this.rut = rut;
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
    public String getRut() {
        return rut;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }


    @Override
    public String toString(){
        return name+" "+lastname+" - "+rut;
    }
    
}
