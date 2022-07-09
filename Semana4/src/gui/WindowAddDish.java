package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class WindowAddDish extends JInternalFrame {
    private JDesktopPane desktopPane;
    private DishWindow dishWindow;

    private JLabel title;
    private JTextField txtId;
    private JTextField txtname;
    private JRadioButton radioYes;
    private JRadioButton radioNo;
    private ButtonGroup group;
    private JSpinner calories;
    private JTextField value;

    private JButton addDish;
    private JButton deleteDish;
    private JButton findDish;
    private JButton updateDish;

    private JTable table;
    private DefaultTableModel dtm;

    public WindowAddDish(JDesktopPane desktopPane,DishWindow dishWindow) {
        this.desktopPane = desktopPane;
        this.dishWindow = dishWindow;

        this.setTitle("Agregar Plato");
        this.setSize( 600,400 );
        this.setResizable( true );
        this.setDefaultCloseOperation( HIDE_ON_CLOSE );
        setClosable( true );
        setMaximizable( true );
        setIconifiable( true );

        setLayout( new GridBagLayout());

        beginComponents();
        addComponents();

        //this.pack();

        desktopPane.add( this );


    }

    private void addComponents() {
        GridBagConstraints gbc = new GridBagConstraints();

        //Agregar titulo
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 5;
        add( title,gbc);
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.NORTH;

        //Agregar Etiqueta del Id del Plato
        gbc.gridy = 1;
        add( new JLabel("ID del Plato"),gbc );

        //Agregar cuadro de texto para Id del Plato
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        add( txtId, gbc );
        gbc.weightx = 0.0;
        gbc.fill = GridBagConstraints.NONE;

        //Agregar Etiqueta del Nombre del Plato
        gbc.gridx = 0;
        gbc.gridy = 2;
        add( new JLabel("Nombre del Plato"),gbc);

        //Agregar Etiqueta de es vegetariano
        gbc.gridx = 4;
        add( new JLabel("Es Vegetariano?"),gbc);

        //Agregar cuadro de texto para Nombre del Plato
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        add( txtname,gbc );
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0.0;

        //Agregar cuadro de Botones de Radio
        JPanel panel = new JPanel();
        panel.setLayout( new GridLayout( 1,2 ) );
        panel.add(radioYes);
        panel.add(radioNo);
        gbc.gridx = 4;
        add( panel,gbc );

        //Agregar Etiqueta de es Calorias
        gbc.gridx = 0;
        gbc.gridy = 4;

        add( new JLabel("Calorias"),gbc );


        //Agregar Etiqueta de es Precio
        gbc.gridx = 2;
        add( new JLabel("Precio"),gbc );

        //Agregar Spinner de Calorias
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        add( calories, gbc );

        //Agregar cuadro de texto para el valor
        gbc.gridx = 2;
        gbc.gridwidth = 3;
        add( value, gbc );
        gbc.gridwidth = 0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0.0;

        //Agregar Tabla
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 4;
        gbc.gridheight = 4;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        add( new JScrollPane( table ),gbc );
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0.0;
        gbc.weighty = 0.0;

        //Agregar Botones
        gbc.gridx = 4;
        gbc.anchor = GridBagConstraints.NORTH;
        add(addDish,gbc);

        gbc.gridy = 7;
        add(deleteDish,gbc);

        gbc.gridy = 8;
        add(findDish,gbc);

        gbc.gridy = 9;
        add(updateDish,gbc);


    }

    private void beginComponents() {
        Font font = new Font(Font.SANS_SERIF,Font.PLAIN, 40 );
        title = new JLabel("Gestión de Platos");
        title.setFont( font );

        txtId = new JTextField();
        txtname = new JTextField();

        radioNo = new JRadioButton( "Si" );
        radioNo.setEnabled( true );
        radioYes = new JRadioButton("NO");
        group = new ButtonGroup( );
        group.add( radioNo );
        group.add( radioYes );

        SpinnerModel model = new SpinnerNumberModel(100,0,2000,1);
        calories = new JSpinner( model );

        value = new JTextField();

        addDish = new JButton("Agregar");
        addDish.setActionCommand( HandlingEvents.ADD_DISH );
        addDish.addActionListener( new HandlingEvents( dishWindow ) );

        deleteDish = new JButton("Borrar");
        findDish = new JButton("Buscar");
        updateDish = new JButton("Actualizar");

        Object[] headings = {"Id Plato","Nombre","Vegetariano","Calorias","Precio"};
        dtm = new DefaultTableModel( headings, 0 );

        table = new JTable( dtm );

    }
}
