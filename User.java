import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Graphics;
public class User extends Character{
    private int gold;
    public User(int x_spawn, int y_spawn, Color b, Color f){
        super(x_spawn, y_spawn, b, f);
        gold = 0;
    }
    public void keyTyped(KeyEvent ke) {}

    public void keyPressed(KeyEvent ke) {if(ke.getKeyChar() == 'w'){
        y-=100;
    }
    else if(ke.getKeyChar() == 's'){
        y+=100;
    }
    else if(ke.getKeyChar() == 'a'){
        x-=100;
    }
    else if(ke.getKeyChar() == 'd'){
        x+=100;
    }
    if(x<230){
        x+=100;
    }
    if(x>630){
        x-=100;
    }
    if(y<130){
        y+=100;
    }
    if(y>530){
        y-=100;
    }
    }
    public void add_gold(int i){
        gold += 1;
    }
    public int get_gold(){
        return gold;
    }

    public void keyReleased(KeyEvent ke) {}

    public void mouseClicked(MouseEvent ke) {}

    public void mousePressed(MouseEvent me) {}
    
    public void mouseReleased(MouseEvent me) {}

    public void mouseEntered(MouseEvent me) {}

    public void mouseExited(MouseEvent me) {}

    public void mouseDragged(MouseEvent me) {}

    public void mouseMoved(MouseEvent me) {}
}