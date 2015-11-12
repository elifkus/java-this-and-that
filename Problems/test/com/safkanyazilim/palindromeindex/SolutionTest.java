package com.safkanyazilim.palindromeindex;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testPalindromeIndex() {
		String item1 = "aaa";
		
		int expected = -1;
		
		//assertEquals(expected, Solution.findCommonLetter(item1, item2));
	}
	
	@Test
	public void testPalindromeIndexWithHackerRankTestCase() {
		String[] items = {"quyjjdcgsvvsgcdjjyq",
							"hgygsvlfwcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcflvsgygh",
							"fgnfnidynhxebxxxfmxixhsruldhsaobhlcggchboashdlurshxixmfxxxbexhnydinfngf",
							"bsyhvwfuesumsehmytqioswvpcbxyolapfywdxeacyuruybhbwxjmrrmjxwbhbyuruycaexdwyfpaloyxbcpwsoiqtymhesmuseufwvhysb",
							"fvyqxqxynewuebtcuqdwyetyqqisappmunmnldmkttkmdlnmnumppasiqyteywdquctbeuwenyxqxqyvf",
							"mmbiefhflbeckaecprwfgmqlydfroxrblulpasumubqhhbvlqpixvvxipqlvbhqbumusaplulbrxorfdylqmgfwrpceakceblfhfeibmm",
							"tpqknkmbgasitnwqrqasvolmevkasccsakvemlosaqrqwntisagbmknkqpt",
							"lhrxvssvxrhl",
							"prcoitfiptvcxrvoalqmfpnqyhrubxspplrftomfehbbhefmotfrlppsxburhyqnpfmqlaorxcvtpiftiocrp",
							"kjowoemiduaaxasnqghxbxkiccikxbxhgqnsaxaaudimeowojk"};
		
		int[] expected = {1,
							8,
							33,
							23,
							25,
							44,
							20,
							-1,
							14,
							-1};
		for(int i=0; i<10; i++) {
			assertEquals(expected[i], Solution.palindromeIndex(items[i]));
		}
 	}

	@Test
	public void testSpeedForPalindromeIndex() {
		String[] items = {"aabbabab",
						  "aba",
						  "sdasdfasdf",
						  "yhohksdf",
						  "hjhjhhjj",
						  "asdfafff",
						  "ijkjkkkk",
						  "asdffdsa",
						  "akkaakka",
						  "kitapcinin",
						  "aabbcbab",
						  "aba",
						  "sdasddasds",
						  "yjohmsdf",
						  "hjljhljj",
						  "asdfaaff",
						  "ijkjkakk",
						  "aslfflsa",
						  "fknafkna",
						  "kitaplinin"};
		
		long start = System.currentTimeMillis();
		
		for(int j=0; j<1000000; j++) {
			for (int i = 0; i<10; i=i+2) {
				//Solution.findCommonLetter(items[i], items[i+1]);
			}
		}
		
		long end = System.currentTimeMillis();
		
		long elapsedTime = end-start;
		
		System.out.println("Total time elapsed 1: "+ String.valueOf(elapsedTime));
		
	}
	
	

}
