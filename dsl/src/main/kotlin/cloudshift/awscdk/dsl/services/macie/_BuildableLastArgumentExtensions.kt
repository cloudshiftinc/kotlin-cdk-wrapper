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

package cloudshift.awscdk.dsl.services.macie

import software.amazon.awscdk.services.macie.CfnAllowList
import software.amazon.awscdk.services.macie.CfnFindingsFilter
import kotlin.Unit

public inline fun CfnFindingsFilter.setFindingCriteria(
    block: CfnFindingsFilterFindingCriteriaPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnFindingsFilterFindingCriteriaPropertyDsl()
    builder.apply(block)
    return setFindingCriteria(builder.build())
}

public inline fun CfnAllowList.setCriteria(block: CfnAllowListCriteriaPropertyDsl.() -> Unit = {}) {
    val builder = CfnAllowListCriteriaPropertyDsl()
    builder.apply(block)
    return setCriteria(builder.build())
}
