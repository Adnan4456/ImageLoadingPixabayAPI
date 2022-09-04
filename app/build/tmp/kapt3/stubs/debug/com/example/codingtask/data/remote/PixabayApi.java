package com.example.codingtask.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\u0002\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/codingtask/data/remote/PixabayApi;", "", "fetchImages", "Lcom/example/codingtask/data/remote/PixabayResponse;", "query", "", "page", "", "limit", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PixabayApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "?key=25973111-24329f9f2d4e8aac3285bdcee")
    public abstract java.lang.Object fetchImages(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "q")
    java.lang.String query, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.codingtask.data.remote.PixabayResponse> continuation);
}