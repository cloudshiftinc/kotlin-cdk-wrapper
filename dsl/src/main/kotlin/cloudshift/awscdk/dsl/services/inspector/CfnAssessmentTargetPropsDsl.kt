@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.inspector

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps

@CdkDslMarker
public class CfnAssessmentTargetPropsDsl {
  private val cdkBuilder: CfnAssessmentTargetProps.Builder = CfnAssessmentTargetProps.builder()

  /**
   * @param assessmentTargetName The name of the Amazon Inspector assessment target.
   * The name must be unique within the AWS account .
   */
  public fun assessmentTargetName(assessmentTargetName: String) {
    cdkBuilder.assessmentTargetName(assessmentTargetName)
  }

  /**
   * @param resourceGroupArn The ARN that specifies the resource group that is used to create the
   * assessment target.
   * If `resourceGroupArn` is not specified, all EC2 instances in the current AWS account and Region
   * are included in the assessment target.
   */
  public fun resourceGroupArn(resourceGroupArn: String) {
    cdkBuilder.resourceGroupArn(resourceGroupArn)
  }

  public fun build(): CfnAssessmentTargetProps = cdkBuilder.build()
}
