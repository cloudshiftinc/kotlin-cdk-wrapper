@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionEventInvokeDestinationConfigPropertyDsl {
  private val cdkBuilder: CfnFunction.EventInvokeDestinationConfigProperty.Builder =
      CfnFunction.EventInvokeDestinationConfigProperty.builder()

  public fun onFailure(onFailure: IResolvable) {
    cdkBuilder.onFailure(onFailure)
  }

  public fun onFailure(onFailure: CfnFunction.DestinationProperty) {
    cdkBuilder.onFailure(onFailure)
  }

  public fun onSuccess(onSuccess: IResolvable) {
    cdkBuilder.onSuccess(onSuccess)
  }

  public fun onSuccess(onSuccess: CfnFunction.DestinationProperty) {
    cdkBuilder.onSuccess(onSuccess)
  }

  public fun build(): CfnFunction.EventInvokeDestinationConfigProperty = cdkBuilder.build()
}
