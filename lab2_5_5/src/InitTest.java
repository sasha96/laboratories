public class InitTest {

   static int id = 0;
   static int nextId ;
    {
        nextId =(int) Math.random()*100;
    }

    public InitTest() {
        nextId++;
        ++id;
    }

    public  void getId() {
        System.out.println(id);
    }


}







