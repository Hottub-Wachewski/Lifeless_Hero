import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Graphics;
public abstract class Character{
    protected int x;
    protected int y;
    protected Color back;
    protected Color frame;
    public Character(int x_spawn, int y_spawn, Color b, Color f){
        x = x_spawn;
        y = y_spawn;
        back = b;
        frame = f;
    }
    public void set_x(int use_this){
        x += use_this;
    }
    public void set_y(int use_this){
        y += use_this;
    }
    public int get_x(){
        return x;
    }
    public int get_y(){
        return y;
    }
    public Color get_back(){
        return back;
    }
    public Color get_frame(){
        return frame;
    }
    public void new_position(int q, int p){
        x = q;
        y = p;
    }
    
    public abstract void keyTyped(KeyEvent ke);

    public abstract void keyPressed(KeyEvent ke);

    public abstract void keyReleased(KeyEvent ke);

    public abstract void mouseClicked(MouseEvent ke);

    public abstract void mousePressed(MouseEvent me);
    
    public abstract void mouseReleased(MouseEvent me);

    public abstract void mouseEntered(MouseEvent me);

    public abstract void mouseExited(MouseEvent me);

    public abstract void mouseDragged(MouseEvent me);

    public abstract void mouseMoved(MouseEvent me);
}