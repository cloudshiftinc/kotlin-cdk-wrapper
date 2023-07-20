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

package cloudshift.awscdk.dsl.services.emrcontainers

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster
import kotlin.String

@CdkDslMarker
public class CfnVirtualClusterEksInfoPropertyDsl {
    private val cdkBuilder: CfnVirtualCluster.EksInfoProperty.Builder =
        CfnVirtualCluster.EksInfoProperty.builder()

    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    public fun build(): CfnVirtualCluster.EksInfoProperty = cdkBuilder.build()
}
