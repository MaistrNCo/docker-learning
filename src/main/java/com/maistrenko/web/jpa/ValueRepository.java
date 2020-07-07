package com.maistrenko.web.jpa;

import com.maistrenko.web.model.Value;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ValueRepository extends JpaRepository<Value,Long>{
}
