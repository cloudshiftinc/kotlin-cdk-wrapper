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

package cloudshift.awscdk.dsl.services.resourcegroups

import kotlin.Unit
import software.amazon.awscdk.services.resourcegroups.CfnGroup

/**
 * The resource query structure that is used to dynamically determine which AWS resources are
 * members of the associated resource group.
 */
public inline fun CfnGroup.setResourceQuery(
    block: CfnGroupResourceQueryPropertyDsl.() -> Unit = {}
) {
    val builder = CfnGroupResourceQueryPropertyDsl()
    builder.apply(block)
    return setResourceQuery(builder.build())
}
