@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * EventInvokeConfigProperty eventInvokeConfigProperty = EventInvokeConfigProperty.builder()
 * .destinationConfig(EventInvokeDestinationConfigProperty.builder()
 * .onFailure(DestinationProperty.builder()
 * .destination("destination")
 * // the properties below are optional
 * .type("type")
 * .build())
 * .onSuccess(DestinationProperty.builder()
 * .destination("destination")
 * // the properties below are optional
 * .type("type")
 * .build())
 * .build())
 * .maximumEventAgeInSeconds(123)
 * .maximumRetryAttempts(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventinvokeconfig.html)
 */
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
