package Graphics;
import Mobility.Point;
//TODO getSpeed in current task is int but getSpeed in last task is double


public interface IMovable {

    public String getAnimalName();
    public double getSpeed();
    public double move(Point p);


}
