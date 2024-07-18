package com.example.clases;

public class Dog extends Animal {

    private String name;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Dog(String specie, boolean isFur, String name) {
        super(specie, isFur);
        this.name = name;
    }


    @Override
    public String toString() {
        return "[name=" + name + ", specie: " + getspecie() + ", has fur: "
                + isFur() + ", is Animal: " + isAnimal()+ "]";
    }

}
