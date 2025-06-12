class Patient{
    private int patient_id;
    private String first_name;
    private String middle_name;
    private String last_name;

    Patient(String first_name, String middle_name, String last_name, int patient_id){
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.patient_id = patient_id;
    }

    Patient(){

    }

    void display(){
        System.out.print("The patient's name is "+first_name+" "+middle_name+" "+last_name+".");
        System.out.println("\nID number: "+patient_id);
    }

    public static void main(String[] args){
        //Scenario 1A: Constructor with parameters
        //String first_name = "Mike";
        //String middle_name = "Valera";
        //String last_name = "Alfiler";
        //int patient_id = 100;
        //Patient patient1 = new Patient(first_name,middle_name,last_name,patient_id);
        
        //Scenario 1B: Object first -> Error, Cannot make a static reference to the non-static field first_name
        //Patient patient1 = new Patient(first_name,middle_name,last_name,patient_id);
        //String first_name = "Mike";
        //String middle_name = "Valera";
        //String last_name = "Alfiler";
        //int patient_id = 100;

        //Scenario 2: Constructor without parameters
        Patient patient1 = new Patient();
        patient1.first_name = "Mike";
        patient1.patient_id = 100;

        System.out.println("The patient details are as follow: ");
        patient1.display();
    }
}
