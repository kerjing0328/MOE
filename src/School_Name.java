public class School_Name {
    protected String pre_name;
    protected String l_name;
    public School_Name(){
    }

    public School_Name(String pre_name, String l_name){
        this.pre_name = pre_name;
        this.l_name = l_name;
    }

    public String getSchool_prename(){
        return pre_name;
    }

    public String getSchool_lastname(){
        return l_name;
    }
    public String getSchool_fullname(){
        return pre_name+l_name;
    }
}
