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

package cloudshift.awscdk.dsl.services.mediastore

import software.amazon.awscdk.services.mediastore.CfnContainer
import kotlin.Unit

public inline fun CfnContainer.setMetricPolicy(
    block: CfnContainerMetricPolicyPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnContainerMetricPolicyPropertyDsl()
    builder.apply(block)
    return setMetricPolicy(builder.build())
}
