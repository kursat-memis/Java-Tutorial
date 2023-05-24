package bolum_14_exception_ve_dosya_islemleri.dosya_islemleri.alistirmalar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Alistirma1 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = openFile();
        System.out.println("Number Of Lines: " + getLineNumber(bufferedReader));
        bufferedReader = reset(bufferedReader);

        System.out.println("Total Character: " + getTotalCharacter(bufferedReader));
        bufferedReader = reset(bufferedReader);

        System.out.println("Number Of Words: " + (getWordNumber(bufferedReader) + 1));
        bufferedReader = reset(bufferedReader);

        System.out.println("Max Repeat Character: " + (getMaxRepeatChar(bufferedReader)));
        bufferedReader = reset(bufferedReader);

        closeFile(bufferedReader);
    }

    private static String getMaxRepeatChar(BufferedReader bufferedReader) {
        Map<Character, Integer> map = new HashMap<>();
        int _char;
        try {
            while ((_char = bufferedReader.read()) != -1) {
                if (map.containsKey((char) _char)) {
                    map.put((char) _char, map.get((char) _char) + 1);
                } else if ((char) _char != ' ') {
                    map.put((char) _char, 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        char key = '0';
        int value = 0;

        for (Map.Entry<Character, Integer> temp : map.entrySet()) {
            if (temp.getValue() > value) {
                key = temp.getKey();
                value = temp.getValue();
            }
        }
        return "En cok tekrar eden eleman " + key + " elemanıdır ve " + value + " kadar tekrar etmiştir.";
    }

    private static BufferedReader reset(BufferedReader bufferedReader) {
        closeFile(bufferedReader);
        bufferedReader = openFile();
        return bufferedReader;
    }

    private static int getWordNumber(BufferedReader bufferedReader) {
        int _char;
        int numberOfWords = 0;
        try {
            while ((_char = bufferedReader.read()) != -1) {
                if ((char) _char == ' ' || (char) _char == '\n') {
                    numberOfWords++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numberOfWords;
    }

    private static void closeFile(BufferedReader bufferedReader) {
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int getTotalCharacter(BufferedReader bufferedReader) {
        int _char;
        int numOfChar = 0;
        try {
            while ((_char = bufferedReader.read()) != -1) {
                numOfChar += 1;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numOfChar;
    }

    private static int getLineNumber(BufferedReader bufferedReader) {
        int numOfLine = 0;
        String line;
        try {
            while (((line = bufferedReader.readLine()) != null)) {
                numOfLine += 1;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numOfLine;
    }

    private static BufferedReader openFile() {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("IstıklalMarsi.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return bufferedReader;
    }
}
