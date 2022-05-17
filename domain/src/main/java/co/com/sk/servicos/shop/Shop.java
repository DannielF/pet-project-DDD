package co.com.sk.servicos.shop;

import co.com.sk.servicos.shop.events.StoreCreated;
import co.com.sk.servicos.shop.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

public class Shop extends AggregateEvent<ShopId> {
    protected StoreName storeName;
    protected Direction direction;
    protected CashierEmployeeId cashierEmployeeId;
    protected ResponsibleId responsibleId;

    public Shop(ShopId entityId, StoreName storeName,Direction direction) {
        super(entityId);
        appendChange(new StoreCreated(storeName,direction)).apply();
    }






}
