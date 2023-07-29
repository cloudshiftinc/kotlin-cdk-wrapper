@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.SqlServerEeInstanceEngineProps
import software.amazon.awscdk.services.rds.SqlServerEngineVersion

/**
 * Properties for SQL Server Enterprise Edition instance engines.
 *
 * Used in `DatabaseInstanceEngine.sqlServerEe`.
 *
 * Example:
 * ```
 * Vpc vpc;
 * ParameterGroup parameterGroup = ParameterGroup.Builder.create(this, "ParameterGroup")
 * .engine(DatabaseInstanceEngine.sqlServerEe(SqlServerEeInstanceEngineProps.builder()
 * .version(SqlServerEngineVersion.VER_11)
 * .build()))
 * .parameters(Map.of(
 * "locks", "100"))
 * .build();
 * DatabaseInstance.Builder.create(this, "Database")
 * .engine(DatabaseInstanceEngine.SQL_SERVER_EE)
 * .vpc(vpc)
 * .parameterGroup(parameterGroup)
 * .build();
 * ```
 */
@CdkDslMarker
public class SqlServerEeInstanceEnginePropsDsl {
    private val cdkBuilder: SqlServerEeInstanceEngineProps.Builder =
        SqlServerEeInstanceEngineProps.builder()

    /** @param version The exact version of the engine to use. */
    public fun version(version: SqlServerEngineVersion) {
        cdkBuilder.version(version)
    }

    public fun build(): SqlServerEeInstanceEngineProps = cdkBuilder.build()
}
