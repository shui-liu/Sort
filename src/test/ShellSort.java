package test;

/**
 * ϣ������ 
 * ԭ��ѡ��ĩβԪ��Ϊ1�ĵݼ��������У��ظ���������ԭ����Ԫ�ع�Ϊһ�������в��ֱ�������������
 * ʱ�临�Ӷȣ�O(n^2); �ռ临�Ӷȣ�O(1); �ȶ���false
 */
public class ShellSort {
	public void sort(int[] a) {
		int gap, i, j, temp;
		for (gap = a.length / 2; gap > 0; gap /= 2) {
			for (i = gap; i < a.length; i++) {
				for (j = i - gap; j >= 0 && a[j] > a[j + gap]; j -= gap) {
					temp = a[j];
					a[j] = a[j + gap];
					a[j + gap] = temp;
				}
			}
		}
	}
}
