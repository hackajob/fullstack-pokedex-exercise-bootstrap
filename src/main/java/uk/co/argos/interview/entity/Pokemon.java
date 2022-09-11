package uk.co.argos.interview.entity;

import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon {
    private Integer id;
    private HashMap<String, String> name;
    private HashMap<String, Integer> base; 

    public Integer getId() {
        return id;
    }

    public HashMap<String, String> getName() {
        return name;
    }

    public HashMap<String, Integer> getBase() {
        return base;
    }

    public void setId(Integer id) {    
        this.id = id;
    }

    public void setName(HashMap<String, String> name) {
        this.name = name;
    }

    public void setBase(HashMap<String, Integer> base) {
        this.base = base;
    }
}
