package CoreJava;
class Student{
        int id;
        int marks;
        String name;

        public static void main(String args[]){
        Student students[] = new Student[3];

        Student s1 = new Student();
        s1.name = "Riaria";
        s1.marks = 89;

        Student s2 = new Student();
        s2.name = "Ruarua";
        s2.marks = 79;

        Student s3 = new Student();
        s3.name = "Urua";
        s3.marks = 77;

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(Student s : students){
            System.out.println(s.name + " : " + s.marks);
        }  
    }
}

