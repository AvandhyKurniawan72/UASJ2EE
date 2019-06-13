package com.kurniawan.avandhy.api.service
import com.kurniawan.avandhy.api.entity.Category
interface CategoryService {
    List<Category> findAll()
    Category findById(int id)
    Category save(Category category)
    Category update(Category category, int id)
    Category delete(int id)
}