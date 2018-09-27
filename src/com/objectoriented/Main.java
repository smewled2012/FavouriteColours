package com.objectoriented;

/* The program let's input the name, email and favourite colour for multiple persons
* and then displays the name email and favourite lists in the form of table
* and then finally it selects and displays the list of names with similar favourite colour
* */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        ArrayList<Person> aPersons= new ArrayList<>();
        boolean check=true;

        while(check) {
            System.out.println("Do you want put your detail information: If yes Enter yes else type no ;");
            Person person1 = new Person();
            String checking = input.nextLine();
            if(checking.equalsIgnoreCase("yes")) {
                System.out.println("Enter the name of the person !");
                String name1 = input.nextLine();
                person1.setName(name1);
                System.out.println("Please Enter your email: ");
                String email1 = input.nextLine();
                person1.setEmail(email1);
                System.out.println("Please eneter your favourite colour :");
                String fav1 = input.nextLine();
                person1.setFavColor(fav1);
                aPersons.add(person1);
            }
            else{
                System.out.println("thank you For Your information !");
                check=false;
            }


           /* System.out.println("Information:\n");
            System.out.printf("\nName: %s\n", person1.getName());
            System.out.printf("Email : %s\n", person1.getEmail());
            System.out.printf("Favourite Colour : %s\n", person1.getFavColor());*/
        }

        System.out.println("The list of People you have enetered \n\n"+ aPersons.size());

        /*(Person personlist:aPersons){
                   System.out.println("Information:\n");
                   System.out.printf("\nName: %s", personlist.getName());
                   System.out.printf("\nEmail : %s", personlist.getEmail());
                   System.out.printf("\nFavourite Colour : %s", personlist.getFavColor());
               }*/

        System.out.println("\nName \t\t\t\t\t  Email\t\t\t\t\t\t Favourite-Colour");

       System.out.println("_______________ \t\t______________________\t\t_______________________\n");

       //display the name email and favourite colour in table format

        for(Person personlist:aPersons) {

            System.out.printf("%s \t\t\t\t\t\t  %s   \t\t\t\t\t\t %s\t\t\t\t\t\t \n", personlist.getName(),personlist.getEmail(),personlist.getFavColor());
        }


    // adding search option

      HashMap<String,String> peopleColor = new HashMap<>();

        /*for(Person personList:aPersons) {
            peopleColor.put(personList.getName(),personList.getFavColor());
            String color = peopleColor.get(personList.getName());
            System.out.printf("\nthe favourite colour of %s is  %s \n", personList.getName(),color);

        }*/




        System.out.println("Please enter the colour of your choice that you want search !");
        String choiceColor = input.nextLine();
        System.out.println("the list of names with favourite color "+choiceColor +" are: ");

        // Searching the names with similar colours using HashMap collection

        /*for(Person personList:aPersons) {
            peopleColor.put(personList.getName(),personList.getFavColor());
            String color = peopleColor.get(personList.getName());
           // System.out.printf("\n the favourite colour of %s is  %s \n", personList.getName(),color);
            if(choiceColor.equalsIgnoreCase(color)){
                System.out.println(personList.getName());
            }

        }*/

        ArrayList<String> myNames = new ArrayList<>();
        // Listing the names with the favourite colour inserted from the user

        for(Person personList:aPersons) {

            if(choiceColor.equalsIgnoreCase(personList.getFavColor())){
                myNames.add(personList.getName());
            }

        }

        // show the list of names with similar favourite colour

        for(String people:myNames){
            System.out.println(people);
        }

        if(choiceColor.equalsIgnoreCase("Grey")){
            System.out.println("OK.");
        }
        else if(choiceColor.equalsIgnoreCase("Blue")){
            System.out.println("That's a nice Colour !");
        }
        else if(choiceColor.equalsIgnoreCase("red")){
            System.out.println("It pops!");
        }
        else{
            // Random class generation
            RandomColor ranFeedback = new RandomColor();
            String[] ranChoice = {"good choice", "bad choice", "poor choice", "Excellent choice"};
            Random ran = new Random();
            String diffColor = ranChoice[ran.nextInt(ranChoice.length)];
            ranFeedback.setFeedback(diffColor);
            System.out.println(ranFeedback.getFeedback());
        }

    }
}

