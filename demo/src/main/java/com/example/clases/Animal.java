package com.example.clases;

import com.example.interfaces.IAnimal;

public class Animal implements IAnimal{

    private String specie;
    private boolean isFur;
    
    public Animal(String specie, boolean isFur) {
        this.specie = specie;
        this.isFur = isFur;
    }

    public String getspecie() {
        return specie;
    }

    public void setspecie(String specie) {
        this.specie = specie;
    }

    public boolean isFur() {
        return isFur;
    }

    public void setFur(boolean isFur) {
        this.isFur = isFur;
    }

    public void fur(boolean isFur){
        if(isFur){
            System.out.println("Tiene Pelo");
        }
    }

    @Override
    public boolean isAnimal() {
        return true;
    }

    @Override
    public void emitirSonido() {
        System.out.println("Emite sonido");
    }
}
