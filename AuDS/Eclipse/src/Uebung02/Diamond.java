package Uebung02;

public class Diamond {

	public static void main(String [ ] args){
		Diamond diamond = new Diamond();
		
		String currentLine = new String();
		int n = 5;
		char[][] arrDiamond = new char[n][n];
		arrDiamond = diamond.drawDiamond(5);
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++){
				currentLine += arrDiamond[i][j];
			}
			System.out.println(currentLine);
			currentLine = "";
		}
			
	}
	
	public char[][] drawDiamond(int n) {
		
		char[][] arrDiamond = new char[n][n];
		boolean flag;
		
		// set stars for 1st and last row
		for(int i=0;i<n;i++){
			arrDiamond[0][i] = ' ';
			arrDiamond[n-1][i] = ' ';
		}
		
		arrDiamond[0][(n-1)/2] = '*';
		arrDiamond[n-1][(n-1)/2] = '*';
		
		for(int i=1;i<n-1;i++) { // rows
			
			for(int j=0;j<n;j++){ // lines; start with Index 1 and end with Index n-1, since these are indexed manually
				
				flag = false;
				
				if(i < (n-1)/2){
					// 1st half
					if(flag == false && arrDiamond[i-1][j] == '*') {
						flag = true;
						arrDiamond[i][j-1] = '*';
					} else if (flag == true && arrDiamond[i-1][j] == '*') {
						arrDiamond[i][j+1] = '*';
					} else {
						arrDiamond[i][j] = ' ';
					}
					
				} else if(i == (n-1)/2) {
					// exactly half
					arrDiamond[i][j] = '*';
				} else {
					// 2nd half
//					if(flag == true && arrDiamond[i-1][j] == '*') {
//						flag = true;
//						arrDiamond[i][j+1] = '*';
//					} else if (flag == false && arrDiamond[i-1][j] == '*') {
//						arrDiamond[i][j-1] = '*';
//					}
				}
				
			}
		}
		
		return arrDiamond;
		
	}

}
