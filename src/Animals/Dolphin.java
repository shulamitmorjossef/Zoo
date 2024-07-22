package Animals;

import Graphics.CompetitionPanel;
import Mobility.Point;
import Olympics.Medal;

/**
 * Represents a Dolphin animal.
 */
public class Dolphin extends WaterAnimal{

    /**
     * The type of water the dolphin lives in.
     */
    private  WaterType waterType;

    /**
     * Construct a new Dolphin object with specified values.
     *
     * @param name Dolphin name.
     * @param gender Dolphin gender: Male, Female or Hermaphrodite.
     * @param weight Dolphin weight. if the weight is less than or equal to 0, a default value of 10 is used.
     * @param speed Dolphin speed. if the speed is less than or equal to 0, a default value of 10 is used.
     * @param medals Dolphin medals- an array of medals that the animal has won. duplicates are removed from the array.
     * @param diveDept the dept of Whale diving. if the dept of diving is above or equal to 0, a default value of -200 is used.
     * @param waterType Dolphin gender: Sea or Sweet.
     */
    public Dolphin(String name, Gender gender, double weight, double speed, Medal[] medals, Point loc , int size, int id, Orientation orientation, int maxEnergy, int energyPerMeter, CompetitionPanel pan, double diveDept, WaterType waterType)
    {
        super(name, gender, weight, speed, medals, loc,size, id, orientation, maxEnergy, energyPerMeter, pan, diveDept);
        this.waterType = waterType;
    }

    public Dolphin(String name, int speed,int energyPerMeter, int maxEnergy) {
        super(name, speed, energyPerMeter, maxEnergy);
        this.waterType = WaterType.Sea;
    }


    /**
     * Construct a new Dolphin with default values.
     */
    public Dolphin()
    {
        super();
        this.waterType = WaterType.Sea;
    }

    /**
     * Produces the sound characteristic of Dolphin.
     */
    protected void sound(){
        System.out.println("Click-click");
    }


    /**
     * @return a string which describes the Dolphin object, including its name, gender, weight, speed, medals, position, total distance, dive dept, water type.
     * the function calls WaterAnimal toString function.
     */
    public String toString()
    {
        return super.toString() + "\nwater type: " + waterType + "\ntype of animal: Dolphin";
    }

    /**
     * Check if dolphin is equal to origin.
     *
     * @param obj- the object to compare with.
     * @return true if dolphin is equal to origin and false otherwise.
     */
    public boolean equals(Object obj)
    {
        boolean isEqual = false;
        if(obj instanceof Dolphin)
            isEqual = super.equals(obj) && waterType == ((Dolphin) obj).waterType;
        return isEqual;
    }

    public String getType()
    {
        return "Dolphin";
    }
}
