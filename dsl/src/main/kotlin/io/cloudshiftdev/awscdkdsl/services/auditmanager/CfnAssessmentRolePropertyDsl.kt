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

package io.cloudshiftdev.awscdkdsl.services.auditmanager

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.auditmanager.CfnAssessment

/**
 * The `Role` property type specifies the wrapper that contains AWS Audit Manager role information,
 * such as the role type and IAM Amazon Resource Name (ARN).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.auditmanager.*;
 * RoleProperty roleProperty = RoleProperty.builder()
 * .roleArn("roleArn")
 * .roleType("roleType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-auditmanager-assessment-role.html)
 */
@CdkDslMarker
public class CfnAssessmentRolePropertyDsl {
    private val cdkBuilder: CfnAssessment.RoleProperty.Builder =
        CfnAssessment.RoleProperty.builder()

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

    public fun build(): CfnAssessment.RoleProperty = cdkBuilder.build()
}
