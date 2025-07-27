package com.java.demo.program.features;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuture1 {

    // A method that simulates a long-running task (e.g., fetching data)
    public static String fetchData() {
        try {
            Thread.sleep(2000); // Simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Data from remote service";
    }
    
    public static void voidfetchData() {
        try {
            Thread.sleep(2000); // Simulate delay
            System.out.println("voidfetchData called...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
    
    public static String ExceptionMethod() {
    	
    	try {
            Thread.sleep(2000); // Simulate delay
            if (true) {
                throw new RuntimeException("Something went wrong!");
            }
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    	return "Data from remote service";
    	
       }
    
    public static String messge() {
    	return " message"; 
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        System.out.println("Start fetching data...");
        
        
        
        // Run fetchData asynchronously
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> fetchData());
        Diplay(future1);
        
        
        // Process Result UpperCase
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> fetchData())
        	    .thenApply(data -> data.toUpperCase());
        Diplay(future2);
        
        
        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> ExceptionMethod())
        	    .exceptionally(ex -> messge());
        String result = future3.join();
        Diplay(future3);
        
        
        CompletableFuture<Void> future4 = CompletableFuture.runAsync(() -> voidfetchData());
            
        future4.get();
        
    CompletableFuture.supplyAsync(() -> "Hello World")
        .thenAccept(r -> System.out.println("Received: " + r));
  
        
        System.out.println("Program finished.");
        
    }
    
    public static void Diplay(CompletableFuture<String> future) {
    	
    	// Block and get the result from future
        try {
            String result = future.get();  // waits if necessary for the computation to complete
            System.out.println("Result received: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

      
        
        // Do other things while fetchData is running asynchronously
        System.out.println("Doing other work...");
    	
    }
}
