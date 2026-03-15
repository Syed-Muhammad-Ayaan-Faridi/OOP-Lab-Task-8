interface Teaching {
    public void conductLecture();
} 
interface Research {
    public void publishPaper();
} 
class Staff{
    protected String Name;
    protected String StaffID;
    protected String Department;

    public Staff(String name,String staff_id,String dept){
        this.Name = name;
        this.StaffID = staff_id;
        this.Department = dept;
    }

    public void displayInfo(){
        System.out.println("Staff Name: "+this.Name);
        System.out.println("Staff ID:"+this.StaffID);
        System.out.println("Staff Department: "+this.Department);
    }
}

class Professor extends Staff implements Teaching,Research{
    public Professor(String name,String staff_id,String dept){
        super(name, staff_id, dept);
    }

    public void conductLecture(){
        System.out.println("Conducting Lecture");
    }

    public void publishPaper(){
        System.out.println("Publishing Research Paper");
    }
}
class LabInstructor extends Staff implements Teaching{
    public LabInstructor(String name,String staff_id,String dept){
        super(name, staff_id, dept);
    }

    public void conductLecture(){
        System.out.println("Conducting Lecture");
    }
    public void publishPaper(){
        System.out.println(this.Name+"Can not Publish research Paper");
    }
}
class ResearchAssistant extends Staff implements Research{
    public ResearchAssistant(String name,String staff_id,String dept){
        super(name, staff_id, dept);
    }
    
    public void publishPaper(){
        System.out.println("Publishing Research Paper");
    }
    
    public void conductLecture(){
        System.out.println(this.Name+" is Not Allowed to Conducting Lecture");
    }
}

public class Task3 {
    public static void main(String[] args) {

        Professor professor = new Professor("Dr. Owais", "CS1004", "Software engineering");
        System.out.println("Professor 1");
        professor.displayInfo();
        professor.conductLecture();
        professor.publishPaper();

        System.out.println();

        LabInstructor labInstructor = new LabInstructor("Mr. Bilal", "AI2102", "Artificial Intelligence");
        System.out.println("Lab Instructor 1");
        labInstructor.displayInfo();
        labInstructor.conductLecture();
        labInstructor.publishPaper();

        System.out.println();

        ResearchAssistant researchAssistant = new ResearchAssistant("Ms. Sara", "DS1303", "Data Science");
        System.out.println("Research Assistant 1");
        researchAssistant.displayInfo();
        researchAssistant.conductLecture();
        researchAssistant.publishPaper();
    }
}