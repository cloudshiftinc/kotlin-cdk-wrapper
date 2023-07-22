@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * EventInvokeDestinationConfigProperty eventInvokeDestinationConfigProperty =
 * EventInvokeDestinationConfigProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-eventinvokedestinationconfig.html)
 */
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
