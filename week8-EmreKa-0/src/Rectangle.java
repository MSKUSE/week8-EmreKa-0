public class Rectangle extends Shape {

    private int sideA = 0, sideB = 0;

    public Rectangle(){

    }

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Side A is " + sideA + "Side B is " + sideB);
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle rectangle = (Rectangle) obj;
        if (this.sideA == rectangle.getSideA()
                && this.sideB == rectangle.getSideB()
                && this.getColor().equals(rectangle.getColor())){
            return true;
        }else {
            return false;
        }
    }

}
