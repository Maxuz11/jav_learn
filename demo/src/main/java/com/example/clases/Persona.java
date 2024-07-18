package com.example.clases;

public class Persona {
    private String name;
    private String lastname;
    private String rut;
    private int ctaCard;

    public Persona(String name, String lastname, String rut,int ctaCard) {
        this.name = name;
        this.lastname = lastname;
        this.rut = rut;
        this.ctaCard = ctaCard;
    }

    public int getCtaCard() {
        return ctaCard;
    }

    public void setCtaCard(int ctaCard) {
        this.ctaCard = ctaCard;
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
