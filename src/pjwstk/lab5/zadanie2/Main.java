/*
    Autor: Rafał Tęcza
    Index: s19468
*/
package pjwstk.lab5.zadanie2;

public class Main {

    public static void main(String[] args) {
        MyCircle circle = new MyCircle(10, 10, 5);

        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
        System.out.println("Distance between another instance: " + circle.distance(new MyCircle(20, 20, 8)));
    }
}