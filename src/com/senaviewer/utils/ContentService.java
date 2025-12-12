package com.senaviewer.utils;

import com.senaviewer.models.Content;
import java.util.ArrayList;
import java.util.List;

public class ContentService {

    private List<Content> contents;

    public ContentService() {
        this.contents = new ArrayList<>();
    }

    public void addContent(Content content) {
        contents.add(content);
        System.out.println("✔ Contenido agregado: " + content.getTitle());
    }

    public List<Content> getAll() {
        return contents;
    }

    public Content searchByTitle(String title) {
        for (Content c : contents) {
            if (c.getTitle().equalsIgnoreCase(title)) {
                return c;
            }
        }
        return null;
    }
}
