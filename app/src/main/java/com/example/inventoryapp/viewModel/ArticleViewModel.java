package com.example.inventoryapp.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.inventoryapp.model.Article;
import com.example.inventoryapp.model.ArticleRepository;

import java.util.List;

public class ArticleViewModel extends AndroidViewModel {
    private ArticleRepository repository;
    private LiveData<List<Article>> allArticles;

    public ArticleViewModel(@NonNull Application application) {
        super(application);

        repository = new ArticleRepository(application);
        allArticles = repository.getAllArticles();
    }

    public void insert(Article article) {
        repository.insert(article);
    }

    public void update(Article article) {
        repository.update(article);
    }

    public void delete(Article article) {
        repository.delete(article);
    }

    public void deleteAllArticles() {
        repository.deleteAllArticles();
    }

    public LiveData<List<Article>> getAllArticles() {
        return allArticles;
    }
}
