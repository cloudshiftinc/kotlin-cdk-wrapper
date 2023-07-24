@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.emrcontainers

import software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster
import kotlin.Unit

/**
 * The container provider of the virtual cluster.
 */
public inline fun CfnVirtualCluster.setContainerProvider(
    block: CfnVirtualClusterContainerProviderPropertyDsl.() -> Unit =
        {}
) {
    val builder = CfnVirtualClusterContainerProviderPropertyDsl()
    builder.apply(block)
    return setContainerProvider(builder.build())
}
