public class Light {
    boolean state;
    public void on(){
        state = true;
        System.out.println("light is on");
    }

    public void off(){
        state = false;
        System.out.println("light is off");
    }
}
