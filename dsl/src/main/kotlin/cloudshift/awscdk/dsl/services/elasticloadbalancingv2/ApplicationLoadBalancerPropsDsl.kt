@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.DesyncMitigationMode
import software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType

@CdkDslMarker
public class ApplicationLoadBalancerPropsDsl {
  private val cdkBuilder: ApplicationLoadBalancerProps.Builder =
      ApplicationLoadBalancerProps.builder()

  public fun deletionProtection(deletionProtection: Boolean) {
    cdkBuilder.deletionProtection(deletionProtection)
  }

  public fun desyncMitigationMode(desyncMitigationMode: DesyncMitigationMode) {
    cdkBuilder.desyncMitigationMode(desyncMitigationMode)
  }

  public fun dropInvalidHeaderFields(dropInvalidHeaderFields: Boolean) {
    cdkBuilder.dropInvalidHeaderFields(dropInvalidHeaderFields)
  }

  public fun http2Enabled(http2Enabled: Boolean) {
    cdkBuilder.http2Enabled(http2Enabled)
  }

  public fun idleTimeout(idleTimeout: Duration) {
    cdkBuilder.idleTimeout(idleTimeout)
  }

  public fun internetFacing(internetFacing: Boolean) {
    cdkBuilder.internetFacing(internetFacing)
  }

  public fun ipAddressType(ipAddressType: IpAddressType) {
    cdkBuilder.ipAddressType(ipAddressType)
  }

  public fun loadBalancerName(loadBalancerName: String) {
    cdkBuilder.loadBalancerName(loadBalancerName)
  }

  public fun securityGroup(securityGroup: ISecurityGroup) {
    cdkBuilder.securityGroup(securityGroup)
  }

  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun vpcSubnets(block: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(block)
    cdkBuilder.vpcSubnets(builder.build())
  }

  public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    cdkBuilder.vpcSubnets(vpcSubnets)
  }

  public fun build(): ApplicationLoadBalancerProps = cdkBuilder.build()
}
