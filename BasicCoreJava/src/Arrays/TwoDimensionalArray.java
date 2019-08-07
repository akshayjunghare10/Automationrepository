package Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][]	 str=new String[3][2];
		//row1
		str[0][0]="pooja";
		str[0][1]="poonam";
		//row2
		str[1][0]="akshay";
		str[1][1]="rutwik";
		//row3
		str[2][0]="kajal";
		str[2][1]="Mayur";
		System.out.println(str[0][1]+str[0][1]);
		System.out.println(str[1][1]+str[1][1]);
		System.out.println(str[2][1]+str[2][1]);
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				
				System.out.println(str[i][j]);
			}
			}
		}
		
		}

