/** 
Class: Plant
Author: John Manning
Purpose: An object for the Plant feature of our project. 
        Represents a plant that will be larger depending on the current growth level
*/
public class Plant{
//fields
    int growthLevel;
//constructors
    public Plant(){
        this.growthLevel = 0;
    }
    public Plant(int growthLevel){
        this.growthLevel = growthLevel;
    }


    
//methods

    /** 
    getGrowthLevel

    Purpose: return the growthLevel of this plant object.
    Parameters: none
    Returns: an int
    */
    public int getGrowthLevel(){
        return growthLevel; 
    }
    /** 
    setGrowthLevel

    Purpose: change the growthLevel of this plant object
    Parameters:  int newLevel
    Returns: void
    */
    public void setGrowthLevel(int newLevel){
        this.growthLevel = newLevel;
    }

}