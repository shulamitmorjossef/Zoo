package Animals;

import Graphics.CompetitionPanel;
import Mobility.Point;
import Olympics.Medal;

/**
 * Represents an air animal.
 * cannot perform instances from this class.
 */
public abstract class AirAnimal extends Animal {

    /**
     * The wingspan of the air animal.
     */
    private double wingspan;



    /**
     * Construct a new AirAnimal object with specified values.
     *
     * @param name air animal name
     * @param gender air animal gender: Male, Female or Hermaphrodite.
     * @param weight air animal weight. if the weight is less than or equal to 0, a default value of 10 is used.
     * @param speed air animal speed. if the speed is less than or equal to 0, a default value of 10 is used.
     * @param medals air animal medals- an array of medals that the animal has won. duplicates are removed from the array.
     * @param wingspan length of the wingspan of the air animal. if the wingspan is less than or equal to 0, a default value of 30 is used.
     */
    public AirAnimal(String name, Gender gender, double weight, double speed, Medal[] medals  , Point loc , int size, int id, Orientation orientation, int maxEnergy, int energyPerMeter, CompetitionPanel pan, double wingspan )
    {
        super(name, gender, weight, speed, medals, loc,size, id, orientation, maxEnergy, energyPerMeter, pan);
        setLocation(new Point(0,100));
        if(wingspan <= 0)
        {
            this.wingspan = 30;
        }
        else
            this.wingspan = wingspan;
    }

    public AirAnimal(String name, int speed,int energyPerMeter, int maxEnergy) {
        super(name, speed, energyPerMeter, maxEnergy);
        setLocation(new Point(0,100));
        this.wingspan = 30;
    }



    /**
     * Construct a new AirAnimal with default values.
     */
    public AirAnimal()
    {
        super();
        setLocation(new Point(0,100));
        this.wingspan = 30;
    }

    /**
     * @return a string which describes the AirAnimal object, including its name, gender, weight, speed, medals, position, total distance, wingspan
     * the function calls Animal toString function.
     */
    public String toString()
    {
        return super.toString() + "\nwingspan: " + wingspan;
    }


    /**
     * Check if airAnimal is equal to origin.
     *
     * @param obj the object to compare with.
     * @return true if airAnimal is equal to origin and false otherwise.
     */
    public boolean equals(Object obj)
    {
        boolean isEqual = false;
        if(obj instanceof AirAnimal)
            isEqual =  (super.equals(obj) && wingspan == ((AirAnimal)obj).wingspan);
        return isEqual;
    }


    public String getCategory()
    {
        return "Air";
    }
}

