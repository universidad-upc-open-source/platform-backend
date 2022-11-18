package com.upc.college.repository;

import com.upc.college.entity.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface DocenteRepository extends JpaRepository<Docente,Integer> {
    @Transactional
    @Modifying
    @Query(value = "{call usp_saveDocente(:nombres,:apellidos,:correo,:contrasenia,:idtipousuario)}",nativeQuery = true)
    void saveDocente(@Param("nombres")String nombres,
                     @Param("apellidos")String apellidos,
                     @Param("correo")String correo,
                     @Param("contrasenia")String contrasenia,
                     @Param("idtipousuario")int idtipousuario);

    @Transactional
    @Modifying
    @Query(value = "{call usp_updateDocente(:iddocentesp,:nombressp,:apellidossp,:correosp,:contraseniasp,:idtipousuariosp)}",nativeQuery = true)
    void updateDocente(@Param("iddocentesp")int iddocente,
                       @Param("nombressp")String nombres,
                       @Param("apellidossp")String apellidos,
                       @Param("correosp")String correo,
                       @Param("contraseniasp")String contrasenia,
                       @Param("idtipousuariosp")int idtipousuario);
    @Transactional
    @Modifying
    @Query(value = "call usp_deleteDocente(:iddocentesp)",nativeQuery = true)
    void deleteDocente(@Param("iddocentesp")int iddocente);

    @Transactional
    @Modifying
    @Query(value = "call usp_activateeDocente(:iddocentesp)",nativeQuery = true)
    void activateeDocente(@Param("iddocentesp")int iddocente);

    @Query(value = "{call usp_listarDocente()}", nativeQuery = true)
    List<Docente> lista();
    @Query(value = "call usp_login(:gmail,:pass)", nativeQuery = true)
    List<Docente> login(@Param("gmail") String gmail,
                        @Param("pass") String pass);

    @Query(value = "{call usp_listarDocenteActivo()}", nativeQuery = true)
    List<Docente> listaActivo();
}
