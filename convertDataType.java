package pertemuan2;

public class convertDataType {
	static short methodOne(long l)
	{
	int i = (int) l;
	return (short)i;
	}
	public static void main(String[] args)
	{
	double d = 10;
	float f = (float) d;
	byte b = (byte) methodOne((long) f);
	System.out.println(d);
	}
}

//public class methodOne {
//	public static void main (String [] args)
//	{
//	//Deklarasi variabel
//	    double pi = 3.14285714286;
//	      //Output
//	      System.out.println("Nilai pi = " + pi);
//	}
//}