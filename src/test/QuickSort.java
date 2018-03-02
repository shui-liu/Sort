package test;

/**
 * 快速排序
 * 原理：选取基准元素（第一个元素），将其余原序列元素依次与基准元素比较，分成小于和大于基准元素的两个序列，再对这两个序列作同样处理
 * 时间复杂度：O(nlgn); 空间复杂度：O(lgn); 稳定：false
*/
public class QuickSort {
	public void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public void sort(int[] a) {
		sort(a, 0, a.length - 1);
	}

	public void sort(int[] a, int beg, int end) {
		if (a.length > 1) {
			int pivot = a[beg];
			// index_s:��С��;index_b:�ϴ���;count:����pivot�����
			int index_s = beg, index_b = end, count = 0; 
			for (int i = beg + 1; i <= end; i++) {
				while (a[i] > pivot) {
					swap(a, i, index_b);
					index_b--;
					if (index_b - index_s == count) {
						break;
					}
				}
				if (a[i] < pivot) {
					swap(a, i, index_s);
					index_s++;
				} else if (a[i] == pivot) {
					count++;
				}
				if (index_b - index_s == count) {
					break;
				}
			}
			if (index_s - beg > 1) {
				sort(a, beg, index_s - 1);
			}
			if (end - index_b > 1) {
				sort(a, index_b + 1, end);
			}
		}
	}
}
