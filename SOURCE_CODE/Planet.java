//Author: God Bennett
//Universal Ai Diploma
//Java_Wormhole - Reasonably rapid movement from 0 java practice to absorption of Java Programming, for the purpose of Universal Ai Diploma




/////////////////OVERVIEW
//1. Describe planet blueprint



//////////////////////////
//PLANET BLUEPRINT
//////////////////////////

//import ArrayList "Blueprint" into our Planet Blueprint
import java.util.ArrayList; //This is an in-built blueprint/class/partial reality 
//How to use: 
//Step 1: Use "import" a built in Blueprint at top of current class/blueprint. eg: "import java.util.ArrayList"
//Step 2: Describe Blueprint inside of class/blueprint like below: private ArrayList <Tree> trees = new ArrayList <Tree> ( );


//Establish planet blueprint
public class Planet
{
    //features
    
    //Empty container: Combines the use of tree blueprints and standard ArrayList to make an empty container, which we will fill up in our main reailty.
    private ArrayList <Tree> trees = new ArrayList <Tree> ( );  
    
    //Empty container: Combines the use of human blueprints and standard ArrayList to make an empty container, which we will fill up in our main reailty.
    private ArrayList <Human> humans = new ArrayList <Human> ( ); 
    
    //Constructor
    //Tells us how to put a planet in main reality a planet, describing trees and humans
    public Planet ( ArrayList<Tree> trees, ArrayList <Human> humans )
    {
        this.trees = trees;
        this.humans = humans;
    }
    
    
    //accessor methods
    public ArrayList <Tree> getTrees ( )
    {
        return trees;
    }
    public ArrayList <Human> getHumans ( )
    {
        return humans;
    }
}