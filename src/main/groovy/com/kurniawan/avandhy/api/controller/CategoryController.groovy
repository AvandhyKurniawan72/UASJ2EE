package com.kurniawan.avandhy.api.controller
import com.kurniawan.avandhy.api.entity.Category
import com.kurniawan.avandhy.api.service.CategoryService
import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping('/categories')
class CategoryController {
    @Autowired
    private final CategoryService categoryService

    @GetMapping('')
    List<Category> findAll() {
        categoryService.findAll()
    }

    @GetMapping('{id}')
    Category findById(@PathVariable('id') int id) {
        categoryService.findById(id)
    }

    @PostMapping()
    Category save(@RequestBody Category category) {
        categoryService.save(category)
    }

    @PutMapping("{id}")
    Category update(@RequestBody Category newCategory, @PathVariable Integer id) {
        CategoryService.update(category, id);
    }

    @DeleteMapping("{id}")
    void delete(@PathVariable Integer id) {
        categoryService.delete(id);
    }
}