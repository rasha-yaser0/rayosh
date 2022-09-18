import java.util.ArrayList;


public class Car {
    private int id;
    private String company;
    private String name;
    private String type;
    private String date_of_create; // dateOfCreate
    private String year;
    
    static ArrayList<Car> cars = new ArrayList<>();
    ArrayList<Wheel> wheels = new ArrayList<>();

    private Engin engin;



    public Car(int id, String company, String name, String type, String date_of_create, String year) {
        this.id = id;
        this.company = company;
        this.name = name;
        this.type = type;
        this.date_of_create = date_of_create;
        this.year = year;

    }



    static void printAll() {
        for (Car o : cars) {
            System.out.println(o.getId());
            System.out.println(o.getName());
            System.out.println(o.getCompany());
            System.out.println(o.getType());
            System.out.println(o.getDate_of_create());
            System.out.println(o.getYear());
            System.out.println("---------------------------------");
        }
    }

    public void printWheels() {
        for (Wheel o : wheels) {
            System.out.println(o.getId());
            System.out.println(o.getNumber_of_screws());
            System.out.println(o.getThickness());
            System.out.println(o.getType());
            System.out.println(o.getCar_id());
            System.out.println("---------------------------------");
        }
    }



    public Engin getEngin() {
        return engin;
    }

    public void setEngin(Engin engin) {
        this.engin = engin;
    }

    // Getter and Setter functions
    public void setId(int id) {
        this.id = id;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setDate_of_create(String date_of_create) {
        this.date_of_create = date_of_create;
    }
    public void setYear(String year) {
        this.year = year;
    }



    public int getId() {
        return id;
    }
    public String getCompany() {
        return company;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getDate_of_create() {
        return date_of_create;
    }
    public String getYear() {
        return year;
    }

}
