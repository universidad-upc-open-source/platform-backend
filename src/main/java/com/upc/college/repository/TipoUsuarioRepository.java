package com.upc.college.repository;

import com.upc.college.entity.TipoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoUsuarioRepository extends JpaRepository<TipoUsuario,Integer> {
    @Query(value = "call usp_tipoUsuario()", nativeQuery = true)
    List<TipoUsuario> listaTipoUsuario();
    @Query(value = "call usp_tipoUsuario(:opcion)", nativeQuery = true)
    List<TipoUsuario> listaTipousuarioxId(@Param("opcion") int opcion);
}
