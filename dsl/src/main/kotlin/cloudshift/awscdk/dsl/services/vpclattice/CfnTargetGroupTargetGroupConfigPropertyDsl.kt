@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnTargetGroup

@CdkDslMarker
public class CfnTargetGroupTargetGroupConfigPropertyDsl {
  private val cdkBuilder: CfnTargetGroup.TargetGroupConfigProperty.Builder =
      CfnTargetGroup.TargetGroupConfigProperty.builder()

  /**
   * @param healthCheck The health check configuration.
   */
  public fun healthCheck(healthCheck: IResolvable) {
    cdkBuilder.healthCheck(healthCheck)
  }

  /**
   * @param healthCheck The health check configuration.
   */
  public fun healthCheck(healthCheck: CfnTargetGroup.HealthCheckConfigProperty) {
    cdkBuilder.healthCheck(healthCheck)
  }

  /**
   * @param ipAddressType The type of IP address used for the target group.
   * The possible values are `ipv4` and `ipv6` . This is an optional parameter. If not specified,
   * the IP address type defaults to `ipv4` .
   */
  public fun ipAddressType(ipAddressType: String) {
    cdkBuilder.ipAddressType(ipAddressType)
  }

  /**
   * @param port The port on which the targets are listening. 
   * For HTTP, the default is `80` . For HTTPS, the default is `443`
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param protocol The protocol to use for routing traffic to the targets. 
   * Default is the protocol of a target group.
   */
  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * @param protocolVersion The protocol version.
   * Default value is `HTTP1` .
   */
  public fun protocolVersion(protocolVersion: String) {
    cdkBuilder.protocolVersion(protocolVersion)
  }

  /**
   * @param vpcIdentifier The ID of the VPC. 
   */
  public fun vpcIdentifier(vpcIdentifier: String) {
    cdkBuilder.vpcIdentifier(vpcIdentifier)
  }

  public fun build(): CfnTargetGroup.TargetGroupConfigProperty = cdkBuilder.build()
}
