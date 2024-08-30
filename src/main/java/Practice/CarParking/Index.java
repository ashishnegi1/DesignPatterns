package Practice.CarParking;

import Practice.CarParking.Model.Car;
import Practice.CarParking.Model.Slot;

import java.util.*;

public class Index {

    private static ArrayList<Slot> slots = new ArrayList<>();
    private static PriorityQueue<Slot> availableSlots = new PriorityQueue<>((Slot s1, Slot s2)->s1.number - s2.number);
    private static HashMap<Car, Slot> carToSlotMap = new HashMap<>();
    private static HashMap<String, Car> registrationToCarMap = new HashMap<>();
    private static HashMap<String, HashSet<Car>> colorToCarsMap = new HashMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of parking slots.");
        int n = sc.nextInt();
        sc.close();

        for(int i=0; i<n; i++){
            Slot slot = new Slot(i+1);
            slots.add(slot);
            availableSlots.add(slot);
        }

//        park KA-01-HH-1234 White
//        park KA-01-HH-9999 White
//        park KA-01-BB-0001 Black
//        park KA-01-HH-7777 Red
//        park KA-01-HH-2701 Blue
//        park KA-01-HH-3141 Black
//        leave 4
//        status
//        park KA-01-P-333 White
//        park DL-12-AA-9999 White
//        registration_numbers_for_cars_with_colour White
//        slot_numbers_for_cars_with_colour White
//        slot_number_for_registration_number KA-01-HH-3141
//        slot_number_for_registration_number MH-04-AY-1111

        park(new Car("KA-01-HH-1234", "White"));
        park(new Car("KA-01-HH-9999", "White"));
        park(new Car("KA-01-BB-0001", "Black"));
        park(new Car("KA-01-HH-7777", "Red"));
//        park(new Car("KA-01-HH-2701", "Blue"));
//        park(new Car("KA-01-HH-3141", "Black"));

        leave(4);
        leave(4);

        status();

//        park(new Car("KA-01-P-333", "White"));
//        park(new Car("DL-12-AA-9999", "White"));
//
//        carsWithColor("White");
//        slotsWithColor("White");
//
//        slotWithRegistration("KA-01-HH-3141");
//        slotWithRegistration("MH-04-AY-1111");
//
//        status();


    }

    public static void park(Car car){
        if(availableSlots.isEmpty()) {
            System.out.println("Sorry, parking lot is full");
            return;
        }
        Slot slot = availableSlots.poll();
        slot.car = car;
        System.out.println("Allocated slot number: " + slot.number);
        carToSlotMap.put(car, slot);
        registrationToCarMap.put(car.registration, car);
        colorToCarsMap.computeIfAbsent(car.color, k -> new HashSet<>()).add(car);
    }

    public static void leave(Integer num){
        num--;
        Slot slot = slots.get(num);
        if(slot.car == null) {
            System.out.println("Already empty in slot " + (num+1));
            return;
        }
        Car car = slot.car;
        slot.car = null;
        System.out.println("Slot number " + (num+1) + " is free");
        availableSlots.add(slot);
        carToSlotMap.remove(car);
        registrationToCarMap.remove(car.registration);
        HashSet<Car> set = colorToCarsMap.get(car.color);
        set.remove(car);
    }

    public static void status(){
        System.out.println("Slot No. Registration No Colour");
        for(Slot slot : slots){
            if(slot.car != null) {
                System.out.println("  " + slot.number + "  " + slot.car.registration + "  " + slot.car.color);
            }
        }
    }

    public static void carsWithColor(String color){
        HashSet<Car> set = colorToCarsMap.get(color);
        for(Car car : set) System.out.println(car.registration + " ");
    }

    public static  void slotsWithColor(String color){
        HashSet<Car> set = colorToCarsMap.get(color);
        for(Car car : set) System.out.print(carToSlotMap.get(car).number + " ");
        System.out.println();
    }

    public static void slotWithRegistration(String registration){
        if(registrationToCarMap.containsKey(registration)){
            System.out.println(carToSlotMap.get(registrationToCarMap.get(registration)).number);
        } else System.out.println("Not found");
    }
}
