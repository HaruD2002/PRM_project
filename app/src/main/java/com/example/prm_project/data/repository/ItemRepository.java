package com.example.prm_project.data.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.prm_project.data.DAO;
import com.example.prm_project.data.dao.CategoryDAO;
import com.example.prm_project.data.dao.models.Category;
import com.example.prm_project.data.dao.models.ItemCategory;

import java.util.List;

public class ItemRepository {
//    private final CategoryDAO categoryDAO;

    public ItemRepository(Application application){
        DAO db = DAO.getInstance(application);
//        categoryDAO = db.categoryDAO();
    }

    public LiveData<List<Category>> CategoryList(){
//        return categoryDAO.getAllCategory();
        return null;
    }


}