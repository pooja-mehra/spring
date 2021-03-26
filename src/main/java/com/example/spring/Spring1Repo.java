package com.example.spring;
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Spring1Repo extends JpaRepository<Spring1Entity, Serializable> {


}
