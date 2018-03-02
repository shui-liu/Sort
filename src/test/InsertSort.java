package test;

/**
 * 插入排序
 * 原理：将原序列视作两个序列：单独由第一个元素组成的有序序列和由其余元素组成的无序序列，依次将无序元素与有序元素比较并插入
 * 时间复杂度：O(n^2); 空间复杂度：O(1); 稳定：true
*/
public class InsertSort {
	public void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[i - 1]) {
				int j = i - 1;
				int temp = a[i];
				while (j > -1 && temp < a[j]) {
					a[j + 1] = a[j];
					j--;
				}
				a[j + 1] = temp;
			}
		}
	}
}
