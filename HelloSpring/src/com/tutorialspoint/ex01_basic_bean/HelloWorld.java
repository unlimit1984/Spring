package com.tutorialspoint.ex01_basic_bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld{ //implements DisposableBean, InitializingBean{
   private String message1;
   private String message2;
 
   public void setMessage1(String message){
      this.message1  = message;
   }

   public void getMessage1(){
      System.out.println("World Message1 : " + message1);
   }
   
   public void setMessage2(String message2) {
	   this.message2 = message2;
   }
   	
   public void getMessage2() {
	   System.out.println("World Message2 : " + message2);
   }
   
   //One option is to use these methods and their XML configuration with init-method="<method-name>", destroy-method="<method-name>"
   public void init(){
	   System.out.println("init of HelloWorld class"); 
   }
   
   public void destroy(){
	   System.out.println("destroy of HelloWorld class"); 
   }
   
   	//But the best way to add these methods with using XML configuration (init-method="<method-name>", destroy-method="<method-name>")
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("afterPropertiesSet");
//		
//	}
//	@Override
//	public void destroy() throws Exception {
//		System.out.println("Destruction of HelloWorld class!");
//		
//	}
}
