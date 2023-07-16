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

  public fun assessmentTargetName(assessmentTargetName: String) {
    cdkBuilder.assessmentTargetName(assessmentTargetName)
  }

  public fun resourceGroupArn(resourceGroupArn: String) {
    cdkBuilder.resourceGroupArn(resourceGroupArn)
  }

  public fun build(): CfnAssessmentTarget = cdkBuilder.build()
}
