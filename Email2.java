//package Regex;

//package com.oops;

import java.util.*;
//import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Email2 {

    public static void main(String[] args){
    	final Scanner s=new Scanner(System.in);
        System.out.println("Welcome to Email problem");
       
        while (true) {


        	String x= "^[a-zA-Z]+[.+-_]{0,1}[a-zA-Z0-9]*@[a-zA-Z]+.[(com)|(co)]+";
            Pattern pattern = Pattern.compile(x);
            //Scanner s2=new Scanner(System.in);
            String y=s.next();

            Matcher matcher =  pattern.matcher(y);

            boolean found = false;
            while (matcher.find()) {
                System.out.println("Valid email");
                found = true;
            }
            if(!found){
                System.out.println("Invalid Email");
            }
        }
    }
}
