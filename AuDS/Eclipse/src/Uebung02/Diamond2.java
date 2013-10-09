package Uebung02;

public class Diamond2 {

	
	public static void main(String [ ] args){

		int n = 9;

		Diamond2 diamond = new Diamond2();
		String currentLine = new String();
		char[][] arrDiamond = new char[n][n];
		arrDiamond = diamond.drawDiamondx(n);
		
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++){
				currentLine += arrDiamond[i][j] == '*' ? "*" : " ";
			}
			System.out.println(currentLine);
			currentLine = "";
		}
		
		
	}
	
	public char[][] drawDiamondx(int n) {
		
		char[][] arrDiamond = new char[n][n];
		char s = '*';
		
		arrDiamond[(n-1)/2][0] = s;
		arrDiamond[(n-1)/2][n-1] = s;
		
		// 1st (n-1)/2
		int i = 1;
		for(;i<(n-1)/2+1;i++) {
			arrDiamond[(n-1)/2+i][i] = s;
			arrDiamond[(n-1)/2][i] = s;
			arrDiamond[(n-1)/2-i][i] = s;
			
		}

		// 2nd (n-1)/2
		for(int j=((n-1)/2)-1;i<n-1;j--) {
			arrDiamond[(n-1)/2+j][i] = s;
			arrDiamond[(n-1)/2][i] = s;
			arrDiamond[(n-1)/2-j][i] = s;
			i++;
		}
		
		return arrDiamond;
		
	}


}
