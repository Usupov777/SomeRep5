package web.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getHorsePowers() == car.getHorsePowers() && getModel().equals(car.getModel()) && getBrand().equals(car.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getHorsePowers(), getBrand());
    }
}
