@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.globalaccelerator

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.globalaccelerator.RawEndpointProps

/**
 * Properties for RawEndpoint.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.globalaccelerator.*;
 * RawEndpointProps rawEndpointProps = RawEndpointProps.builder()
 * .endpointId("endpointId")
 * // the properties below are optional
 * .preserveClientIp(false)
 * .region("region")
 * .weight(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class RawEndpointPropsDsl {
  private val cdkBuilder: RawEndpointProps.Builder = RawEndpointProps.builder()

  /**
   * @param endpointId Identifier of the endpoint. 
   * Load balancer ARN, instance ID or EIP allocation ID.
   */
  public fun endpointId(endpointId: String) {
    cdkBuilder.endpointId(endpointId)
  }

  /**
   * @param preserveClientIp Forward the client IP address.
   * GlobalAccelerator will create Network Interfaces in your VPC in order
   * to preserve the client IP address.
   *
   * Only applies to Application Load Balancers and EC2 instances.
   *
   * Client IP address preservation is supported only in specific AWS Regions.
   * See the GlobalAccelerator Developer Guide for a list.
   */
  public fun preserveClientIp(preserveClientIp: Boolean) {
    cdkBuilder.preserveClientIp(preserveClientIp)
  }

  /**
   * @param region The region where this endpoint is located.
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  /**
   * @param weight Endpoint weight across all endpoints in the group.
   * Must be a value between 0 and 255.
   */
  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): RawEndpointProps = cdkBuilder.build()
}
