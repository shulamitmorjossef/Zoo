package Animals;

import Mobility.ILocatable;
import Mobility.Point;
import Olympics.Medal;
import Graphics.CompetitionPanel;

import java.awt.*;

/**
 * Represents an Alligator animal.
 */

public class Alligator extends Animal implements IReptile ,IWaterAnimal,ITerrestrialAnimals {

    private WaterAnimalUnique waterAnimalUnique;
    private TerrestrialAnimalUnique terrestrialAnimalUnique;


    /**
     * The area where the alligator lives.
     */
    private String areaOfLiving;

    /**
     * Construct a new Alligator object with specified values.
     *
     * @param name alligator name.
     * @param gender alligator gender: Male, Female or Hermaphrodite.
     * @param weight alligator weight. if the weight is less than or equal to 0, a default value of 10 is used.
     * @param speed alligator speed. if the speed is less than or equal to 0, a default value of 10 is used.
     * @param medals alligator medals- an array of medals that the animal has won. duplicates are removed from the array.
     * @param diveDept the dept of alligator diving. if the dept of diving is above or equal to 0, a default value of -200 is used.
     * @param areaOfLiving area the alligator lives.
     */
    public Alligator(String name, Gender gender, double weight, double speed, Medal[] medals, Point loc , int size, int id, Orientation orientation, int maxEnergy, int energyPerMeter, CompetitionPanel pan, double diveDept, String areaOfLiving)
    {
        super(name, gender, weight, speed, medals, loc,size, id, orientation, maxEnergy, energyPerMeter, pan);
        waterAnimalUnique = new WaterAnimalUnique(diveDept);
        terrestrialAnimalUnique = new TerrestrialAnimalUnique(4);
        //, diveDept
//        waterAnimal = new WaterAnimal();
        this.areaOfLiving = areaOfLiving;
    }
    public Alligator(String name, int speed,int energyPerMeter, int maxEnergy) {
        super(name, speed, energyPerMeter, maxEnergy);
        this.areaOfLiving = "desert";
    }

    /**
     * Construct a new Alligator with default values.
     */
    public Alligator()
    {
        super();
        this.areaOfLiving = "desert";
    }


    /**
     * Produces the sound characteristic of Alligator.
     */
    protected void sound(){
        System.out.println("Roar");
    }


    /**
     * @return a string which describes the Alligator object, including its name, gender, weight, speed, medals, position, total distance, dive dept, area of living.
     * the function calls WaterAnimal toString function.
     */
    public String toString()
    {
        return super.toString() + "\narea of living: " + areaOfLiving + "\ntype of animal: Alligator";
    }


    /**
     * Check if alligator is equal to origin.
     *
     * @param obj the object to compare with.
     * @return true if alligator is equal to origin and false otherwise.
     */
    public boolean equals(Object obj)
    {
        boolean isEqual = false;
        if(obj instanceof Alligator)
            isEqual =  super.equals(obj) && areaOfLiving.equals(((Alligator)obj).areaOfLiving);
        return isEqual;
    }


    /**
     * Increases the current speed of the animal by a specified amount.
     *
     * @param speed the amount to increase the current speed by. must be greater than 0.
     * @return true if the speed was successfully increased and false otherwise.
     */
    public boolean speedUp(int speed)
    {
        if(speed <= 0)
            return false;

        this.setSpeed(super.getSpeed() + speed);
        return true;
    }

    public String getType()
    {
        return "Alligator";
    }



//    public void drawObject(Graphics g)
//    {
//
//        public void paintComponent(Graphics g)   {
//        super.paintComponent(g);
//        g.drawImage(img,0,0,getWidth(),getHeight(), this);
//     .....
//        {
//
//
//        }

    public String getCategory()
    {
        return "Terrestrial+Water";
    }

    public boolean Dive(double dept)
    {
        return waterAnimalUnique.Dive(dept);
    }






}
