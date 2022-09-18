class Main {
    public static void main(String[] args) {


        Car c1 = new Car(1, "bmw", "first car", "car",
                "2020-9-16", "2020");

        Wheel w1_c1 = new Wheel(1, 1, "bold", "china", 1);
        Wheel w2_c1 = new Wheel(2, 2, "bold", "china", 1);
        c1.wheels.add(w1_c1);
        c1.wheels.add(w2_c1);

         c1.wheels.remove(w2_c1); 


        Engin e1 = new Engin(1, "first engin", 100000, 5, "china", 1);
        c1.setEngin(e1);





        Car c2 = new Car(2, "Audi", "Second car", "car",
                "1999-9-16", "1999");


        Wheel w1_c2 = new Wheel(3, 1, "bold", "china", 2);
        Wheel w2_c2 = new Wheel(4, 2, "bold", "china", 2);


        c2.wheels.add(w1_c2);
        c2.wheels.add(w2_c2);

        Engin e2 = new Engin(2, "second engin", 30, 3, "china", 2);
        c2.setEngin(e2);




        Car.cars.add(c1);

        System.out.println("Wheels first car");
        c1.printWheels();


        Car.cars.add(c2);
        
        Car.printAll();
        System.out.println("***************************");
        Car.cars.remove(c1);
        Car.printAll();

   

    }
}
