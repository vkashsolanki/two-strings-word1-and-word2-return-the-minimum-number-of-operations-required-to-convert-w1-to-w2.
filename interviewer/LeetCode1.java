package com.interviewer;

public class LeetCode1 {
	
	
	public static void main(String[] args) {
		
		String  s = "horse", t = "ros";
		LeetCode1 c = new LeetCode1();
		c.minDistance(s, t);
		System.out.println(c.minDistance(s, t));
		
	}

	    public int minDistance(String word1, String word2) {
	        int x = word1.length(), y = word2.length();
	        int[][] f = new int[x + 1][y + 1];
	        for (int j = 1; j <= y; ++j) {
	            f[0][j] = j;
	        }
	        for (int i = 1; i <= x; ++i) {
	            f[i][0] = i;
	            for (int j = 1; j <= y; ++j) {
	                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
	                    f[i][j] = f[i - 1][j - 1];
	                } else {
	                    f[i][j] = Math.min(f[i - 1][j], Math.min(f[i][j - 1], f[i - 1][j - 1])) + 1;
	                }
	            }
	        }
	        return f[x][y];
	    }
	}


