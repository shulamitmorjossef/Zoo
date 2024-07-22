package Animals;

import java.lang.Cloneable;
import java.awt.Graphics;

import Mobility.ILocatable;
import Mobility.Mobile;
import Mobility.Point;
import Olympics.Medal;
import Graphics.IDrawable;
import Graphics.IMovable;
import Graphics.IAnimal;
import java.awt.image.BufferedImage;
import Graphics.CompetitionPanel;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;


//import Graphics.CompetitionPanel;
//TODO ILocable in current task but ILocatable in last task
//TODO Cloneable in java but IClonable task



/**
 * Represents an animal.
 * cannot perform instances from this class.
 */
//public abstract class Animal extends Mobile implements , IMoveable, , Cloneable{




    public abstract class Animal extends Mobile implements IAnimal,IMovable, Cloneable, IDrawable, ILocatable {


//"Energy", "Amount", , "Energy Consuming
    private int size;
    private int id;
    private Point loc;
    private Orientation orientation;
    private int maxEnergy;
    private int currentEnergy;
    private int energyPerMeter;
    private CompetitionPanel pan;
    private BufferedImage img1, img2, img3, img4;


    /**
     * The name of the animal.
     */
    private String name;

    /**
     * The gender of the animal.
     */
    private Gender gender;

    /**
     * The weight of the animal.
     */
    private double weight;

    /**
     * The speed of the animal.
     */
    private double speed;

    /**
     * An array of medals of the animal.
     */
    private Medal [] medals;





    public Animal(String name, int speed,int energyPerMeter, int maxEnergy)
    {
        super();
        this. name = name;
        this.speed = speed;
        this.maxEnergy = maxEnergy;
        this.currentEnergy = 0;
        this.energyPerMeter = energyPerMeter;

        this.gender = Gender.Hermaphrodite;
        this.weight = 10;
        this.medals = null;

        this.size = 0;//TODO size of image of animal?
        this.id = 000000000;
        this.orientation = Orientation.EAST;
        this.pan = null;
        this.img1 = null;
        this.img2 = null;
        this.img3 = null;
        this.img4 = null;
    }






    /**
     * Construct a new Animal object with specified values.
     *
     * @param name animal name.
     * @param gender animal gender: Male, Female or Hermaphrodite.
     * @param weight animal weight. if the provided speed is less than or equal to 0, a default value of 10 is used.
     * @param speed animal speed. if the provided speed is less than or equal to 0, a default value of 10 is used.
     * @param medals animal medals- an array of medals that the animal has won. duplicates are removed from the array.
     */
    public Animal(String name, Gender gender, double weight, double speed, Medal[] medals   ,Point loc ,int size, int id, Orientation orientation,int maxEnergy, int energyPerMeter, CompetitionPanel pan)
    {
        super(loc,0);
        this.name = name;
        this.gender = gender;

        // Validate and set default values for weight and speed
        if(weight <= 0 || speed <= 0)
        {
            this.weight = 10;
            this.speed = 10;
        }
        else{
            this.weight = weight;
            this.speed = speed;
        }

        // Process the medals array to remove duplicates and ensure uniqueness
        if(medals != null)
        {
            // Calculate the actual size of the unique medals array
            int medalSize = medals.length;
            boolean isExists;
            for (int i=0; i<medals.length; i++)
            {
                isExists = false;
                for (int j = i+1; j < medals.length && !isExists; j++) {
                        if (medals[i].equals(medals[j])) {
                            --medalSize;
                            isExists = true;
                        }
                }
            }

            // Create a new array to store unique Medal objects
            this.medals = new Medal[medalSize];
            this.medals[0] = new Medal(medals[0]); // Copy the first element
            int k=1;
            for (int i=1; i<medals.length; i++)
            {
                isExists = false;
                for (int j = 0; j < k && k<medalSize && !isExists; j++)
                {
                    if (this.medals[j].equals(medals[i]))
                    {
                        isExists = true;
                    }
                    if (!isExists)
                    {
                        this.medals[k] = new Medal(medals[i]);
                        ++k;
                    }
                }
            }
        }
        else
            this.medals = medals; // Copy the first element



        this.size = size;
        this.id = id;
        this.orientation = orientation;
        this.maxEnergy = maxEnergy;
        this.currentEnergy = 0;
        this.energyPerMeter = energyPerMeter;
        this.pan = pan;

        this.img1 = null;
        this.img2 = null;
        this.img3 = null;
        this.img4 = null;
    }

    /**
     * Construct a new Animal with default values.
     */
    public Animal()
    {
        super();
        this. name = "raxi";
        this.gender = Gender.Hermaphrodite;
        this.weight = 10;
        this.speed = 10;
        this.medals = null;


        //added
        this.size = 0;
        this.id = 000000000;
        this.orientation = Orientation.EAST;
        this.maxEnergy = 200;
        this.currentEnergy = 0;
        this.energyPerMeter = 30;
        this.pan = null;

        this.img1 = null;
        this.img2 = null;
        this.img3 = null;
        this.img4 = null;
    }

    /**
     * Gets the current speed of the animal.
     *
     * @return the current speed of the animal.
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Sets the speed of the animal if the given speed is greater than 0.
     *
     * @param speed the speed to set.
     * @return true if the speed was set, false otherwise.
     */
    protected boolean setSpeed(double speed) {
        if(speed > 0) {
            this.speed = speed;
            return true;
        }
        return false;
    }

    /**
     * Function that prints the name and sound of animal.
     * the function calls sound function that prints the sound.
     */
    public final void makeSound(){
        System.out.print("Animal " + name + " said ");
        sound();
    }

    /**
     * Produces a sound characteristic of the animal.
     * This method should be implemented by subclasses to specify the sound.
     */
    protected abstract void sound();





    /**
     * @return a string which describes the Animal object, including its name, gender, weight, speed, medals, position, total distance
     */
    public String toString()
    {
        String string =  "name: " + name + "\ngender: " + gender + "\nweight: " + weight + "\nspeed: " + speed;
        if(medals != null) {
            if (medals.length > 0) {
                string += "\n---***--medals---***--\n";
                for (int i = 0; i < medals.length; ++i)
                    string += "(" + (i + 1) + ") " + medals[i].toString() + "\n";
                string += "---***----------***--\n";
            }
            else if (medals.length == 0) {
                string += "\n";

            }
        }
        else  {
            string += "\n";

        }
        string += super.toString();

        return string;
    }




    /**
     * Checks if the medals of this animal object are equal to another object's medals.
     * Equality is determined by comparing the content of the medals arrays; they are considered
     * equal if they contain the same medals, regardless of their indexed positions.
     *
     @param obj the object to compare with
     @return true if the medals arrays of both objects contain identical medals,
     false otherwise or if the comparison object is not an instance of Animal
     */
    private boolean isMedalsEqual(Object obj)
    {
        boolean isExists;
        // Check if both this animal and the other object have non-null medals arrays
        if(medals != null && ((Animal)obj).medals != null)
        {
            // Check if the lengths of the medals arrays are equal
            if (medals.length != ((Animal) obj).medals.length)
                return false;
            else
                // Compare each medal in this animal's medals array with the other object's medals array
                for (int i = 0; i < medals.length; ++i)
                {
                    isExists = false;
                    for (int j = 0; j < medals.length && !isExists; ++j)
                        if (medals[i].equals(((Animal) obj).medals[j]))
                            isExists = true;
                    // If a medal in this animal's array is not found in the other object's array, return false
                    if (!isExists)
                        return false;
                }
        }
        // Check if one has null medals array while the other has non-null medals array
        else if((medals != null && ((Animal)obj).medals == null) || (medals == null && ((Animal)obj).medals != null))
            return false;
        // If both have null medals arrays or both have non-null and equal length medals arrays, return true
        return true;
    }



    /**
     * Check if animal is equal to origin.
     *
     * @param obj the object to compare with.
     * @return true if animal is equal to origin and false otherwise.
     */
    public boolean equals(Object obj)
    {
        boolean isEqual = false;
        if(obj instanceof Animal) {
            isEqual = name.equals (((Animal) obj).name);
            isEqual = isEqual && gender == ((Animal)obj).gender;
            isEqual = isEqual && weight == ((Animal)obj).weight;
            isEqual = isEqual && speed == ((Animal)obj).speed;
            isEqual = isEqual && isMedalsEqual(obj);
            isEqual = isEqual && super.equals((obj));
        }
        return isEqual;
    }




    public void drawObject (Graphics g)
    {
        if(orientation==Orientation.EAST) // animal move to the east side
            g.drawImage(img1, super.getLocationX(), super.getLocationY()-size/10, size*2, size, pan);

        else if(orientation==Orientation.SOUTH) // animal move to the south side
            g.drawImage(img2, super.getLocationX(), super.getLocationY()-size/10, size, size, pan);

        else if(orientation==Orientation.WEST) // animal move to the west side
            g.drawImage(img3, super.getLocationX(), super.getLocationY()-size/10, size*2, size, pan);

        else if(orientation==Orientation.NORTH) // animal move to the north side
            g.drawImage(img4, super.getLocationX()-size/2, super.getLocationY()-size/10, size, size*2, pan);
    }


    public void loadImages(String nm)
    {
        try {
            img1 = ImageIO.read(new File(PICTURE_PATH + nm + "1.png"));
            System.out.println("yes!!");

            img2 = ImageIO.read(new File(PICTURE_PATH + nm + "2.png"));
            System.out.println("yes!!");

            img3 = ImageIO.read(new File(PICTURE_PATH + nm + "3.png"));
            System.out.println("yes!!");

            img4 = ImageIO.read(new File(PICTURE_PATH + nm + "4.png"));
            System.out.println("yes!!");

        }
        catch (IOException e) { System.out.println("Cannot load images for " + nm); }


    }



    public Animal clone()
    {
        try{
            return (Animal)super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            throw new AssertionError();
        }

    }


    public int getMaxEnergy() {
        return maxEnergy;
    }

    public int getCurrentEnergy() {
        return currentEnergy;
    }



    public abstract String getCategory();


    public abstract String getType();


    /**
     * Increases the animal's energy by the specified amount.
     *
     * @param energy The amount of energy to add to the animal's current energy level. Must be a positive integer.
     * @return {@code true} if the energy was successfully added without exceeding the maximum allowed energy;
     *         {@code false} if adding the specified energy would exceed the maximum energy level.
     */
    public boolean eat(int energy)
    {
        if(energy <= 0)
            return false;
        if(currentEnergy + energy > maxEnergy)
            return false;
        currentEnergy += energy;
        return true;
    }

    public String getAnimalName()
    {
        return name;
    }














}
