@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy

@CdkDslMarker
public class CfnContinuousDeploymentPolicySingleHeaderConfigPropertyDsl {
  private val cdkBuilder: CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty.Builder =
      CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty.builder()

  /**
   * @param header The request header name that you want CloudFront to send to your staging
   * distribution. 
   * The header must contain the prefix `aws-cf-cd-` .
   */
  public fun `header`(`header`: String) {
    cdkBuilder.`header`(`header`)
  }

  /**
   * @param value The request header value. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty = cdkBuilder.build()
}
