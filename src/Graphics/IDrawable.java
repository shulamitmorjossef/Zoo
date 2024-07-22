package Graphics;

import java.awt.Graphics;

public interface IDrawable {
    public final static String PICTURE_PATH = "C:\\Users\\Student\\Pictures\\Task2Images\\";
    public void loadImages(String nm);
    public void drawObject(Graphics g);

}
