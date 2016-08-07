package com.safkanyazilim.questionchooser;

import java.util.Random;

public class QuestionChooser {
	private static int[] numberOfQuestionsInChapter = new int[]{9, 8, 6, 12, 8, 10, 12, 14, 8, 11, 6, 11, 8, 7, 7, 26, 26};
	
	public static ProblemLocation randomlyChooseQuesiton() {
		int numberOfChapters = numberOfQuestionsInChapter.length;
		Random random = new Random();
		
		int indexOfChapter = random.nextInt(numberOfChapters);
		int numberOfQuestion = random.nextInt(numberOfQuestionsInChapter[indexOfChapter]) + 1;
		
		return new ProblemLocation(indexOfChapter+1, numberOfQuestion);
	}
	
	public static void main(String[] args) {
		System.out.println(randomlyChooseQuesiton());
	}

}
