package mx.uv.t4is.ContratosCFE;

import org.springframework.data.repository.CrudRepository;

public interface Icontratos extends CrudRepository<Contrato,Integer>{

    //Buscar por nContrato
    Iterable<Contrato> findByNcontratoAndFirmae(int ncontrato,String firmae);    

}