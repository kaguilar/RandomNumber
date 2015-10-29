public class getAnumber 
{	
	int aRandom;
	
	private int small =0;
	private int large=0;
	
	public int SetLowNumber(int low){
		small=low;
		
		return small;
	}
	public int SetHighNumber(int high){
		large=high;
		
		return large;
	}
	public int getrandomnumberMinMax(int min, int max){
		aRandom= min + (int)( Math.random() * max);
		return aRandom;
	}
	public int GetAnumber(){
		aRandom=small+(int)(Math.random()*large);
		return aRandom;
	}}

