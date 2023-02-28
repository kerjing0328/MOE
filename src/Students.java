public class Students {
    Name sName;

    double mark;

    String stu_id;

    public Students(String f_name, String m_name, String l_name, String stu_id, double mark){
        sName = new Name(f_name, m_name, l_name);
        this.mark = mark;
        this.stu_id = stu_id;
    }

    public double getMark(){
        return mark;
    }
    public String getStu_id(){
        return stu_id;
    }

    public String getSName(){
        return sName.getFullName();
    }
}
