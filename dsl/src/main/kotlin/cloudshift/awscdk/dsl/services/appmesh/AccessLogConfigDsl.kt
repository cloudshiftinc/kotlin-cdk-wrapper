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

  /**
   * @param virtualGatewayAccessLog VirtualGateway CFN configuration for Access Logging.
   */
  public
      fun virtualGatewayAccessLog(virtualGatewayAccessLog: CfnVirtualGatewayVirtualGatewayAccessLogPropertyDsl.() -> Unit
      = {}) {
    val builder = CfnVirtualGatewayVirtualGatewayAccessLogPropertyDsl()
    builder.apply(virtualGatewayAccessLog)
    cdkBuilder.virtualGatewayAccessLog(builder.build())
  }

  /**
   * @param virtualGatewayAccessLog VirtualGateway CFN configuration for Access Logging.
   */
  public
      fun virtualGatewayAccessLog(virtualGatewayAccessLog: CfnVirtualGateway.VirtualGatewayAccessLogProperty) {
    cdkBuilder.virtualGatewayAccessLog(virtualGatewayAccessLog)
  }

  /**
   * @param virtualNodeAccessLog VirtualNode CFN configuration for Access Logging.
   */
  public
      fun virtualNodeAccessLog(virtualNodeAccessLog: CfnVirtualNodeAccessLogPropertyDsl.() -> Unit =
      {}) {
    val builder = CfnVirtualNodeAccessLogPropertyDsl()
    builder.apply(virtualNodeAccessLog)
    cdkBuilder.virtualNodeAccessLog(builder.build())
  }

  /**
   * @param virtualNodeAccessLog VirtualNode CFN configuration for Access Logging.
   */
  public fun virtualNodeAccessLog(virtualNodeAccessLog: CfnVirtualNode.AccessLogProperty) {
    cdkBuilder.virtualNodeAccessLog(virtualNodeAccessLog)
  }

  public fun build(): AccessLogConfig = cdkBuilder.build()
}
