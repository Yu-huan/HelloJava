package packagehellojava;
public class Rectangle {
	static int edges=4;
	int w;
	int h;
	public int area(){
		return w * h ;
	}
	public void setWH(int w,int h){
		this.w=w;
		this.h=h;
	}
	public void setWH(int w){
		setWH(w,w);
	}
	Rectangle(int w,int h){
		setWH(w,h);
	}
	Rectangle(int w){
		setWH(w,w);
	}
}

//public class Rectangle {
/*class Rectangle implements canCompareArea{
	static int edges=4;
	int w;
	int h;
	public int area(){
		return w * h ;
	}
	public void setWH(int w,int h){
		this.w=w;
		this.h=h;
	}
	public void setWH(int w){
		setWH(w,w);
	}
	Rectangle(int w,int h){
		setWH(w,h);
	}
	Rectangle(int w){
		setWH(w,w);
	}
	public boolean LargerThan(canCompareArea aShape){
		return this.area()>aShape.area();
	}
}*/
