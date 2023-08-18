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

package io.cloudshiftdev.awscdkdsl.services.inspector

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps

/**
 * Properties for defining a `CfnAssessmentTarget`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.inspector.*;
 * CfnAssessmentTargetProps cfnAssessmentTargetProps = CfnAssessmentTargetProps.builder()
 * .assessmentTargetName("assessmentTargetName")
 * .resourceGroupArn("resourceGroupArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html)
 */
@CdkDslMarker
public class CfnAssessmentTargetPropsDsl {
    private val cdkBuilder: CfnAssessmentTargetProps.Builder = CfnAssessmentTargetProps.builder()

    /**
     * @param assessmentTargetName The name of the Amazon Inspector assessment target. The name must
     *   be unique within the AWS account .
     */
    public fun assessmentTargetName(assessmentTargetName: String) {
        cdkBuilder.assessmentTargetName(assessmentTargetName)
    }

    /**
     * @param resourceGroupArn The ARN that specifies the resource group that is used to create the
     *   assessment target. If `resourceGroupArn` is not specified, all EC2 instances in the current
     *   AWS account and Region are included in the assessment target.
     */
    public fun resourceGroupArn(resourceGroupArn: String) {
        cdkBuilder.resourceGroupArn(resourceGroupArn)
    }

    public fun build(): CfnAssessmentTargetProps = cdkBuilder.build()
}
