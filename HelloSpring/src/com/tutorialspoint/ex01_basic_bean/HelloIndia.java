package com.tutorialspoint.ex01_basic_bean;

public class HelloIndia {
	   private String message1;
	   private String message2;
	   private String message3;
	 
	   public void setMessage1(String message){
	      this.message1  = message;
	   }

	   public void getMessage1(){
	      System.out.println("India Message1 : " + message1);
	   }
	   
	   public void setMessage2(String message2) {
		   this.message2 = message2;
	   }
	   	
	   public void getMessage2() {
		   System.out.println("India Message2 : " + message2);
	   }
	   
	   public void setMessage3(String message3) {
		   this.message3 = message3;
	   }
	   	
	   public void getMessage3() {
		   System.out.println("India Message3 : " + message3);
	   }
	   public void init(){
		   System.out.println("init of HelloIndia class"); 
	   }
	   
	   public void destroy(){
		   System.out.println("destroy of HelloIndia class"); 
	   }	   
}
