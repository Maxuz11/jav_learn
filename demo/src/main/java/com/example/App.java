package com.example;

import com.example.clases.Trabajador;

public class App 
{
    public static void main( String[] args )
    {  
       Trabajador a = new Trabajador("max andres", "j j", "1423-9", "12121", 22);
        Integer b = a.descomponerRun();
        System.out.println(b);
        System.out.println(a.toString());
    }
}
