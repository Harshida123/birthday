package com.company;

public class practice {
    public int[] arraypractice = {12,20, 34, 45, 56,20};
    public int k = 0;
    public int[] newpractice;

    public practice(int value) {
        for (int i = 0; i < arraypractice.length; i++) {

            if (arraypractice[i] == value) {
                k=k+1;
                //newpractice = value;

            }
        }
        if(k >0)
        {
            System.out.println("this is belongs to array");

        }
        else {
            System.out.println("this is not belongs to array");
        }


    }
}




