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

  public fun healthCheck(healthCheck: IResolvable) {
    cdkBuilder.healthCheck(healthCheck)
  }

  public fun healthCheck(healthCheck: CfnTargetGroup.HealthCheckConfigProperty) {
    cdkBuilder.healthCheck(healthCheck)
  }

  public fun ipAddressType(ipAddressType: String) {
    cdkBuilder.ipAddressType(ipAddressType)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun protocolVersion(protocolVersion: String) {
    cdkBuilder.protocolVersion(protocolVersion)
  }

  public fun vpcIdentifier(vpcIdentifier: String) {
    cdkBuilder.vpcIdentifier(vpcIdentifier)
  }

  public fun build(): CfnTargetGroup.TargetGroupConfigProperty = cdkBuilder.build()
}
