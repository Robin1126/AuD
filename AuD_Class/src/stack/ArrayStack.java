package stack;

/**
 * Author : Binbin Luo
 * Date : 08.11.2023
 */
public class ArrayStack {
    /**
     * 栈的大小
     */
    private int maxStack;

    /**
     * 用数组来模拟栈
     */
    private int[] stack;

    /**
     * 表示栈顶的位置，如果没有数据的时候，默认为-1
     */
    private int top = -1;

    /**
     * 类的构造方法，构造时候传入指定的栈大小
     * @param maxStack 栈的大小
     */

    public ArrayStack(int maxStack) {
        this.maxStack = maxStack;
        this.stack = new int[maxStack];
    }

    /**
     * 1. 压栈
     * 2. 弹栈
     * 3. 判断是否为空栈
     * 4. 当前栈中是否为满栈
     */

    /**
     * 判断是否为满栈
     * @return
     */
    public boolean isFull() {
        return this.top == maxStack - 1;
    }

    /**
     * 判断是否为空栈
     * @return
     */
    public boolean isEmpty() {
        return this.top == -1;
    }

    /**
     * 压栈
     * @param val 要压栈的数字
     */
    public void push(int val) {
        // 判断是否为满栈
        if (isFull()) {
            throw new RuntimeException("This stack is already full");
        } else {
            top += 1;
            stack[top] = val;
        }
    }

    /**
     * 弹栈
     */
    public int pop() {
        // 判断是否为空栈
        if (isEmpty()) {
            throw new RuntimeException("This stack is already empty");
        } else {
            // 释放栈顶元素？
            int value = stack[top];
            top -= 1;
            return value;
        }
    }

    /**
     * 查看栈中所有元素
     */
    public void disAll() {
        // 是否为空栈
        if (isEmpty()) {
            throw new RuntimeException("This stack is empty!");
        } else {
            for (int i = 0; i < top + 1; i++) {
                // 采用字符串拼接
                System.out.println("stack[" + i + "] = " + stack[i]);
            }
        }
    }

    // 返回数组的长度
    public int length() {
        return this.top + 1;
    }

    // 判断是否是一个运算符，这里只针对加减乘除
    public boolean isOper(char v) {
        return v == '+' || v == '-' || v == '*' || v == '/';
    }

    /**
     * 判断运算符的优先级，使用数字来表示优先级大小
     */
    public int priority(int oper) {
        if (oper == '/' || oper == '*') {
            return 1;
        } else if (oper == '+' || oper == '-') {
            return 0;
        } else {
            return -1;
        }
    }

    /**
     * 查看栈顶的数据
     */
    public int peek() {
        return this.stack[top];
    }

    /**
     * 获取栈的容量
     */
    public int stackLength() {
        return this.stack.length;
    }
}


