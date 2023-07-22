@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.globalaccelerator.endpoints

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.services.ec2.IInstance
import software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpoint

/**
 * Use an EC2 Instance as a Global Accelerator Endpoint.
 *
 * Example:
 *
 * ```
 * Listener listener;
 * Instance instance;
 * listener.addEndpointGroup("Group", EndpointGroupOptions.builder()
 * .endpoints(List.of(
 * InstanceEndpoint.Builder.create(instance)
 * .weight(128)
 * .preserveClientIp(true)
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class InstanceEndpointDsl(
  instance: IInstance,
) {
  private val cdkBuilder: InstanceEndpoint.Builder = InstanceEndpoint.Builder.create(instance)

  /**
   * Forward the client IP address.
   *
   * GlobalAccelerator will create Network Interfaces in your VPC in order
   * to preserve the client IP address.
   *
   * Client IP address preservation is supported only in specific AWS Regions.
   * See the GlobalAccelerator Developer Guide for a list.
   *
   * Default: true if available
   *
   * @param preserveClientIp Forward the client IP address. 
   */
  public fun preserveClientIp(preserveClientIp: Boolean) {
    cdkBuilder.preserveClientIp(preserveClientIp)
  }

  /**
   * Endpoint weight across all endpoints in the group.
   *
   * Must be a value between 0 and 255.
   *
   * Default: 128
   *
   * @param weight Endpoint weight across all endpoints in the group. 
   */
  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): InstanceEndpoint = cdkBuilder.build()
}
