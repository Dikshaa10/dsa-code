
//import java.util;
class StackReverse
 {
    int size ;
    int top ;
    char[] a ;
    boolean isEmpty()
    {
        return(top<0);
    }
    StackReverse(int n){
        top = -1 ;
        size = n ;
        a = new char[size];
    }

boolean push(char x){
    if(top>= size){
        System.out.println("stack is overflow");
        return false ;

    }
    else {
        a[++top] = x ;
        return true ;
    }
}
char pop(){
    if(top<0){
        System.out.println("stack is underflow");
        return 0 ;
    }
    else{
        char x = a[top--];
        return x ;
    }
}
}
class Main{
    public static void StackReverse(StringBuffer str){
        int n = str.length ();
        StackReverse obj = new StackReverse(n);
        for(int i= 0 ; i<n ; i++){
            obj.push(str.charAt(i));
        }
        for(int i= 0 ; i<n ; i++){
            char ch = obj .pop();
            str.setCharAt(i, ch);
        }
    }
    public static void main(String[] args){
        StringBuffer str = new StringBuffer("GeeksQuiz");
        StackReverse(str);
        System.out.println("Reversed string is " + str);
    }
}
