package test;

/**
 * ѡ������
 * ԭ����������ѡȡ��ֵ���һ��Ԫ�ؽ��������ٴ�����Ԫ����ѡȡ��ֵ��ڶ���Ԫ�ؽ���������������
 * �ռ临�Ӷȣ�O(n^2); �ռ临�Ӷȣ�O(1); �ȶ���false
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
