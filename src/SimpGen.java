package com.company;

//������� ���������� ����� � ����� ����������� ����: � � V
class TwoGen<T,V> {
    T ob1;
    V ob2;

    //�������� ������������ ������ �� ������� ���� � � V
    TwoGen(T ol, V �2) {
        ob1 = ol;
        ob2 = �2;
    }

    //�������� ���� � � V
    void showTypes() {
        System.out.println("T�� �: " + ob1.getClass().getName());
        System.out.println("T�� V: " + ob2.getClass().getName());
    }

    T getob1() {
        return ob1;
    }

    V getob2() {
        return ob2;
    }
}
//������������������ ���������� ������ �woGen
class SimpGen {
    public static void main(String args[]) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "���������");
        //�������� ����
        tgObj.showTypes();
        //�������� � �������� ��������
        int v = tgObj.getob1();
        System.out.println("��a�e��e : " + v);
        String str = tgObj.getob2();
        System.out.println("��a�e��e : " + str);
    }
}