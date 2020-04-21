public class Apr21{
	public static void main(String[] args){
		float a = 3.1415926f;
		System.out.println(a);
		int b;
		b = (int)a;
		System.out.println(b);


		int x = 1;
		boolean and1 = true || (++x > 1);
		System.out.println(and1);
		System.out.println(x);

		int y = 1;
		boolean and2 = true | (++y > 1);
		System.out.println(and2);
		System.out.println(y);


	}
}