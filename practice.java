/*Initialize a object by using methods */

class practice{
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
        practice buzo = new practice();
        buzo.init("black", 10);
        buzo.display();
    }
} 
