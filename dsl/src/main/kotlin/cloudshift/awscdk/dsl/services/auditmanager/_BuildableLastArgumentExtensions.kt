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

package cloudshift.awscdk.dsl.services.auditmanager

import kotlin.Unit
import software.amazon.awscdk.services.auditmanager.CfnAssessment

/** The destination that evidence reports are stored in for the assessment. */
public inline fun CfnAssessment.setAssessmentReportsDestination(
    block: CfnAssessmentAssessmentReportsDestinationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAssessmentAssessmentReportsDestinationPropertyDsl()
    builder.apply(block)
    return setAssessmentReportsDestination(builder.build())
}

/** The AWS account that's associated with the assessment. */
public inline fun CfnAssessment.setAwsAccount(
    block: CfnAssessmentAWSAccountPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAssessmentAWSAccountPropertyDsl()
    builder.apply(block)
    return setAwsAccount(builder.build())
}

/** The wrapper of AWS accounts and services that are in scope for the assessment. */
public inline fun CfnAssessment.setScope(block: CfnAssessmentScopePropertyDsl.() -> Unit = {}) {
    val builder = CfnAssessmentScopePropertyDsl()
    builder.apply(block)
    return setScope(builder.build())
}
