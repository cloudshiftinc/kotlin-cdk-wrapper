@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediaconnect.CfnGateway

@CdkDslMarker
public class CfnGatewayGatewayNetworkPropertyDsl {
  private val cdkBuilder: CfnGateway.GatewayNetworkProperty.Builder =
      CfnGateway.GatewayNetworkProperty.builder()

  public fun cidrBlock(cidrBlock: String) {
    cdkBuilder.cidrBlock(cidrBlock)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnGateway.GatewayNetworkProperty = cdkBuilder.build()
}
