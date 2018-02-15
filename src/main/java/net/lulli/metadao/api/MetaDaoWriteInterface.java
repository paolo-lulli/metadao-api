package net.lulli.metadao.api;

import java.sql.Connection;
import java.util.Map;

public interface MetaDaoWriteInterface<T>
{
    public Integer insert(MetaDto dto, T dbConnection);

    //public Integer execute(String sqlInputString, DataConnection dbConnection);

    public Integer delete(MetaDto dto, WheresMap wheres, T dbConnection);

    public Integer update(MetaDto dto, WheresMap wheres, T dbConnection);
}
