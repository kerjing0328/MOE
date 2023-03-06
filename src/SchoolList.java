public class SchoolList {

    School[] year23;
    int year;
    int currsize;

    public SchoolList(int year, int maxschoolsz){
        this.year = year;
        year23 = new School[maxschoolsz];
    }

    public void addSchool(School school_participate){
        this.year23[currsize] = school_participate;
        currsize++;
    }


    public School getBestSchool(){
        int topavg = 0;
        double max = year23[0].calcAvgMarks();

        for(int i = 0; i<currsize; i++){
            double avg = year23[i].calcAvgMarks();
            if (avg > max){
                max = avg;
                topavg = i;
            }
        }
        return year23[topavg];
    }

    public void removeSchool(int index){
        School[] year23_new = new School[year23.length-1];
        for (int i = 0, k = 0; i < year23.length; i++){
            if (i!=index){
                year23_new[k] = year23[i];
                k++;
            }
        }
        currsize -= 1;
        for (int i = 0; i < year23_new.length; i++){
                year23[i] = year23_new[i];
            }
    }

    public School getHiStdSchool(){
        int topstd = 0;
        double max = year23[0].calcStdMarks();

        for(int i = 0; i<currsize; i++){
            double avg = year23[i].calcStdMarks();
            if (avg > max){
                max = avg;
                topstd = i;
            }
        }
        return year23[topstd];
    }

    public int getIndex(String s_lname){
        int index = -1;
        if (year23 == null) {
            index = -1;
        }

        int len = year23.length;
        int i = 0;

        while (i < len) {
            if (year23[i].s_name.getSchool_lastname().equals(s_lname)) {
                index = i;
                break;
            }
            else {
                i = i + 1;
                index = -1;
            }
        }
        return index;
    }


}
