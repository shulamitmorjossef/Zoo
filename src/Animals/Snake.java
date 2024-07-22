package Animals;

import Graphics.CompetitionPanel;
import Mobility.ILocatable;
import Mobility.Point;
import Olympics.Medal;

/**
 * Represents a Snake animal.
 */
public class Snake extends TerrestrialAnimals implements IReptile {

    /**
     * Represents the poisonous nature of the snake: yes or no.
     */
    private Poisonous poisonous;

    /**
     * Length of the snake.
     */
    private double length;


    /**
     * Construct a new Snake object with specified values.
     *
     * @param name Snake name
     * @param gender Snake gender: Male, Female or Hermaphrodite.
     * @param weight Snake weight. if the weight is less than or equal to 0, a default value of 10 is used.
     * @param speed Snake speed. if the speed is less than or equal to 0, a default value of 10 is used.
     * @param medals Snake medals- an array of medals that the animal has won. duplicates are removed from the array.
     * @param poisonous Snake degree of Poisonous: Mild, Moderate or Severe.
     * @param length length of Snake. if the length is less than or equal to 0, a default value of 13 is used.
     *
     * number of legs is set to 0.
     */
    public Snake(String name, Gender gender, double weight, double speed, Medal[] medals, Point loc , int size, int id, Orientation orientation, int maxEnergy, int energyPerMeter, CompetitionPanel pan, Poisonous poisonous, double length)
    {
        super(name, gender, weight, speed, medals, loc,size, id, orientation, maxEnergy, energyPerMeter, pan, 0);
        setNoLegsToDefault();

        this.poisonous = poisonous;
        if(length <= 0)
            length = 13;
        this.length = length;
    }

    public Snake(String name, int speed,int energyPerMeter, int maxEnergy) {
        super(name, speed, energyPerMeter, maxEnergy);
        this.poisonous = Poisonous.Low;
        this.length = 13;
    }

    /**
     * Construct a new Snake with default values.
     */
    public Snake()
    {
        super();
        this.poisonous = Poisonous.Low;
        this.length = 13;
    }


    /**
     * Produces the sound characteristic of Snake.
     */
    protected void sound(){
        System.out.println("ssssssss");
    }


    /**
     * @return a string which describes the Snake object, including its name, gender, weight, speed, medals, position, total distance, number of legs, poisonous level.
     * the function calls TerrestrialAnimals toString function.
     */
    public String toString()
    {
        if(poisonous == Poisonous.Low)
            return super.toString() + "\npoisonous: no" + "\nlength: " + length + "\ntype of animal: Snake";
        return super.toString() + "\npoisonous: yes" + "\nlength: " + length + "\ntype of animal: Snake";

    }


    /**
     * Check if snake is equal to origin.
     *
     * @param obj the object to compare with.
     * @return true if snake is equal to origin and false otherwise.
     */
    public boolean equals(Object obj)
    {
        boolean isEqual = false;
        if(obj instanceof Snake)
            isEqual = super.equals(obj) && poisonous == ((Snake) obj).poisonous && length == ((Snake) obj).length;
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
        return "Snake";
    }


}
