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

package io.cloudshiftdev.awscdkdsl.services.mediastore

import kotlin.Unit
import software.amazon.awscdk.services.mediastore.CfnContainer

/** The metric policy that is associated with the container. */
public inline fun CfnContainer.setMetricPolicy(
    block: CfnContainerMetricPolicyPropertyDsl.() -> Unit = {}
) {
    val builder = CfnContainerMetricPolicyPropertyDsl()
    builder.apply(block)
    return setMetricPolicy(builder.build())
}
