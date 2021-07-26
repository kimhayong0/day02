package day02_variable;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		int kor,eng,math;
		System.out.println("당신의 이름은 무엇입니까?");
		name = scan.next();
		System.out.println(name+"님의 국어점수: ");
		kor = scan.nextInt();
		System.out.println(name+"님의 영어점수: ");
		eng = scan.nextInt();
		System.out.println(name+"님의 수학점수: ");
		math = scan.nextInt();
		
		System.out.println("=================");
		System.out.println("이 름  : "+name);
		System.out.println("=================");
		System.out.println("국 어  : "+kor);
		System.out.println("영 어  : "+eng);
		System.out.println("수 학  : "+math);
		System.out.println("=================");
		System.out.println("합 계  :  "+(kor+eng+math));
		System.out.println("=================");
		
		

	}

}
