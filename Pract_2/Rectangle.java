package Package2;

public class Rectangle extends Circle{
    int l = 0, b = 0;
    double ar;
    
    public void input()
    {
        super.input();
        l = 6;
        b = 4;
    }
    
    public void compute()
    {
        super.compute();
        ar = l * b;
    }
    
    public void print()
    {
        super.print();
        System.out.println("Area of rectangle:"+ar);
    }
}
