package snakegame;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author jaydi
 */
public class GamePanel extends JPanel {

    private ImageIcon snaketitle = new ImageIcon(getClass().getClass().getResource("snaketitle.jpg"));

    GamePanel() {

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.WHITE);
        g.clipRect(24, 10, 851, 55);
        g.drawRect(24, 74, 851, 576);

        snaketitle.paintIcon(this, g, 25, 11);
    }

}
