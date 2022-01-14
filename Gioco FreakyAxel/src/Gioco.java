import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class Gioco extends Canvas implements KeyListener {
    private static final int larghezza = 1280;
    private static final int altezza = 720;
    private static final String nome_gioco = "Gioco Realizzato da Mirco Morelli";

    BufferedImage sfondo = null;
    BufferedImage topo = null;
    BufferedImage ombrello = null;

    public Gioco(){
        caricaRisorse();
    }


    Gioco gioco = new Gioco();

    public static void main(String[] args) {

        JFrame finestra_gioco = new JFrame(nome_gioco);

        Dimension dimensione_finestra = new Dimension(larghezza,altezza);
        finestra_gioco.setPreferredSize(dimensione_finestra);
        finestra_gioco.setMaximumSize(dimensione_finestra);
        finestra_gioco.setResizable(false);

        finestra_gioco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        finestra_gioco.add(finestra_gioco);
        finestra_gioco.addKeyListener((KeyListener) finestra_gioco);

        finestra_gioco.pack();
        finestra_gioco.setVisible(true);
    }
    private void caricaRisorse(){
        CaricatoreImmagini loader = new CaricatoreImmagini();
        sfondo = loader.caricaImmagine("/immagini/sfondo.png");
        topo = loader.caricaImmagine("/immagini/topo.png");
        ombrello = loader.caricaImmagine("/immagini/ombrello.png");
        System.out.println("Risorse caricate");

    }
    private void disegna(){
        Graphics g = this.getGraphics();

        g.drawImage(sfondo,0,0,larghezza,altezza,this);
        g.dispose();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        disegna();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
