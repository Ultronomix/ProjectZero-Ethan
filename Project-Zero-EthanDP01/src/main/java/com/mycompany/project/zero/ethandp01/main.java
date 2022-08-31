package com.mycompany.project.zero.ethandp01;

import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        //Introduction
        System.out.println("Welcome to the beta for the party creator pre-registration! In this small prototype you will pick and choose 4 party member to make a team for an adventure! "
                + "Before we get started, Let us get you registered!");

        System.out.println();

        user user = new user();

        //Setting username for an account
        Scanner username = new Scanner(System.in);
        System.out.println("Please insert your desired username!");
        String userTest = username.next();
        user.setUserName(userTest);

        System.out.println();

        //setting a password for the account
        Scanner password = new Scanner(System.in);
        System.out.println("Please create a password for this user.");
        String pass = password.next();
        user.setPassWord(pass);

        System.out.println();


        //Creating character objects so they may be displayed and used
        System.out.println("Below lists the characters that you may choose from! Remember you may only choose 4!");

        System.out.println();


        ArrayList<String> choices = new ArrayList<>();
        ArrayList<String> chars = new ArrayList<>();

        Characters characters = new Characters("Legends of the Land!", chars, choices);
        characters.addChars("Legends of the Land!");

        Characters lisa = new Characters("1: Lisa, Beckoner of Thunder", chars, choices);
        lisa.addChars("1: Lisa, Beckoner of Thunder");

        Characters amber = new Characters("2: Amber, Archer of Flame", chars, choices);
        amber.addChars("2: Amber, Archer of Flame");

        Characters zhongli = new Characters("3: Zhongli, Caller of Earth", chars, choices);
        zhongli.addChars("3: Zhongli, Caller of Earth");

        Characters ei = new Characters("4: Ei, Lightnings Fury", chars, choices);
        ei.addChars("4: Ei, Lightnings Fury");

        Characters collei = new Characters("5: Collei, Natures Archer", chars, choices);
        collei.addChars("5: Collei, Natures Archer");

        Characters tighnari = new Characters("6: Tighnari, Fox of the Forest", chars, choices);
        tighnari.addChars("6: Tighnari, Fox of the Forest");

        Characters yae = new Characters("7: Yae, The Storms Spirit", chars, choices);
        yae.addChars("7: Yae, The Storms Spirit");

        Characters kusanali = new Characters("8: Kusanali, Wisdom of Life", chars, choices);
        kusanali.addChars("8: Kusanali, Wisdom of Life");

        Characters deyha = new Characters("9: Deyha, Fiery Merc", chars, choices);
        deyha.addChars("9: Deyha, Fiery Merc");

        Characters shenhe = new Characters("10: Shenhe, Ice Caller", chars, choices);
        shenhe.addChars("10: Shenhe, Ice Caller");

        Characters displayC = new Characters("Display", chars, choices);
        displayC.displayOptions();

        System.out.println();

        //Allowing the user to make their choices
        System.out.println("Selct the 4 you would like to acquire, use numbers 1 through 10 for your selections as shown alongside the characters!");

        System.out.println();

        int counterChoices = 1;

        do {
            Scanner choice = new Scanner(System.in);
            System.out.println("Choose a Character!");
            System.out.println();
            int numChoices = choice.nextInt();

            switch (numChoices) {

                case 1:

                    System.out.println("Lisa, Beckoner of Thunder");
                    System.out.println();
                    System.out.println("Next Choice!");
                    System.out.println();
                    lisa.addChoices("Lisa, Beckoner of Thunder");

                    if (counterChoices == 1) { user.setPartyLead(choices.get(0)); }
                    if (counterChoices == 2) { user.setPartySecond(choices.get(1)); }
                    if (counterChoices == 3) { user.setPartyThird(choices.get(2)); }
                    if (counterChoices == 4) { user.setPartyFourth(choices.get(3)); }

                    counterChoices++;

                    break;

                case 2:

                    System.out.println("Amber, Archer of Flame");
                    System.out.println();
                    System.out.println("Next Choice!");
                    System.out.println();
                    amber.addChoices("Amber, Archer of Flame");

                    if (counterChoices == 1) { user.setPartyLead(choices.get(0)); }
                    if (counterChoices == 2) { user.setPartySecond(choices.get(1)); }
                    if (counterChoices == 3) { user.setPartyThird(choices.get(2)); }
                    if (counterChoices == 4) { user.setPartyFourth(choices.get(3)); }

                    counterChoices++;

                    break;

                case 3:

                    System.out.println("Zhongli, Caller of Earth");
                    System.out.println();
                    System.out.println("Next Choice!");
                    System.out.println();
                    zhongli.addChoices("Zhongli, Caller of Earth");

                    if (counterChoices == 1) { user.setPartyLead(choices.get(0)); }
                    if (counterChoices == 2) { user.setPartySecond(choices.get(1)); }
                    if (counterChoices == 3) { user.setPartyThird(choices.get(2)); }
                    if (counterChoices == 4) { user.setPartyFourth(choices.get(3)); }

                    counterChoices++;

                    break;

                case 4:

                    System.out.println("Ei, Lightnings Fury");
                    System.out.println();
                    System.out.println("Next Choice!");
                    System.out.println();
                    ei.addChoices("Ei, Lightnings Fury");

                    if (counterChoices == 1) { user.setPartyLead(choices.get(0)); }
                    if (counterChoices == 2) { user.setPartySecond(choices.get(1)); }
                    if (counterChoices == 3) { user.setPartyThird(choices.get(2)); }
                    if (counterChoices == 4) { user.setPartyFourth(choices.get(3)); }

                    counterChoices++;

                    break;

                case 5:

                    System.out.println("Collei, Natures Archer");
                    System.out.println();
                    System.out.println("Next Choice!");
                    System.out.println();
                    collei.addChoices("Collei, Natures Archer");

                    if (counterChoices == 1) { user.setPartyLead(choices.get(0)); }
                    if (counterChoices == 2) { user.setPartySecond(choices.get(1)); }
                    if (counterChoices == 3) { user.setPartyThird(choices.get(2)); }
                    if (counterChoices == 4) { user.setPartyFourth(choices.get(3)); }

                    counterChoices++;

                    break;

                case 6:

                    System.out.println("Tighnari, Fox of the Forest");
                    System.out.println();
                    System.out.println("Next Choice!");
                    System.out.println();
                    tighnari.addChoices("Tighnari, Fox of the Forest");

                    if (counterChoices == 1) { user.setPartyLead(choices.get(0)); }
                    if (counterChoices == 2) { user.setPartySecond(choices.get(1)); }
                    if (counterChoices == 3) { user.setPartyThird(choices.get(2)); }
                    if (counterChoices == 4) { user.setPartyFourth(choices.get(3)); }

                    counterChoices++;

                    break;

                case 7:

                    System.out.println("Yae, The Storms Spirit");
                    System.out.println();
                    System.out.println("Next Choice!");
                    System.out.println();
                    yae.addChoices("Yae, The Storms Spirit");

                    if (counterChoices == 1) { user.setPartyLead(choices.get(0)); }
                    if (counterChoices == 2) { user.setPartySecond(choices.get(1)); }
                    if (counterChoices == 3) { user.setPartyThird(choices.get(2)); }
                    if (counterChoices == 4) { user.setPartyFourth(choices.get(3)); }

                    counterChoices++;

                    break;

                case 8:

                    System.out.println("Kusanali, Wisdom of Life");
                    System.out.println();
                    System.out.println("Next Choice!");
                    System.out.println();
                    kusanali.addChoices("Kusanali, Wisdom of Life");

                    if (counterChoices == 1) { user.setPartyLead(choices.get(0)); }
                    if (counterChoices == 2) { user.setPartySecond(choices.get(1)); }
                    if (counterChoices == 3) { user.setPartyThird(choices.get(2)); }
                    if (counterChoices == 4) { user.setPartyFourth(choices.get(3)); }

                    counterChoices++;

                    break;

                case 9:

                    System.out.println("Deyha, Fiery Merc");
                    System.out.println();
                    System.out.println("Next Choice!");
                    System.out.println();
                    deyha.addChoices("Deyha, Fiery Merc");

                    if (counterChoices == 1) { user.setPartyLead(choices.get(0)); }
                    if (counterChoices == 2) { user.setPartySecond(choices.get(1)); }
                    if (counterChoices == 3) { user.setPartyThird(choices.get(2)); }
                    if (counterChoices == 4) { user.setPartyFourth(choices.get(3)); }

                    counterChoices++;

                    break;

                case 10:

                    System.out.println("Shenhe, Ice Caller");
                    System.out.println();
                    System.out.println("Next Choice!");
                    System.out.println();
                    shenhe.addChoices("Shenhe, Ice Caller");

                    if (counterChoices == 1) { user.setPartyLead(choices.get(0)); }
                    if (counterChoices == 2) { user.setPartySecond(choices.get(1)); }
                    if (counterChoices == 3) { user.setPartyThird(choices.get(2)); }
                    if (counterChoices == 4) { user.setPartyFourth(choices.get(3)); }

                    counterChoices++;

                    break;

                default:

                    System.out.println("Hey now, that number isn't allowed! Restart and try again!");
                    System.out.println();

                    break;
            }

        } while (counterChoices <= 4);

        System.out.println("Thank you for making your choices! We hope you are excited about the characters you selected");

        Scanner options = new Scanner(System.in);

        int counterOptions = 0;

        //Allowing the user to review their choices or end the program
        do{

            System.out.println("Anything else before you go?");
            System.out.println();
            System.out.println("1. View choices");
            System.out.println();
            System.out.println("2. Quit");

            int numOptions = options.nextInt();

            switch (numOptions) {

                case 1:

                    int n = 0;
                    System.out.println("These are the characters you chose to acquire!");
                    System.out.println();

                    for (n = 0; n < choices.size(); n++) {
                        System.out.println(choices.get(n));
                        System.out.println();
                    }
                    break;

                case 2:

                    System.out.println("We hope you enjoyed the party builder beta!");
                    counterOptions++;

            }

        } while (counterOptions < 1);

        String newUser = sqlTele.save(user);
        System.out.println(newUser);

        List<user> users = sqlTele.getAllUsers();
        users.forEach(System.out::println);

    }

}
