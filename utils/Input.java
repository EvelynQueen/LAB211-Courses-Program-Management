package utils;

import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);
    // input a unempty string
    public static String inputString(String inpMsg, String errMsg){
        while (true) {
            try {
                System.out.println(inpMsg);
                String str = sc.nextLine();
                if(str.isEmpty()){
                    throw new Exception();
                }
                return str;
            } catch (Exception e) {
                System.out.println(errMsg);
            }
        }
    }

    // input s string mathching regex pattern
    public static String inputString(String inpMsg, String errMsg, String regex){
        while (true) {
            try {
                System.out.println(inpMsg);
                String str = sc.nextLine();
                if(str.isEmpty() || !str.matches(regex)){
                    throw new Exception();
                }
                return str;
            } catch (Exception e) {
                System.out.println(errMsg);
            }
        }
    };

    // input a posity number
    public static int inputPosInt(String inpMsg, String errMsg){
        while (true) {
            try {
                System.out.println(inpMsg);
                int num = Integer.parseInt(sc.nextLine());
                if (num <= 0) {
                    throw new Exception();
                }
                return num;
            } catch (Exception e) {
                System.out.println(errMsg);
            }
        }
    }

    // input a number between two given numbers
    public static int inputPosInt(String inpMsg, String errMsg, int 
                                    lowerBound, int upperBound){
        if(lowerBound > upperBound){
            int tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }
        System.out.println(inpMsg); //hiển thị lời mời
        while (true) {            
            try {
                int number = Integer.parseInt(sc.nextLine());
                if(number < lowerBound || number > upperBound){
                    throw new Exception();
                }
                return number;
            } catch (Exception e) {
                System.out.println(errMsg);
            }
        }
    }
}

/*
 The methods in the Input class are defined as static (e.g., public static String inputString(...)). 
  This means you can call these methods without creating an instance of the Input class. 
  You can simply call them using the class name, like Input.inputString(...).
 */