package sn.dev.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import sn.dev.dto.ClasseDto;
import sn.dev.dto.SectorDto;

import java.util.List;

@WebService
public interface SectorWebService {

    @WebMethod(operationName = "getAllSectors")
    SectorDto getSectorById(@WebParam(name = "id") int id);
    @WebMethod(operationName = "getAllSectors")
    List<SectorDto> getAllSectors();
    @WebMethod(operationName = "saveSector")
    SectorDto createSector(@WebParam(name = "sector") SectorDto sectorDto);

    @WebMethod(operationName = "updateSector")
    boolean updateSector(@WebParam(name = "sector") SectorDto sectorDto);
    @WebMethod(operationName = "deleteSector")
    boolean deleteSector(@WebParam(name = "id") int id);


}
