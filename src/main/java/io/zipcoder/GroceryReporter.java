package io.zipcoder;

import io.zipcoder.utils.FileReader;

import java.util.regex.Pattern;

public class GroceryReporter {
    private final String originalFileText;

    public GroceryReporter(String jerksonFileName) {
        this.originalFileText = FileReader.readFile(jerksonFileName);
    }

    @Override
    public String toString() {
        Pattern pattern = Pattern.compile(originalFileText);

        return null;
    }
}
