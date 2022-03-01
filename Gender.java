package com.gender;

import java.util.Scanner;

public class Gender {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.println("Enter the ID: ");

    String id = in.nextLine();

    if (id.length() != 13) {
      System.out.println("An ID needs to be 13 digits long. Try again.");
      return;
    } else if (!onlyDigits(id)) {
      System.out.println("An ID can only contain digits. Try again.");
      return;
    }

    if (id.endsWith("0") || id.endsWith("1") || id.endsWith("2") || id.endsWith("3") || id.endsWith("4"))
      System.out.println("ID implies female");
    else
      System.out.println("ID implies male");
  }

  public static boolean onlyDigits(String str) {

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
        continue;
      else {
        return false;
      }
    }
  return true;
  }

}