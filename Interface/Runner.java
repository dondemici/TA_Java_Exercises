import java.util.*;;

interface Runner {
    void run();
}

class Machine implements Runner{
    public void run()
    {
        System.out.println("I run to manufacture.");
    }
}

class Athelete implements Runner{
    public void run(){
        System.out.println("I run marathons.");
    }
}

class PoliticalCandidate implements Runner{
    public void run(){
        System.out.println("I run for election.");
    }
}


class TestClasses{
    public static void main(String[] args) {
        
        ArrayList<Runner> listofRunners=new ArrayList<>();

        listofRunners.add(new Machine());
        listofRunners.add(new Athelete());
        listofRunners.add(new PoliticalCandidate());

        Iterator<Runner> itr=listofRunners.iterator();

        while(itr.hasNext())
        {
            Runner s=itr.next();
            s.run();
        }
    }
}