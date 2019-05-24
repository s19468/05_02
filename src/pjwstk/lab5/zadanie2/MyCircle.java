/*
    Autor: Rafał Tęcza
    Index: s19468
*/
package pjwstk.lab5.zadanie2;

public class MyCircle {

    private MyPoint center = new MyPoint(0,0);
    private int radius = 1;

    public MyCircle() {}

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x,y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return this.center.getX();
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public int getCenterY() {
        return this.center.getY();
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public int[] getCenterXY() {
        int[] xy = {getCenterX(), getCenterY()};
        return xy;
    }

    public void setCenterXY(int x, int y) {
        this.center.setX(x);
        this.center.setY(y);
    }

    @Override
    public String toString() {
        return "MyCricle[radius=" + getRadius() + ",center="+ center.toString() + "]";
    }

    public double getArea() {
        double area = Math.PI * (getRadius() * getRadius());
        return area;
    }

    public double getCircumference() {
        double circumference = Math.PI * 2 * getRadius();
        return circumference;
    }

    public double distance(MyCircle myCircle) {
        double distance = this.getCenter().distance(myCircle.getCenter());
        return distance;
    }
}
