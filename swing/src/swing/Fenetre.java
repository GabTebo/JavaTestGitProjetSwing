package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Fenetre
{
  public static void main(String[] args)
  {
    JFrame fenetre = new JFrame ("Clavier");
    Container panneau = fenetre.getContentPane();
    // Utilisation d'un gestionnaire de layout GridLayout de 4 lignes par
    // 4 colonnes avec un ecart d'un pixel entre les composants
    panneau.setLayout (new GridLayout (4, 4, 1, 1));
 
    // Ajout de boutons pour former un clavier de calculatrice
    panneau.add (new JButton ("7"));
    panneau.add (new JButton ("8"));
    panneau.add (new JButton ("9"));
    panneau.add (new JButton ("C"));
    panneau.add (new JButton ("4"));
    panneau.add (new JButton ("5"));
    panneau.add (new JButton ("6"));
    panneau.add (new JButton ("\u00f7"));
    panneau.add (new JButton ("1"));
    panneau.add (new JButton ("2"));
    panneau.add (new JButton ("3"));
    panneau.add (new JButton ("x"));
    panneau.add (new JButton ("0"));
    panneau.add (new JButton (","));
    panneau.add (new JButton ("+"));
    JButton boutonMoins = new  JButton ("-");
    final JTextField tx = new JTextField();
    panneau.add(tx); 
    
    boutonMoins.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			tx.setText("coucou");
		}
	});
    
    panneau.add (boutonMoins);
    

        
    // Calcul de la taille preferee de la fenetre en fonction de son contenu
    fenetre.pack();
    fenetre.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    fenetre.setVisible(true);
  }
}
