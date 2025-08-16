package week1.day2;

public class Fibonacciseries {


		public static void main(String[] args) {

			int range = 8, firstNum = 0, secNum = 1, sum;

			System.out.print(firstNum + ", ");

			System.out.print(secNum);

			for (int i = 2; i < range; i++) {
				sum = firstNum + secNum;

				System.out.print(", " + sum);

				firstNum = secNum;

				secNum = sum;
			}
		}
	}


