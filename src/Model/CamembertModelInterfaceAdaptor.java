package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 *
 */
public class CamembertModelInterfaceAdaptor extends Observable implements CamembertModelInterface  {



    private CamembertModel model;

    public CamembertModelInterfaceAdaptor() {
        this.model = new CamembertModel(new ArrayList<>());

    }

    @Override
    public void notifyObservers() {
        setChanged();
        super.notifyObservers();
    }

    public String getMainTitle() {
        return model.getMainTitle();
    }

    @Override
    public void setMainTitle(String mainTitle) {
        model.setMainTitle(mainTitle);
        notifyObservers();
    }

    @Override
    public int size() {
        return model.size();
    }

    @Override
    public double getValues(int i) {
        return model.getValues(i);
    }

    @Override
    public double total() {
        return model.total();
    }

    /**
     * @param i
     * @return item title of a particular id
     */
    @Override
    public String getTitle(int i) {
        return model.getTitle(i);
    }

    /**
     * @return Main title
     */
    @Override
    public String getTitle() {
        return model.getTitle();
    }

    @Override
    public String getUnit() {
        return model.getUnit();
    }

    /**
     * @param i
     * @return item description of a particular id
     */
    @Override
    public String getDescription(int i) {
        return model.getDescription(i);
    }

    public void setUnit(String unit) {
        model.setUnit(unit);
        notifyObservers();
    }

    @Override
    public void addItem(String titre, double value, String description) {
        model.myItems.add(new ItemAdapter(new Item(titre, value, description)));
        notifyObservers();
    }

    public List<ItemInterface> getItems() {
        return model.getItems();
    }

    @Override
    public void removeItem(int rowIndex) {
        model.removeItem(rowIndex);
        notifyObservers();
    }
}
