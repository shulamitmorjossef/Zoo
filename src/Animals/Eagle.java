package Animals;

import Graphics.CompetitionPanel;
import Mobility.Point;
import Olympics.Medal;

/**
 * Represents an Eagle animal.
 */
public class Eagle extends AirAnimal {

    /**
     * The altitude at which the eagle flies.
     */
    private double altitudeOfFlight;

    /**
     * The maximum altitude an eagle can fly.
     */
    static final int MAX_ALTITUDE = 1000;

    /**
     * Construct a new Eagle object with specified values.
     *
     * @param name Eagle name.
     * @param gender Eagle gender: Male, Female or Hermaphrodite.
     * @param weight Eagle weight. if the weight is less than or equal to 0, a default value of 10 is used.
     * @param speed Eagle speed. if the speed is less than or equal to 0, a default value of 10 is used.
     * @param medals Eagle medals- an array of medals that the animal has won. duplicates are removed from the array.
     * @param wingspan length of the wingspan of Eagle. if the wingspan is less than or equal to 0, a default value of 30 is used.
     * @param altitudeOfFlight Eagle altitude of flight. if the altitude of flight is less than or equal to 0, a default value of 100 is used.
     */
    public Eagle(String name, Gender gender, double weight, double speed, Medal[] medals, Point loc , int size, int id, Orientation orientation, int maxEnergy, int energyPerMeter, CompetitionPanel pan, double wingspan, double altitudeOfFlight)
    {
        super(name, gender, weight, speed, medals, loc,size, id, orientation, maxEnergy, energyPerMeter, pan,wingspan);

        if(altitudeOfFlight > MAX_ALTITUDE)
            altitudeOfFlight = MAX_ALTITUDE;

        else if(altitudeOfFlight <= 0)
        altitudeOfFlight = 100;

        this.altitudeOfFlight = altitudeOfFlight;
    }

    public Eagle(String name, int speed,int energyPerMeter, int maxEnergy) {
        super(name, speed, energyPerMeter, maxEnergy);
        this.altitudeOfFlight = 100;
    }


    /**
     * Construct a new Eagle with default values.
     */
    public Eagle()
    {
        super();
        this.altitudeOfFlight = 100;
    }

    /**
     * Produces the sound characteristic of Eagle.
     */
    protected void sound(){
        System.out.println("Clack-wack-chack");
    }


    /**
     * @return a string which describes the Eagle object, including its name, gender, weight, speed, medals, position, total distance, wingspan, altitude of flight.
     * the function calls AirAnimal toString function.
     */
    public String toString()
    {
        return super.toString() + "\naltitude of flight: " + altitudeOfFlight + "\ntype of animal: Eagle";
    }


    /**
     * Check if eagle is equal to origin.
     *
     * @param obj- the object to compare with.
     * @return true if eagle is equal to origin and false otherwise.
     */
    public boolean equals(Object obj)
    {
        boolean isEqual = false;
        if(obj instanceof Eagle)
            isEqual = super.equals(obj) && altitudeOfFlight == ((Eagle) obj).altitudeOfFlight;
        return isEqual;
    }

    public String getType()
    {
        return "Eagle";
    }
}
