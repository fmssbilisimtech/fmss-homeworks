package backend.thirdweek;

import java.util.Iterator;

public class IterableString implements Iterable<Character> {
    String value_;

    IterableString(String value){
        value_ = value;
    }

    @Override
    public Iterator<Character> iterator() {
        return new Iterator<>() {
            int iterator = 0;
            @Override
            public boolean hasNext() {
                if(iterator < value_.length())
                    return true;
                else {
                    return false;
                }
            }

            @Override
            public Character next() {
                return value_.charAt(iterator++);
            }
        };
    }

    public static void main(String[] args) {
        IterableString characters = new IterableString("Merhaba");
        for (Character character : characters) {
            System.out.println(character);
        }
        for (Character character : characters) {
            System.out.println(character);
        }


    }
}

//public class IterableString implements Iterable<Character> {
//    String value_;
//
//    IterableString(String value){
//        value_ = value;
//    }
//
//    @Override
//    public Iterator<Character> iterator() {
//        return new Iterator<>() {
//            int iterator = 0;
//            @Override
//            public boolean hasNext() {
//                if(iterator < value_.length())
//                    return true;
//                else {
//                    return false;
//                }
//            }
//
//            @Override
//            public Character next() {
//                return value_.toCharArray()[iterator++];
//            }
//        };
//    }
//
//    public static void main(String[] args) {
//        IterableString characters = new IterableString("Merhaba");
//        for (Character character : characters) {
//            System.out.println(character);
//        }
//        for (Character character : characters) {
//            System.out.println(character);
//        }
//    }
//}
