class hello{
    public static void main(String[] args) {
        System.out.println("hello");

        Runnable runner = () -> { System.out.println("Hello Lambda!"); };
        runner.run(); //Hello Lambda!
    }
}