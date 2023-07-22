@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import software.amazon.awscdk.services.appmesh.HealthCheckConfig

@CdkDslMarker
public class HealthCheckConfigDsl {
  private val cdkBuilder: HealthCheckConfig.Builder = HealthCheckConfig.builder()

  /**
   * @param virtualGatewayHealthCheck VirtualGateway CFN configuration for Health Checks.
   */
  public
      fun virtualGatewayHealthCheck(virtualGatewayHealthCheck: CfnVirtualGatewayVirtualGatewayHealthCheckPolicyPropertyDsl.() -> Unit
      = {}) {
    val builder = CfnVirtualGatewayVirtualGatewayHealthCheckPolicyPropertyDsl()
    builder.apply(virtualGatewayHealthCheck)
    cdkBuilder.virtualGatewayHealthCheck(builder.build())
  }

  /**
   * @param virtualGatewayHealthCheck VirtualGateway CFN configuration for Health Checks.
   */
  public
      fun virtualGatewayHealthCheck(virtualGatewayHealthCheck: CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty) {
    cdkBuilder.virtualGatewayHealthCheck(virtualGatewayHealthCheck)
  }

  /**
   * @param virtualNodeHealthCheck VirtualNode CFN configuration for Health Checks.
   */
  public
      fun virtualNodeHealthCheck(virtualNodeHealthCheck: CfnVirtualNodeHealthCheckPropertyDsl.() -> Unit
      = {}) {
    val builder = CfnVirtualNodeHealthCheckPropertyDsl()
    builder.apply(virtualNodeHealthCheck)
    cdkBuilder.virtualNodeHealthCheck(builder.build())
  }

  /**
   * @param virtualNodeHealthCheck VirtualNode CFN configuration for Health Checks.
   */
  public fun virtualNodeHealthCheck(virtualNodeHealthCheck: CfnVirtualNode.HealthCheckProperty) {
    cdkBuilder.virtualNodeHealthCheck(virtualNodeHealthCheck)
  }

  public fun build(): HealthCheckConfig = cdkBuilder.build()
}
