package com.interviewer;

public class LeetCode2 {

	public int minDistance(String word1, String word2) {

		int x = word1.length();

		int y = word2.length();

		int[][] dp = new int[x + 1][y + 1];

		for (int i = 0; i <= x; i++) {

			dp[i][0] = i;

		}

		for (int j = 0; j <= y; j++) {

			dp[0][j] = j;

		}

		for (int i = 1; i <= x; i++) {

			for (int j = 1; j <= y; j++) {

				if (word1.charAt(i - 1) == word2.charAt(j - 1)) {

					dp[i][j] = dp[i - 1][j - 1];

				} else {

					dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));

				}

			}

		}

		return dp[x][y];

	}

	public static void main(String[] args) {

		String s = "intention", t = "execution";
		//intention -> inention (remove 't')
		//inention -> enention (replace 'i' with 'e')
		//enention -> exention (replace 'n' with 'x')
		//exention -> exection (replace 'n' with 'c')
		//exection -> execution (insert 'u')
		LeetCode1 c = new LeetCode1();
		c.minDistance(s, t);
		System.out.println(c.minDistance(s, t));

	}

}
