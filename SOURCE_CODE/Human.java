//Author: God Bennett
//Universal Ai Diploma
//Java_Wormhole - Reasonably rapid movement from 0 java practice to absorption of Java Programming, for the purpose of Universal Ai Diploma


/////////////////OVERVIEW
//1. Describe human blueprint



//////////////////////////
//HUMAN BLUEPRINT
//////////////////////////

//import Random "Blueprint" into our Human Blueprint
import java.util.Random; //This is an in-built blueprint/class/partial reality (Particular function: Get random number)
//How to use: 
//Step 1: Use "import" a built in Blueprint at top of current class/blueprint. eg: "import java.util.Random
//Step 2: Describe Blueprint inside of class/blueprint like below: new Random ( ).nextInt ( )


public class Human
{
    //features
    private int id = new Random ( ).nextInt ( );
    private String name;
    
    //Constructor
    //Tells us how to put a human on a planet or in Main Reality, by describing a name.
    public Human ( String name )
    {
        this.name = name; 
    }
    
    
    //methods
    public int getId ( )
    {
        return id;
    }
    
    public String getName ( )
    {
        return name;
    }
}