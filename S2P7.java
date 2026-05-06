class Message {
    String text;
    Message(String t) {
        text = t;
    }
    void showLength() {
        System.out.println(text.length());
    }
    void showUppercase() {
        System.out.println(text.toUpperCase());
    }
}
class Main {
    public static void main(String[] args) {
        Message M1 = new Message("Krrish Gupta");
        M1.showLength();
        M1.showUppercase();
    }
}
