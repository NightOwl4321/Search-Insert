package project;

import javax.swing.JOptionPane;

public class binarySearch {
	public static void main(String[] args) {
		int[] a = { 1, 4, 7, 10 };
		String input = JOptionPane.showInputDialog("What number should be inserted?");
		final int insertNum = Integer.parseInt(input);
		binarySearch(a, insertNum);
	}

	private static int binarySearch(int[] a, final int insertNum) {
		int mid = a.length / 2;
		if (a[mid] != insertNum) {
			if (a[mid] > insertNum) {
				mid /= 2;
			} else if (a[mid] < insertNum) {
				mid = mid + (mid / 2);
			}
		} else {
			insertPos = mid;
		}
		return insertPos;
	}

}
