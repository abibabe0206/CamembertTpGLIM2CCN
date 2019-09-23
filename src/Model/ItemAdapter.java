package Model;

import java.util.Observable;

public class ItemAdapter extends Observable implements ItemInterface {
    private final ItemInterface delegateItem;

    public ItemAdapter(ItemInterface delegateItem) {
        this.delegateItem = delegateItem;
    }

    @Override
    public void notifyObservers() {
        setChanged();
        super.notifyObservers();
    }

    @Override
    public String getTitre() {
        return delegateItem.getTitre();
    }

    @Override
    public void setTitre(String titre) {
        delegateItem.setTitre(titre);
        notifyObservers();
    }

    @Override
    public double getValue() {
        return delegateItem.getValue();
    }

    @Override
    public void setValue(double value) {
        delegateItem.setValue(value);
        notifyObservers();
    }

    @Override
    public String getDescription() {
        return delegateItem.getDescription();
    }

    @Override
    public void setDescription(String description) {
        delegateItem.setDescription(description);
        notifyObservers();
    }
}
