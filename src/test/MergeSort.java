package test;

/**
 * 归并排序
 * 原理：原序列分成若干子序列，先使子序列有序，再合并有序的子序列
 * 时间复杂度：O(nlgn); 空间复杂度：O(n); 稳定：true
*/
public class MergeSort {
	public static void merge(int[] a, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		int i = low;
		int j = mid + 1;
		int k = 0;
		while (i <= mid && j <= high) {
			if (a[i] < a[j]) {
				temp[k++] = a[i++];
			} else {
				temp[k++] = a[j++];
			}
		}
		while (i <= mid) {
			temp[k++] = a[i++];
		}
		while (j <= high) {
			temp[k++] = a[j++];
		}
		for (int count = 0; count < high - low + 1; count++) {
			a[low + count] = temp[count];
		}
	}

	public static void mergeSort(int[] a, int low, int high) {
		int mid = (low + high) / 2;
		if (low < high) {
			mergeSort(a, low, mid);
			mergeSort(a, mid + 1, high);
			merge(a, low, mid, high);
		}
	}

	public static void sort(int[] a) {
		mergeSort(a, 0, a.length - 1);
	}

}
