package com.corejava.CompiletimeExceptionHanling;

import java.io.IOException;

public class CompiletimeExceptionHanling {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println("Execuation started ");
		
       Thread.sleep(3000);
       
       System.out.println("Execution completed");
       
       
       
       System.out.println("***********************************");
       System.out.println("Enter a number");
       System.in.read();
       System.out.println();
       
	}

}
