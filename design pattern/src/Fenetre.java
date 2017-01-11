import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class Fenetre extends JFrame {


    //Déclaration
    private JFrame fenetre;
    private JPanel panel;
    private JButton button;
    private JComboBox liste;

    private StarWarsTheme starWarsTheme;
    private MarioTheme marioTheme;

    //Constructeur
    public Fenetre() {

        //Instance
        marioTheme = new MarioTheme();
        starWarsTheme = new StarWarsTheme();

        Object[] elements = new Object[]{"Mario", "StarWars"};
        liste = new JComboBox(elements);


        //Contexte
        fenetre = new JFrame();
        fenetre.setTitle("Changement theme");                   //Définit un titre pour notre fenêtre
        fenetre.setSize(400, 100);                              //Définit sa taille : 400 pixels de large et 100 pixels de haut
        fenetre.setLocationRelativeTo(null);                    //Nous demandons maintenant à notre objet de se positionner au centre
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Termine le processus lorsqu'on clique sur la croix rouge
        fenetre.setVisible(true);                               //Et enfin, la rendre visible

        panel = new JPanel();
        panel.add(liste);

        button = marioTheme.createButton("Mario");              //On associe le button au bouton Mario
        panel.add(button);                                      //On affiche le button

        fenetre.add(panel);


        //Selectionner item
        Object selected = liste.getSelectedItem();
        System.out.println(selected);


        liste.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent cliqueListe) {
                panel.remove(button);
                if(cliqueListe.getItem().equals("Mario")) {
                    button = marioTheme.createButton("Mario");
                }
                else {
                    button = starWarsTheme.createButton("StarWars");
                }
                panel.add(button);
                panel.repaint();
                panel.revalidate();
            }
        });




    }
}