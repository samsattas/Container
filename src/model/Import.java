package model;

public class Import{
	private Container con1;
	private Container con2;
	private Container con3;

	public Import(Container con1, Container con2, Container con3){
		this.con1 = con1;
		this.con2 = con2;
		this.con3 = con3;
	}

//getters & setters
	public Container getCon1(){return con1;}
	public Container getCon2(){return con2;}
	public Container getCon3(){return con3;}

	public void setCon1(Container con1){this.con1 = con1;}
	public void setCon2(Container con2){this.con2 = con2;}
	public void setCon3(Container con3){this.con3 = con3;}



	public double cVolTotal(){
		double vol1 = con1.getW()*con1.getL()*con1.getH();
		double vol2 = con2.getW()*con2.getL()*con2.getH();
		double vol3 = con3.getW()*con3.getL()*con3.getH();
		double tVol = vol1 +vol2 + vol3;
		return tVol;
	}

	public double cAverage(){
		double vol1 = con1.getW()*con1.getL()*con1.getH();
		double vol2 = con2.getW()*con2.getL()*con2.getH();
		double vol3 = con3.getW()*con3.getL()*con3.getH();
		double tVol = vol1 + vol2 + vol3;
		return tVol/3;
	}
}