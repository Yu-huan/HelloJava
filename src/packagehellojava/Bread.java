package packagehellojava;

public class Bread {
	//�ѥ]�S��
}
class Toast extends Bread implements canCompareArea{
	int length;
	public Toast(int length){
		this.length=length;
	}
	public int area(){
		return length*length;
	}
}

interface canCompareArea{
	public int area();
}
