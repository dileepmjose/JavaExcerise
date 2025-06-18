//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MyThread extends Thread{

    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Thread ====> "+i);
            try{
              Thread.sleep(500);
            }catch(Exception e){
                System.out.println("Thread interrupted");
            }
        }
    }
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        for(int i=0;i<=5;i++){
            System.out.println("Thread %%%%% "+i);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println("Thread interrupted");
            }
        }
    }
}