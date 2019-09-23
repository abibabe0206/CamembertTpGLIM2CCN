package Model;

import java.util.List;

public class CamembertModel implements CamembertModelInterface {

    private String mainTitle = "Abiola";
    private  String unit = "$";
    /*
     * List of items
     * */
    List<ItemInterface> myItems;

    public CamembertModel(List<ItemInterface> myItems) {
        this.myItems = myItems;
    }




    public String getMainTitle() {
        return mainTitle;
    }

    @Override
    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    @Override
    public int size() {
        return myItems.size();
    }


    @Override
    public double getValues(int i) {
        return myItems.get(i).getValue();
    }

    @Override
    public double total() {
        double total = 0;
        for(ItemInterface item: myItems){
            total += item.getValue();
        }

        return total;
    }

    /**
     * @param i
     * @return item title of a particular id
     */
    @Override
    public String getTitle(int i) {
        return myItems.get(i).getTitre();
    }

    /**
     * @return Main title
     */
    @Override
    public String getTitle() {
        return mainTitle;
    }

    public String getUnit() {
        return unit;
    }

    /**
     * @param i
     * @return item description of a particular id
     */
    @Override
    public String getDescription(int i) {
        return myItems.get(i).getDescription();
    }

    @Override
    public void setUnit(String unit) {
        this.unit = unit;
    }


    @Override
    public void addItem(String titre, double value, String description){
        Item item = new Item(titre, value, description);
        myItems.add(item);
    }

    public List<ItemInterface> getItems(){
        return myItems;
    }

    @Override
    public void removeItem(int rowIndex) {
        myItems.remove(rowIndex);
    }
}
