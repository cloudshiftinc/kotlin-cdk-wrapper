@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.AccessLogConfig
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class AccessLogConfigDsl {
  private val cdkBuilder: AccessLogConfig.Builder = AccessLogConfig.builder()

  public
      fun virtualGatewayAccessLog(block: CfnVirtualGatewayVirtualGatewayAccessLogPropertyDsl.() -> Unit
      = {}) {
    val builder = CfnVirtualGatewayVirtualGatewayAccessLogPropertyDsl()
    builder.apply(block)
    cdkBuilder.virtualGatewayAccessLog(builder.build())
  }

  public
      fun virtualGatewayAccessLog(virtualGatewayAccessLog: CfnVirtualGateway.VirtualGatewayAccessLogProperty) {
    cdkBuilder.virtualGatewayAccessLog(virtualGatewayAccessLog)
  }

  public fun virtualNodeAccessLog(block: CfnVirtualNodeAccessLogPropertyDsl.() -> Unit = {}) {
    val builder = CfnVirtualNodeAccessLogPropertyDsl()
    builder.apply(block)
    cdkBuilder.virtualNodeAccessLog(builder.build())
  }

  public fun virtualNodeAccessLog(virtualNodeAccessLog: CfnVirtualNode.AccessLogProperty) {
    cdkBuilder.virtualNodeAccessLog(virtualNodeAccessLog)
  }

  public fun build(): AccessLogConfig = cdkBuilder.build()
}
