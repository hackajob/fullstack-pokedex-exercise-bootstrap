package uk.co.hackajob.interview.entity;

import java.util.HashMap;

public class Pokemon {
    private int id;
    private HashMap<String, String> name;
    private HashMap<String, Integer> base; 

    public int getId() {
        return id;
    }

    public HashMap<String, String> getName() {
        return name;
    }

    public HashMap<String, Integer> getBase() {
        return base;
    }

    public void setId(int id) {    
        this.id = id;
    }

    public void setName(HashMap<String, String> name) {
        this.name = name;
    }

    public void setBase(HashMap<String, Integer> base) {
        this.base = base;
    }
}
