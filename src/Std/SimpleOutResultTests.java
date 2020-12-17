package Std;

import Tests.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SimpleOutResultTests implements OutResultTests {
    private final List<Test> testList;

    public SimpleOutResultTests() {
        this.testList = new ArrayList<>();
    }

    public void addTest(Test test) {
        testList.add(test);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Test test : testList) {
            try {
                stringBuilder
                        .append("Test ")
                        .append(test.getId())
                        .append(": ")
                        .append(test.getResult())
                        .append("\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringBuilder.toString();
    }
}
