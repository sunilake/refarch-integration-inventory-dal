package inventory.ws;

import java.util.Collection;

import inventory.model.SupplierEntity;

public interface SupplierDAO {

	SupplierEntity saveSupplier(SupplierEntity s) throws DALException ;

	SupplierEntity getByName(String name) throws DALException ;

	SupplierEntity updateSupplier(SupplierEntity s) throws DALException ;
	
	String deleteSupplier(long id) throws DALException ;
	
	Collection<SupplierEntity> getSuppliers() throws DALException ;

	SupplierEntity getById(long supplierId) throws DALException;
}
