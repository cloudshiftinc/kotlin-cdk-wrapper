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

package cloudshift.awscdk.dsl.services.dax

import software.amazon.awscdk.services.dax.CfnCluster
import kotlin.Unit

public inline fun CfnCluster.setSseSpecification(
    block: CfnClusterSSESpecificationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnClusterSSESpecificationPropertyDsl()
    builder.apply(block)
    return setSseSpecification(builder.build())
}
