
public class Attribute {
	public double [] value;
	public int num;

	public Attribute(int length, boolean rnd){
		value = new double[length];
		if(rnd)
			for(int i = 0; i < length; i++)
				value[i] = Math.random();
		num = -1;
	}

	public void setNumber(int num){
		this.num = num;
	}

	public int getNumber(){
		return num;
	}

	public double getLength(){
		return value.length;
	}

	public void set(int index, double val){
		value[index] = val;
	}

	public double get(int index){
		return value[index];
	}

	public double distance(Attribute w){
		return Math.sqrt(distanceSq(w));
	}

	public double distanceSq(Attribute w){
		if(w.getLength() != value.length)
			return -1; // error
			else{
				double distSq = 0;
				double d;

				for(int i = 0; i < value.length; i++){
					d = value[i] - w.get(i);
					distSq += d * d;
				}

				return distSq;
			}
	}
}
