package Model;

import java.util.List;

public interface CamembertModelInterface {
    void setMainTitle(String mainTitle);

    /**
     *
     * @return size
     */
    public int size();

    /**
     *
     * @param i
     * @return values
     */
    public double getValues(int i);

    /**
     *
     * @return total value of items bought
     */
    public double total();

    /**
     *
     * @param i
     * @return item title of a particular id
     */
    public String getTitle(int i);

    /**
     *
     * @return Main title
     */
    public String getTitle();



    /**
     *
     * @return the unit
     */
    public String getUnit();

    /**
     *
     * @param i
     * @return item description of a particular id
     */
    public String getDescription(int i);


    void setUnit(String unit);

    void addItem(String titre, double value, String description);
    
    List<ItemInterface> getItems();

    void removeItem(int rowIndex);
}
