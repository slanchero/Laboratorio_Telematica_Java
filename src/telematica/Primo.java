package telematica;

import java.math.BigInteger;

public class Primo {
    private BigInteger limI;
    private BigInteger limF;

    public void setLimI(BigInteger limI) {
        this.limI = limI;
    }

    public void setLimF(BigInteger limF) {
        this.limF = limF;
    }
    
    public void primos(){
        BigInteger i=limI;
        while(i.compareTo(limI)>=0&&i.compareTo(limF)<=0){
            if(isPrimo(i)){
                System.out.println(i);
            }
            i=i.add(BigInteger.ONE);
        }
    }
    
    public boolean isPrimo(BigInteger valor){
        int sw=0;
        BigInteger i=new BigInteger("2");
        while(sw==0&&i.compareTo(valor.divide(BigInteger.valueOf(2)))<=0){
            if(valor.remainder(i).equals(BigInteger.ZERO)){
                sw=1;
            }
            i=i.add(BigInteger.ONE);
        }
        if(sw==0){
            return true;
        }else{
            return false;
        }
    }
}
