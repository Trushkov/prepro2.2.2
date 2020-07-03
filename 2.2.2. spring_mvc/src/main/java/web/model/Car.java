package web.model;

import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private int series;

    private String name;

    private boolean isAWD;

    public Car() {
    }

    public Car(int series, String name, boolean isAWD) {
        this.series = series;
        this.name = name;
        this.isAWD = isAWD;
    }

    public int getSeries() {
        return series;
    }

    public String getName() {
        return name;
    }

    public boolean isAWD() {
        return isAWD;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAWD(boolean AWD) {
        isAWD = AWD;
    }

    @Override
    public String toString() {
        return "Car{" +
                "series=" + series +
                ", name='" + name + '\'' +
                ", isAWD=" + isAWD +
                '}';
    }
}
