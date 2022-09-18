public class Engin {
    private int id;
    private String type;
    private int max_speed;
    private int number_of_cylenders;
    private String country;
    private int car_id;



    public Engin(int id, String type, int max_speed, int number_of_cylenders, String country, int car_id) {
        this.id = id;
        this.type = type;
        this.max_speed = max_speed;
        this.number_of_cylenders = number_of_cylenders;
        this.country = country;
        this.car_id = car_id;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    public int getNumber_of_cylenders() {
        return number_of_cylenders;
    }

    public void setNumber_of_cylenders(int number_of_cylenders) {
        this.number_of_cylenders = number_of_cylenders;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

}
