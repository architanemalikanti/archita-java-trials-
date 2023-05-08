package architaTrials.Demos;

import javax.swing.JFrame;

public class C extends JFrame{
	

	public static void main(String[] args) {
		
		C x  = new C();
		x.show();
		
		System.out.println(x.getArea());
		
		x.sq();
		x.setTitle("xyz");
		x.putDate();
		
		C h = new C();
		C j = h; //j and h point to the same object.
		
		h.show();
		
		//h and j point to the same object so both will return the same thing
		h.getX();
		j.getX(); 
		
		h = null; //null means absence of a pointer
		h.show(); //h points to null! will throw a null pointer exception
		

	}
	
	//return the area of the window
	public int getArea() {
		
		return getHeight()*getWidth();
	}
	
	//square the window. make the height equal to the width. 
	
	public void sq() {
		setSize(getWidth(),getWidth());
	}
	
	//put the date in the title
	
	public void putDate() {
		setTitle(new java.util.Date().toString());
		
	}
	
	
	

}
