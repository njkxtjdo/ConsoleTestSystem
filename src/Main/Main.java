package Main;

import Programs.Program;
import Std.OutResultTests;
import Std.SimpleOutResultTests;
import Tests.Test;
import Tests.TestForConsoleOne;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Program program = new Program("python3 main.py");
        OutResultTests simpleOutResultTests = new SimpleOutResultTests();
        Test testForConsole = new TestForConsoleOne(program);
        simpleOutResultTests.addTest(testForConsole);
        System.out.println(simpleOutResultTests);
        program.close();
    }
}
