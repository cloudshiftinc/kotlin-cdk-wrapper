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

package io.cloudshiftdev.awscdkdsl.services.rds

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.rds.SqlServerEngineVersion
import software.amazon.awscdk.services.rds.SqlServerExInstanceEngineProps

/**
 * Properties for SQL Server Express Edition instance engines.
 *
 * Used in `DatabaseInstanceEngine.sqlServerEx`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * SqlServerEngineVersion sqlServerEngineVersion;
 * SqlServerExInstanceEngineProps sqlServerExInstanceEngineProps =
 * SqlServerExInstanceEngineProps.builder()
 * .version(sqlServerEngineVersion)
 * .build();
 * ```
 */
@CdkDslMarker
public class SqlServerExInstanceEnginePropsDsl {
    private val cdkBuilder: SqlServerExInstanceEngineProps.Builder =
        SqlServerExInstanceEngineProps.builder()

    /** @param version The exact version of the engine to use. */
    public fun version(version: SqlServerEngineVersion) {
        cdkBuilder.version(version)
    }

    public fun build(): SqlServerExInstanceEngineProps = cdkBuilder.build()
}
