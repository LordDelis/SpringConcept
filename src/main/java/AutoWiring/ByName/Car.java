package AutoWiring.ByName;

public class Car {
    Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println(specification.toString());
    }

}
