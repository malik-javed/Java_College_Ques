// generic class in Java allows you to create a class that can work with different types of data without writing multiple versions of the class

// Generic class definition
class Displayer<T> {
    private T num; // Generic variable

    public void setNum(T num) {
        this.num = num;
    }

    public void display() {
        System.out.println("Value: " + num);
    }
}

public class MyGeneric {
    public static void main(String[] args) {
        // Creating an object for Integer
        Displayer<Integer> intDisplayer = new Displayer<>();
        intDisplayer.setNum(20);
        intDisplayer.display();

        // Creating an object for Double
        Displayer<Double> doubleDisplayer = new Displayer<>();
        doubleDisplayer.setNum(20.0);
        doubleDisplayer.display();

        // Creating another object for Integer
        Displayer<Integer> anotherIntDisplayer = new Displayer<>();
        anotherIntDisplayer.setNum(50);
        anotherIntDisplayer.display();
    }
}
