package Interfaces;

import Model.Client;
import Model.OrderWork;

public interface ICliente {


    void LlamarClientes(Client client);

    void RecibirOrdenes(OrderWork orderWork);

}
