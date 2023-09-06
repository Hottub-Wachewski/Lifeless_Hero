import java.util.Random;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
public class MyGame extends Game  {
    public static final String TITLE = "MyGame";
    public static final int SCREEN_WIDTH = 1000;
    public static final int SCREEN_HEIGHT = 1000;
    public User player_uno;
    private Random rand = new Random();
    public static ArrayList<Character> chests;
    public double time;
    // declare variables here

    public MyGame() {
        // initialize variables here
        player_uno = new User(430, 330, Color.CYAN, Color.RED);
        chests = new ArrayList<Character>();
        time = 0;
    }
    
    public void update() {
        time += 0.01;
        if(time > 5){
            time = 0;
            int rand1 = rand.nextInt(5) * 100;
            int rand2 = rand.nextInt(5) * 100;
            if(chests.size()!=1){
                chests.add(new Treasure(rand1+230, rand2+130, Color.YELLOW, Color.ORANGE, "gold"));
            }
        }
        // updating logic
    }
    
    public void draw(Graphics pen) {
        pen.setColor(Color.DARK_GRAY); 
        pen.fillRect(0, 0, 1000, 1000);
        pen.setColor(Color.WHITE); 
        pen.fillRect( 75, 680, 825, 250);
        pen.setColor(Color.BLACK); 
        pen.drawRect( 75, 680, 825, 250);
        int row = 230;
        int col = 130;
        pen.setColor(Color.GREEN);    
        for(int r=0; r<5; r++){
            for(int c=0; c<5; c++){
                pen.fillRect(row, col, 100, 100); 
                col += 100;
            }
            col = 130;
            row += 100;
        }
        row = 230;
        col = 130;
        pen.setColor(Color.ORANGE);    
        for(int r=0; r<5; r++){
            for(int c=0; c<5; c++){
                pen.drawRect(row, col, 100, 100); 
                col += 100;
            }
            col = 130;
            row += 100;
        }
        for(int t=0; t<chests.size(); t++){
            pen.setColor(chests.get(t).get_back());
            pen.fillRect(chests.get(t).get_x(), chests.get(t).get_y(), 100, 100);
            pen.setColor(chests.get(t).get_frame()); 
            pen.drawRect(chests.get(t).get_x(), chests.get(t).get_y(), 100, 100);
        }
        pen.setColor(player_uno.get_back()); 
        pen.fillRect(player_uno.get_x(), player_uno.get_y(), 100, 100);
        pen.setColor(player_uno.get_frame()); 
        pen.drawRect(player_uno.get_x(), player_uno.get_y(), 100, 100);
        pen.setFont(new Font("arial", 1, 50));
        pen.drawString("Gold: "+player_uno.get_gold()+"", 680, 730);
    }
        
    public void keyTyped(KeyEvent ke) {}

    public void keyPressed(KeyEvent ke) {player_uno.keyPressed(ke);
        if(chests.size() > 0){
            if(player_uno.get_x() == chests.get(0).get_x() && player_uno.get_y() == chests.get(0).get_y()){
                chests.remove(0);
                player_uno.add_gold(1);
            }
        }
    }

    public void keyReleased(KeyEvent ke) {}

    public void mouseClicked(MouseEvent ke) {}

    public void mousePressed(MouseEvent me) {}
    
    public void mouseReleased(MouseEvent me) {}

    public void mouseEntered(MouseEvent me) {}

    public void mouseExited(MouseEvent me) {}

    public void mouseDragged(MouseEvent me) {}

    public void mouseMoved(MouseEvent me) {}
        
        
    //Launches the Game
    public static void main(String[] args) { new MyGame().start(TITLE, SCREEN_WIDTH,SCREEN_HEIGHT); }
}