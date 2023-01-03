class rec{
    int l=6;
    int b=4;
    void area(){
        int a=l*b;
        System.out.println("Area:"+a);
    }
    void peri(){
        int p=2*(l+b);
        System.out.println("Perimeter:"+p);
    }
    public static void main(String[] args){
        rec a= new rec();
        a.area();
        a.peri();
    }
}