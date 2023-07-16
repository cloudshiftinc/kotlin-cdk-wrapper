@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayLoggingPropertyDsl {
  private val cdkBuilder: CfnVirtualGateway.VirtualGatewayLoggingProperty.Builder =
      CfnVirtualGateway.VirtualGatewayLoggingProperty.builder()

  public fun accessLog(accessLog: IResolvable) {
    cdkBuilder.accessLog(accessLog)
  }

  public fun accessLog(accessLog: CfnVirtualGateway.VirtualGatewayAccessLogProperty) {
    cdkBuilder.accessLog(accessLog)
  }

  public fun build(): CfnVirtualGateway.VirtualGatewayLoggingProperty = cdkBuilder.build()
}
