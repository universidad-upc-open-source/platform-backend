package com.upc.college.repository;

import com.upc.college.entity.Competencia;
import com.upc.college.entity.CursoxCompetencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CursoCompetenciaRepository extends JpaRepository<CursoxCompetencia,Integer> {
    @Transactional
    @Modifying
    @Query(value = "{call usp_saveCursoCompetencia(:idcurso,:idcompetencia)}",nativeQuery = true)
    void saveCursoCompetencia(@Param("idcurso")int idcurso,
                           @Param("idcompetencia")int idcompetencia);

}
