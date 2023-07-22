@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnEndpoint

/**
 * The event buses the endpoint is associated with.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * EndpointEventBusProperty endpointEventBusProperty = EndpointEventBusProperty.builder()
 * .eventBusArn("eventBusArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-endpointeventbus.html)
 */
@CdkDslMarker
public class CfnEndpointEndpointEventBusPropertyDsl {
  private val cdkBuilder: CfnEndpoint.EndpointEventBusProperty.Builder =
      CfnEndpoint.EndpointEventBusProperty.builder()

  /**
   * @param eventBusArn The ARN of the event bus the endpoint is associated with. 
   */
  public fun eventBusArn(eventBusArn: String) {
    cdkBuilder.eventBusArn(eventBusArn)
  }

  public fun build(): CfnEndpoint.EndpointEventBusProperty = cdkBuilder.build()
}
