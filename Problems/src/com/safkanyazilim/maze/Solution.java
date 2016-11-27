package com.safkanyazilim.maze;


/**
 * Solution for <insert problem url>
 * @author elif
 *
 */
public class Solution {
	public static int findLengthOfRoute(int[][] maze, int rows, int columns, int exitRow, int exitColumn) {
		boolean visited[][] = new boolean[rows][columns];	
		
		int stepCount = 0;
		
		stepCount = findNextStep(maze, visited, 0, 0, stepCount, rows, columns, exitRow, exitColumn);
		return stepCount;
		
	}	
	
	private static int findNextStep(int[][] maze, boolean[][] visited, int x, int y, int stepCount, int rows,  int columns, int exitRow, int exitColumn) {
		visited[x][y] = true;
		//System.out.println("X,Y is "+x+","+y);
		if (checkIfExitRowAndColumn(x, y,  exitRow, exitColumn)) {
			return stepCount;
		} else {
			if (x+1 <= exitRow && !visited[x+1][y] && checkIfStepable(maze, x, y)) {
				stepCount = findNextStep(maze, visited, x+1, y, stepCount+1, rows, columns, exitRow, exitColumn);
			} else if(y+1 <= exitColumn &&  !visited[x][y+1] && checkIfStepable(maze, x, y)) {
				stepCount = findNextStep(maze, visited, x, y+1, stepCount+1, rows, columns, exitRow, exitColumn);
			} else if (x-1 > -1 && !visited[x-1][y] && checkIfStepable(maze, x, y)) {
				stepCount = findNextStep(maze, visited, x-1, y, stepCount+1, rows, columns, exitRow, exitColumn);
			} else if (y-1 > -1 && !visited[x][y-1] && checkIfStepable(maze, x, y)) {
				stepCount = findNextStep(maze, visited, x, y-1, stepCount+1, rows, columns, exitRow, exitColumn);
			} else {
				return -1;
			}

		}
		return stepCount;
	}
	
	private static boolean checkIfExitRowAndColumn(int x, int y, int exitRow, int exitColumn) {
		
		if (x == exitRow && y == exitColumn) {
			return true;
		}
		
		return false;
	}
	
	private static boolean checkIfStepable(int[][] maze, int x, int y) {
		return maze[x][y] == 0;
	}
	

}
