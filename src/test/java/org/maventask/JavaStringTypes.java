package org.maventask;

public class JavaStringTypes {
public static void main(String[] args) {
	String a="ashok";
	String b="arivu";
	String c="ashok";
	System.out.println(System.identityHashCode(a));
	System.out.println(System.identityHashCode(b));
	System.out.println(System.identityHashCode(c));
	System.out.println("**********************");
	String s= new String("ak");
	String s2=new String("ak");
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s2));
	System.out.println("**********************");
	
	String concat = a.concat(b);
	System.out.println(concat);
	System.out.println(System.identityHashCode(concat));
	System.out.println(System.identityHashCode(a));
	System.out.println(System.identityHashCode(b));
	System.out.println("**********************");
	
	StringBuffer s3= new StringBuffer("ak");
	StringBuffer s4=new StringBuffer("akom");
	StringBuffer append = s3.append(s4);
	System.out.println(append);
	System.out.println(System.identityHashCode(append));
	System.out.println(System.identityHashCode(s3));
	System.out.println(System.identityHashCode(s4));
}
}
