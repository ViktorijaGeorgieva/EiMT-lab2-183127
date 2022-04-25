package mk.ukim.finki.eimtlab2183127.model.dto;

import lombok.Data;
import mk.ukim.finki.eimtlab2183127.model.enumerations.Category;

@Data
public class BookDto {
    private String name;

    private Category category;

    private Long authorId;

    private Integer availableCopies;

    public BookDto() {
    }

    public BookDto(String name, Category category, Long authorId, Integer availableCopies) {
        this.name = name;
        this.category = category;
        this.authorId = authorId;
        this.availableCopies = availableCopies;
    }
}
