class Employee{
    String name;
    int age;
    long ph;
    String ad;
    double salary;
    public void em(){
        name="Aayush";
        age=18;
        ph=9812;
        ad="Satikhel";
        salary=35000;
    }
    double salary(double a){
        a=salary;
        return a;
    }
    public static void main(String[] args){
        Employee d=new Employee();
        d.em();
        System.out.println("The name is:"+d.name);
        System.out.println("The address is:"+d.ad);
        System.out.println("The age is:"+d.age);
        System.out.println("The phone number is:"+d.ph);
        System.out.println("The salaray is:"+d.salary);
        
    }
}