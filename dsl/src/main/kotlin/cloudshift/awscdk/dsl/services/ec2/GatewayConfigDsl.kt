@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.GatewayConfig

/**
 * Pair represents a gateway created by NAT Provider.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * GatewayConfig gatewayConfig = GatewayConfig.builder()
 * .az("az")
 * .gatewayId("gatewayId")
 * .build();
 * ```
 */
@CdkDslMarker
public class GatewayConfigDsl {
  private val cdkBuilder: GatewayConfig.Builder = GatewayConfig.builder()

  /**
   * @param az Availability Zone. 
   */
  public fun az(az: String) {
    cdkBuilder.az(az)
  }

  /**
   * @param gatewayId Identity of gateway spawned by the provider. 
   */
  public fun gatewayId(gatewayId: String) {
    cdkBuilder.gatewayId(gatewayId)
  }

  public fun build(): GatewayConfig = cdkBuilder.build()
}
