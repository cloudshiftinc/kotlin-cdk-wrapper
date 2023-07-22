@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnEventInvokeConfig

@CdkDslMarker
public class CfnEventInvokeConfigDestinationConfigPropertyDsl {
  private val cdkBuilder: CfnEventInvokeConfig.DestinationConfigProperty.Builder =
      CfnEventInvokeConfig.DestinationConfigProperty.builder()

  /**
   * @param onFailure The destination configuration for failed invocations.
   */
  public fun onFailure(onFailure: IResolvable) {
    cdkBuilder.onFailure(onFailure)
  }

  /**
   * @param onFailure The destination configuration for failed invocations.
   */
  public fun onFailure(onFailure: CfnEventInvokeConfig.OnFailureProperty) {
    cdkBuilder.onFailure(onFailure)
  }

  /**
   * @param onSuccess The destination configuration for successful invocations.
   */
  public fun onSuccess(onSuccess: IResolvable) {
    cdkBuilder.onSuccess(onSuccess)
  }

  /**
   * @param onSuccess The destination configuration for successful invocations.
   */
  public fun onSuccess(onSuccess: CfnEventInvokeConfig.OnSuccessProperty) {
    cdkBuilder.onSuccess(onSuccess)
  }

  public fun build(): CfnEventInvokeConfig.DestinationConfigProperty = cdkBuilder.build()
}
