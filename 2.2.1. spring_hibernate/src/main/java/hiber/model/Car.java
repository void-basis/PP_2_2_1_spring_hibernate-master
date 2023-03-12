package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @OneToOne(fetch = FetchType.LAZY)   //(cascade = CascadeType.ALL)
    @MapsId
    @JoinColumn(name = "id")
    private User user;

    @Column(name = "model")
    public String model;

    @Column(name = "series")
    private int series;

    @Id
    private long id;

    public Car() {
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getId() {
//        return id;
//    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
