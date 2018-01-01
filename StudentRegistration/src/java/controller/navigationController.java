package controller;

import dao.StudentDao;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;


@Named(value = "navigationController")
@RequestScoped
public class navigationController {
    


    private String location;
 

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public navigationController() {
    }

    public String navigate() {
    
        if (this.location.equals("Göteborg")) {
            return "confirmation";
        } else {
            return "confirmation2";
        }
    }
}
