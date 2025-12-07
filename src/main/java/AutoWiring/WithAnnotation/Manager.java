package AutoWiring.WithAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manager {
    private Employee employee;

    @Autowired
    public Manager(Employee employee) {
        this.employee = employee;
    }

    public void showStaffDetails(){
        System.out.println(employee.toString());
    }
}
