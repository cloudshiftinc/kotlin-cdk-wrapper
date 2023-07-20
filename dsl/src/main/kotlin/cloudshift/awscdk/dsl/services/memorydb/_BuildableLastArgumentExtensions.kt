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

package cloudshift.awscdk.dsl.services.memorydb

import software.amazon.awscdk.services.memorydb.CfnCluster
import kotlin.Unit

public inline fun CfnCluster.setClusterEndpoint(
    block: CfnClusterEndpointPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnClusterEndpointPropertyDsl()
    builder.apply(block)
    return setClusterEndpoint(builder.build())
}
