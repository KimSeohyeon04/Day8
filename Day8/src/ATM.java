import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int MAX = 5;
		
		int[] arId = new int[MAX];
		int[] arPw = new int[MAX];
		int[] arMoney = new int[MAX];
		
		int count = 0;
		int log = -1;
		
		String menu = "=== �ް�IT ATM ===\n";
		menu += "1.ȸ������\n2.ȸ��Ż��\n3.�α���\n4.�α׾ƿ�\n";
		menu += "5.�Ա�\n6.��ü\n7.�ܾ���ȸ\n8.��������\0.n����";
		
		System.out.println("Id�� �Է����ּ���");
		int Id = sc.nextInt();
		
		int check = 1;
		
		for(int i=0;i<count;i++)
		{
			if(arId[i] == Id)
			{
				check = -1;
			}
		}
	}
}
