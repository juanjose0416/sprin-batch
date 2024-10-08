package com.example.demo;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomItemProcessor implements ItemProcessor<String, String> {

    @Override
    public String process(String item) {
        return "Hola " + item;
    }

}
