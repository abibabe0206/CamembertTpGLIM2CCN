package View;

import Controller.Controller;
import Model.*;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] a) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(30, 30, 400, 400);

        // Create an instance of the model
        //
        CamembertModelInterface model = new CamembertModelInterfaceAdaptor();

        //new CamembertJTable().setVisible(true);
        model.addItem("Abiola pie", 30, "High in Blood");
        model.addItem("Abiola pie", 30, "High in Blood");


        // Maybe put some data in the model

        int oldFirst = 0;
        int oldLast = 0;

        // Create the controller and link the controller to the model...
        Controller controller = new Controller(model);

        // create the view
        CamembertView view = new CamembertView(model);
        view.setController(controller);
        controller.setView(view);

        ((CamembertModelInterfaceAdaptor) model).addObserver(view);

        window.addMouseListener(view);
        window.addMouseMotionListener(view);


        /**
         * JTable Section
         */

        DynamicTable modelTable = new DynamicTable(model);
        window.setTitle("Camembert Table");
        JTable table = new JTable(modelTable);
      // view.table = view.getTable();
        window.getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel buttons = new JPanel();


        buttons.add(new JButton(new AddAction(modelTable)));
        buttons.add(new JButton(new RemoveAction(table)));

        window.getContentPane().add(buttons, BorderLayout.BEFORE_FIRST_LINE);

        window.pack();


        // display layout
        GridLayout layout = new GridLayout(1, 1);

        window.getContentPane().add(controller.getView());

        window.setLayout(layout);
        //window.pack();
        window.setVisible(true);
        // window.pack();


    }

}
