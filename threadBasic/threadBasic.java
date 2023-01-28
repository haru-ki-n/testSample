package threadBasic;
class thraedBasic {
    public static void main(String[] args) {
        var th1 = new MyThread();
        var th2 = new MyThread();
        var th3 = new MyThread();

        th1.start();
        th2.start();
        th3.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(this.getName() + ":" + i);
        }
    }
}