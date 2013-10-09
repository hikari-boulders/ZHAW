package Uebung02;

public class Diamond {


	boolean flag;
	
	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public static void main(String [ ] args){
		Diamond diamond = new Diamond();
		
		String currentLine = new String();
		int n = 9;
		char[][] arrDiamond = new char[n][n];
		arrDiamond = diamond.drawDiamond(n);
		
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
		
		// set spaces for all elements first
		for(int i=0;i<n;i++){
			arrDiamond[0][i] = ' ';
			arrDiamond[n-1][i] = ' ';
		}
		
		// set stars for 1st and last row
		arrDiamond[0][(n-1)/2] = '*';
		arrDiamond[n-1][(n-1)/2] = '*';
		
		for(int i=1;i<n-1;i++) { // loop rows

			setFlag(false);
			
			for(int j=0;j<n;j++){ // loop lines; start with Index 1 and end with Index n-1, since these are indexed manually
				
				if(i < (n-1)/2){

					// 1st half
					if(isFlag() == false && arrDiamond[i-1][j] == '*') {
						setFlag(true);
						arrDiamond[i][j-1] = '*';
					} else if (isFlag() == true && arrDiamond[i-1][j] == '*') {
						System.out.println("yea");
						arrDiamond[i][j+1] = '*';
					} else {
						arrDiamond[i][j] = ' ';
					}
					
				} else if(i == (n-1)/2) {
					// exactly half --> fill entire row with stars
					arrDiamond[i][j] = '*';
				} else {
					// 2nd half
					if(isFlag() == false && arrDiamond[i-1][j] == '*') {
						setFlag(true);
						arrDiamond[i][j+1] = '*';
					} else if (isFlag() == true && arrDiamond[i-1][j] == '*') {
						arrDiamond[i][j-1] = '*';
					}
				}
				
			}
		}
		
		return arrDiamond;
		
	}

}
