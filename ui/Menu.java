
package ui;

import java.util.ArrayList;
import utils.Input;

public class Menu<T> {
    public ArrayList<String> optionList = new ArrayList<>();
    public String title; 
    public Menu(String title){
        this.title = title;
    }
    //addnewOption: method thêm option vào optionlist
    public void addNewOption(String newOption){
        optionList.add(newOption);
    }
    
    public void print(){
        int count = 1;
        System.out.println("________" + title + "_________");
        for (String op : optionList) {
            System.out.println(count + "." + op);
            count++;
        }
    }
    public int getChoice(){
        int choice = Input.inputPosInt("Input your choice", "Your choice must between 1 and " + optionList.size(), 1, optionList.size());
        return choice;
    }
    
    //hàm xin người dùng con số họ chọn và return cái object tương ứng
    //vị trí n đó trong danh sách
    public T ref_getChoice(ArrayList<T> options){
        //options là brandlist: danh sách các brand
        int choice = Input.inputPosInt("Input SEQ of brand", 
                    "SEQ must be between 1 and " + options.size(), 1, options.size());
        return options.get(choice-1); //vì menu 1-12 nhưng array đi từ 0-11
    }
}