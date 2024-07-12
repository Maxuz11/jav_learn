package com.example.clases;

import com.example.IData;


/**
 * herencia se usa Extends and super
 * interface use implements for use the move data
 */
public class User extends Persona implements IData{
    private Integer id;

    public User(String name, String lastname, String rut, Integer id) {
        super(name, lastname, rut);
        this.id = id;
    }

    @Override
    public void mostrarData(){
        System.out.println("hola");
    }


    @Override
    public String toString(){
        return "Usuario: "+super.toString();
    }
 
}
