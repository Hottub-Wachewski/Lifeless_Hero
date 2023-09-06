import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Graphics;
public class Treasure extends Character{
    private String items;
    public Treasure(int x_spawn, int y_spawn, Color b, Color f, String i){
        super(x_spawn, y_spawn, b, f);
        items = i;
    }
    public String get_items(){
        return items;
    }
    public void keyTyped(KeyEvent ke) {}

    public void keyPressed(KeyEvent ke) {}

    public void keyReleased(KeyEvent ke) {}

    public void mouseClicked(MouseEvent ke) {}

    public void mousePressed(MouseEvent me) {}
    
    public void mouseReleased(MouseEvent me) {}

    public void mouseEntered(MouseEvent me) {}

    public void mouseExited(MouseEvent me) {}

    public void mouseDragged(MouseEvent me) {}

    public void mouseMoved(MouseEvent me) {}
}