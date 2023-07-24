@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.inspectorv2

import software.amazon.awscdk.services.inspectorv2.CfnFilter
import kotlin.Unit

/**
 * Details on the filter criteria associated with this filter.
 */
public inline fun CfnFilter.setFilterCriteria(
    block: CfnFilterFilterCriteriaPropertyDsl.() -> Unit =
        {}
) {
    val builder = CfnFilterFilterCriteriaPropertyDsl()
    builder.apply(block)
    return setFilterCriteria(builder.build())
}
