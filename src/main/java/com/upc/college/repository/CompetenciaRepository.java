package com.upc.college.repository;

import com.upc.college.entity.Competencia;
import com.upc.college.entity.CursoDocente;
import com.upc.college.entity.CursoxCompetencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CompetenciaRepository extends JpaRepository<Competencia,Integer> {
    @Query(value = "{call usp_listCompetencia()}", nativeQuery = true)
    List<Competencia> lista();

    @Query(value = "{call usp_ListCompetenciaNotCurso(:idcursosp)}", nativeQuery = true)
    List<Competencia> ListCompetenciaNotCurso(@Param("idcursosp") int idcurso);

    @Query(value = "{call usp_listCompetenciaxcurso(:idcursosp)}", nativeQuery = true)
    List<Competencia> listCompetenciaxcurso(@Param("idcursosp") int idcurso);

    @Transactional
    @Modifying
    @Query(value = "{call usp_saveCompetencia(:nombre)}",nativeQuery = true)
    void saveCompetencia(@Param("nombre")String nombre);

    @Transactional
    @Modifying
    @Query(value = "call usp_deleteCompetencia(:idcompetenciasp)",nativeQuery = true)
    void deleteCompetencia(@Param("idcompetenciasp")int idcompetencia);

    @Transactional
    @Modifying
    @Query(value = "call usp_activateCompetencia(:idcompetenciasp)",nativeQuery = true)
    void activarCompetencia(@Param("idcompetenciasp")int idcompetencia);
}
