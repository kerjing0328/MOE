import java.util.*;
public class Main {

    // In order to be included in a national ranking exercise,
    // secondary schools may choose to participate in a math competency evaluation survey.
    // The MoE maintains the list of the schools (there may new addition, and some schools may opt out).
    // Each school is identified by the name, the address (this usually split into multiple parts),
    // the principal's name (first name, last name).
    // A dataset of marks collected for each school.
    // Each marks entry consists of a score, the ID and name and class name of the participating student.
    // The survey is carried out on a yearly basis.
    //
    //The MoE would like to be able to do the following calculation over the years :
    //get the score for a particular school in a particular year
    //list out the average score for each schools
    //list out the standard deviation for each schools
    //sort the list
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("-------------------- Menu --------------------");
        System.out.println("1. Add New School Record");
        System.out.println("2. Display Performance of Particular School");
        System.out.println("3. List out the Average Score and Standard Deviation");
        System.out.println("4. Display the Best Performer");
        System.out.println("5. Remove Existing School Record");
        System.out.println("6. Exit\n");

        System.out.print("Option: ");
        int option = in.nextInt();

        SchoolList year2023 = new SchoolList(2023, 3);

        while (option!=6){

            if (option == 1){
                //Add new school to SchoolList for a particular year
                //Enter School Name
                System.out.println(">>> Enter School Info");
                System.out.print("Pre Name: ");
                String pre_name = in.next();
                System.out.print("Last Name: ");
                String l_name = in.next();

                //Enter Principal Name
                System.out.println("\n>>> Enter Principal's Name");
                System.out.print("First Name: ");
                String pri_fname = in.next();
                System.out.print("Middle Name: ");
                String pri_mname = in.next();
                System.out.print("Last Name: ");
                String pri_lname = in.next();


                //Enter num of student participate
                System.out.print("\nEnter the number of students participate: ");
                int num_stu = in.nextInt();
                School school = new School(num_stu,pri_fname, pri_mname, pri_lname);
                school.setName(pre_name, l_name);

                //Enter each student's info
                for (int j = 0; j < num_stu; j++){
                    System.out.println("\n>>> Enter Student #"+(j+1)+"'s Info");
                    System.out.print("First Name: ");
                    String stu_fname = in.next();
                    System.out.print("Middle Name: ");
                    String stu_mname = in.next();
                    System.out.print("Last Name: ");
                    String stu_lname = in.next();
                    System.out.print("Student ID: ");
                    String stu_id = in.next();
                    System.out.print("Mark: ");
                    double mark = in.nextDouble();
                    Students student = new Students(stu_fname,stu_mname,stu_lname, stu_id, mark);
                    school.addStudent(student);
                }
                school.sortMarks();
                year2023.addSchool(school);
            }
            else if (option == 2){
                //for (int i = 0; i < year2023.currsize; i++){
                System.out.print("Enter a school's last name: ");
                String filter = in.next();
                int i = year2023.getIndex(filter);
                if (i==-1){
                    System.out.println("Error! School non-exist!");
                }
                else{
                    System.out.println("\n>>> School: "+year2023.year23[i].getSName());
                    for (int j = 0; j < year2023.year23[i].getCurrstunum(); j++){
                        System.out.println("\nStudent #"+(j+1)+"'s Info: ");
                        System.out.println("Name            : "+year2023.year23[i].student[j].getSName());
                        System.out.println("Student ID      : "+year2023.year23[i].student[j].getStu_id());
                        System.out.println("Mark            : "+year2023.year23[i].student[j].getMark());
                    }
                    System.out.println("\nAverage           : "+year2023.year23[i].calcAvgMarks());
                    System.out.println("Standard Deviation  : "+year2023.year23[i].calcStdMarks()+"\n");

                }

                //}
            }
            else if(option==3) {
                for (int i = 0; i < year2023.currsize; i++) {
                    System.out.println("\n>>> School: " + year2023.year23[i].getSName());
                    System.out.println("Average           : " + year2023.year23[i].calcAvgMarks());
                    System.out.println("Standard Deviation  : " + year2023.year23[i].calcStdMarks() + "\n");

                }
            }
            else if(option==4){
                School school = year2023.getBestSchool();

                System.out.println("\nHighest Average Marks: "+school.calcAvgMarks()+" ("+school.getSName()+")");

                school = year2023.getHiStdSchool();

                System.out.println("Highest Std School: " +school.calcStdMarks()+" ("+school.getSName()+")");
            }
            else if(option==5){
                System.out.print("Index to remove: ");
                int index = in.nextInt();
                year2023.removeSchool(index);

                for (int i = 0; i < year2023.currsize; i++){
                    System.out.println("\n>>> School: "+year2023.year23[i].getSName());
                    for (int j = 0; j < year2023.year23[i].getCurrstunum(); j++){
                        System.out.println("\nStudent #"+(j+1)+"'s Info: ");
                        System.out.println("Name            : "+year2023.year23[i].student[j].getSName());
                        System.out.println("Student ID      : "+year2023.year23[i].student[j].getStu_id());
                        System.out.println("Mark            : "+year2023.year23[i].student[j].getMark());
                    }
                    System.out.println("\nAverage           : "+ year2023.year23[i].calcAvgMarks());
                    System.out.println("Standard Deviation  : "+year2023.year23[i].calcStdMarks()+"\n");

                }
            }
            System.out.println("-------------------- Menu --------------------");
            System.out.println("1. Add New School Record");
            System.out.println("2. Display Performance of Particular School");
            System.out.println("3. List out the Average Score and Standard Deviation");
            System.out.println("4. Display the Best Performer");
            System.out.println("5. Remove Existing School Record");
            System.out.println("6. Exit\n");

            System.out.print("Option: ");
            option = in.nextInt();
        }







    }

}