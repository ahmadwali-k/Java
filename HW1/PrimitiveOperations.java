public class PrimitiveOperations {
    public static void main(String[] args) {

        short sht = 10;
        byte byt = 55;
        float flt = 56.55f;
	int i = 30;
	char t = 'T';
	int temp;
	
	System.out.println("int: " + i);
        System.out.println("short: " + sht);
        System.out.println("byte: " + byt);
        System.out.println("float: " + flt);
	
	float f = (float) i * flt;
	System.out.println("from int to float: " + f);
	int i2 = (int)Math.round(f * i);
	System.out.println("from float to int: " + i2);
	double total = sht * byt * flt;
	System.out.println("char: " + t);	
	
	//t2 = t.toLowerCase();  
	System.out.println("total: " + total);
	//System.out.println("char casting: " + t2);
	temp = (int) t;
	temp = temp + 32;
	t = (char) temp;
	System.out.println("char conversion (casting): " + t);
    }
}
