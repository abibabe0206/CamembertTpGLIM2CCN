package Model;

import javax.swing.*;


public class CamembertJTable extends JFrame {

    /*private DynamicTable model = new DynamicTable();

    private JTable table;

    public CamembertJTable(){
        super();

        setTitle("Camembert Table");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        table = new JTable(model);

        getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel buttons = new JPanel();

        buttons.add(new JButton(new AddAction()));
        buttons.add(new JButton(new RemoveAction()));

        getContentPane().add(buttons, BorderLayout.SOUTH);

        pack();
    }

    private class AddAction extends AbstractAction {
        private AddAction(){
            super("Add Item");
        }

        public void actionPerformed(ActionEvent e){
            model.addItemTable();
        }
    }

    private class RemoveAction extends AbstractAction {
        private RemoveAction(){
            super("Remove Item");
        }

        public void actionPerformed(ActionEvent e){
            int[] selection = table.getSelectedRows();

            for(int i = selection.length - 1; i < selection.length; i--){
                model.removeItemTable(selection[i]);
            }
        }
    }*/
}
