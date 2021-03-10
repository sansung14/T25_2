package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.h2.dto.Departamentos;

/**
 * @author Jose
 *
 */
public interface IDepartamentosDAO extends JpaRepository<Departamentos, Long>{

}
