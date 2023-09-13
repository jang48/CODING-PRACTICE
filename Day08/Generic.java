package Day08;
public class Generic {
    public static void main(String[] args) {
        저장소<Integer> a저장소 = new 저장소<>();

        a저장소.setData(10);
        a저장소.setData(20);
        a저장소.setData(30);

        int num = a저장소.getData(1);
        System.out.println(num);
        num = a저장소.getData(0);
        System.out.println(num);
    }
}

class 저장소<T> {
    private Object[] datas;
    int lastIdx;

    저장소() {
        datas = new Object[3];
        lastIdx = 0;
    }

    public void setData(T data) {
        this.datas[lastIdx] = data;
        lastIdx++;
    }

    public T getData(int idx) {
        return (T)datas[idx];
    }
}