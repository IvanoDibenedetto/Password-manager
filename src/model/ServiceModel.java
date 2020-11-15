package model;

import java.util.ArrayList;

public class ServiceModel {

    private ArrayList<Service> serviceList;

    public ServiceModel(){
     serviceList = new ArrayList<>();
     serviceList.add(new Service("facebook"));
    }

    public Service getServiceByName(String name){

        for (Service service : serviceList) {
            if (service.getName().equals(name))
                return service;
        }
        return null;
    }

}
