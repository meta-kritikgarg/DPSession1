/**
 * 
 */
package com.model.dao;

import java.util.List;

import com.model.vo.CarVO;

/**
 * @author Kritik Garg
 *
 */
public interface CarDaoInterface {
	
	public List<CarVO> getAllCars() ;
	public CarVO findCarbyId(int id);
	public int insert(CarVO carvo);
	public boolean deleteById(int id);
	public boolean update(CarVO carvo);
}
