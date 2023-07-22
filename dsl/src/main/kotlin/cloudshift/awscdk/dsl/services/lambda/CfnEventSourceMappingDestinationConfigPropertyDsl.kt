@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

/**
 * A configuration object that specifies the destination of an event after Lambda processes it.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * DestinationConfigProperty destinationConfigProperty = DestinationConfigProperty.builder()
 * .onFailure(OnFailureProperty.builder()
 * .destination("destination")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-destinationconfig.html)
 */
@CdkDslMarker
public class CfnEventSourceMappingDestinationConfigPropertyDsl {
  private val cdkBuilder: CfnEventSourceMapping.DestinationConfigProperty.Builder =
      CfnEventSourceMapping.DestinationConfigProperty.builder()

  /**
   * @param onFailure The destination configuration for failed invocations.
   */
  public fun onFailure(onFailure: IResolvable) {
    cdkBuilder.onFailure(onFailure)
  }

  /**
   * @param onFailure The destination configuration for failed invocations.
   */
  public fun onFailure(onFailure: CfnEventSourceMapping.OnFailureProperty) {
    cdkBuilder.onFailure(onFailure)
  }

  public fun build(): CfnEventSourceMapping.DestinationConfigProperty = cdkBuilder.build()
}
