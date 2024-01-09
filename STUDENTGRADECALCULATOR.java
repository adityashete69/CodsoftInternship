import java.util.Scanner;

class Marks{
    int M[];
    int Total;
    float Per;
    String Grade;

    void read()
    {
        Scanner sc = new Scanner(System.in);
        M= new int[5];
        System.out.println("Enter the Marks in 5 Subject out of 100");
        for(int i = 0; i<5; i++)
        {
			M[i] = sc.nextInt();
            if(M[i]>100)
            {
                System.out.println("Invalid Marks");
                break;
            }
            else{
			Total = Total + M[i];
            }
        }
        Per = (float)Total/5;
        if (Per>= 90) {
            Grade = "AA";
        } else if (Per >= 80) {
            Grade = "A";
        } else if (Per >= 70) {
            Grade = "B";
        } else if (Per >= 60) {
            Grade = "C";
        } else if (Per >= 50) {
            Grade = "D";
        }else {
            Grade = "Fail";
        }

    }
    void disp()
    {
    for(int i = 0; i<5; i++){
        System.out.print(M[i]+"  ");
    }
    System.out.println("\nTotal: "+Total+"\tPercentage: "+Per+"\tGrade"+Grade);

    }
}
public class STUDENTGRADECALCULATOR{
	public static void main(String args[]){
		Marks m1 = new Marks();
				
		m1.read();
		m1.disp();
	}
}
