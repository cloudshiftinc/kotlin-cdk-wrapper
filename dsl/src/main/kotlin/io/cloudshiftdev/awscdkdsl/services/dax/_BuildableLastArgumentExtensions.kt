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

package io.cloudshiftdev.awscdkdsl.services.dax

import kotlin.Unit
import software.amazon.awscdk.services.dax.CfnCluster

/** Represents the settings used to enable server-side encryption on the cluster. */
public inline fun CfnCluster.setSseSpecification(
    block: CfnClusterSSESpecificationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnClusterSSESpecificationPropertyDsl()
    builder.apply(block)
    return setSseSpecification(builder.build())
}
