package sn.dev.service;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import sn.dev.dto.ClasseDto;

import java.util.List;

@WebService
public interface ClasseWebService {
    @WebMethod(operationName = "getClasseById")
    ClasseDto getClasseById(@WebParam(name = "idClasse") int id);

    @WebMethod(operationName = "createClasse")
    boolean createClasse(@WebParam(name = "classe") ClasseDto classe);

    @WebMethod(operationName = "updateClasse")
    boolean updateClasse(@WebParam(name = "classe") ClasseDto classe);
    @WebMethod(operationName = "deleteClasse")
    boolean deleteClasse(@WebParam(name = "idClasse") int id);
    @WebMethod(operationName = "getAllClasses")
    List<ClasseDto> getAllClasses();
}
