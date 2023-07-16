@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy

@CdkDslMarker
public class CfnContinuousDeploymentPolicySessionStickinessConfigPropertyDsl {
  private val cdkBuilder: CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty.Builder =
      CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty.builder()

  public fun idleTtl(idleTtl: Number) {
    cdkBuilder.idleTtl(idleTtl)
  }

  public fun maximumTtl(maximumTtl: Number) {
    cdkBuilder.maximumTtl(maximumTtl)
  }

  public fun build(): CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty =
      cdkBuilder.build()
}
