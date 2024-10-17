package utils;

import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);
    // input a unempty string
    public String inputString(String inpMsg, String errMsg){
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
    public String inputString(String inpMsg, String errMsg, String regex){
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
    public int inputPosInt(String inpMsg, String errMsg){
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
}
