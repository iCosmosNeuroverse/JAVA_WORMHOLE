//Author: God Bennett
//Universal Ai Diploma
//Java_Wormhole - Reasonably rapid movement from 0 java practice to absorption of Java Programming, for the purpose of Universal Ai Diploma


/////////////////OVERVIEW
//1. Describe trees, and a list of trees
//2. Describe humans, and a list of humans
//3. Describe planet based on the above
//4. Observe data about planet/trees and humans using loops

//////////////////////////
//MAIN REALITY
//////////////////////////
//import ArrayList "Blueprint" into our Planet Blueprint
import java.util.ArrayList; //This is an in-built blueprint/class/partial reality 
//How to use: 
//Step 1: Use "import" a built in Blueprint at top of current class/blueprint. eg: "import java.util.ArrayList"
//Step 2: Describe Blueprint inside of class/blueprint like below: private ArrayList <Tree> trees = new ArrayList <Tree> ( );


public class MainReality
{
    public static void main ( String [ ] arguments )
    {
        /////////////////////////////////////////////
        //1. Describe trees, and a list of trees
        //describe trees
        Tree tree1 = new Tree ("brown");
        Tree tree2 = new Tree ("black");
        Tree tree3 = new Tree ("red");
        
        //form list from trees described
        //A. Empty container: Combines the use of tree blueprints and standard ArrayList to make an empty container, which we will fill up in our main reailty.
        ArrayList <Tree> trees = new ArrayList <Tree> ( );
        //B. Loop to full empty container of trees
        trees.add ( tree1 ); //.add function comes standard with ArrayList, although it is an ArrayList of our custom Tree Blueprint
        trees.add ( tree2 ); //.add function comes standard with ArrayList, although it is an ArrayList of our custom Tree Blueprint
        trees.add ( tree3 ); //.add function comes standard with ArrayList, although it is an ArrayList of our custom Tree Blueprint
        
        
        /////////////////////////////////////////////
        //2. Describe humans, and a list of humans
        //describe humans
        Human human1 = new Human ("Fred");
        Human human2 = new Human ("Lisa");
        Human human3 = new Human ("Mary");
        Human human4 = new Human ("John");
		
        //form list from humans described
        //A. Empty container: Combines the use of human blueprints and standard ArrayList to make an empty container, which we will fill up in our main reailty.
        ArrayList <Human> humans = new ArrayList <Human> ( );
        //B. Loop to full empty container of humans
        humans.add ( human1 ); //.add function comes standard with ArrayList, although it is an ArrayList of our custom Human Blueprint
        humans.add ( human2 ); //.add function comes standard with ArrayList, although it is an ArrayList of our custom Human Blueprint
        humans.add ( human3 ); //.add function comes standard with ArrayList, although it is an ArrayList of our custom Human Blueprint
        humans.add ( human4 ); //.add function comes standard with ArrayList, although it is an ArrayList of our custom Human Blueprint
           
        /////////////////////////////////////////////
        //3. Describe planet based on the above
        Planet onePlanet = new Planet ( trees, humans );
        
        
        /////////////////////////////////////////////
        //4. Observe data about planet/trees and humans using loops
        int numberOfTrees = onePlanet.getTrees ( ).size ( );
        int numberOfHumans = onePlanet.getHumans ( ).size ( );
        
        for ( int t = 0; t < numberOfTrees; t ++ )
            System.out.println ( "Tree " + t + " name is : " + onePlanet.getTrees ( ).get ( t ).getColour ( ) );
            
        for ( int h = 0; h < numberOfHumans; h ++ )
            System.out.println ( "Human " + h + " id is : " + onePlanet.getHumans ( ).get ( h ).getId ( ) );
    }
}