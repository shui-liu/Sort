package test;

/**
 * ð������
 * ԭ���ظ����αȽ����������ڵ�����Ԫ�أ�ÿһ�α�������һ������Ԫ��
 * ʱ�临�Ӷȣ�O(n^2); �ռ临�Ӷȣ�O(1); �ȶ���true
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
