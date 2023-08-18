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

package io.cloudshiftdev.awscdkdsl.services.macie

import kotlin.Unit
import software.amazon.awscdk.services.macie.CfnAllowList
import software.amazon.awscdk.services.macie.CfnFindingsFilter

/** The criteria that specify the text or text pattern to ignore. */
public inline fun CfnAllowList.setCriteria(block: CfnAllowListCriteriaPropertyDsl.() -> Unit = {}) {
    val builder = CfnAllowListCriteriaPropertyDsl()
    builder.apply(block)
    return setCriteria(builder.build())
}

/** The criteria to use to filter findings. */
public inline fun CfnFindingsFilter.setFindingCriteria(
    block: CfnFindingsFilterFindingCriteriaPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFindingsFilterFindingCriteriaPropertyDsl()
    builder.apply(block)
    return setFindingCriteria(builder.build())
}
