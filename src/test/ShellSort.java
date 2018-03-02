package test;

/**
 * 希尔排序 原理：选择末尾元素为1的递减步长序列，重复依步长将原序列元素归为一个子序列并分别作插入排序处理 时间复杂度：O(n^2);
 * 空间复杂度：O(1); 稳定：false
 */
public class ShellSort {
	public static void sort(int[] a) {
		int gap, i, j, temp;
		for (gap = a.length / 2; gap > 0; gap /= 2) {
			for (i = gap; i < a.length; i++) {
				for (j = i - gap; j >= 0 && a[j] > a[j + gap]; j -= gap) {
					temp = a[j];
					a[j] = a[j + gap];
					a[j + gap] = temp;
				}
			}
		}
	}
}
