package project;

import javax.swing.JOptionPane;

public class arrinsertay {
	public static void main(String[] args) {
		int[] a = { 1, 4, 7, 10 };
		String input = JOptionPane.showInputDialog("What number should be inserted?");
		final int insertNum = Integer.parseInt(input);
		insertNumIntoSortedArray(a, insertNum);
	}

	private static void insertNumIntoSortedArray(int[] a, final int insertNum) {
		int[] newA = new int[a.length + 1];
		int insertPos = -999999;

		insertPos = linearSearch(a, insertNum, insertPos);
		
		//doesn't work yet vvvvvv
		//insertPos = binarySearch(a, insertNum, insertPos);
		for (int j = 0; j < newA.length; j++) {
			if (insertPos == 0) {
				if (j == 0) {
					newA[j] = insertNum;
				} else {
					newA[j] = a[j - 1];
				}
			} else if (insertPos == a.length) {
				if (j < a.length) {
					newA[j] = a[j];
				} else {
					newA[j] = insertNum;
				}
			} else {
				if (j < insertPos) {
					newA[j] = a[j];
				} else if(j > insertPos) {
					newA[j] = a[j - 1];
				}	else {
					newA[j] = insertNum;
				}
			}

		}

	}

	private static int linearSearch(int[] a, final int insertNum, int insertPos) {
		for (int i = 0; i < a.length; i++) {
			if (insertNum <= a[i]) {
				insertPos = i;
				break;
			} else {
				insertPos = a.length;
			}
		}
		return insertPos;
	}
	
	private static int binarySearch(int[] a, final int insertNum, int insertPos) {
		int mid = a.length/2;
		if(a[mid] != insertNum) {
			if(a[mid] > insertNum) {
				mid /= 2;
			} else if(a[mid] < insertNum) {
				mid = mid + (mid/2);
			}
		} else {
			insertPos = mid;
		}
		return insertPos;
	}
}
