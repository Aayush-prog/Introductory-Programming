
class type{
    public static void main(String[] args){
        int a=0,b=0,c=0,d=0,e=0,f=0;
        for (int i=99;i<100;i++){
            if (i%50==0){
                a++;
            }else if(i%20==0){
                b++;
            }else if(i%10==0){
                c++;
            }else if(i%5==0){
                d++;
            }else if(i%2==0){
                e++;
            }else{
                f++;
            }
        }
        System.out.printf("%d  %d  %d  %d  %d  %d",a,b,c,d,e,f);
        
    }
}