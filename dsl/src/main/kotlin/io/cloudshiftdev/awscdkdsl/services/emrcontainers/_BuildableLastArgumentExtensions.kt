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

package io.cloudshiftdev.awscdkdsl.services.emrcontainers

import kotlin.Unit
import software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster

/** The container provider of the virtual cluster. */
public inline fun CfnVirtualCluster.setContainerProvider(
    block: CfnVirtualClusterContainerProviderPropertyDsl.() -> Unit = {}
) {
    val builder = CfnVirtualClusterContainerProviderPropertyDsl()
    builder.apply(block)
    return setContainerProvider(builder.build())
}
