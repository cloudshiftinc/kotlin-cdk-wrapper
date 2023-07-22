@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.auditmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.auditmanager.CfnAssessment

@CdkDslMarker
public class CfnAssessmentAWSServicePropertyDsl {
  private val cdkBuilder: CfnAssessment.AWSServiceProperty.Builder =
      CfnAssessment.AWSServiceProperty.builder()

  /**
   * @param serviceName The name of the AWS service .
   */
  public fun serviceName(serviceName: String) {
    cdkBuilder.serviceName(serviceName)
  }

  public fun build(): CfnAssessment.AWSServiceProperty = cdkBuilder.build()
}
