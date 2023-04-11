package methodOverloading;

class MyUtil{
	//정수형 배열을 매개변수로 전달받아 그 중에 가장 큰수를 찾아 반환하는 메소드를 정의
	public int getMax(int []a) {
		int max =a[0];
		for(int i=1; i<a.length; i++) {
			if(max < a[i])
				max = a[i];
		}
		return max;
	}
	//두개의 정수를 매개변수로 전달받아 그 중에 큰수를 찾아 반환하는 메소드를 정의
	public int getMax(int a, int b) {
		int max = a;
		if(max < b)
			max = b;
		return max;
	}
	//두개의 실수를 매개변수로 전달받아 그 중에 큰수를 찾아 반환하는 메소드를 정의
	public double getMax(double a, double b) {
		double max = a;
		if (max < b)
			max = b;
		return max;
	}
}

public class MethodOverloadingtest {

	public static void main(String[] args) {
		MyUtil util = new MyUtil();
		System.out.println(util.getMax(20,30));
		System.out.println(util.getMax(20.5,30.5));
		int []data = {10,20,30,40,50,60};
		System.out.println(util.getMax(data));
	}

}
