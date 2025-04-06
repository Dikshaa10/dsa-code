
class Stack
{
   static final int MAX = 1000 ;
   int top ;
   int a[] = new int [ MAX];
   boolean isEmpty()
   {
      return (top<0);
   }
   Stack ()
   {

   }

   boolean  push() {
   
if(top > MAX-1){
   System.out.println("Stack is overflow");
   return false ;
}
else{
   int x = a[top++];
   return true ;
}
   
}
int pop ()
{
if(top < 0){
   System.out.println("Stack is underflow");
   return 0 ;
}
else{
   int x = a[top--];
   return x;
}
}
int peek ()
{
   if(top <0){
      System.out.println("Stack is underflow");
      return 0 ;
   }
   else{
      int x = a[top++];
      return x ;
   }
}
}
  void Display()
 {
   for(int i = top ; i>-1 ; i--){
      System.out.println(""+ a[i]);

   }

}
class Main 
{
   public static void main(String[] args) {
       Stack s = new Stack();
       s.push (10);
       s.push (20);
       s.push (30);
       s.push (40);
       System.out.println(s.pop() +"stack is popped");
       s.Display ();
       

       
   }
}