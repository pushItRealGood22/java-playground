package com.galvanize;

public class SomeProgram {
    public static void main(String[] args) {
        if (args.length < 1){
            System.out.println("Please provide an argument");
        } else {
            System.out.println("Argument provided is", args[0]);
        }
       // String firstArgument = args[0];   // arg1
      //  String secondArgument = args[1];  // arg2
    }
}