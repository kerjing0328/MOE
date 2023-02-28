public class School {
    School_Name s_name;
    Address address;
    Principal principal;
    Students[] student;

    private int currstunum = 0;

    int num_student;

    public School(int num, String pri_fname, String pri_mname, String pri_lname){
        this.num_student = num;
        student = new Students[num];
        principal = new Principal(pri_fname, pri_mname, pri_lname);
    }

    public void setName(String pre_name, String l_name){
        this.s_name = new School_Name(pre_name, l_name);
    }

    public void addStudent(Students student){
        this.student[currstunum] = student;
        currstunum++;
    }

    public double calcAvgMarks(){
        double avg = 0.0, total = 0.0;
        for (int i = 0; i<currstunum; i++){
            total += student[i].getMark();
        }
        avg = total/currstunum;
        return avg;
    }

    public double calcStdMarks(){
        double total = 0.0, std = 0.0;
        for (int i = 0; i<currstunum; i++){
            total += student[i].getMark();
        }
        double mean = total/currstunum;
        for (int i = 0; i<currstunum; i++){
            std += Math.pow(student[i].getMark() - mean, 2);
        }
        return Math.sqrt(std/currstunum);
    }

    public void sortMarks(){
        Students x;
        for (int i = 0; i < currstunum; i++){
            for (int j = i+1; j < currstunum; j++){
                if (student[j].getMark() < student[i].getMark()){
                    x = student[i];
                    student[i] = student[j];
                    student[j] = x;
                }
            }
        }
    }

    public String getPName(){
        return principal.getPName().getFullName();
    }

    public String getSName(){
        return s_name.getSchool_fullname();
    }

    public int getCurrstunum(){
        return currstunum;
    }
}
