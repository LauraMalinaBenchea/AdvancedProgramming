public class PALAB1 {
    //printing Hello World
    public static void printHelloWorld(){
        System.out.println("Hello World");
    }
    //choosing a random number
    public static int randomNumber(int random){
        random = (int) (Math.random() * 1_000_000);
        return random;
    }
    //applying the requested operations
    public static int operations(int random){
        random *= 3;
        random += Integer.parseInt("10101", 2);
        random += Integer.parseInt("FF", 16);
        random *= 6;
        return random;
    }
    //computing the needed sums
    public static int sums(int random){
        while(random >= 10){
            int sum = 0, variable = random;
            while(variable > 0){
                sum += variable%10;
                variable /= 10;
            }
            random = sum;
        }
        return random;
    }
    //displaying the final message
    public static void printText(int random, String[] languages){
        System.out.print("Willy-nilly, this semester I will learn ");
        System.out.print(languages[random]);
    }

    public static void main(String[] args){
        printHelloWorld();
        String[] languages = {"C", "C++", "C#", "Phyton", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int random = 0;
        random = operations(random);
        random = sums(random);
        printText(random, languages);


    }
}

