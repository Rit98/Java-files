/*class Animal{   here access modifier is default 
    public void run(){
        System.out.println("I am running");
    }
    
    public static void main(String[] args) {
        System.out.println("1");
        Animal buzo = new Animal();
        buzo.eat();
        buzo.run();
        Birds sp = new Birds();
        sp.fly();
        Animal aa = new Animal();
        aa.eat();
        aa.run();
   }
    public void eat(){
         System.out.println("I am eating");
    }
}

class Birds{
    void fly(){
        System.out.println("I am flying");    }
} */

/* By Reference variable*/

class Animal{
    String color;
    int age;
    public static void main(String[] args) {
        Animal buzo = new Animal();
        buzo.color = "black"; /*here we initialize the values of string & int in this object using '.' operator */ 
        buzo.age = 10;
        System.out.println(buzo.color +" "+buzo.age);
    }
}

/*By using methods */
/*class Animal{
    String color;
    int age;
    void init(String c , int a){
        color = c;
        age = a;
    }
    void display(){
        System.out.println(color+" "+age);
    }
    public static void main(String[] args) {
        Animal buzo = new Animal();
        buzo.init("black", 10);
        buzo.display();
    }
}
     
     /*the value of these parameters is initialized into string and int*/
       





