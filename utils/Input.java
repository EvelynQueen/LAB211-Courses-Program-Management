package utils;

import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);
    // input a unempty string
    public String inputString(String inpMsg, String errMsg){
        String str;
        while (true) {
            System.out.println(inpMsg);
            str = sc.nextLine();
            if (!str.isEmpty()) { 
                return str;
            }
            System.out.println(errMsg);
        }
    }
}
