package model;

import java.util.HashMap;
import java.util.Map;

public class Model {

    private Map<String, String> dizionario;

    public Model(){
        dizionario = new HashMap<String, String>();
    }
    public void addField(String key, String value){
        dizionario.put(key,value);
    }
    public String getField(String key){
        return dizionario.get(key);
    }
    public void patchField(){

    }

}
