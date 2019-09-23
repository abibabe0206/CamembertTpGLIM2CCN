package Controller;

import Model.CamembertModelInterface;
import Model.CamembertModelInterfaceAdaptor;
import View.CamembertView;

public class Controller {


    CamembertModelInterface model;
    CamembertView view;

    boolean selected = false;
    int selectedItem;

    public Controller(CamembertModelInterface model) {
        this.model = model;
    }

    public CamembertView getView() {
        return  this.view;
    }



    public void setSelected(boolean b) {
        selected = b;
        view.repaint();
    }


    public void setSelectedPie(int i) {
        selected = true;
        selectedItem = i;
        view.repaint();
    }

    public int getSelectedPie() {
        return this.selectedItem;
    }


    public boolean isSelected() {
        return this.selected;
    }

    public void deSelect() {
        this.selected = false;
    }

    public void nextPie() {
        this.selectedItem++;

    }

    public void previousPie() {
        this.selectedItem--;
    }

    public void addItem( String titre, int value, String description){
      model.addItem(titre, value, description);

    }

    public void setView(CamembertView v) {
        view = v;
    }
}
