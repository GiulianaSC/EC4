package com.giuliana.evaluacioncontinuacuatro.view.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/giuliana/evaluacioncontinuacuatro/view/fragments/RickiMortiFavoriteViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_favorites", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/giuliana/evaluacioncontinuacuatro/model/Rickimorti;", "favorites", "Landroidx/lifecycle/LiveData;", "getFavorites", "()Landroidx/lifecycle/LiveData;", "repository", "Lcom/giuliana/evaluacioncontinuacuatro/data/repository/RickiMortiRepository;", "addFavorite", "", "rickimorti", "refreshFavorites", "removeFavorite", "app_debug"})
public final class RickiMortiFavoriteViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.giuliana.evaluacioncontinuacuatro.data.repository.RickiMortiRepository repository = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.giuliana.evaluacioncontinuacuatro.model.Rickimorti>> _favorites = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.giuliana.evaluacioncontinuacuatro.model.Rickimorti>> favorites = null;
    
    public RickiMortiFavoriteViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.giuliana.evaluacioncontinuacuatro.model.Rickimorti>> getFavorites() {
        return null;
    }
    
    public final void refreshFavorites() {
    }
    
    public final void addFavorite(@org.jetbrains.annotations.NotNull()
    com.giuliana.evaluacioncontinuacuatro.model.Rickimorti rickimorti) {
    }
    
    public final void removeFavorite(@org.jetbrains.annotations.NotNull()
    com.giuliana.evaluacioncontinuacuatro.model.Rickimorti rickimorti) {
    }
    
    public final void getFavorites() {
    }
}