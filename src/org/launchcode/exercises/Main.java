package org.launchcode.exercises;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static int Divide(int x, int y)
    {
        // Write code here!
        if(y ==0) {
            try {
                throw new ArithmeticException("Ohhh, can't do 0");
            } catch ( ArithmeticException a ){
                a.printStackTrace();
            }
        }
        return x/y;
    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        int totalPoints = 0;
        if(fileName.endsWith(".java")){
            totalPoints +=1;
       }else if(fileName == null){
            totalPoints = -1;
       } else {
            totalPoints = 0;
      }
      return totalPoints;
    }

}
