import java.nio.file.NotLinkException;

public class labw03 implements var04 {

	public double logika(double d1, double d2, double d3) {
		// ���� ��� �����. ����� ���������� ������������� ����� � �������� ������.
		
		int countPositive = 0;
		
		if (d1 > 0) {
			countPositive++;
		}
		if (d2 > 0) {
			countPositive++;
		}
		if (d3 > 0) {
			countPositive++;
		}
		
		System.out.println("���������� ������������� ����� � �������� ������: " + countPositive);
		return 0;
	}
  
	public void poka(int N) {
		// ���� ����� ����� N (> 0). ��������� �������� ������� ������ �
		// ������ ������� �� �������, ������� ��� ��� �����, ������� � 
		// ����� ������ (������� ������).
		int n = Math.abs(N);
        while(n > 0) {
            System.out.println(n % 10);
            n -= n % 10;
            n /= 10;
        }
	}
 
	public void massivy(double[] A, double D) {

		// ����� ������� ������� A, ������ ������� �������� � D ���������
		double[] B = new double[A.length];
		
		for (int i = 0; i < A.length ; i++){
			B[i] = Math.abs(A[i] - D);
		}
		
		double min = B[0];

		int num=0;
		for(int i = 0; i < B.length; i++){
			System.out.println("�������: " + B[i]);
            if(min > B[i]){
                min = B[i];
				num=i;
            }
		}

		System.out.println("����������� ������� ������� �: " + num);
		
	}
  	
}