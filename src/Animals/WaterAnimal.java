package Animals;

import Graphics.CompetitionPanel;
import Mobility.Point;
import Olympics.Medal;

/**
 * Represents a water animal.
 * cannot perform instances from this class.
 */
public abstract class WaterAnimal extends Animal implements IWaterAnimal {

//    private double diveDept;
//    private static final double MAX_DIVE = -800;

    private WaterAnimalUnique waterAnimalUnique;

/**
 * Construct a new WaterAnimal object with specified values.
 *
 * @param name air animal name
 * @param gender air animal gender: Male, Female or Hermaphrodite.
 * @param weight air animal weight. if the weight is less than or equal to 0, a default value of 10 is used.
 * @param speed air animal speed. if the speed is less than or equal to 0, a default value of 10 is used.
 * @param medals air animal medals- an array of medals that the animal has won. duplicates are removed from the array.
 * @param diveDept the dept of diving. if the dept of diving is above or equal to 0, a default value of -200 is used.
 */
    public WaterAnimal(String name, Gender gender, double weight, double speed, Medal[] medals, Point loc , int size, int id, Orientation orientation, int maxEnergy, int energyPerMeter, CompetitionPanel pan, double diveDept)
    {
        super(name, gender, weight, speed, medals, loc,size, id, orientation, maxEnergy, energyPerMeter, pan);

        setLocation(new Point(0,50));
        if (diveDept < -800)
            diveDept = -800;
        else if(diveDept >= 0)
            diveDept = -200;

        waterAnimalUnique = new WaterAnimalUnique(diveDept);
//        this.diveDept = diveDept;
    }

    public WaterAnimal(String name, int speed,int energyPerMeter, int maxEnergy) {
        super(name, speed, energyPerMeter, maxEnergy);
        setLocation(new Point(0,50));
        waterAnimalUnique = new WaterAnimalUnique(-200);
    }


    /**
     * Construct a new WaterAnimal with default values.
     */
    public WaterAnimal()
    {
        super();
        setLocation(new Point(0,50));
        waterAnimalUnique = new WaterAnimalUnique(-200);

//        this.diveDept = -200;
    }

//    /**
//     *Performs a dive with the specified depth.
//     *
//     * @param dept the depth of the dive to perform
//     * @return true if the dive was successfully performed, false if the dive depth exceeds the maximum allowed or invalid value.
//     */
//    public boolean Dive(double dept)
//    {
//        if(dept >= 0)
//            return false;
//        if(waterAnimalUnique.getDiveDept() + dept < waterAnimalUnique.getMAX_DIVE())
//            return false;
//
//        waterAnimalUnique.setDiveDept(waterAnimalUnique.getDiveDept() + dept);
//        return true;
//    }

    public boolean Dive(double dept)
    {
        return waterAnimalUnique.Dive(dept);
    }

//    /**
//     * @return a string which describes the WaterAnimal object, including its name, gender, weight, speed, medals, position, total distance, dept of dive.
//     * the function calls Animal toString function.
//     */
    public String toString()
    {
        return super.toString() +  waterAnimalUnique.toString();
    }


//    /**
//     * Check if waterAnimal is equal to origin.
//     *
//     * @param obj the object to compare with.
//     * @return true if waterAnimal is equal to origin and false otherwise.
//     */
//    public boolean equals(Object obj)
//    {
//        boolean isEqual = false;
//        if(obj instanceof WaterAnimal)
//            isEqual = (super.equals(obj) && waterAnimalUnique.getDiveDept() == ((WaterAnimal)obj).waterAnimalUnique.getDiveDept());
//        return isEqual;
//    }
        public boolean equals(Object obj)
        {
            if(obj instanceof WaterAnimal) {
               return (super.equals(obj) && waterAnimalUnique.equals(((WaterAnimal) obj).waterAnimalUnique));
            }
            return false;
        }


    //equals

    public String getCategory()
    {
        return "Water";
    }

}
