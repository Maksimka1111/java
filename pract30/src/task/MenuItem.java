package task;

import java.io.Serializable;

public class MenuItem implements Serializable {
    protected int cost;
    protected String name, description;

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }
}
