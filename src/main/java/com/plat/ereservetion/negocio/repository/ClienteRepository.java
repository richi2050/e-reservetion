/**
 * 
 */
package com.plat.ereservetion.negocio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plat.ereservetion.modelo.Cliente;

/**
 * Interfaces para definir las operaciones de bd relacionadas con cliente
 * @author Ricardo
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente, String>{
	/**
	 * Definicion del m,etodo para buscar los clientes por su  apellido
	 * @param apellidoCli
	 * @return
	 */
	public List<Cliente> findByApellidoCli(String apellidoCli);
 
}
