package org.prac;

public class ReverseStringByWord {
public static void main(String[] args) {
	//expected output= "class java to welcome";
	
	String name= "welcome to java class";
	String result="";
	String reverse="";
	
	String[] split = name.split(" ");
	char[] ch = name.toCharArray();
	for (int i = split.length-1; i >= 0; i--) {
		for (int j = ch.length-1; j >=0; j--) {
			reverse=reverse+ch[j];
			
		}
		
		result=reverse+split[i]+" ";
	}
	
	System.out.println(result);
//	System.out.println(reverse);
}

}
