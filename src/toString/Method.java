package toString;

class Human{
    String name;
    String occupation;
    String gender;

   public String toString(){
        return name+"\n"+occupation+"\n"+gender;
    }

}

public class Method {
   public static void main(String[]args){

       Human human=new Human();


       human.name="Musa";
       human.occupation="Freedom fighter";
       human.gender="male";

       System.out.println(human);

    }

}
