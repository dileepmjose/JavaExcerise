package com.java.demo.program.features;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuture2 {

    // A method that simulates a long-running task (e.g., fetching data)
    public static String fetchData() {
        try {
            Thread.sleep(2000); // Simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Data from remote service";
    }

    public static void main(String[] args) {

        System.out.println("Start fetching data...");

        // Run fetchData asynchronously
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> fetchData())
        	    .thenApply(data -> data.toUpperCase());

        // Do other things while fetchData is running asynchronously
        System.out.println("Doing other work...");

        // Block and get the result from future
        try {
            String result = future.get();  // waits if necessary for the computation to complete
            System.out.println("Uppercase result:: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("Program finished.");
    }
}
