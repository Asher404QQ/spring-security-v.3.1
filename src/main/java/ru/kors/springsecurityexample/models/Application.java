package ru.kors.springsecurityexample.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Application {
    private int id;
    private String name;
    private String author;
    private String version;
}
