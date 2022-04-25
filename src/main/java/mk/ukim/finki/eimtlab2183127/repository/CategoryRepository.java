package mk.ukim.finki.eimtlab2183127.repository;


import mk.ukim.finki.eimtlab2183127.model.enumerations.Category;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CategoryRepository{
    public List<Category> findAll() {
        return Arrays.asList(Category.values().clone());
    }
}
