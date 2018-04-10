package artmx.tourismpedia.indo.model;

/**
 * Created by ARTMX on 27-Dec-16.
 */

public class Category {

    private String name;
    private int thumbnail;

    public Category(String name, int thumbnail) {
        this.name = name;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getThumbnail() {
        return thumbnail;
    }

}
