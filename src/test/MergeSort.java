package test;

/**
 * �鲢����
 * ԭ��ԭ���зֳ����������У���ʹ�����������ٺϲ������������
 * ʱ�临�Ӷȣ�O(nlgn); �ռ临�Ӷȣ�O(n); �ȶ���true
*/
public class MergeSort {
	public void merge(int[] a, int low, int mid, int high) {
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

	public void mergeSort(int[] a, int low, int high) {
		int mid = (low + high) / 2;
		if (low < high) {
			mergeSort(a, low, mid);
			mergeSort(a, mid + 1, high);
			merge(a, low, mid, high);
		}
	}

	public void sort(int[] a) {
		mergeSort(a, 0, a.length - 1);
	}

}
