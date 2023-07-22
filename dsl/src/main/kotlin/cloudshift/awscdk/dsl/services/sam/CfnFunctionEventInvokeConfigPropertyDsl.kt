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

  /**
   * @param destinationConfig the value to be set.
   */
  public fun destinationConfig(destinationConfig: IResolvable) {
    cdkBuilder.destinationConfig(destinationConfig)
  }

  /**
   * @param destinationConfig the value to be set.
   */
  public
      fun destinationConfig(destinationConfig: CfnFunction.EventInvokeDestinationConfigProperty) {
    cdkBuilder.destinationConfig(destinationConfig)
  }

  /**
   * @param maximumEventAgeInSeconds the value to be set.
   */
  public fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number) {
    cdkBuilder.maximumEventAgeInSeconds(maximumEventAgeInSeconds)
  }

  /**
   * @param maximumRetryAttempts the value to be set.
   */
  public fun maximumRetryAttempts(maximumRetryAttempts: Number) {
    cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
  }

  public fun build(): CfnFunction.EventInvokeConfigProperty = cdkBuilder.build()
}
