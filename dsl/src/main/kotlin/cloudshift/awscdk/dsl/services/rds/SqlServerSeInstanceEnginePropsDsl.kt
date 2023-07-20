@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.SqlServerEngineVersion
import software.amazon.awscdk.services.rds.SqlServerSeInstanceEngineProps

@CdkDslMarker
public class SqlServerSeInstanceEnginePropsDsl {
    private val cdkBuilder: SqlServerSeInstanceEngineProps.Builder =
        SqlServerSeInstanceEngineProps.builder()

    public fun version(version: SqlServerEngineVersion) {
        cdkBuilder.version(version)
    }

    public fun build(): SqlServerSeInstanceEngineProps = cdkBuilder.build()
}
