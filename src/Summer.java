public class Summer extends Jacket{

    public String lightJacket;

    public Summer(String lightJacket, double length, double width) {
        super(length, width);
        this.lightJacket = lightJacket;

    }

    public void sayHi(){
        System.out.println("Hi");
    }
}
