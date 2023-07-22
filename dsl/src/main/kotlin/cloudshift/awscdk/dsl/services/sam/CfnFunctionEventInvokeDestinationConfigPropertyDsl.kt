@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionEventInvokeDestinationConfigPropertyDsl {
  private val cdkBuilder: CfnFunction.EventInvokeDestinationConfigProperty.Builder =
      CfnFunction.EventInvokeDestinationConfigProperty.builder()

  /**
   * @param onFailure the value to be set. 
   */
  public fun onFailure(onFailure: IResolvable) {
    cdkBuilder.onFailure(onFailure)
  }

  /**
   * @param onFailure the value to be set. 
   */
  public fun onFailure(onFailure: CfnFunction.DestinationProperty) {
    cdkBuilder.onFailure(onFailure)
  }

  /**
   * @param onSuccess the value to be set. 
   */
  public fun onSuccess(onSuccess: IResolvable) {
    cdkBuilder.onSuccess(onSuccess)
  }

  /**
   * @param onSuccess the value to be set. 
   */
  public fun onSuccess(onSuccess: CfnFunction.DestinationProperty) {
    cdkBuilder.onSuccess(onSuccess)
  }

  public fun build(): CfnFunction.EventInvokeDestinationConfigProperty = cdkBuilder.build()
}
