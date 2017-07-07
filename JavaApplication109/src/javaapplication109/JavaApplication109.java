package javaapplication109;


public class JavaApplication109 {

   
    public static void main(String[] args) {
        int dias[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String mes[]={"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        for(int i=0; i<dias.length;i++){
            if(mes[12]==null){
                mes[12]="Lu";
                System.out.println("Esse foi o valor armazenado"+mes[i]);
                
            }
            
            
        }
        
        
    }
    
}
