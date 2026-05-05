package com.calculator;

public class Calculator 
{
    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a,int b){
        return a-b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
    public int divide(int a,int b){
        if(b==0){
            throw new IllegalArgumentException("cannot divide by zero");
        }
        return a/b;
    }
    public int modulus(int a,int b){
        if(b==0){
            throw new IllegalArgumentException("cannot modulus by zero");
            
        }
        return a%b;
    }
    public int power(int a,int b){
        return (int) Math.pow(a,b);
    }
    public int square(int a){
        return a*a;
    }
    public int squareRoot(int a){
        if(a<0){
            throw new IllegalArgumentException("cannot square root of negative number");
        }
        return (int) Math.sqrt(a);
    }
    public int factorial(int a){
        if(a<0){
            throw new IllegalArgumentException("cannot factorial of negative number");
        }
        int result=1;
        for(int i=1;i<=a;i++){
            result*=i;
        }
        return result;
    }
}
