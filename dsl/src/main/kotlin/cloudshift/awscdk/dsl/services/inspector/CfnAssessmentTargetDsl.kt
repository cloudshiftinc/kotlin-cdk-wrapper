@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.inspector

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.inspector.CfnAssessmentTarget
import software.constructs.Construct

/**
 * The `AWS::Inspector::AssessmentTarget` resource is used to create Amazon Inspector assessment
 * targets, which specify the Amazon EC2 instances that will be analyzed during an assessment run.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.inspector.*;
 * CfnAssessmentTarget cfnAssessmentTarget = CfnAssessmentTarget.Builder.create(this,
 * "MyCfnAssessmentTarget")
 * .assessmentTargetName("assessmentTargetName")
 * .resourceGroupArn("resourceGroupArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html)
 */
@CdkDslMarker
public class CfnAssessmentTargetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAssessmentTarget.Builder = CfnAssessmentTarget.Builder.create(scope,
      id)

  /**
   * The name of the Amazon Inspector assessment target.
   *
   * The name must be unique within the AWS account .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html#cfn-inspector-assessmenttarget-assessmenttargetname)
   * @param assessmentTargetName The name of the Amazon Inspector assessment target. 
   */
  public fun assessmentTargetName(assessmentTargetName: String) {
    cdkBuilder.assessmentTargetName(assessmentTargetName)
  }

  /**
   * The ARN that specifies the resource group that is used to create the assessment target.
   *
   * If `resourceGroupArn` is not specified, all EC2 instances in the current AWS account and Region
   * are included in the assessment target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html#cfn-inspector-assessmenttarget-resourcegrouparn)
   * @param resourceGroupArn The ARN that specifies the resource group that is used to create the
   * assessment target. 
   */
  public fun resourceGroupArn(resourceGroupArn: String) {
    cdkBuilder.resourceGroupArn(resourceGroupArn)
  }

  public fun build(): CfnAssessmentTarget = cdkBuilder.build()
}
