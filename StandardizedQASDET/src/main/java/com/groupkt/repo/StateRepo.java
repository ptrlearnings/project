package com.groupkt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.groupkt.domain.State;

public interface StateRepo extends JpaRepository<State, Long> {
	@Query("Select s from State s where country=:country AND (abbr=:val OR name =:val)")
	public State findByNameOrAbbr(@Param("country")String country,@Param("val")String val);
	public List<State> findByCountry(String country);
 }
