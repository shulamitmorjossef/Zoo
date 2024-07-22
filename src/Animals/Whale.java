package Animals;

import Graphics.CompetitionPanel;
import Mobility.Point;
import Olympics.Medal;

/**
 * Represents a Whale animal.
 */
public class Whale extends WaterAnimal{

    /**
     * The type of food the Whale consumes.
     */
    private String foodType;


    /**
     * Construct a new Whale object with specified values.
     *
     * @param name Whale name
     * @param gender Whale gender: Male, Female or Hermaphrodite.
     * @param weight Whale weight. if the weight is less than or equal to 0, a default value of 10 is used.
     * @param speed Whale speed. if the speed is less than or equal to 0, a default value of 10 is used.
     * @param medals Whale medals- an array of medals that the animal has won. duplicates are removed from the array.
     * @param diveDept the dept of Whale diving. if the dept of diving is above or equal to 0, a default value of -200 is used.
     * @param foodType Whale food type.
     */
    public Whale(String name, Gender gender, double weight, double speed, Medal[] medals, Point loc , int size, int id, Orientation orientation, int maxEnergy, int energyPerMeter, CompetitionPanel pan, double diveDept, String foodType)
    {
        super(name, gender, weight, speed, medals, loc,size, id, orientation, maxEnergy, energyPerMeter, pan, diveDept);
        this.foodType = foodType;
    }

    public Whale(String name, int speed,int energyPerMeter, int maxEnergy) {
        super(name, speed, energyPerMeter, maxEnergy);
        this.foodType = "krill";
    }


    /**
     * Construct a new Snake with Whale values.
     */
    public Whale()
    {
        super();
        this.foodType = "krill";
    }


    /**
     * Produces the sound characteristic of Whale.
     */
    protected void sound(){
        System.out.println("Splash");
    }


    /**
     * @return a string which describes the Whale object, including its name, gender, weight, speed, medals, position, total distance, dive dept, food type.
     * the function calls WaterAnimal toString function.
     */
    public String toString()
    {
        return super.toString() + "\nfood type: " + foodType + "\ntype of animal: Whale";
    }


    /**
     * Check if whale is equal to origin.
     *
     * @param obj the object to compare with.
     * @return true if whale is equal to origin and false otherwise.
     */
    public boolean equals(Object obj)
    {
        boolean isEqual = false;
        if(obj instanceof Whale)
            isEqual = super.equals(obj) && foodType.equals (((Whale) obj).foodType);
        return isEqual;
    }

    public String getType()
    {
        return "Whale";
    }
}
