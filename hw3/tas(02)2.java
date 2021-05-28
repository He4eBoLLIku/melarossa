package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    int x= in.nextInt();
    if(x>=5){
      if(x<=11)
        System.out.println("доброе утро");
    }
    if(x>=12) {
      if (x <= 15)
        System.out.println("добрый день");
    }
    if(x>=16) {
      if (x <= 23)
        System.out.println("доброый вечер");
    }
    if(x>=0) {
      if (x <= 4)
        System.out.println("доброй ночи");
    }

  }
}