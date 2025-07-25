package sn.dev.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import sn.dev.dto.ClasseDto;

import java.util.List;

@WebService
public class ClasseWebServiceImpl implements ClasseWebService{
    private final IClasseService classeService = new ClasseService();
    @Override
    @WebMethod(operationName = "getClasseById")
    public ClasseDto getClasseById(int id) {
        return classeService.getClassById(id);
    }

    @Override
    @WebMethod(operationName = "createClasse")
    public boolean createClasse(ClasseDto classe) {
        return classeService.save(classe);
    }

    @Override
    @WebMethod(operationName = "updateClasse")
    public boolean updateClasse(ClasseDto classe) {
        return classeService.update(classe);
    }

    @Override
    @WebMethod(operationName = "deleteClasse")
    public boolean deleteClasse(int id) {
        return classeService.delete(id);
    }

    @Override
    @WebMethod(operationName = "getAllClasses")
    public List<ClasseDto> getAllClasses() {
        return classeService.getAllClasses();
    }
}
