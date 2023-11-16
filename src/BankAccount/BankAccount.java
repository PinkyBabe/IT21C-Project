
package BankAccount;


class BankAccount {
    private String name;
    private int age;
    private long acc_num,deposit1,deposit2;
    private long summary;
    
    public String getName(){
    
        return name;
    }
    public int getAge(){
    
        return age;
    }
    public long getAccNum(){
    
        return acc_num;
    }
    public long getDeposit1(){
    
        return deposit1;
    }
    public long Deposit2(){
    
        return deposit2;
    }
    
    public void setName(String name){
    
        this.name = name;
        System.out.println("Name: "+this.name);
    
    }
    public void setAge(int age){
    
        this.age = age;
        System.out.println("Age: "+this.age);
    
    }
    public void setAccNum(long acc_num){
    
        this.acc_num = acc_num;
        System.out.println("Account Number: "+this.acc_num);
    
    }
    public void setDeposit1(long deposit1){
    
        this.deposit1 = deposit1;
        System.out.println("Deposit1: $"+this.deposit1);
    }
    
      public void setDeposit2(long deposit2){
        this.deposit2 = deposit2;
          System.out.println("Deposit2: $"+this.deposit2);
      }
      
      public void Balance(){
      
          this.summary = this.deposit2 + this.deposit1;
          
          System.out.println("Remaining Balance: $"+this.summary);
      
      }
}

class Main{
  
    public static void main(String[] args){
    
        BankAccount b = new BankAccount();
        BankAccount b2 = new BankAccount();
        
        b.setName("Rey Sinabianan");
        b.setAge(19);
        b.setAccNum(010101);
        b.setDeposit1(1000);
        b.setDeposit2(1000);
        b.Balance();
    }
}

