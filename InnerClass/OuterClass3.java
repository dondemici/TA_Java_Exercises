class OuterClass3{

void show()
{

    class MethodInner
    {
        void display(){
            System.out.println("sOMETHING");
        }
    }
    MethodInner m1 = new MethodInner();
    m1.display();

}
public static void main(String[] args) {
    new OuterClass3().show();
}
}
