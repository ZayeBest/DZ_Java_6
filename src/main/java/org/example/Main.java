package org.example;

import org.example.Class.MyArray;

public class Main {
    public static void main(String[] args) {
        MyArray array = new MyArray();


        array.put("1st");
        array.put("2nd");
        array.put("3rd");
        array.put("4rd");
        array.put("5rd");


        System.out.println("Довжина: " + array.length());
        array.get(); //виводимо перший елемент
        array.get(); //виводимо 2й елемент
        array.get(); //виводимо 3й елемент
        array.get(); //виводимо 4й елемент
        array.get(); //виводимо 5й елемент
        System.out.println("Довжина: " + array.length());

        //двічі перевіримо, що немає елементів
        array.get();
        array.get();

        System.out.println("Довжина перед тим як покласти елемент: " + array.length());
        array.put("new Elem");
        System.out.println("Довжина після того, як поклали: " + array.length());
        array.get(); //виводимо перший елемент

    }
}
