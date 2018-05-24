/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nmatrix;

/**
 *
 * @author johor
 */
public class NMatrix {
    
    int n;
    int[] v;
    int zero = 0;
    
    public NMatrix(int n){
        
        if(n == 1)
            throw new IllegalArgumentException("n no puede ser 1");
        this.n = n;
        this.v = new int[(this.n*3)-2];
        
        for(int i=0;i <((n*3)-2);i++)
            v[i]=(int)(Math.random() * 50)+1;
            
    
    }
    
    public int get(int i, int j){
        
        i-=1;
        j-=1;
        
        if((i <0||i >= this.n)||(j<0||j>=this.n))
            throw new IllegalArgumentException("i o j fuera de rango matriz "
                    +this.n+"X"+this.n);
        
        if(j==0)
            return this.v[i];
        if(j+1==this.n)
            return this.v[this.n+i];
        if(i==j && (i > 0 && i < n-1)&&(j > 0 && j < n-1))
            return this.v[(2*this.n)+(i-1)];
        
        return this.zero;
    }

   
    public static void main(String[] args) {
        
       int n =6 ;
        
       NMatrix test = new NMatrix(n);
       
       
       for(int i=0;i <((n*3)-2);i++)
            System.out.println(test.v[i]);
 
       System.out.println(test.get(2,3));
    }
    
}
