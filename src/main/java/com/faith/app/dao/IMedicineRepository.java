package com.faith.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.entity.Medicine;
@Repository
public interface IMedicineRepository extends CrudRepository<Medicine, Integer> {

}
