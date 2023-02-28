public class Name {
    String f_name;
    String m_name;
    String l_name;

    public Name(String f_name, String m_name, String l_name){
        this.f_name = f_name;
        this.m_name = m_name;
        this.l_name = l_name;
    }

    public String getF_name(){
        return f_name;
    }

    public String getM_name(){
        return m_name;
    }

    public String getL_name(){
        return l_name;
    }

    public String getFullName(){
        return f_name + " " + m_name + " " + l_name + " ";
    }
}
