package com.upc.college.repository;

import com.upc.college.entity.Grado;
import com.upc.college.entity.TipoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GradoRepository  extends JpaRepository<Grado,Integer> {

    @Query(value = "call usp_listGrado(:estadosp)", nativeQuery = true)
    List<Grado> listaGrado(@Param("estadosp") int estado);
}
