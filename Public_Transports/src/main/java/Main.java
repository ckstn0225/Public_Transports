class Main {
    public static void main(String[] args) {
        System.out.println("--------------Bus-----------");
            Bus bus = new Bus();
            Bus bus2 = new Bus();

        System.out.println(bus.id);
        System.out.println(bus2.id);
        System.out.println("-----------------------------------");
        bus.boarding(2);
        System.out.println("-----------------------------------");
        bus.useoil(50);
        System.out.println("-----------------------------------");
        bus.run("차고지행");
        System.out.println("-----------------------------------");
        bus.FillOil(10);
        System.out.println("-----------------------------------");
        bus.run("운행");
        System.out.println("-----------------------------------");
        bus.boarding(45);
        System.out.println("-----------------------------------");
        bus.boarding(5);
        System.out.println("-----------------------------------");
        bus.useoil(55);
        System.out.println("-----------------------------------");

        System.out.println("-------------Taxi--------------");
        Taxi taxi = new Taxi();
        Taxi taxi1 = new Taxi();

        System.out.println(taxi.id);
        System.out.println(taxi1.id);
        System.out.println("-----------------------------------");

        taxi.boarding(2,"서울역",2);
        System.out.println("-----------------------------------");

        taxi.useoil(80);
        System.out.println("-----------------------------------");
        taxi.purchase();
        System.out.println("-----------------------------------");
        taxi.boarding(5,"구로디지털단지역",12);
        System.out.println("-----------------------------------");
        taxi.boarding(3,"구로디지털단지역",12);
        System.out.println("-----------------------------------");
        taxi.useoil(20);
        System.out.println("-----------------------------------");
        taxi.purchase();
        System.out.println("-----------------------------------");

    }


}