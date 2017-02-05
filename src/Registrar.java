public class Registrar {

    private boolean override = false;

    void setOverride(boolean value){
        override =  value;
    }

    boolean canRegister(int credits, double gpa){
        if(override)
            return true;
        else
        if(gpa < 2.0)
            return false;
        else if(gpa >= 3.0)
            return true;
        else
            return credits <16;
    }
}


