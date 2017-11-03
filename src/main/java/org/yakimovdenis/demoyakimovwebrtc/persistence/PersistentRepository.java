package org.yakimovdenis.demoyakimovwebrtc.persistence;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.io.Serializable;
import java.util.List;

public interface PersistentRepository <T, ID extends Serializable> {
    List<T> getAll();
    T getOne(ID id);
    boolean exists(ID id);
    Long count();
    boolean delete(ID id);
    ID persist(T t);
    boolean update(T t);
    Page<T> getPage(PageRequest request);
}
