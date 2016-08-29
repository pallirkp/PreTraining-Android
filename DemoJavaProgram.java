import java.io.*;
public class DemoJavaProgram
{
	public static void main(String s[]) {
		
		Circle myobj=new Circle(5.20,"Red",false);
		System.out.println(myobj.toString());
		System.out.println("Area of Circle is "+myobj.getArea());
		System.out.println("Perimeter of Circle is "+myobj.getPerimeter());

		Rectangle x=new Rectangle(5,4,"Green",false);
		System.out.println(x.toString());
		System.out.println("Area of Rectangle is "+x.getArea());
		System.out.println("Perimeter of Rectangle is "+x.getPerimeter());

		Square y=new Square(5.20,"Green",false);
		System.out.println(y.toString());
		System.out.println("Area of Square is "+y.getArea());
		System.out.println("Perimeter of Square is "+y.getPerimeter());

	}
}

abstract class Shape
{
	protected String color;
	protected boolean filled;

	public Shape() 
                 {
	}
	public Shape(String color,boolean filled) 
	{
		this.color=color;
		this.filled=filled;
	}

	public String getColor() 
	{
		return this.color;
	}
	public void setColor(String color) 
	{
		this.color=color;
	}
	public boolean isFilled() {
		if(filled)
			return true;
		else
			return false;
	}
	public void setFilled(boolean filled) 
	{
		this.filled=filled;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
	public String toString() 
	{
		return "Shape[color="+getColor()+",filled="+isFilled()+"]";
	}
}
class Circle extends Shape 
{
	protected double radius;

	public Circle() {
	}
	public Circle(double radius) 
	{
		this.radius=radius;
	}
	public Circle(double radius,String color,boolean filled)
	{
		super(color,filled);
		this.radius=radius;
	}

	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	public double getPerimeter() {
		return 2*3.14*radius;
	}
	public String toString() {
		return "Circle[Shape[color="+getColor()+",isfilled="+isFilled()+"],radius="+getRadius()+"]";
	}
}
class Rectangle extends Shape 
{
	protected double width;
	protected double length;

	public Rectangle() {
	}
	public Rectangle(double width,double length) {
		this.length=length;
		this.width=width;
	}
	public Rectangle(double width,double length,String color,boolean filled) {
		super(color,filled);
		this.width=width;
		this.length=length;
	}

	public double getWidth() {
		return this.width;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public double getLength() {
		return this.length;
	}
	public void setLength(double length) {
		this.length=length;
	}
	public double getArea() {
		return length*width;
	}
	public double getPerimeter() {
		return 2*(length+width);
	}
	public String toString() {
		return "Rectangle[Shape[color="+getColor()+",filled="+isFilled()+"],width="+getWidth()+",length="+getLength()+"]";
	}
}
class Square extends Rectangle 
{

	public Square() {
	}
	public Square(double side) {
		super(side,side);
	}
	public Square(double side,String color,boolean filled) {
		super(side,side,color,filled);
	}

	public void setSide(double side) {
		//super.length=super.width=side;
		this.setWidth(side);
		this.setLength(side);
	}
	public double getSide() {
		return super.length;
	}
	public void setWidth(double side) {
		super.width=side;
	}
	public void setLength(double side) {
		super.length=side;
	}
	public String toString(){
		return "Square[Shape[color="+getColor()+",filled="+isFilled()+"],side="+getSide()+"]";
	}
}