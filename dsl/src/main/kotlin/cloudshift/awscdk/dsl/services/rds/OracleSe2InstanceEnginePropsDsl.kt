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
import software.amazon.awscdk.services.rds.OracleEngineVersion
import software.amazon.awscdk.services.rds.OracleSe2InstanceEngineProps

@CdkDslMarker
public class OracleSe2InstanceEnginePropsDsl {
    private val cdkBuilder: OracleSe2InstanceEngineProps.Builder =
        OracleSe2InstanceEngineProps.builder()

    public fun version(version: OracleEngineVersion) {
        cdkBuilder.version(version)
    }

    public fun build(): OracleSe2InstanceEngineProps = cdkBuilder.build()
}
