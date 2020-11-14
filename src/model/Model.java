package model;

public class Model {

    private String _name;
    private String _username;
    private String _password;
    private String _code;


    public Model(String _name, String _code){
        this._name = _name;
        this._code = _code;
    }

    public Model(String _name, String _username, String _password){
        this._name = _name;
        this._username = _username;
        this._password = _password;
    }


    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_username() {
        return _username;
    }

    public void set_username(String _username) {
        this._username = _username;
    }

    public String get_password() {
        return _password;
    }

    public void set_password(String _password) {
        this._password = _password;
    }

    public String get_code() {
        return _code;
    }

    public void set_code(String _code) {
        this._code = _code;
    }
}
