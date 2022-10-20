package telematica;

public class Cifrado {
    
    int[] num;

    public Cifrado() {
        num= new int[9];
        for (int i = 0; i < num.length; i++) {
            num[i]=i;
        }
    }
    
    public void cifrar(int n1,int n2, int n3, int n4){
        n1=n1+7;
        n2=n2+7;
        n3=n3+7;
        n4=n4+7;
    }
}
