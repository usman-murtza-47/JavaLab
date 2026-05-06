class Sentence{
    String text;
    Sentence (String t){
        text = t;
    }
    void countWords(){
        String[] words = text.split(" ");
        int count = words.length;
        System.out.println ("Sentence is: " + text);
        System.out.println ("Total words are: " + count);
    }
}
class Main {
    public static void main(String[] args) {
        Sentence S = new Sentence ("My name is Krrish Gupta");
        S.countWords();
    }
}
