package com.company;

// ����� NonGen - �������������� ���������� ������ Gen ��� ���������
class NonGen {
    Object ob; // ������ �� ������ ����� ��� O�ject

    //�������� ������������ ������ �� ������ ���� O�ject
    NonGen(Object o) {
        ob = o;
    }

    //���������� ��� O�ject
    Object getob() {
        return ob;
    }

    //�������� ��� ������� ��
    void showType() {
        System.out.println("O��e�� �� ��������� � ���� " + ob.getClass().getName());
    }
}
//������������������ ������������ �����
class NonGenDemo {
    public static void main(String args[]) {
        NonGen iOb;
//������� ������ ���� NonGen � ��������� � ���
//������ ���� Integer. ����������� ������������
        iOb = new NonGen(88);
//�������� ��� ������, ���������� � ���������� iOb
        iOb.showType();
//�������� �������� ���������� i��,
//�� ���� ��� ��������� ���������� �����
        int v = (Integer) iOb.getob();
        System.out.println("��a�e��e : " + v);
        System.out.println();
//������� ������ ������ ���� NonGen �
//��������� � ��� ������ ���� Strinq
        NonGen strOb = new NonGen("Tec� ��� ���������");
//�������� ��� ������, ���������� � ���������� strOb
        strOb.showType();
//�������� �������� ���������� strOb,
// � � ���� ������ ����������� ���������� �����
        String str = (String)strOb.getob();
        System.out.println("��a�e��e : " + str);
//���� ��� �������������, �� �� ������������� ��������!
        iOb = strOb;
        v = (Integer)iOb.getob();//������ �� ����� ����������!
    }