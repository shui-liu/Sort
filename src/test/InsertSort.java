package test;

/**
 * ��������
 * ԭ����ԭ���������������У������ɵ�һ��Ԫ����ɵ��������к�������Ԫ����ɵ��������У����ν�����Ԫ��������Ԫ�رȽϲ�����
 * ʱ�临�Ӷȣ�O(n^2); �ռ临�Ӷȣ�O(1); �ȶ���true
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
