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

package cloudshift.awscdk.dsl.services.resourceexplorer2

import software.amazon.awscdk.services.resourceexplorer2.CfnView
import kotlin.Unit

public inline fun CfnView.setFilters(block: CfnViewFiltersPropertyDsl.() -> Unit = {}) {
    val builder = CfnViewFiltersPropertyDsl()
    builder.apply(block)
    return setFilters(builder.build())
}
