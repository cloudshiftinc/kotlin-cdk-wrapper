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

package io.cloudshiftdev.awscdkdsl.services.resourceexplorer2

import kotlin.Unit
import software.amazon.awscdk.services.resourceexplorer2.CfnView

/**
 * An array of strings that include search keywords, prefixes, and operators that filter the results
 * that are returned for queries made using this view.
 */
public inline fun CfnView.setFilters(block: CfnViewFiltersPropertyDsl.() -> Unit = {}) {
    val builder = CfnViewFiltersPropertyDsl()
    builder.apply(block)
    return setFilters(builder.build())
}
