package com.app.repo;

import com.app.mdl.mdl_item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repo_item extends JpaRepository<mdl_item,Long>{
}
