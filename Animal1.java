class Animal1{   
here access modifier is default   

public void run(){
        System.out.println("I am running");
    }
    
    public static void main(String[] args) {
        System.out.println("1");
        Animal1 buzo = new Animal1();
        buzo.eat();
        buzo.run();
        Birds sp = new Birds();
        sp.fly();
        Animal1 aa = new Animal1();
        aa.eat();
        aa.run();
   }
    public void eat(){
         System.out.println("I am eating");
    }
}

class Birds{
    void fly(){
        System.out.println("I am flying");    
    }
}
