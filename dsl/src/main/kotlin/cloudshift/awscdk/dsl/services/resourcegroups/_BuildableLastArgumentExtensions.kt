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

package cloudshift.awscdk.dsl.services.resourcegroups

import software.amazon.awscdk.services.resourcegroups.CfnGroup
import kotlin.Unit

public inline fun CfnGroup.setResourceQuery(
    block: CfnGroupResourceQueryPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnGroupResourceQueryPropertyDsl()
    builder.apply(block)
    return setResourceQuery(builder.build())
}
