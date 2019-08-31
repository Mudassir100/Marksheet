package completestudentmarksheet;
public class CompleteStudentMarksheet {
public static void main(String[] args) {
int a=1;
float totalMarks=0;
float Avg;
float AvgScore=50;
float difference;
float highest=0, lowest=500;

System.out.println("MsrkSheet");
float marks[][]={{50,30,35,65,55},{89,23.5f,93.5f,66.5f,95},
{40,60,65,50,35},{0,33,65,66,41},{59,8,15,20,0},
{45,65,74,39,55},{78,83,84,85,55},{90,86,94,91,80},
{80,68,73,70,74},{98,97,89,87,90}};
for(int StuNo=0;StuNo<marks.length;StuNo++)
{
System.out.println("--------------------");
System.out.println("Student "+a);
System.out.println("--------------------");
    System.out.println("Marks of Five Subjects");
a++;
for(int SbjNo=0;SbjNo<5;SbjNo++)
{
System.out.print(marks[StuNo][SbjNo]+" ");
totalMarks=totalMarks + marks[StuNo][SbjNo];
}
System.out.println("\nTotal = "+totalMarks);
Avg=totalMarks/5;
System.out.println("Average = "+Avg);

if(Avg>=AvgScore)
{
    System.out.println("Exceed the average Score i.e 50");
}
else{
    System.out.println("Below the average Score i.e 50");
}
System.out.println("Grade");
if(Avg>=90){System.out.println("A");}
else if(Avg>=80 && Avg<90){System.out.println("B");}
else if(Avg>=70 && Avg<80){System.out.println("C");}
else if(Avg>=60 && Avg<70){System.out.println("D");}
else {System.out.println("E");}
difference=Avg-AvgScore;
System.out.println("Difference between Gain Marks and Avg Marks = "+difference);

if(totalMarks>highest)
{
highest=totalMarks;
}
if(totalMarks<lowest)
{
lowest=totalMarks;
}
totalMarks=0;
}  
    System.out.println("-------------------------");
    System.out.println("Highest marks = "+highest);
    System.out.println("Lowest marks = "+lowest);
    System.out.println("-------------------------");
}  
}