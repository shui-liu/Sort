package test;

/**
 * 选择排序
 * 原理：从序列中选取最值与第一个元素交换次序，再从其余元素中选取最值与第二个元素交换次序，依此类推
 * 空间复杂度：O(n^2); 空间复杂度：O(1); 稳定：false
*/
public class SelectionSort {
	public void sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int min = a[i];
			int index = i;
			for (int j = i + 1; j < a.length; j++) {
				if (min > a[j]) {
					min = a[j];
					index = j;
				}
			}
			a[index] = a[i];
			a[i] = min;
		}
	}
}
