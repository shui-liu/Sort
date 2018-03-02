package test;

/**
 * 堆排序
 * 原理：首先将序列建立为大顶堆，再重复交换堆顶和末尾元素，恢复大顶特性这两个步骤直至所有元素有序 时间复杂度：O(nlgn);
 * 空间复杂度：O(1); 稳定：false
 */
public class HeapSort {
	public static void adjust(int[] a, int i, int len) {
		int temp, j;
		temp = a[i];
		for (j = 2 * i + 1; j < len; j = j * 2 + 1) {
			if (j < len - 1 && a[j] < a[j + 1])
				j++;
			if (temp >= a[j])
				break;
			a[i] = a[j];
			i = j;
		}
		a[i] = temp;
	}

	public static void sort(int[] a) {
		// 建立大顶堆
		for (int i = a.length / 2 - 1; i > -1; i--) {
			adjust(a, i, a.length);
		}
		// 交换堆顶和末尾元素，并恢复大顶堆
		for (int i = a.length - 1; i > 0; i--) {
			int temp = a[i];
			a[i] = a[0];
			a[0] = temp;
			adjust(a, 0, i);
		}
	}
}