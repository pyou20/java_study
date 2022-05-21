package 迭代器_数据结构_List_Set_TreeSet集合_Colletions工具类;

import java.util.ArrayList;
import java.util.Iterator;

public class Test3 {
    public static void main(String[] args) {
        double maxScore=0,allScore=0,average=0,minScore=0,num=0;
        double temp=0;

        ArrayList<Student> studentsTable=new ArrayList<>();

        studentsTable.add(new Student("小王","18",90));
        studentsTable.add(new Student("小李","20",94));
        studentsTable.add(new Student("PYou","22",80));
        studentsTable.add(new Student("Mike","22",60));
        studentsTable.add(new Student("joh","21",84));

        Iterator<Student> it = studentsTable.iterator();
        while(it.hasNext()){
            Student student=it.next();
            temp=student.getScore();
            num++;
            allScore+=temp;
            maxScore=maxScore>temp?maxScore:temp;
            minScore=minScore<temp?minScore:temp;
        }
        average=allScore/num;

        System.out.println("总分：" +allScore+
                "最高分" +maxScore+
                "平均分" +average+
                "最低分"+minScore);
        System.out.println(num);
    }

}

class Student{
    private String name;
    private String age;
    private double score;

    public Student(){}
    public Student(String name, String age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setScore(double score) {
        this.score = score;
    }
}