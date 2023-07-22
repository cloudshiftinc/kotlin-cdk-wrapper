@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy

@CdkDslMarker
public class CfnContinuousDeploymentPolicySingleWeightConfigPropertyDsl {
  private val cdkBuilder: CfnContinuousDeploymentPolicy.SingleWeightConfigProperty.Builder =
      CfnContinuousDeploymentPolicy.SingleWeightConfigProperty.builder()

  /**
   * @param sessionStickinessConfig Session stickiness provides the ability to define multiple
   * requests from a single viewer as a single session.
   * This prevents the potentially inconsistent experience of sending some of a given user's
   * requests to your staging distribution, while others are sent to your primary distribution. Define
   * the session duration using TTL values.
   */
  public fun sessionStickinessConfig(sessionStickinessConfig: IResolvable) {
    cdkBuilder.sessionStickinessConfig(sessionStickinessConfig)
  }

  /**
   * @param sessionStickinessConfig Session stickiness provides the ability to define multiple
   * requests from a single viewer as a single session.
   * This prevents the potentially inconsistent experience of sending some of a given user's
   * requests to your staging distribution, while others are sent to your primary distribution. Define
   * the session duration using TTL values.
   */
  public
      fun sessionStickinessConfig(sessionStickinessConfig: CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty) {
    cdkBuilder.sessionStickinessConfig(sessionStickinessConfig)
  }

  /**
   * @param weight The percentage of traffic to send to a staging distribution, expressed as a
   * decimal number between 0 and .15. 
   */
  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): CfnContinuousDeploymentPolicy.SingleWeightConfigProperty = cdkBuilder.build()
}
