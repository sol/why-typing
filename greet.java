interface Greeter {
  void sayHi();
}

class MyGreeter implements Greeter {
    public void sayHi() {
        System.out.println("Hi there!");
    }
}

class Main {
    public static void runGreeter(Greeter greeter) {
        greeter.sayHi();
    }

    public static void main(String[] args) {
        runGreeter(new MyGreeter());
        // runGreeter(23);
        // runGreeter(null);
    }
}
