package bankomate.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOServiceImpl implements IOService{
    private BufferedReader reader;

    public IOServiceImpl(){
        reader = new BufferedReader(new InputStreamReader(System.in));
    }
    @Override
    public String read() throws IOException {
        return reader.readLine();
    }

    @Override
    public void write(String message) {
        System.out.println(message);
    }
}
