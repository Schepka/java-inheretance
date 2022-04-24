package session2;

public class Phone {
    private String model;
    private String brand;
    private boolean isTouchScreen;
    private boolean is5G;
    private int capacity;

    public Phone (String model, String brand, boolean isTouchScreen, boolean is5G, int capacity) {
        this.model = model;
        this.brand = brand;
        this.isTouchScreen = isTouchScreen;
        this.is5G = is5G;
        this.capacity = capacity;


    }
public String getModel(){
        return getModel();
}
public void sendMessage (String number, String message){
    System.out.println("sending: " + message + "to: " + number);
    }
    public void call(String number){
        System.out.println("Calling " + number);
    }


}

