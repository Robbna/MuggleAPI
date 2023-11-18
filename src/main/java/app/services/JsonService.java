package app.services;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import app.controllers.BookController;

public class JsonService<T> {

    public List<T> getList(String jsonFile, Class<T> targetClass) {

        ObjectMapper objectMapper = new ObjectMapper();
        InputStream data = BookController.class.getResourceAsStream(
                String.format("/data/%s", jsonFile));
        try {
            List<T> list = new ArrayList<T>();
            for (JsonNode node : objectMapper.readTree(data)) {
                list.add(objectMapper.treeToValue(node, targetClass));
            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
