package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.dto.UserDto;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Map<String, Object> ejem =  insertUser("soy lo Max-imo");
        System.out.println(ejem);         
        
    }

    //UserDto user
    public static  Map<String, Object>  insertUser(String msg){
        Map<String, Object> body = new HashMap<>();
        UserDto a = new UserDto(1, "aaa", "bbb");
        ArrayList<String> c = new ArrayList<>();
        c.add("name: "+ a.getLastname());
        c.add("lastname: "+a.getName());
        c.add("id: "+a.getId());
        body.put("data", c);
        body.put("msg", msg);

        return body;
    }
}
