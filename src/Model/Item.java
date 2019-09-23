package Model;

public class Item implements ItemInterface {

    private String titre;
    private double value;
    private String description;


    public Item(String titre, double value, String description) {
        this.titre = titre;
        this.value = value;
        this.description = description;
    }


    @Override
    public String getTitre() {
        return titre;
    }

    /**
     *
     * @param titre
     * setting rhe titre
     */
    @Override
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     *
     * @return the value of item
     */
    @Override
    public double getValue() {
        return value;
    }

    @Override
    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }
}
