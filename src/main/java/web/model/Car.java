package web.model;

public class Car {
private String model;
private int horsePowers;
private String brand;
public Car(){
}
public Car(String model, int horsePowers, String brand){
    this.model = model;
    this.horsePowers = horsePowers;
    this.brand = brand;
}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", horsePowers=" + horsePowers +
                ", brand='" + brand + '\'' +
                '}';
    }
}
