package com.giuliana.evaluacioncontinuacuatro.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rJ\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/giuliana/evaluacioncontinuacuatro/data/repository/RickiMortiRepository;", "", "rickimortiDao", "Lcom/giuliana/evaluacioncontinuacuatro/data/db/RickimortiDao;", "(Lcom/giuliana/evaluacioncontinuacuatro/data/db/RickimortiDao;)V", "getRickimortiDao", "()Lcom/giuliana/evaluacioncontinuacuatro/data/db/RickimortiDao;", "addFavorite", "", "rickimorti", "Lcom/giuliana/evaluacioncontinuacuatro/model/Rickimorti;", "(Lcom/giuliana/evaluacioncontinuacuatro/model/Rickimorti;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavorites", "", "getRickiMorti", "Lcom/giuliana/evaluacioncontinuacuatro/model/ApiResponse;", "Lcom/giuliana/evaluacioncontinuacuatro/data/response/RickiMortiListResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeFavorite", "app_debug"})
public final class RickiMortiRepository {
    @org.jetbrains.annotations.Nullable()
    private final com.giuliana.evaluacioncontinuacuatro.data.db.RickimortiDao rickimortiDao = null;
    
    public RickiMortiRepository() {
        super();
    }
    
    public RickiMortiRepository(@org.jetbrains.annotations.Nullable()
    com.giuliana.evaluacioncontinuacuatro.data.db.RickimortiDao rickimortiDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.giuliana.evaluacioncontinuacuatro.data.db.RickimortiDao getRickimortiDao() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getRickiMorti(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.giuliana.evaluacioncontinuacuatro.model.ApiResponse<com.giuliana.evaluacioncontinuacuatro.data.response.RickiMortiListResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addFavorite(@org.jetbrains.annotations.NotNull()
    com.giuliana.evaluacioncontinuacuatro.model.Rickimorti rickimorti, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.giuliana.evaluacioncontinuacuatro.model.Rickimorti> getFavorites() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object removeFavorite(@org.jetbrains.annotations.NotNull()
    com.giuliana.evaluacioncontinuacuatro.model.Rickimorti rickimorti, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}