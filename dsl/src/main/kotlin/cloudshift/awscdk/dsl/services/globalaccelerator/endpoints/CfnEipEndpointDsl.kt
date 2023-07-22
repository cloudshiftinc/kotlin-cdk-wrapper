@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.globalaccelerator.endpoints

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.CfnEIP
import software.amazon.awscdk.services.globalaccelerator.endpoints.CfnEipEndpoint

/**
 * Use an EC2 Instance as a Global Accelerator Endpoint.
 *
 * Example:
 *
 * ```
 * Listener listener;
 * CfnEIP eip;
 * listener.addEndpointGroup("Group", EndpointGroupOptions.builder()
 * .endpoints(List.of(
 * CfnEipEndpoint.Builder.create(eip)
 * .weight(128)
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class CfnEipEndpointDsl(
  eip: CfnEIP,
) {
  private val cdkBuilder: CfnEipEndpoint.Builder = CfnEipEndpoint.Builder.create(eip)

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

  public fun build(): CfnEipEndpoint = cdkBuilder.build()
}
