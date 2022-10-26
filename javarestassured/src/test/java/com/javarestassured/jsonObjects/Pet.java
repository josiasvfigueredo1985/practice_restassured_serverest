package com.javarestassured.jsonObjects;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
    private long id;
    private Category category;
    private String name;
    private String[] photoUrls;
    private Tag[] tags;
    private String status;
}
