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

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.auditmanager.CfnAssessment
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnAssessmentDelegationPropertyDsl {
    private val cdkBuilder: CfnAssessment.DelegationProperty.Builder =
        CfnAssessment.DelegationProperty.builder()

    public fun assessmentId(assessmentId: String) {
        cdkBuilder.assessmentId(assessmentId)
    }

    public fun assessmentName(assessmentName: String) {
        cdkBuilder.assessmentName(assessmentName)
    }

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun controlSetId(controlSetId: String) {
        cdkBuilder.controlSetId(controlSetId)
    }

    public fun createdBy(createdBy: String) {
        cdkBuilder.createdBy(createdBy)
    }

    public fun creationTime(creationTime: Number) {
        cdkBuilder.creationTime(creationTime)
    }

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun lastUpdated(lastUpdated: Number) {
        cdkBuilder.lastUpdated(lastUpdated)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun roleType(roleType: String) {
        cdkBuilder.roleType(roleType)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnAssessment.DelegationProperty = cdkBuilder.build()
}
