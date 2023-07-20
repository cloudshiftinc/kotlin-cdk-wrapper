@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.inspector

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps

@CdkDslMarker
public class CfnAssessmentTargetPropsDsl {
  private val cdkBuilder: CfnAssessmentTargetProps.Builder = CfnAssessmentTargetProps.builder()

  public fun assessmentTargetName(assessmentTargetName: String) {
    cdkBuilder.assessmentTargetName(assessmentTargetName)
  }

  public fun resourceGroupArn(resourceGroupArn: String) {
    cdkBuilder.resourceGroupArn(resourceGroupArn)
  }

  public fun build(): CfnAssessmentTargetProps = cdkBuilder.build()
}
