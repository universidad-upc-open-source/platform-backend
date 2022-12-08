package com.upc.college.repository;

import com.upc.college.entity.Docente;
import com.upc.college.entity.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EstudianteRepository extends JpaRepository<Estudiantes,Integer> {
    @Query(value = "{call usp_listarEstudiantes()}", nativeQuery = true)
    List<Estudiantes> lista();

    @Query(value = "{call usp_listEstudianteGradoSeccion(:idcursosp)}", nativeQuery = true)
    List<Estudiantes> listaEstiduanteGradoSeccion(@Param("idcursosp") int idcurso);

    @Query(value = "{call usp_listaAlumnosxDocente(:iddocentesp)}", nativeQuery = true)
    List<Estudiantes> listaAlumnosxDocente(@Param("iddocentesp") int iddocente);

    @Transactional
    @Modifying
    @Query(value = "call usp_eliminarEstudiante(:idestudiantesp)",nativeQuery = true)
    void deleteEstudiante(@Param("idestudiantesp")int idestudiante);

    @Transactional
    @Modifying
    @Query(value = "call usp_activateEstudiante(:idestudiantesp)",nativeQuery = true)
    void activateEstudiante(@Param("idestudiantesp")int idestudiante);

    @Transactional
    @Modifying
    @Query(value = "call usp_updateEstudiante(:idestudiantesp,:nombressp,:apellidossp,:dnisp,:idgradosp,:idseccionsp)",nativeQuery = true)
    void updateEstudiante(@Param("idestudiantesp")int idestudiante,
                          @Param("nombressp")String nombres,
                          @Param("apellidossp")String apellidos,
                          @Param("dnisp")String dni,
                          @Param("idgradosp")int idgrado,
                          @Param("idseccionsp")int idseccion);

    @Transactional
    @Modifying
    @Query(value = "call usp_saveEstudiante(:nombressp,:apellidossp,:dnisp,:idgradosp,:idseccionsp)",nativeQuery = true)
    void saveEstudiante(@Param("nombressp")String nombressp,
                        @Param("apellidossp")String apellidossp,
                        @Param("dnisp")String dnisp,
                        @Param("idgradosp")int idgradosp,
                        @Param("idseccionsp")int idseccionsp);
}
