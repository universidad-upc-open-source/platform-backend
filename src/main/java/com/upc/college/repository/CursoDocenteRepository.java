package com.upc.college.repository;

import com.upc.college.entity.CursoDocente;
import com.upc.college.entity.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CursoDocenteRepository extends JpaRepository<CursoDocente,Integer> {
    @Transactional
    @Modifying
    @Query(value = "{call usp_saveDocentexCurso(:iddocente,:idcurso,:idgrado,:idseccion)}",nativeQuery = true)
    void saveDocentexCurso(@Param("iddocente")int iddocente,
                     @Param("idcurso")int idcurso,
                     @Param("idgrado")int idgrado,
                     @Param("idseccion")int idseccion);

    @Transactional
    @Modifying
    @Query(value = "{call usp_updateDocentexCurso(:iddocentexcursosp,:iddocentesp,:idgradosp,:idseccionsp)}",nativeQuery = true)
    void updateCursoxDocente(@Param("iddocentexcursosp")int iddocentexcurso,
                       @Param("iddocentesp")int iddocente,
                       @Param("idgradosp")int idgrado,
                       @Param("idseccionsp")int idseccion);
    @Query(value = "{call usp_listarCursoxDocente()}", nativeQuery = true)
    List<CursoDocente> lista();

    @Query(value = "{call usp_listCursoxDocente(:idcursosp)}", nativeQuery = true)
    List<CursoDocente> listaCursoxDocente(@Param("idcursosp") int idcurso);

    @Query(value = "{call usp_listCursoDocente(:iddocentesp)}", nativeQuery = true)
    List<CursoDocente> listaCursoDocente(@Param("iddocentesp") int iddocente);

}
