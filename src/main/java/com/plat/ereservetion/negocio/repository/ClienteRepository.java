/**
 * 
 */
package com.plat.ereservetion.negocio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plat.ereservetion.modelo.Cliente;

/**
 * Interfaces para definir las operaciones de bd relaiconadas con cliente
 * @author Ricardo
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente, String>{

}
