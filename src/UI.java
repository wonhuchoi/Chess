import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class UI extends JPanel implements MouseListener, MouseMotionListener{
    static int x=0, y=0;
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.setBackground(Color.RED);
        g.setColor(Color.RED);
        g.fillRect(10,20,100,200);
        Image ChessPieces;
        ChessPieces = new ImageIcon("ChessPieces.png").getImage();
        g.drawImage(ChessPieces, x, y,x+64,y+64, 0 ,0,64,64, this);
    }
    @Override
    public void mouseMoved(MouseEvent me){

    }
    @Override
    public void mousePressed(MouseEvent me){

    }
    @Override
    public void mouseReleased(MouseEvent me){

    }
    @Override
    public void mouseClicked(MouseEvent me){
        x = me.getX();
        y=me.getY();
    }
    @Override
    public void mouseDragged(MouseEvent me){

    }
    @Override
    public void mouseEntered(MouseEvent me){

    }
    @Override
    public void mouseExited(MouseEvent me){

    }
}
