/*************************************************************************
* Laith Alaboodi
* Wizard Game 
* User fights wizard, and has to randomly match the power the wizard uses
  *************************************************************************/

import java.util.*;

public class WizardredGame
{
   // keyboard is a global variable because it is above main()
   static Scanner keyboard = new Scanner(System.in); 
    
   public static void main(String[] args) 
   {
      // Put the main code here.
     String userName;
     int numbersOfTries;
     Boolean wizzardDefeated;
     
      
      
     wizzardDefeated= false;
     numbersOfTries = 1;
     //welcomes the users
     welcomeMessage();
      
     //get he username and set its to local variable with inside main
     userName=getUserName();
     //shows the wizards powers
     displayWizardSpells(userName);
      
     //While not defeated, we play again until tries attempted to passes three times
      while (!wizzardDefeated && numbersOfTries <=3){
        wizzardDefeated = battleStarts() ;
        numbersOfTries = numbersOfTries +1 ;
      }
       
      endingMessage(wizzardDefeated);
     
   }//end of main
   
   //created a random genrator 
    public static int randomGenerator(){
    Random value = new Random();
    
    int number = 1+value.nextInt(5);
    
    return number;
  }
   
    //module for the welcomeMessage
   public static void welcomeMessage(){
      System.out.println("*****************************************************************************************************************");
      System.out.println("* You are a Great Stark warrior battling a Powerful Lannister Warrior                                           *");
      System.out.println("* If you guess the spell the Lannister Warrior uses in battle you will save the village                         *");
      System.out.println("* If you guess incorrectly three times you will be sent to the Night Watch,                                     *");
      System.out.println("* And the village will fall.                                                                                    *");
      System.out.println("* YOU WILL ONLY GET 3 CHANCES!                                                                                  *");
       System.out.println("* You are running Version v2.2                                                                                  *");
      System.out.println("*****************************************************************************************************************");
    }
   
   //function to get the userName and return the name the user put
   public static String getUserName(){
     String name;
      System.out.println("What is the name of your Great Worrior? ");
      name = keyboard.next();
      return name;
   }
   
   //module to hold the name 
    public static void displayWizardSpells(String name){
      System.out.println(name + "-the-Warrior-of-House Stark, the Lannister Warrior has many spells to use in battle.");
      System.out.println("1. Longsword ");
      System.out.println("2. Bow and Arrow ");
      System.out.println("3. Spear ");
      System.out.println("4. Charging Horse");
       System.out.println("5. Dagger Attack");
      
    }
   
   //used Boolean to create a true or false stament 
    public static Boolean battleStarts(){
      //player’s chosen spell
     int chosenSpell; 
     int wizardChosenSpell;
     //the random spell chosen
     wizardChosenSpell = randomGenerator();
     Boolean wizzardDefeated;
     
     
     System.out.println("Choose a spell you think the Lannister Warrior will use!");
     
     chosenSpell = keyboard.nextInt();
     System.out.println("*********************************************************************************************");
      System.out.println("*"+spellName(chosenSpell)+". Great Choice!");
      System.out.println("* It is time, get ready the battle will begin...");
      System.out.println("* The Lannister Warrior uses"+ spellName(wizardChosenSpell));
      System.out.println("*********************************************************************************************");
     if (chosenSpell==wizardChosenSpell){
       System.out.println("You waited for the Lannister Warrior spell!");
        System.out.println("Thank you for saving our village!");
        wizzardDefeated = true;
     }else{
           System.out.println("You did not anticipate the Lannister Warrior spell.");
           System.out.println("Your health is lowered!");
           wizzardDefeated=false;
           }
     
         return wizzardDefeated;                  
     }//end of fucntion    
    
    //fucntion for the choice they can chose
     public static String spellName(int selectSpell){
      
       String spellName ;
       switch (selectSpell) {
            case 1:  spellName = " Longsword";
                     break;
            case 2:  spellName = " Bow and Arrow";
                     break;
            case 3:  spellName = " Spear";
                     break;
            case 4:  spellName = " Charging Horse";
                     break;
            case 5:  spellName = " Dagger Attack";
                     break;
            default: spellName= "waiting";
                     break;

        }
        return spellName;
    }//endfuntion
     
      public static void  endingMessage(Boolean isWizzardDefeated){
        if (isWizzardDefeated){
          System.out.println("You Won your too good for this game!");
        }else{
          System.out.println("Sorry not so sorry you suck, try again next time!");
        }
        
    }
   
}//end of class