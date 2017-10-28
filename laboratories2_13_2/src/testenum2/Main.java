package testenum2;

public class Main {
    public static void main(String[] args) {
     MyDayOfWeek myDayOfWeek = MyDayOfWeek.FRIDAY;
     switch (myDayOfWeek){
         case SUNDAY:
             System.out.println("My Java day " + myDayOfWeek);
             break;
         case MONDAY:
             System.out.println("My Java day " + myDayOfWeek);
             break;
         case TUESDAY:
             System.out.println("My Java day " + myDayOfWeek);
             break;
         case WEDNESDAY:
             System.out.println("My Java day " + myDayOfWeek);
             break;
         case THURSDAY:
             System.out.println("My Java day " + myDayOfWeek);
             break;
         case FRIDAY:
             System.out.println("My Java day " + myDayOfWeek);
             break;
         case SATURDAY:
             System.out.println("My Java day " + myDayOfWeek);
             break;
         default:
             System.out.println("This not day of week");
     }
    }
}
