class Student {
    private String first_name;
    private String last_name;
    private String student_id;
    final private String course_name = "CSIS";
    
    public Student(String first_name, String last_name, String student_id){
        this.first_name = first_name;
        this.last_name = last_name;
        this.student_id = student_id;
    }

    public String getFirst_name(){
        return first_name;
    }
    public String getLast_name(){
        return last_name;
    }
    public String getStudent_id(){
        return student_id;
    }

    public void SetFirst_name(String first_name){
        this.first_name = first_name;
    }
    public void SetLast_name(String last_name){
        this.last_name = last_name;
    }
    public void SetStudent_id(String student_id){
        this.student_id = student_id;
    }

    void printDetails(){
        System.out.println("The details are as follows: "+first_name+last_name+student_id);
        System.out.println("Course name: "+course_name);
    }

}
class TestStudent{
    public static void main(String[] args){
        Student student1 = new Student("Dona","Nobis","99");
            student1.printDetails();
    }
}

