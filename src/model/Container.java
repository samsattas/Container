package model;

public class Container{
/*
w: width
l: lenght
h: height
*/

	private double w;
	private double l;
	private double h;

	public Container(double w, double l, double h){
		this.w = w;
		this.l = l;
		this.h = h;
	}

//getters & setters
	public double getW(){return w;}
	public double getL(){return l;}
	public double getH(){return h;}

	public void setW(){this.w = w;}
	public void setL(){this.l = l;}
	public void setH(){this.h = h;}
}