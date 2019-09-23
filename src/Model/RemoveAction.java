package Model;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class RemoveAction extends AbstractAction {

    JTable table;
    public RemoveAction(JTable t){
        super("Remove Item");
        table = t;
    }

    public void actionPerformed(ActionEvent e){
        DynamicTable m = (DynamicTable) table.getModel();
       try {
           int rowIndex = table.getSelectedRow();
           //System.out.println("rowIndex" + rowIndex);
           m.removeItemTable(rowIndex);
       }catch (Exception ex){
           JOptionPane.showMessageDialog(null,ex);
       }

    }
}
