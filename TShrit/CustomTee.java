public class CustomTee extends TeeShirt {
    
    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    private String slogan;

    public CustomTee(String Order_Number, String color, String size, String slogan)
    {
        super(Order_Number, color, size); //reusability
        this.slogan=slogan;
    }

@Override
public String toString(){
     //resusability
    return super.toString()+"The slogan: "+slogan;
}

}
