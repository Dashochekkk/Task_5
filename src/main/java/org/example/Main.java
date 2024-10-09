package org.example;

public class Main {

}
//Задача 1: Управление животными (интерфейсы и абстрактные классы)

// Интерфейс Animal
interface Animal {
    void eat();
    void sleep();
}

// Абстрактный класс Mammal
abstract class Mammal implements Animal {
    public abstract void walk();
}

// Класс Lion
class Lion extends Mammal {
    @Override
    public void eat() {
        System.out.println("Лев ест мясо.");
    }

    @Override
    public void sleep() {
        System.out.println("Лев спит.");
    }

    @Override
    public void walk() {
        System.out.println("Лев идет пешком.");
    }
}

// Класс Elephant
class Elephant extends Mammal {
    @Override
    public void eat() {
        System.out.println("Слон ест растения.");
    }

    @Override
    public void sleep() {
        System.out.println("Слон спит.");
    }

    @Override
    public void walk() {
        System.out.println("Идет слон.");
    }
}

// Пример использования
 class ZooManagement {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        lion.sleep();
        lion.walk();

        Elephant elephant = new Elephant();
        elephant.eat();
        elephant.sleep();
        elephant.walk();
    }
}
//Задача 2: Фигуры (интерфейсы и абстрактные классы)

// Интерфейс Shape
interface Shape {
    double area();
    double perimeter();
}

// Абстрактный класс Polygon
abstract class Polygon implements Shape {
    public abstract int numberOfSides();
}

// Класс Triangle
class Triangle extends Polygon {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public int numberOfSides() {
        return 3;
    }
}

// Класс Rectangle
class Rectangle extends Polygon {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public int numberOfSides() {
        return 4;
    }
}

// Класс Circle
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Пример использования
 class ShapeManagement {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Площадь треугольника: " + triangle.area());
        System.out.println("Периметр треугольника:" + triangle.perimeter());
        System.out.println("Стороны треугольника:" + triangle.numberOfSides());

        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Площадь прямоугольника:" + rectangle.area());
        System.out.println("Периметр прямоугольника: " + rectangle.perimeter());
        System.out.println("Стороны прямоугольника: " + rectangle.numberOfSides());

        Circle circle = new Circle(5);
        System.out.println("Площадь круга: " + circle.area());
        System.out.println("Периметр круга: " + circle.perimeter());
    }
}
//Задача 3: Работа с устройствами (интерфейсы и абстрактные классы)

// Интерфейс Device
interface Device {
    void turnOn();
    void turnOff();
}

// Абстрактный класс ElectronicDevice
abstract class ElectronicDevice implements Device {
    public abstract int getPowerConsumption();
}

// Класс TV
class TV extends ElectronicDevice {
    @Override
    public void turnOn() {
        System.out.println("Телевизор включен.");
    }

    @Override
    public void turnOff() {
        System.out.println("Телевизор выключен.");
    }

    @Override
    public int getPowerConsumption() {
        return 100; // 100 watts
    }
}

// Класс Computer
class Computer extends ElectronicDevice {
    @Override
    public void turnOn() {
        System.out.println("Компьютер включен.");
    }

    @Override
    public void turnOff() {
        System.out.println("Компьютер выключен.");
    }

    @Override
    public int getPowerConsumption() {
        return 500;
    }
}

// Пример использования
 class DeviceManagement {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.turnOn();
        tv.turnOff();
        System.out.println("Потребляемая мощность телевизора: " + tv.getPowerConsumption() + " ватт");

        Computer computer = new Computer();
        computer.turnOn();
        computer.turnOff();
        System.out.println("Потребляемая мощность компьютера:\n " + computer.getPowerConsumption() + " ватт");
    }
}

//Задача 4: Магазин (интерфейсы и абстрактные классы)

// Интерфейс Product
interface Product {
    double getPrice();
    String getName();
}

// Абстрактный класс PhysicalProduct
abstract class PhysicalProduct implements Product {
    public abstract double getWeight();
}

// Класс Book
class Book extends PhysicalProduct {
    private double price;
    private String name;
    private double weight;

    public Book(double price, String name, double weight) {
        this.price = price;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}

// Класс Software
class Software implements Product {
    private double price;
    private String name;

    public Software(double price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}

// Пример использования
 class StoreManagement {
    public static void main(String[] args) {
        Book book = new Book(29.99, "Java Programming", 1.2);
        System.out.println("Название книги: " + book.getName());
        System.out.println("Стоимость книги: " + book.getPrice());
        System.out.println("Вес книги: " + book.getWeight() + " kg");

        Software software = new Software(49.99, "Java IDE");
        System.out.println("Название программного обеспечения: " + software.getName());
        System.out.println("Цена программного обеспечения: " + software.getPrice());
    }
}

//Задача 5: Спортивные соревнования (интерфейсы и абстрактные классы)

// Интерфейс Athlete
interface Athlete {
    void train();
    void compete();
}

// Абстрактный класс Runner
abstract class Runner implements Athlete {
    public abstract double getBestTime();
}

// Класс Sprinter
class Sprinter extends Runner {
    @Override
    public void train() {
        System.out.println("Спринтер тренируется на короткие дистанции.");
    }

    @Override
    public void compete() {
        System.out.println("Спринтер соревнуется в беге на 100 метров.");
    }

    @Override
    public double getBestTime() {
        return 10.5;
    }
}

// Класс MarathonRunner
class MarathonRunner extends Runner {
    @Override
    public void train() {
        System.out.println("Марафонец тренируется на длинные дистанции.");
    }

    @Override
    public void compete() {
        System.out.println("Марафонец участвует в марафонском забеге.");
    }

    @Override
    public double getBestTime() {
        return 2.5;
    }
}

// Пример использования
 class SportsManagement {
    public static void main(String[] args) {
        Sprinter sprinter = new Sprinter();
        sprinter.train();
        sprinter.compete();
        System.out.println("Лучшее время спринтера: " + sprinter.getBestTime() + " секунд");

        MarathonRunner marathonRunner = new MarathonRunner();
        marathonRunner.train();
        marathonRunner.compete();
        System.out.println("Лучшее время марафонца: " + marathonRunner.getBestTime() + " часы");
    }
}