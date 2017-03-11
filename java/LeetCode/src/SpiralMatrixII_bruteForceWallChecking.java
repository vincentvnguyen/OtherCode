
public class SpiralMatrixII_bruteForceWallChecking {
	public static int[][] generateMatrix (int n){
		int [][] answer = new int[n][n];
		int horizontalIndex = 0;
		int verticalIndex = 0;
		// 0 = right, 1 = down, 2 = left, 3 = up
		int direction = 0;
		for (int index = 0; index < n*n; index++){
			answer[verticalIndex][horizontalIndex] = index + 1;
			// Tons of ifs
			if (direction == 0){
				// Check to see if reached right
				if (horizontalIndex + 1 >= n || answer[verticalIndex][horizontalIndex+1] != 0){
					// Switch down
					direction = 1;
					verticalIndex++;
				}
				else {
					// Go right
					horizontalIndex++;
				}
			}
			else if (direction == 1){
				// Check to see if reached bottom
				if (verticalIndex + 1 >= n || answer[verticalIndex+1][horizontalIndex] != 0){
					// Switch left
					direction = 2;
					horizontalIndex--;
				}
				else {
					// Go down
					verticalIndex++;
				}
			}
			else if (direction == 2){
				// Check to see if reached left
				if (horizontalIndex - 1 <= -1 || answer[verticalIndex][horizontalIndex-1] != 0){
					// Switch up
					direction = 3;
					verticalIndex--;
				}
				else {
					// Go left
					horizontalIndex--;
				}
			}
			else if (direction == 3){
				// Check to see if reached up
				if (verticalIndex - 1 <= -1 || answer[verticalIndex-1][horizontalIndex] != 0){
					// Switch right
					direction = 0;
					horizontalIndex++;
				}
				else {
					// Go up
					verticalIndex--;
				}
			}
		}
		for (int row = 0; row<n; row++){
			for (int column = 0; column<n; column++){
				System.out.print(answer[row][column]);
			}
			System.out.println();
		}
		return answer;
	}
}
