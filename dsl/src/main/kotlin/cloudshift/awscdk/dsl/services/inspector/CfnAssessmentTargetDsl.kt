@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.inspector

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.inspector.CfnAssessmentTarget
import software.constructs.Construct

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
