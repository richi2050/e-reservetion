/**
 * 
 */
package com.plat.ereservetion.negocio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plat.ereservetion.modelo.Reserva;

/**
 * @author Ricardo
 *
 */
public interface ReservaRepository extends JpaRepository<Reserva, String>{
	
}
