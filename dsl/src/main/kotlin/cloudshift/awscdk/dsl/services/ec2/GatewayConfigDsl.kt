@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.GatewayConfig

@CdkDslMarker
public class GatewayConfigDsl {
  private val cdkBuilder: GatewayConfig.Builder = GatewayConfig.builder()

  public fun az(az: String) {
    cdkBuilder.az(az)
  }

  public fun gatewayId(gatewayId: String) {
    cdkBuilder.gatewayId(gatewayId)
  }

  public fun build(): GatewayConfig = cdkBuilder.build()
}
