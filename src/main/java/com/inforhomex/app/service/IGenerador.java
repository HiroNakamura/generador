package com.inforhomex.app.service;

import java.util.List;

public interface IGenerador<T> {
    T create(T t);
    List<T> getList();
}
