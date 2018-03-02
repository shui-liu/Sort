package test;

/**
 * ��������
 * ԭ��ѡȡ��׼Ԫ�أ���һ��Ԫ�أ���������ԭ����Ԫ���������׼Ԫ�رȽϣ��ֳ�С�ںʹ��ڻ�׼Ԫ�ص��������У��ٶ�������������ͬ������
 * ʱ�临�Ӷȣ�O(nlgn); �ռ临�Ӷȣ�O(lgn); �ȶ���false
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
