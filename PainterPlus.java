import org.code.neighborhood.*;

public class PainterPlus extends Painter{

    public void turnRight() {
      turnLeft();
      turnLeft();
      turnLeft();
    }

    public void paintNGo(String color) {
      setPaint(1);
      paint(color);
      move();
    }
}

