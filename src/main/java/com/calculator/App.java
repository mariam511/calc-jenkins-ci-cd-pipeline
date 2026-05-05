package com.calculator;

public class Calculator 
{
    int add(int a,int b){
        return a+b;
    }
    int subtract(int a,int b){
        return a-b;
    }
    int multiply(int a,int b){
        return a*b;
    }
    int divide(int a,int b){
        if(b==0){
            throw new illegalargumentexception("cannot divide by zero");
        }
        return a/b;
    }
    int modulus(int a,int b){
        if(b==0){
            throw new illegalargumentexception("cannot modulus by zero");
            return a%b;
        }
    }
    int power(int a,int b){
        return (int) Math.pow(a,b);
    }
    int square(int a){
        return a*a;
    }
    int squareRoot(int a){
        if(a<0){
            throw new illegalargumentexception("cannot square root of negative number");
        }
        return (int) Math.sqrt(a);
    }
    int factorial(int a){
        if(a<0){
            throw new illegalargumentexception("cannot factorial of negative number");
        }
        int result=1;
        for(int i=1;i<=a;i++){
            result*=i;
        }
        return result;
    }
}
