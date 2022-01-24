package com.example.FirstGitProject;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


@SpringBootApplication

		public class FirstGitProjectApplication {
	

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter string");
			String str = in.nextLine();
			System.out.println(str);
			StrRev(str);
			
		}
		public static void StrRev(String Str) {
			char cha[] = Str.toCharArray();
			String reverse = "";
			for (int i = cha.length - 1; i >= 0; i--) {
				reverse += cha[i];
			}
			System.out.println(reverse);
		}
	
}

