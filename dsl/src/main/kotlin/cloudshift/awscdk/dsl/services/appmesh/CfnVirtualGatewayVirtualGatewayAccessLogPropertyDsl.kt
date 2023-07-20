@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayAccessLogPropertyDsl {
  private val cdkBuilder: CfnVirtualGateway.VirtualGatewayAccessLogProperty.Builder =
      CfnVirtualGateway.VirtualGatewayAccessLogProperty.builder()

  public fun `file`(`file`: IResolvable) {
    cdkBuilder.`file`(`file`)
  }

  public fun `file`(`file`: CfnVirtualGateway.VirtualGatewayFileAccessLogProperty) {
    cdkBuilder.`file`(`file`)
  }

  public fun build(): CfnVirtualGateway.VirtualGatewayAccessLogProperty = cdkBuilder.build()
}
