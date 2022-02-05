package prototype;
import java.lang.Cloneable;


public class Rectangle implements Cloneable{
    public int h,w;
    public Rectangle(int h, int w) {
        this.h = h;
        this.w = w;
    }
    // @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    // private int nums, digits;
    // public Shape(Shape toClone) {
    //     nums = toClone.nums;
    //     digits = toClone.digits;
    // }
    public static void main(String[] args) throws CloneNotSupportedException{
        System.out.println("cloning ..");
        int h = 5, w = 6;
        Rectangle one = new Rectangle(h,w);
        Rectangle two = (Rectangle) one.clone();

        System.out.println(one.h + " " + one.w);
        System.out.println(two.h + " " + two.w);
    }
}

