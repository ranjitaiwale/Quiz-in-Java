package com.company;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        System.out.println("..######......****.....QUIZ....***********.......##########..");
        System.out.println("Enter Your Name");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("Question:1  What is capital of India ?");
        Scanner sc1 = new Scanner(System.in);

        String str1 = sc1.nextLine();
        System.out.println("Your answer is " + str1);

        switch (str1) {
            case "Delhi":
                System.out.println("Great.........");
                System.out.println("Your Answer is correct ...");
                break;
            default:
                System.out.println("oho");
                System.out.println("Your Answer is Wrong");
                System.out.println("correct Answer is Delhi");

        }

        System.out.println("Question:2  What is National Bird of India ?");
        Scanner sc2 = new Scanner(System.in);

        String str2 = sc2.nextLine();
        System.out.println("Your Answer is " + str2);


        switch (str2) {
            case "Peacock":
                System.out.println("Great.........");
                System.out.println("Your Answer is correct ...");
                break;
            default:
                System.out.println("oho");
                System.out.println("Your Answer is Wrong");
                System.out.println("Correct Answer is Peacock");
        }
        System.out.println("Question:3 Who is the best Actress in Bollywood ?");
        Scanner sc3 = new Scanner(System.in);

        String str3 = sc3.nextLine();
        System.out.println("Your Answer is " + str3);


        switch (str3) {
            case "Shradha Kapoor":
                System.out.println("Great.........");
                System.out.println("Your Answer is correct ...");
                break;
            default:
                System.out.println("oho");
                System.out.println("Your Answer is Wrong");
                System.out.println("Correct Answer is Shradha Kapoor");
        }
        System.out.println("Question:4 Which is best movie for engineering students ?");
        Scanner sc4 = new Scanner(System.in);

        String str4 = sc4.nextLine();
        System.out.println("Your Answer is " + str4);


        switch (str4) {
            case "3 Idiots":
                System.out.println("Great.........");
                System.out.println("Your Answer is correct ...");
                break;
            default:
                System.out.println("oho");
                System.out.println("Your Answer is Wrong");
                System.out.println("Correct Answer is 3 Idiots");
        }
        System.out.println("Question:5 What is the Capital of Maharashtra?");
        Scanner sc5 = new Scanner(System.in);

        String str5 = sc5.nextLine();
        System.out.println("Your Answer is " + str5);


        switch (str5) {
            case "Mumbai":
                System.out.println("Great.........");
                System.out.println("Your Answer is correct ...");
                break;
            default:
                System.out.println("oho");
                System.out.println("Your Answer is Wrong");
                System.out.println("Correct Answer is Mumbai");
        }
        System.out.println("Question:6 What is Density or mass density ?");
        Scanner sc6 = new Scanner(System.in);

        String str6 = sc6.nextLine();
        System.out.println("Your Answer is " + str6);


        switch (str6) {
            case "The ratio of mass of fluid to its volume is called as density or mass density.":
                System.out.println("Great.........");
                System.out.println("Your Answer is correct ...");
                break;
            default:
                System.out.println("oho");
                System.out.println("Your Answer is Wrong");
                System.out.println("Correct Answer is  The ratio of mass of fluid to its volume is called as density or mass density.");
        }
        System.out.println("Question:7 What is Specific Volume ?");
        Scanner sc7 = new Scanner(System.in);

        String str7 = sc7.nextLine();
        System.out.println("Your Answer is " + str7);


        switch (str7) {
            case "The ratio of volume of fluid to its mass is called as specific volume.":
                System.out.println("Great.........");
                System.out.println("Your Answer is correct ...");
                break;
            default:
                System.out.println("oho");
                System.out.println("Your Answer is Wrong");
                System.out.println("Correct Answer is The ratio of volume of fluid to its mass is called as specific volume. ");
        }
        System.out.println("Question:8 What is Specific gravity?");
        Scanner sc8 = new Scanner(System.in);

        String str8 = sc8.nextLine();
        System.out.println("Your Answer is " + str8);


        switch (str8) {
            case "The ratio of volume of fluid to its ideal volume of fluid.":
                System.out.println("Great.........");
                System.out.println("Your Answer is correct ...");
                break;
            default:
                System.out.println("oho");
                System.out.println("Your Answer is Wrong");
                System.out.println(" The ratio of volume of fluid to its ideal volume of fluid. ");
        }
        System.out.println("Question:9 What is reciprocal of mass density or density?");
        Scanner sc9 = new Scanner(System.in);

        String str9 = sc9.nextLine();
        System.out.println("Your Answer is " + str9);


        switch (str9) {
            case "Specific Volume":
                System.out.println("Great.........");
                System.out.println("Your Answer is correct ...");
                break;
            default:
                System.out.println("oho");
                System.out.println("Your Answer is Wrong");
                System.out.println("Specific Volume");
        }
        System.out.println("Question:10 Name the dangerous disease in human life?");
        Scanner sc10 = new Scanner(System.in);

        String str10 = sc10.nextLine();
        System.out.println("Your Answer is " + str10);


        switch (str10) {
            case "Sabse bada rog kya kahenge log":
                System.out.println("Great.........");
                System.out.println("Your Answer is correct ...");
                break;
            default:
                System.out.println("oho");
                System.out.println("Your Answer is Wrong");
                System.out.println("Sabse bada rog kya kahenge log");
        }

       System.out.println( "Congratulations " + str + " Great job");
        System.out.println(" This Quiz is organized by R.V.AIWALE. Thanks for " +
                "participating and growing the beauty of our program....Thank you so much............");
    }
    }