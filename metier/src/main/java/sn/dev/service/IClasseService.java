package sn.dev.service;

import sn.dev.dto.ClasseDto;

import java.util.List;

public interface IClasseService {
    public List<ClasseDto> getAllClasses();
    public ClasseDto getClassById(int id);
    public boolean save(ClasseDto classeDto);
    public boolean update(ClasseDto classeDto);
    public boolean delete(int id);
    public List<ClasseDto> getClassesBySectorId(int sectorId);
}
