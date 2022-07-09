package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainWindow extends JFrame implements ActionListener, KeyListener {
    private JButton btnOk;
    private JButton btnClean;
    private JTextField txtName;
    private JLabel title;
    private JComboBox<String> options;

    public MainWindow(String title) {
        /***
         * Organizadores de Contenido
         *  FlowLayout, BorderLayout, GridLayout, GridBagLayout
         */

        super(title);
        this.setSize(new Dimension(320, 120));
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
    }

    public void begin() {
        beginElements();
        addElements();
    }

    private void addElements() {
        /*JPanel pnlNorth = new JPanel();
        pnlNorth.setBorder(BorderFactory.createLineBorder(Color.black));
        pnlNorth.setLayout( new GridLayout(1,1));
        pnlNorth.add(new JTextField());
        add(pnlNorth, BorderLayout.NORTH);


        add(new JLabel("SUR"), BorderLayout.SOUTH);

        JPanel pnlCenter = new JPanel();
        pnlCenter.setLayout( new GridLayout(3,4));
        for( int i = 0 ; i <= 9 ; i++ ){
            pnlCenter.add( new JButton(Integer.toString( i ) ) );
        }
        pnlCenter.add( new JButton("C"));
        pnlCenter.add( new JButton("AC"));
        add(pnlCenter, BorderLayout.CENTER);*/

        add(title,BorderLayout.NORTH);
        add(txtName,BorderLayout.CENTER);

        JPanel pnlSouth = new JPanel( new FlowLayout());
        pnlSouth.add( btnOk);
        pnlSouth.add( btnClean);
        pnlSouth.add( options );

        add( pnlSouth,BorderLayout.SOUTH);


    }

    private void beginElements() {
        btnOk = new JButton("Aceptar");
        btnOk.addActionListener( this );

        btnClean = new JButton("Limpiar");
        btnClean.addActionListener( this );


        txtName = new JTextField("Nombre");
        txtName.addKeyListener( this );
        title = new JLabel();

        String[] txtOptions = {"Sumar","Restar","Multiplicar", "Dividir"};
        options = new JComboBox<>( txtOptions );
        options.addActionListener( this );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       switch( e.getActionCommand()){
           case "Aceptar" : title.setText( "Hola " + txtName.getText());
           break;

           case "Limpiar" : txtName.setText("");
           break;

           case "comboBoxChanged" :
               System.out.println( "Se ha Pulsado " + options.getSelectedItem());
       }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char key = e.getKeyChar();
        if( !((key >= 65 && key <= 90) || (key >= 97 && key <= 122 ) || key == 32 ) ){
            e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
