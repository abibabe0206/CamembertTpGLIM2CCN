package Model;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AddAction extends AbstractAction {

    DynamicTable table;
    public AddAction(DynamicTable m) {
        super("Add Item");
        table = m;
    }

    public void actionPerformed(ActionEvent e) {
        table.addItemTable();

    }
}