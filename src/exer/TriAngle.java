package exer;

/**
 * @author: sqm
 * @date: 2020/8/9 22:49
 * @description:
 */
public class TriAngle {
    private double base;
    private double height;

    //空构造器
    public TriAngle(){

    }

    public TriAngle(double b, double h){
        base = b;
        height = h;
    }

    public void setBase(double b){
        if (b > 0){
            base = b;
            return;
        }
        System.out.println("Error");
    }

    public void setHeight(double h){
        if (h > 0){
            height = h;
            return;
        }
        System.out.println("Error");
    }

    public double getBase(){
        return base;
    }

    public double getHeight(){
        return height;
    }


}
