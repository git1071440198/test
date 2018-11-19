
public class A {
	
    String str = new String("good"); 
    char[] ch = {'a','b','c'}; 
    public static void main(String[] args) {
         A ex=new A();
          ex.change(ex.ch);
          System.out.print(ex.str+" and ");
          System.out.println(ex.ch);
    }
public void change(char ch[]){
          str="test ok";
          ch[0]='g';
    }

}
