package model;

import java.util.HashMap;
import java.util.Map;

public class Model {


    private String _name;
    private Map<String, String> _dizionario;

    public Model(String _name){
        this._name = _name;
        _dizionario = new HashMap<String, String>();
    }
    public void addField(String key, String value){
        _dizionario.put(key,value);
    }
    public String getField(String key){
        return _dizionario.get(key);
    }
    public void patchField(){

    }

}
