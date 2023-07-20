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

package cloudshift.awscdk.dsl.services.auditmanager

import software.amazon.awscdk.services.auditmanager.CfnAssessment
import kotlin.Unit

public inline fun CfnAssessment.setAssessmentReportsDestination(
    block: CfnAssessmentAssessmentReportsDestinationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnAssessmentAssessmentReportsDestinationPropertyDsl()
    builder.apply(block)
    return setAssessmentReportsDestination(builder.build())
}

public inline fun CfnAssessment.setAwsAccount(
    block: CfnAssessmentAWSAccountPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnAssessmentAWSAccountPropertyDsl()
    builder.apply(block)
    return setAwsAccount(builder.build())
}

public inline fun CfnAssessment.setScope(block: CfnAssessmentScopePropertyDsl.() -> Unit = {}) {
    val builder = CfnAssessmentScopePropertyDsl()
    builder.apply(block)
    return setScope(builder.build())
}
