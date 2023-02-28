public class Principal {
    Name pName;

    public Principal(String f_name, String m_name, String l_name){
        pName = new Name(f_name, m_name, l_name);
    }

    public Name getPName(){
        return pName;
    }

}
