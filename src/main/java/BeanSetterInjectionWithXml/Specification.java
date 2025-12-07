package BeanSetterInjectionWithXml;

public class Specification {
    private String make;
    private String model;
    private String manufactureYear;
    private String engineType;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
        System.out.println("Set make called");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "SPECIFICATION:\n" +
                "Make: " + make + "\n" +
                "Model: " + model + "\n" +
                "Manufacture Year: " + manufactureYear + "\n" +
                "Engine Type='" + engineType;
    }
}
