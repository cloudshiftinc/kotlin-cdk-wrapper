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
import software.amazon.awscdk.services.rds.CfnDBCluster
import kotlin.String

@CdkDslMarker
public class CfnDBClusterEndpointPropertyDsl {
    private val cdkBuilder: CfnDBCluster.EndpointProperty.Builder =
        CfnDBCluster.EndpointProperty.builder()

    public fun address(address: String) {
        cdkBuilder.address(address)
    }

    public fun port(port: String) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnDBCluster.EndpointProperty = cdkBuilder.build()
}
