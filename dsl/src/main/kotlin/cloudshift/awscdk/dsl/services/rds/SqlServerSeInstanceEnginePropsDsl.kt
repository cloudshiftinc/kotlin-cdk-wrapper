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
import software.amazon.awscdk.services.rds.SqlServerEngineVersion
import software.amazon.awscdk.services.rds.SqlServerSeInstanceEngineProps

/**
 * Properties for SQL Server Standard Edition instance engines.
 *
 * Used in `DatabaseInstanceEngine.sqlServerSe`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * SqlServerEngineVersion sqlServerEngineVersion;
 * SqlServerSeInstanceEngineProps sqlServerSeInstanceEngineProps =
 * SqlServerSeInstanceEngineProps.builder()
 * .version(sqlServerEngineVersion)
 * .build();
 * ```
 */
@CdkDslMarker
public class SqlServerSeInstanceEnginePropsDsl {
    private val cdkBuilder: SqlServerSeInstanceEngineProps.Builder =
        SqlServerSeInstanceEngineProps.builder()

    /** @param version The exact version of the engine to use. */
    public fun version(version: SqlServerEngineVersion) {
        cdkBuilder.version(version)
    }

    public fun build(): SqlServerSeInstanceEngineProps = cdkBuilder.build()
}
