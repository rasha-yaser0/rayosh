public class Wheel {
    private int id;
    private int number_of_screws;
    private String thickness;
    private String type;
    private int car_id;

    public Wheel(int id, int number_of_screws, String thickness, String type, int car_id) {
        this.id = id;
        this.number_of_screws = number_of_screws;
        this.thickness = thickness;
        this.type = type;
        this.car_id = car_id;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setNumber_of_screws(int number_of_screws) {
        this.number_of_screws = number_of_screws;
    }

    public void setThickness(String thickness) {
        this.thickness = thickness;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public int getId() {
        return id;
    }

    public int getNumber_of_screws() {
        return number_of_screws;
    }

    public String getThickness() {
        return thickness;
    }

    public String getType() {
        return type;
    }

    public int getCar_id() {
        return car_id;
    }

}
