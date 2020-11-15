package model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Service implements Serializable {

    private String name;
    private Map<String, String> dizionario;

    public Service(String name){
        this.name = name;
        dizionario = new HashMap<>();
    }

    public String getName(){
        return name;
    }
    public void addField(String key, String value){
        dizionario.put(key,value);
    }
    public String getField(String key){
        return dizionario.get(key);
    }
    public void updateField(String key){

    }

}
