/*Initialize a object by a refernce variable*/ 



class practice{
    String color;
    int age;
        
    public static void main(String[] args) {
        practice buzo = new practice();
        buzo.color = "black";
        buzo.age = 10;
        System.out.println(buzo.color+" "+buzo.age);


    }
}

