@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayFileAccessLogPropertyDsl {
  private val cdkBuilder: CfnVirtualGateway.VirtualGatewayFileAccessLogProperty.Builder =
      CfnVirtualGateway.VirtualGatewayFileAccessLogProperty.builder()

  public fun format(format: IResolvable) {
    cdkBuilder.format(format)
  }

  public fun format(format: CfnVirtualGateway.LoggingFormatProperty) {
    cdkBuilder.format(format)
  }

  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun build(): CfnVirtualGateway.VirtualGatewayFileAccessLogProperty = cdkBuilder.build()
}
