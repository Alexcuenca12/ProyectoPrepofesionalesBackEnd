package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.dao.IDocenteTutorDao;
import com.ista.tecazuay.proyecto.models.entity.DocenteTutor;
import com.ista.tecazuay.proyecto.models.service.IDocenteTutorService;

@Service
public class DocenteTutorServiceImpl implements IDocenteTutorService {

	@Autowired
	private IDocenteTutorDao DocenteTutorDao;

	@Override
	@Transactional(readOnly = true)
	public List<DocenteTutor> findAll() {

		return (List<DocenteTutor>) DocenteTutorDao.findAll();
	}

	@Override
	@Transactional
	public DocenteTutor save(DocenteTutor tutor) {

		return DocenteTutorDao.save(tutor);
	}

	@Override
	@Transactional(readOnly = true)
	public DocenteTutor findById(Long id) {

		return DocenteTutorDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		DocenteTutorDao.deleteById(id);
	}
}
