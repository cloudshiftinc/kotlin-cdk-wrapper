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
import software.amazon.awscdk.services.rds.AuroraMysqlClusterEngineProps
import software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion

@CdkDslMarker
public class AuroraMysqlClusterEnginePropsDsl {
    private val cdkBuilder: AuroraMysqlClusterEngineProps.Builder =
        AuroraMysqlClusterEngineProps.builder()

    public fun version(version: AuroraMysqlEngineVersion) {
        cdkBuilder.version(version)
    }

    public fun build(): AuroraMysqlClusterEngineProps = cdkBuilder.build()
}
