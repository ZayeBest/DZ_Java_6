package org.example.Class;


public class MyArray {
    public int marker = 0;
    public int size = 3;
    private String[] array= new String[size];

    public int length(){
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != null) {
                a++;
            }
        }
        return a;
    }

    public void put(String str) {
        if (marker >= array.length) {

            String[] newArray = new String[array.length * 2];

            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }

        array[marker] = str;
        marker++;
    }

    public  void get(){
        if (marker > 0){
            System.out.println(array[0]);
            for (int i = 0; i< array.length-1;i++){
                array[i]=array[i+1];
            }
            marker--;
        }else {
            System.out.println("No more elements");
        }

    }



}





