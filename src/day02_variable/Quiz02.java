package day02_variable;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		int kor,eng,math;
		System.out.println("����� �̸��� �����Դϱ�?");
		name = scan.next();
		System.out.println(name+"���� ��������: ");
		kor = scan.nextInt();
		System.out.println(name+"���� ��������: ");
		eng = scan.nextInt();
		System.out.println(name+"���� ��������: ");
		math = scan.nextInt();
		
		System.out.println("=================");
		System.out.println("�� ��  : "+name);
		System.out.println("=================");
		System.out.println("�� ��  : "+kor);
		System.out.println("�� ��  : "+eng);
		System.out.println("�� ��  : "+math);
		System.out.println("=================");
		System.out.println("�� ��  :  "+(kor+eng+math));
		System.out.println("=================");
		
		

	}

}
