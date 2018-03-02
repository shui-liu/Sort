package test;

/**
 * 冒泡排序
 * 原理：重复依次比较序列中相邻的无序元素，每一次遍历减少一个无序元素
 * 时间复杂度：O(n^2); 空间复杂度：O(1); 稳定：true
*/
public class BubbleSort {
	public void sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
}
