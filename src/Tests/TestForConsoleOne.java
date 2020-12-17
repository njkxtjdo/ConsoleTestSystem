package Tests;

import Programs.Program;

import java.io.IOException;

public class TestForConsoleOne implements Test {
    TestForConsole testForConsole;

    public TestForConsoleOne(Program program) {
        testForConsole = new TestForConsole(program);
    }

    @Override
    public Boolean getResult() throws IOException {
        this.put("1+1\n");
        return this.get().equals("1+1");
    }

    @Override
    public String get() {
        return testForConsole.get();
    }

    @Override
    public void put(String string) throws IOException {
        testForConsole.put(string);
    }

    @Override
    public Integer getId() {
        return testForConsole.getId();
    }

    @Override
    public void close() throws IOException {
        testForConsole.close();
    }
}
