class Main { 
 private int data=30; 
 class Inner{ 
 void msg(){System.out.println("data is "+data);} 
 } 
 public static void main(String args[]){ 
 Main obj=new Main(); 
 Main.Inner in=obj.new Inner(); 
 in.msg(); 
 } 
} 