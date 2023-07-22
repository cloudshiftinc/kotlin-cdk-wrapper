@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnEndpoint

/**
 * The failover configuration for an endpoint.
 *
 * This includes what triggers failover and what happens when it's triggered.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * FailoverConfigProperty failoverConfigProperty = FailoverConfigProperty.builder()
 * .primary(PrimaryProperty.builder()
 * .healthCheck("healthCheck")
 * .build())
 * .secondary(SecondaryProperty.builder()
 * .route("route")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-endpoint-failoverconfig.html)
 */
@CdkDslMarker
public class CfnEndpointFailoverConfigPropertyDsl {
  private val cdkBuilder: CfnEndpoint.FailoverConfigProperty.Builder =
      CfnEndpoint.FailoverConfigProperty.builder()

  /**
   * @param primary The main Region of the endpoint. 
   */
  public fun primary(primary: IResolvable) {
    cdkBuilder.primary(primary)
  }

  /**
   * @param primary The main Region of the endpoint. 
   */
  public fun primary(primary: CfnEndpoint.PrimaryProperty) {
    cdkBuilder.primary(primary)
  }

  /**
   * @param secondary The Region that events are routed to when failover is triggered or event
   * replication is enabled. 
   */
  public fun secondary(secondary: IResolvable) {
    cdkBuilder.secondary(secondary)
  }

  /**
   * @param secondary The Region that events are routed to when failover is triggered or event
   * replication is enabled. 
   */
  public fun secondary(secondary: CfnEndpoint.SecondaryProperty) {
    cdkBuilder.secondary(secondary)
  }

  public fun build(): CfnEndpoint.FailoverConfigProperty = cdkBuilder.build()
}
