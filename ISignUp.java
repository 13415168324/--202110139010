import java.util.ArrayList;
import java.util.Scanner;

public interface ISignUp {
	public void print();
	public boolean addStudent(int stuType);
	public static IParams parse() throws Exception{
		Scanner scan = new Scanner(System.in);
		String[] a = SchoolSystem.parse(scan.next());
		  IParams iparams = new IParams() {
			  int Big;
			  int Medium;
			  int Small;
			@Override
			public int getBig() {
				IParams();
				return Big;
			}
			@Override
			public int getMedium() {
				IParams();
				return Medium;
			}
			@Override
			public int getSmall() {
				IParams();
				return Small;
			}
			@Override
			public ArrayList<Integer> getPlanSignUp() {
				ArrayList<Integer> planSignUp = new ArrayList<Integer>();
                for (int i = 4;i<a.length;i++) {
                    planSignUp.add(Integer.valueOf(a[i]));
                }
				return planSignUp;
			}
			 void IParams() {
                 for (int i = 1; i < 4; i++) {
                     if (i == 1) {
                         Big = (Integer.valueOf(a[i]));
                     } else if (i == 2) {
                         Medium = (Integer.valueOf(a[i]));
                     } else {
                         Small = (Integer.valueOf(a[i]));
                     }
                 }
             }
     };return iparams;
		  
	}

}
