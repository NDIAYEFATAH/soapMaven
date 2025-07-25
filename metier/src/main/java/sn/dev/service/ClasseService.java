package sn.dev.service;

import sn.dev.dao.ClasseDao;
import sn.dev.dao.IClasseDao;
import sn.dev.dto.ClasseDto;
import sn.dev.entity.ClassEntity;
import sn.dev.entity.SectorEntity;
import sn.dev.mapper.ClasseMapper;

import java.util.List;

public class ClasseService implements IClasseService{
    private final IClasseDao classeDao = (IClasseDao) new ClasseDao();

    @Override
    public List<ClasseDto> getAllClasses() {
        return ClasseMapper.listClasseEntityToListClasseDto(classeDao.findAll(new ClassEntity()));
    }

    @Override
    public ClasseDto getClassById(int id) {
        return ClasseMapper.toClasseDto(classeDao.findById(id, new ClassEntity()));
    }

    @Override
    public boolean save(ClasseDto classeDto) {
        return classeDao.save(ClasseMapper.toClassEntity(classeDto));
    }

    @Override
    public boolean update(ClasseDto classeDto) {
        return classeDao.update(ClasseMapper.toClassEntity(classeDto));
    }

    @Override
    public boolean delete(int id) {
        return classeDao.delete(id, new ClassEntity());
    }

    @Override
    public List<ClasseDto> getClassesBySectorId(int sectorId) {
        ClassEntity classEntity = new ClassEntity();
        classEntity.setSector(new SectorEntity(sectorId, null)); // Assuming SectorEntity has a constructor with id and name
        return ClasseMapper.listClasseEntityToListClasseDto(classeDao.findAll(classEntity));
    }
}
