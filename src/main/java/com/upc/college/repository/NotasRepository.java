package com.upc.college.repository;

import com.upc.college.entity.Estudiantes;
import com.upc.college.entity.Notas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface NotasRepository extends JpaRepository<Notas,Integer> {
    @Query(value = "{call usp_listaNotasxCurso(:idcursosp)}", nativeQuery = true)
    List<Notas> listaNotasxCurso(@Param("idcursosp") int idcurso);

    @Query(value = "{call usp_listarNotasxProfesor(:iddocentesp)}", nativeQuery = true)
    List<Notas> listalistarNotasxProfesor(@Param("iddocentesp") int iddocente);

    @Transactional
    @Modifying
    @Query(value = "call usp_saveNotasxCurso(:idestudiantesp,:idcursosp,:nota1sp,:nota2sp,:nota3sp,:nota4sp,:promediosp)",nativeQuery = true)
    void saveNotasxCurso(@Param("idestudiantesp")int idestudiantesp,
                        @Param("idcursosp")int idcursosp,
                        @Param("nota1sp")double nota1sp,
                        @Param("nota2sp")double nota2sp,
                        @Param("nota3sp")double nota3sp,
                        @Param("nota4sp")double nota4sp,
                        @Param("promediosp")double promediosp);
}
