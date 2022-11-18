package com.upc.college.repository;

import com.upc.college.entity.Grado;
import com.upc.college.entity.Seccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SeccionRepository  extends JpaRepository<Seccion,Integer> {
    @Query(value = "call usp_listSeccion(:estadosp)", nativeQuery = true)
    List<Seccion> listaSeccion(@Param("estadosp") int estado);
}
