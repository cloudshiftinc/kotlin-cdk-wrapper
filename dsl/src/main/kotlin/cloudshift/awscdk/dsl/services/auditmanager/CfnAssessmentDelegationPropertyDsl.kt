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

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.auditmanager.CfnAssessment

/**
 * The `Delegation` property type specifies the assignment of a control set to a delegate for
 * review.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.auditmanager.*;
 * DelegationProperty delegationProperty = DelegationProperty.builder()
 * .assessmentId("assessmentId")
 * .assessmentName("assessmentName")
 * .comment("comment")
 * .controlSetId("controlSetId")
 * .createdBy("createdBy")
 * .creationTime(123)
 * .id("id")
 * .lastUpdated(123)
 * .roleArn("roleArn")
 * .roleType("roleType")
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-delegation.html)
 */
@CdkDslMarker
public class CfnAssessmentDelegationPropertyDsl {
    private val cdkBuilder: CfnAssessment.DelegationProperty.Builder =
        CfnAssessment.DelegationProperty.builder()

    /**
     * @param assessmentId The identifier for the assessment that's associated with the delegation.
     */
    public fun assessmentId(assessmentId: String) {
        cdkBuilder.assessmentId(assessmentId)
    }

    /** @param assessmentName The name of the assessment that's associated with the delegation. */
    public fun assessmentName(assessmentName: String) {
        cdkBuilder.assessmentName(assessmentName)
    }

    /** @param comment The comment that's related to the delegation. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * @param controlSetId The identifier for the control set that's associated with the delegation.
     */
    public fun controlSetId(controlSetId: String) {
        cdkBuilder.controlSetId(controlSetId)
    }

    /**
     * @param createdBy The user or role that created the delegation. *Minimum* : `1`
     *
     * *Maximum* : `100`
     *
     * *Pattern* : `^[a-zA-Z0-9-_()\\[\\]\\s]+$`
     */
    public fun createdBy(createdBy: String) {
        cdkBuilder.createdBy(createdBy)
    }

    /** @param creationTime Specifies when the delegation was created. */
    public fun creationTime(creationTime: Number) {
        cdkBuilder.creationTime(creationTime)
    }

    /** @param id The unique identifier for the delegation. */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /** @param lastUpdated Specifies when the delegation was last updated. */
    public fun lastUpdated(lastUpdated: Number) {
        cdkBuilder.lastUpdated(lastUpdated)
    }

    /** @param roleArn The Amazon Resource Name (ARN) of the IAM role. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param roleType The type of customer persona.
     *
     * In `CreateAssessment` , `roleType` can only be `PROCESS_OWNER` .
     *
     * In `UpdateSettings` , `roleType` can only be `PROCESS_OWNER` .
     *
     * In `BatchCreateDelegationByAssessment` , `roleType` can only be `RESOURCE_OWNER` .
     */
    public fun roleType(roleType: String) {
        cdkBuilder.roleType(roleType)
    }

    /** @param status The status of the delegation. */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnAssessment.DelegationProperty = cdkBuilder.build()
}
