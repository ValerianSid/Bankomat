package bankomate.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOServiceImpl implements IOService{

    @Override
    public String read() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = new String();
        try {
            inputString = reader.readLine();
        } catch (IOException ex) {
            System.out.println("Произошла ошибка ввода/вывода");
        }
        return inputString;

    }

    @Override
    public String write(String message) {
        return System.out.println(message);
    }
}
