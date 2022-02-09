package liquibase.ext.snowflake.sqlgenerator;

import liquibase.database.Database;
import liquibase.ext.snowflake.database.SnowflakeDatabase;
import liquibase.sqlgenerator.core.SetTableRemarksGenerator;
import liquibase.statement.core.SetTableRemarksStatement;

public class SnowflakeSetTableRemarksGenerator extends SetTableRemarksGenerator {
    @Override
    public int getPriority() {
        return PRIORITY_DATABASE;
    }

    @Override
    public boolean supports(SetTableRemarksStatement statement, Database database) {
        return database instanceof SnowflakeDatabase;
    }
}
