package project.pkg0.ethandp01;

import java.util.ArrayList;

// the purpose of this class is to create the methods for making objects and adding them to the array lists shown
public class Characters {
    
  private String name;
  private ArrayList<String> chars;
  private ArrayList<String> choices;
  
  //Method for creating the character objects
  public Characters(String name, ArrayList<String> chars, ArrayList<String> choices) {
    this.name = name;
    this.chars = chars;
    this.choices = choices;
  }

  public String getname() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  //Method for adding characters to the overall roster
  public void addChars(String chara) {
    chars.add(chara);
  }
  
  //Method for adding the users choices to their personal roster
  public void addChoices(String choice) {
    choices.add(choice);
  }

  //Method for displaying the entire roster in the main method
  public void displayOptions() {
    int n = 0;
    System.out.println("These are the characters you can choose to acquire!");
    System.out.println();
    for (n = 0; n < chars.size(); n++) {
      System.out.println(chars.get(n));
    }
  }
}