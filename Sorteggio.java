import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class Sorteggio extends JFrame implements ActionListener{
	JTextArea parola= new JTextArea ();
	JTextArea risultato= new JTextArea (); 
	
	JButton Inserimento= new JButton("Inserisci");   //bottone per funzioni
	JButton Cancella=new JButton("Cancella");
	JButton Stampa=new JButton("Stampa");
	
	JLabel Parola=new JLabel ("Inserire parola: ");
	JLabel Risultato=new JLabel ("Risultato: ");
	
	ArrayList lista=new ArrayList();
	
	public Sorteggio() {
		super("Sorteggio randomico.");
		
		Container cont=this.getContentPane();
		cont.setLayout(new FlowLayout());
		
		cont.add(Parola);
		cont.add(parola);
		Parola.setHorizontalTextPosition(Parola.LEFT);
		parola.setPreferredSize(new Dimension(250,20));	
		
		
		cont.add(Inserimento);
		Inserimento.addActionListener( e -> Inserimento());
		cont.add(Cancella);
		Cancella.addActionListener(e -> Cancella());
		cont.add(Stampa);
		Stampa.addActionListener(e -> Stampa());
		
		cont.add(Risultato);
		cont.add(risultato);
		Risultato.setHorizontalTextPosition(Risultato.LEFT);
		risultato.setPreferredSize(new Dimension (250,20));
		
		setSize(300,300);
		setVisible (true);
		setResizable(false);
	}
	
	public void Inserimento() {
		if (parola.getText()!=""||parola.getText()!=" ") {
		lista.add(parola.getText());
		parola.setText("");
		}
	}
	
	public void Cancella(){
        parola.setText("");
        risultato.setText("");
    }
	
	public void Stampa() {
		int r=(int)(Math.random()*lista.size());
		risultato.setText((String)(lista.get(r)));
	}
@Override
public void actionPerformed (ActionEvent e) {
	if (e.getSource()==Inserimento) {
		Inserimento();
	}
	if (e.getSource()==Cancella) {
		Cancella();
	}
	if (e.getSource()==Stampa) {
		Stampa();
	}
}
}


