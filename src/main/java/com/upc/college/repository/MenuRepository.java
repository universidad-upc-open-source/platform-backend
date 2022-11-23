package com.upc.college.repository;

import com.upc.college.entity.Docente;
import com.upc.college.entity.Menu;
import com.upc.college.entity.Seccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu,Integer> {
    @Transactional
    @Modifying
    @Query(value = "{call usp_SaveMenu(:nombre,:ruta,:idtipousuario)}",nativeQuery = true)
    void saveMenu(@Param("nombre")String nombre,
                     @Param("ruta")String ruta,
                     @Param("idtipousuario")int idtipousuario);

    @Query(value = "call usp_listarMenu(:idtipousuariosp)", nativeQuery = true)
    List<Menu> listarMenu(@Param("idtipousuariosp") int idtipousuario);
}
