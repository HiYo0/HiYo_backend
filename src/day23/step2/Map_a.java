package day23.step2;

import java.util.Arrays;

public class Map_a <A,B> {
    // 값 A = 키 타입 // B = 값 타입

    // 1. 필드
    private Object[] array;
    private int size;

    // 2. 생성자
    public Map_a(){
        array = new Object[0];
    }

    // 3. 메소드

    public boolean add(A 키내용,B 값내용){
        // 추가할 키값 객체로 생성
        Map_객체<A,B> map_객체 = new Map_객체<>();
        map_객체.set키(키내용);
        map_객체.set값(값내용);

        // 배열 사이즈증가용
        size++;
        Object[] newArray = new Object[this.size];

        // 새로운 배열에 기존꺼 복사
        for (int i = 0; i < array.length; i++) {
            newArray[i]=array[i];
        }
        this.array = newArray; // 기존 배열 사이즈증가 끝
        this.array[size-1] = map_객체; // 기존배열 마지막에 새로운 객체 추가

        return true;
    }
    public void remove(int index){
        size--;
        Object[] newArray = new Object[this.size];
        // 새로운 배열에 기존꺼 복사( 매개변수에 있는 인덱스 제외 )
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            newArray[j]=array[i];
            if(i!=index-1)j++;
        }
        this.array = newArray; // 기존 배열 사이즈감소 끝
    }
    public int size(){
        return this.array.length;
    }


    @Override
    public String toString() {
        return "array=" + Arrays.toString(array);
    }

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
