package Animals;

//toDO continue
public class TerrestrialAnimalUnique{

    private double noLegs;



    public TerrestrialAnimalUnique(double noLegs)
    {
        this.noLegs = noLegs;
    }

    protected void setNoLegs(double noLegs) {
        this.noLegs = noLegs;
    }

    protected double getNoLegs() {
        return noLegs;
    }

    public boolean equals(Object obj)
    {
        if(obj instanceof TerrestrialAnimalUnique) {

            return ((TerrestrialAnimalUnique) obj).getNoLegs() == ((TerrestrialAnimalUnique) obj).getNoLegs();
        }
        return false;
    }

    public String toString()
    {
        return "\nnumber of legs: " + getNoLegs();
    }





}

