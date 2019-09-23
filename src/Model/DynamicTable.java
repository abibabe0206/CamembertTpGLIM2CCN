package Model;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;

public class DynamicTable extends AbstractTableModel {

    CamembertModelInterface model;


    public CamembertModelInterface getModel() {
        return model;
    }

    private final String[] headers = {"Title", "Value", "Description"};

    public DynamicTable(CamembertModelInterface m){
        super();
        model = m;

    }

    public int getRowCount(){
        return model.size();
    }

    public int getColumnCount(){
        return headers.length;
    }

    public String getColumnName(int columnIndex){
        return headers[columnIndex];
    }

    public Object getValueAt(int rowIndex, int columnIndex){
        switch (columnIndex){
            case 0:
                return model.getTitle(rowIndex);
            case 1:
                return model.getValues(rowIndex);
            case 2:
                return model.getDescription(rowIndex);
            default:
                return null;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return true;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex){
        if(aValue != null){
            ItemInterface item = model.getItems().get(rowIndex);

            switch (columnIndex){
                case 0:
                    item.setTitre(aValue.toString());
                    break;
                case 1:
                    item.setValue(Double.parseDouble(aValue.toString()));
                    break;
                case 2:
                    item.setDescription(aValue.toString());
                    break;
            }
        }
    }

    public void addItemTable(){
        model.addItem("Abiola pie", 30, "good for your body");

        fireTableRowsInserted(model.getItems().size() -1, model.getItems().size() -1);
    }

    public void removeItemTable(int rowIndex){
        model.removeItem(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
}


