package DibujoPanel;

import javax.swing.*;
import java.awt.*;

public class PanelDibujo extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int anchura=getWidth();
        int altura=getHeight();

        g.drawLine(125,0,200,200);
        g.drawLine(100,125,200,125);
        g.drawLine(125,0,125,200);


    }
}
