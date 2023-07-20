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

package cloudshift.awscdk.dsl.services.guardduty

import software.amazon.awscdk.services.guardduty.CfnDetector
import software.amazon.awscdk.services.guardduty.CfnFilter
import kotlin.Unit

public inline fun CfnDetector.setDataSources(
    block: CfnDetectorCFNDataSourceConfigurationsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnDetectorCFNDataSourceConfigurationsPropertyDsl()
    builder.apply(block)
    return setDataSources(builder.build())
}

public inline fun CfnFilter.setFindingCriteria(
    block: CfnFilterFindingCriteriaPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnFilterFindingCriteriaPropertyDsl()
    builder.apply(block)
    return setFindingCriteria(builder.build())
}
