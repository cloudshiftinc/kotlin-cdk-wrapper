@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionEventInvokeConfigPropertyDsl {
  private val cdkBuilder: CfnFunction.EventInvokeConfigProperty.Builder =
      CfnFunction.EventInvokeConfigProperty.builder()

  public fun destinationConfig(destinationConfig: IResolvable) {
    cdkBuilder.destinationConfig(destinationConfig)
  }

  public
      fun destinationConfig(destinationConfig: CfnFunction.EventInvokeDestinationConfigProperty) {
    cdkBuilder.destinationConfig(destinationConfig)
  }

  public fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number) {
    cdkBuilder.maximumEventAgeInSeconds(maximumEventAgeInSeconds)
  }

  public fun maximumRetryAttempts(maximumRetryAttempts: Number) {
    cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
  }

  public fun build(): CfnFunction.EventInvokeConfigProperty = cdkBuilder.build()
}
