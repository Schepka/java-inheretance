package session2;

public class Iphone extends Phone {

    String color;
    String madeIn;

    public Iphone (String model, String brand, boolean isTouchScreen, boolean is5G, int capacity) {
       super (model,brand, isTouchScreen, is5G, capacity);
       this.color = color;
       this.madeIn = madeIn;
    }
    public String getColor(){
        return color;
    }
    public void
@Override
    public void sendMessage(String number, String message){
        System.out.println("Iphone 13 sending message: " + message + "to:" + number);
    }
@Override
    public void

}
