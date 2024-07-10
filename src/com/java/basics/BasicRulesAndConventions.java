package com.java.basics;//R1 package declaration is must
//R1.1 : Atleast try to have one  class name should  matching the File name


//R2 class > fn/methods/blocks
// C1: class names should be in PascalCase
public class BasicRulesAndConventions {//R3keywords: they are reserved words


    // C2: the fn name and the varibale names should be in camelCase
    public static void main(String[] args) {//body or block
        int valueOfDozen = 12;
        // int class = 54; //R3.1 variable Name cannot be a reserved word
        
        System.out.println(valueOfDozen);
        return;//R4 whenever your code execution will come to a return line, the code for that block will stop and return
        // System.out.println(valueOfDozen); //no statement executes after return line.

    }
    
}

// class Dummy{
//     public static void main(String[] args) {//body or block

//         System.out.println("Hey");


//     }
    
// }
