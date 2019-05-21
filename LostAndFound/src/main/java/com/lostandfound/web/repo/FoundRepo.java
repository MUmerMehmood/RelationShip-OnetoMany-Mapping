package com.lostandfound.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lostandfound.web.bean.FoundBean;

@Repository
public interface FoundRepo extends JpaRepository<FoundBean, String> {

}
