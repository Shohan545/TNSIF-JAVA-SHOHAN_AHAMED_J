package OOPS;

public class Encapsulation {
	private String name;
	private int rollnum;
	private float mark;
public void setdata(String name,int rollnum, float mark) {
	this.name=name;
	this.rollnum=rollnum;
	this.mark=mark;
}
public String getname() {
	return name;
}
public int getrollnum() {
	return rollnum;
}
public float getmark() {
	return mark;
}
public static void main(String args[]) {
		Encapsulation data=new Encapsulation();
		data.setdata("Shohan",89,99.9f);
		System.out.println(data.getname()+" "+data.getrollnum()+" "+data.getmark());
	}
}

