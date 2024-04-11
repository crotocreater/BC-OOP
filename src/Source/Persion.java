package Source;

import java.io.Serializable;

public class Persion implements Serializable {
    protected String id, name;
    public Persion(){}
    public Persion(String id, String name){
        this.id = id;
        this.name = name;
    }
    public Persion(Persion another){
        this.name = another.name;
        this.id = another.id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
}
