package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.stereotype.Component;

@Component
public class CustomItemReader implements ItemReader<String> {

    private List<String> items;
    private int index = 0;

    public CustomItemReader() {
        this.items = Arrays.asList("Juan", "María", "Pedro");
    }

    @Override
    public String read() {
        if (index < items.size()) {
            return items.get(index++);
        }
        return null;
    }

}
