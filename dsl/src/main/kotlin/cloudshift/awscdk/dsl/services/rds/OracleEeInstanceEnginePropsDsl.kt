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
import software.amazon.awscdk.services.rds.OracleEeInstanceEngineProps
import software.amazon.awscdk.services.rds.OracleEngineVersion

@CdkDslMarker
public class OracleEeInstanceEnginePropsDsl {
    private val cdkBuilder: OracleEeInstanceEngineProps.Builder =
        OracleEeInstanceEngineProps.builder()

    public fun version(version: OracleEngineVersion) {
        cdkBuilder.version(version)
    }

    public fun build(): OracleEeInstanceEngineProps = cdkBuilder.build()
}
