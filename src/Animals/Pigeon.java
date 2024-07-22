package Animals;

import Graphics.CompetitionPanel;
import Mobility.Point;
import Olympics.Medal;

/**
 * Represents a Pigeon animal.
 */
public class Pigeon extends AirAnimal {

    /**
     * The family to which the pigeon belongs.
     */
    private String family;

    /**
     * Construct a new Pigeon object with specified values.
     *
     * @param name Pigeon name.
     * @param gender Pigeon gender: Male, Female or Hermaphrodite.
     * @param weight Pigeon weight. if the weight is less than or equal to 0, a default value of 10 is used.
     * @param speed Pigeon speed. if the speed is less than or equal to 0, a default value of 10 is used.
     * @param medals Pigeon medals- an array of medals that the animal has won. duplicates are removed from the array.
     * @param wingspan length of the wingspan of Pigeon. if the wingspan is less than or equal to 0, a default value of 30 is used.
     * @param family Pigeon family.
     */
    public Pigeon(String name, Gender gender, double weight, double speed, Medal[] medals, Point loc , int size, int id, Orientation orientation, int maxEnergy, int energyPerMeter, CompetitionPanel pan, double wingspan, String family)
    {
        super(name, gender, weight, speed, medals, loc,size, id, orientation, maxEnergy, energyPerMeter, pan,wingspan);
        this.family = family;
    }

    public Pigeon(String name, int speed,int energyPerMeter, int maxEnergy) {
        super(name, speed, energyPerMeter, maxEnergy);
        this.family = "Rock dove";
    }


    /**
     * Construct a new Pigeon with default values.
     */
    public Pigeon()
    {
        super();
        this.family = "Rock dove";
    }

    /**
     * Produces the sound characteristic of Pigeon.
     */
    protected void sound(){
        System.out.println("Arr-rar-rar-rar-raah");
    }


    /**
     * @return a string which describes the Pigeon object, including its name, gender, weight, speed, medals, position, total distance, wingspan, family.
     * the function calls AirAnimal toString function.
     */
    public String toString()
    {
        return super.toString() + "\nfamily: " + family + "\ntype of animal: Pigeon";
    }


    /**
     * Check if pigeon is equal to origin.
     *
     * @param obj the object to compare with.
     * @return true if pigeon is equal to origin and false otherwise.
     */
    public boolean equals(Object obj)
    {
        boolean isEqual = false;
        if(obj instanceof Pigeon)
            isEqual = super.equals(obj) && family.equals (((Pigeon) obj).family);
        return isEqual;
    }

    public String getType()
    {
        return "Pigeon";
    }
}
