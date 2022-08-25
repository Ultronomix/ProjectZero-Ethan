package project.pkg0.ethandp01;

import java.util.ArrayList;

public class Characters {
    
  private String name;
  private ArrayList<String> chars;
  private ArrayList<String> choices;

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

  public void addChars(String chara) {
    chars.add(chara);
  }
  
  public void addChoices(String choice) {
    choices.add(choice);
  }

  public void displayOptions() {
    int n = 0;
    System.out.println("These are the characters you can choose to acquire!");
    System.out.println();
    for (n = 0; n < chars.size(); n++) {
      System.out.println(chars.get(n));
    }
  }
}