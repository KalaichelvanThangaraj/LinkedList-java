import java.util.*;
class add{
     static void main(String[] arrgs)
    {
        LinkedList<String> subject=new LinkedList<>();
        {
            subject.add("English");
            subject.add("Tamil");
            subject.add("Maths");
            System.out.println("subject");
        }
        ArrayList<String>courses=new ArrayList<>();
        {

            courses.add("ECE");
            courses.add("CSE");
            System.out.println("courses");
        }
        subject.addAll(courses);
        System.out.println(subject);
    }
}

 /*output

subject
courses
[English, Tamil, Maths, ECE, CSE] */