package binary;

public class ExplicitConversion {

	public static void main(String[] args) {
		int iNum = 1000;
		byte bNum = (byte)iNum; //오류 발생
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum);
		
		float fNum = 0.9F;
		
		int num1 = (int)dNum + (int)fNum;	//3 + 0 = 3
		int num2 = (int)(dNum + fNum);		//4.23의 정수부분
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
