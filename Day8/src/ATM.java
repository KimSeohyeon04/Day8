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
		
		String menu = "=== 메가IT ATM ===\n";
		menu += "1.회원가입\n2.회원탈퇴\n3.로그인\n4.로그아웃\n";
		menu += "5.입금\n6.이체\n7.잔액조회\n8.개인정보\0.n종료";
		
		System.out.println("Id를 입력해주세요");
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
