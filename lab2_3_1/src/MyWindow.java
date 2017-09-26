
class Window {

    public static void main(String[] args) {
        ClassForWindow myWindow1 = new ClassForWindow();
        ClassForWindow myWindow2 = new ClassForWindow();
        ClassForWindow myWindow3 = new ClassForWindow();
        ClassForWindow myWindow4 = new ClassForWindow();
        ClassForWindow myWindow5 = new ClassForWindow();

        myWindow1.setWidth(100);
        myWindow1.setHeight(50);
        myWindow1.setNumberOfGlass(3);
        myWindow1.setColor("red");
        myWindow1.setOpen(true);

        myWindow2.setWidth(150);
        myWindow2.setHeight(10);
        myWindow2.setNumberOfGlass(2);
        myWindow2.setColor("blue");
        myWindow2.setOpen(false);

        myWindow3.setWidth(10);
        myWindow3.setHeight(560);
        myWindow3.setNumberOfGlass(35);
        myWindow3.setColor("black");
        myWindow3.setOpen(true);

        myWindow4.setWidth(40);
        myWindow4.setHeight(70);
        myWindow4.setNumberOfGlass(2);
        myWindow4.setColor("green");
        myWindow4.setOpen(false);

        myWindow5.setWidth(35);
        myWindow5.setHeight(66);
        myWindow5.setNumberOfGlass(34);
        myWindow5.setColor("brown");
        myWindow5.setOpen(true);

        myWindow1.printFields();
        myWindow2.printFields();
        myWindow3.printFields();
        myWindow4.printFields();
        myWindow5.printFields();
    }


}
