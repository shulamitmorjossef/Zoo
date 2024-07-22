package Animals;

import Graphics.CompetitionPanel;
import Mobility.Point;
import Olympics.Medal;


/**
 * Represents a terrestrial animal.
 * cannot perform instances from this class.
 */
public abstract class TerrestrialAnimals extends Animal implements ITerrestrialAnimals{

    /**
     * The number of legs the terrestrial animal has.
     */
//    private double noLegs;
    private TerrestrialAnimalUnique terrestrialAnimalUnique;



    /**
     * Construct a new TerrestrialAnimals object with specified values.
     *
     * @param name terrestrial animal name.
     * @param gender terrestrial animal gender: Male, Female or Hermaphrodite.
     * @param weight terrestrial animal weight. if the weight is less than or equal to 0, a default value of 10 is used.
     * @param speed terrestrial animal speed. if the speed is less than or equal to 0, a default value of 10 is used.
     * @param medals terrestrial animal medals- an array of medals that the animal has won. duplicates are removed from the array.
     * @param noLegs number of legs of terrestrial animal. if the number of legs  is less than or equal to 0, a default value of 4 is used.
     */
    public TerrestrialAnimals(String name, Gender gender, double weight, double speed, Medal[] medals, Point loc , int size, int id, Orientation orientation, int maxEnergy, int energyPerMeter, CompetitionPanel pan, double noLegs)
    {
        super(name, gender, weight, speed, medals, loc,size, id, orientation, maxEnergy, energyPerMeter, pan);

        setLocation(new Point(0,20));
        if (noLegs <= 0)
            noLegs = 4;
        terrestrialAnimalUnique = new TerrestrialAnimalUnique(noLegs) ;
    }


    public TerrestrialAnimals(String name, int speed,int energyPerMeter, int maxEnergy) {
        super(name, speed, energyPerMeter, maxEnergy);
        setLocation(new Point(0,20));
        terrestrialAnimalUnique = new TerrestrialAnimalUnique(4);
    }


    /**
     * Construct a new TerrestrialAnimals with default values.
     */
    public TerrestrialAnimals()
    {
        super();
        setLocation(new Point(0,20));
        terrestrialAnimalUnique = new TerrestrialAnimalUnique(4);
//        this.noLegs = 4;
    }

    /**
     * Sets the number of legs to the default value.
     *
     * @return true when set is successful.
     */
    protected boolean setNoLegsToDefault() {
        terrestrialAnimalUnique.setNoLegs(0);
        return true;
    }


//    /**
//     * @return a string which describes the TerrestrialAnimals object, including its name, gender, weight, speed, medals, position, total distance, number of legs.
//     * the function calls Animal toString function.
//     */
    public String toString()
    {
        return super.toString() + terrestrialAnimalUnique.toString();
    }


//    /**
//     * Check if terrestrialAnimals is equal to origin.
//     *
//     * @param obj the object to compare with.
//     * @return true if terrestrialAnimals is equal to origin and false otherwise.
//     */
//    public boolean equals(Object obj)
//    {
//        boolean isEqual = false;
//        if(obj instanceof TerrestrialAnimals)
//            isEqual =  (super.equals(obj) && terrestrialAnimalUnique.getNoLegs() == ((TerrestrialAnimals)obj).terrestrialAnimalUnique.getNoLegs());
//        return isEqual;
//    }

    public boolean equals(Object obj)
    {
        if(obj instanceof TerrestrialAnimals) {
            return (super.equals(obj) && terrestrialAnimalUnique.equals(((TerrestrialAnimals) obj).terrestrialAnimalUnique));
        }
        return false;
    }

    public String getCategory()
    {
        return "Terrestrial";
    }

}
