public class Main {
    public static void main(String[] args)  {


        try {
            print(".hello");
        } catch (MyException e) {
            throw new RuntimeException(e);
        }


    }


    public static void print(String msg) throws MyException{
        if (msg.startsWith(".")) {
            throw new MyException("не должно быть точки в начале");
        }
        System.out.println(msg);
    }

}




