package com.javalec.base;
import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String[] student = {"No1", "No2", "No3", "No4"};
        String[] gwamok = {"Korean", "English", "Mathmatics"};
        int[] korscore = new int[student.length];
        int[] engscore = new int[student.length];
        int[] mathscore = new int[student.length];
        int ave = 0;
        int tot = 0;
        int korAve = 0;
        int engAve = 0;
        int mathAve = 0;

        System.out.println(gwamok[0] + "의 성적을 입력:");
        for (int i = 0; i < student.length; i++) {
            System.out.print(student[i] + "의 성적은: ");
            korscore[i] = scanner.nextInt();
            tot += korscore[i];
            korAve = tot / student.length;
        }

        System.out.println(gwamok[1] + "성적을 입력:");
        for (int i = 0; i < student.length; i++) {
            System.out.print(student[i] + "의 성적은: ");
            engscore[i] = scanner.nextInt();
            tot += engscore[i];
            engAve = tot / student.length;
        }

        System.out.println(gwamok[2] + "의 성적을 입력:");
        for (int i = 0; i < student.length; i++) {
            System.out.print(student[i] + "의 성적은: ");
            mathscore[i] = scanner.nextInt();
            tot += mathscore[i];
            mathAve = tot / student.length;
        }

        System.out.println("");
        System.out.println("\tkorean\tEnglish\tMathmatics");
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i] + "\t" + korscore[i] + "\t" + engscore[i] + "\t" + mathscore[i]);
        }

        System.out.println("Average\t" + korAve + "\t" + engAve + "\t" + mathAve);
    }

}

