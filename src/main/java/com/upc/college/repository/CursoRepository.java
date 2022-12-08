package com.upc.college.repository;

import com.upc.college.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public interface CursoRepository extends JpaRepository<Curso,Integer> {
    @Transactional
    @Modifying
    @Query(value = "{call usp_saveCurso(:nombresp,:fotosp)}",nativeQuery = true)
    void saveCurso(@Param("nombresp")String nombre,
                     @Param("fotosp")String foto);

    @Transactional
    @Modifying
    @Query(value = "{call usp_updateCurso(:idcursosp,:nombresp,:fotosp)}",nativeQuery = true)
    void updateCurso(@Param("idcursosp")Integer idcurso,
                     @Param("nombresp")String nombre,
                     @Param("fotosp")String foto);
    @Transactional
    @Modifying
    @Query(value = "call usp_deleteCurso(:idcursosp)",nativeQuery = true)
    void deleteCurso(@Param("idcursosp")int idcurso);

    @Transactional
    @Modifying
    @Query(value = "call usp_activarCurso(:idcursosp)",nativeQuery = true)
    void activarCurso(@Param("idcursosp")int idcurso);

    @Query(value = "call usp_listarCurso()", nativeQuery = true)
    List<Curso> lista();
}
