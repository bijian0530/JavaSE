package Test11_11;

public class MyStack {
    private Object[] elements;
    private int index;

    public MyStack() {
        this.elements = new Object[10];
        this.index = -1;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void push(Object obj){
        if(index >= elements.length - 1){
            System.out.println("压栈失败，栈已满");
            return;
        }
        index++;
        elements[index] = obj;
        System.out.println("压栈成功"+obj+",栈帧指向"+index);
    }
    public void pop(){
        if(index < 0){
            System.out.println("弹栈失败，栈已空");
            return;
        }
        index--;
        System.out.println("弹栈成功,"+"栈帧指向"+index);
    }
}
