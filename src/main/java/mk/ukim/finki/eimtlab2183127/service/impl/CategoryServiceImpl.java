package mk.ukim.finki.eimtlab2183127.service.impl;

import mk.ukim.finki.eimtlab2183127.model.enumerations.Category;
import mk.ukim.finki.eimtlab2183127.repository.CategoryRepository;
import mk.ukim.finki.eimtlab2183127.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> findAll() {
        return this.categoryRepository.findAll();
    }
}
