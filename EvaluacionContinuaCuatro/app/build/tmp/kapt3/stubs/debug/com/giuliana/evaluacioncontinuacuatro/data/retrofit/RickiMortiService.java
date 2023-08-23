package com.giuliana.evaluacioncontinuacuatro.data.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/giuliana/evaluacioncontinuacuatro/data/retrofit/RickiMortiService;", "", "getRicki", "Lcom/giuliana/evaluacioncontinuacuatro/data/response/RickiMortiFavoriteResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRickiMorti", "Lcom/giuliana/evaluacioncontinuacuatro/data/response/RickiMortiListResponse;", "app_debug"})
public abstract interface RickiMortiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "character")
    public abstract java.lang.Object getRickiMorti(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.giuliana.evaluacioncontinuacuatro.data.response.RickiMortiListResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "character/?name=Muscular%20Mannie&status=alive")
    public abstract java.lang.Object getRicki(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.giuliana.evaluacioncontinuacuatro.data.response.RickiMortiFavoriteResponse> continuation);
}