package com.example;

import com.example.clases.Dog;

public class App 
{
    public static void main( String[] args )
    {  
        Dog rufu = new Dog("Canin", true, "rufus");
        System.out.println(rufu.toString());
    }
}
