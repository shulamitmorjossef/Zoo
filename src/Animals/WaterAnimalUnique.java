package Animals;

public class WaterAnimalUnique {

    /**
     * The depth at which the animal dives.
     */
    private double diveDept;

    /**
     * The maximum dive depth allowed for any water animal.
     */
    private static final double MAX_DIVE = -800;


    public WaterAnimalUnique(double diveDept)
    {
        this.diveDept = diveDept;
    }

    protected double getDiveDept() {
        return diveDept;
    }

    protected double getMAX_DIVE() {
        return MAX_DIVE;
    }

    protected void setDiveDept(double diveDept) {
        this.diveDept = diveDept;
    }


    /**
     *Performs a dive with the specified depth.
     *
     * @param dept the depth of the dive to perform
     * @return true if the dive was successfully performed, false if the dive depth exceeds the maximum allowed or invalid value.
     */
    public boolean Dive(double dept)
    {
        if(dept >= 0)
            return false;
        if(getDiveDept() + dept < getMAX_DIVE())
            return false;

        setDiveDept(getDiveDept() + dept);
        return true;
    }

    /**
     * @return a string which describes the WaterAnimal object, including its name, gender, weight, speed, medals, position, total distance, dept of dive.
     * the function calls Animal toString function.
     */
    public String toString()
    {
        return "\ndive dept: " + getDiveDept();
    }





    /**
     * Check if waterAnimal is equal to origin.
     *
     * @param obj the object to compare with.
     * @return true if waterAnimal is equal to origin and false otherwise.
     */
    public boolean equals(Object obj)
    {
        if(obj instanceof WaterAnimalUnique) {

            return ((WaterAnimalUnique) obj).getDiveDept() == ((WaterAnimalUnique) obj).getDiveDept();
        }
        return false;
    }

}

