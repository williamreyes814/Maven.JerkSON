package io.zipcoder;

import io.zipcoder.utils.Item;
import io.zipcoder.utils.ItemParseException;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ItemParser {
    public List<Item> parseItemList(String valueToParse) {
        return null;
    }

    public Item parseSingleItem(String singleItem) throws ItemParseException {
        List<String> myList = new ArrayList<>();

        Pattern pattern = Pattern.compile("naMe:price;");
        Matcher matcher = pattern.matcher(singleItem);
        return null;
    }
}
