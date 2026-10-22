package practicadospspaoa;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class PracticaDosPSPAOA extends JFrame
{
    //Soy una prueba de commit
    //Creo el array de clientes
    
    ArrayList <Cliente> clientes  = new ArrayList<>();
    //Etiquetas para identificar los campos de texto
    private JLabel numeroLabel;
    private JLabel nombreLabel;
    private JLabel edadLabel;
    private JLabel puntosLabel;
    
    //Text fields para introducir números (ahora son de Swing: JTextField)
    private JTextField numeroField;
    private JTextField dobleField;
    private JTextField edadField;
    private JTextField puntosField;
    
    private JButton atrasButton;
    private JButton adelanteButton;

    public PracticaDosPSPAOA() {
        super("Doble");
        clientes.add(new Cliente("1","Adrian","18","1500"));
        clientes.add(new Cliente("2","Fernado","21","1300"));
        clientes.add(new Cliente("3","Luiza","22","1600"));
        clientes.add(new Cliente("4","Santi","18","2500"));
        //Lo que pasa si cerramos la ventana (sustituye al WindowListener
        //con windowClosing y System.exit(0) de la versión anterior).
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Crea las etiquetas.
        numeroLabel = new JLabel("Numero: ");
        nombreLabel = new JLabel("Nombre: ");
        edadLabel = new JLabel("Edad: ");
        puntosLabel = new JLabel("Puntos: ");

        //Campo donde vamos a introducir el número
        numeroField = new JTextField(10);
        edadField = new JTextField("");
        puntosField = new JTextField("");

        //Campo que nos muestra el doble del numero introducido
        dobleField = new JTextField(10);
        dobleField.setForeground(Color.red);
        
        atrasButton = new JButton("Atras!");
        atrasButton.addActionListener(new ActionListener() {  // Evento de boton.
            public void actionPerformed(ActionEvent e) {
                System.out.println("atras");
            }
        });
        
        adelanteButton = new JButton("Avanzar!");
        adelanteButton.addActionListener(new ActionListener() {  // Evento de boton.
            public void actionPerformed(ActionEvent e) {
                System.out.println("Adelante");
            }
        });

        //Dispone la geometría de las etiquetas en un panel
        JPanel labelPane = new JPanel();
        labelPane.setLayout(new GridLayout(0, 1));
        labelPane.add(numeroLabel);
        labelPane.add(nombreLabel);
        labelPane.add(edadLabel);
        labelPane.add(puntosLabel);
        
        JPanel BotonesPane = new JPanel();
        labelPane.setLayout(new GridLayout(0,1));
        BotonesPane.add(atrasButton);
        BotonesPane.add(adelanteButton);
        
        
        //Dispone los campos de texto en otro panel
        JPanel fieldPane = new JPanel();
        fieldPane.setLayout(new GridLayout(0, 1));
        fieldPane.add(numeroField);
        fieldPane.add(dobleField);
        fieldPane.add(edadField);
        fieldPane.add(puntosField);

        //Incluye los dos paneles en otro panel,
        //etiquetas a la izquierda
        //y campos de texto a la derecha.
        JPanel contentPane = new JPanel();
        contentPane.setBorder(
               BorderFactory.createEmptyBorder(20, 20, 20, 20));
        contentPane.setLayout(new BorderLayout());
        contentPane.add(labelPane, BorderLayout.CENTER);
        contentPane.add(fieldPane, BorderLayout.EAST);
        contentPane.add(BotonesPane, BorderLayout.SOUTH);

        setContentPane(contentPane);  //this.setContentPane(contentPane);
          // es set, o sea, machado el contenedor del objeto "Doble", hijo de JFrame

    }

    public static void main(String[] args) {
        
        // Toda la interfaz Swing se crea en el hilo de eventos (receta: se hace siempre así).
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                final PracticaDosPSPAOA app = new PracticaDosPSPAOA();

                //Este WindowListener ya solo sirve para poner el foco.
                //(Para cerrar la ventana ya no hace falta: setDefaultCloseOperation.)
                app.addWindowListener(new WindowAdapter() {
                    //Pone el focus (foco de atencion)
                });
                app.pack();
                app.setVisible(true);
            }
        });
    }

}
