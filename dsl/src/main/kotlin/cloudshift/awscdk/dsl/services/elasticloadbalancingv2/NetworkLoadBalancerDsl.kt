@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer
import software.constructs.Construct

@CdkDslMarker
public class NetworkLoadBalancerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: NetworkLoadBalancer.Builder = NetworkLoadBalancer.Builder.create(scope,
      id)

  /**
   * Indicates whether cross-zone load balancing is enabled.
   *
   * Default: false
   *
   * @param crossZoneEnabled Indicates whether cross-zone load balancing is enabled. 
   */
  public fun crossZoneEnabled(crossZoneEnabled: Boolean) {
    cdkBuilder.crossZoneEnabled(crossZoneEnabled)
  }

  /**
   * Indicates whether deletion protection is enabled.
   *
   * Default: false
   *
   * @param deletionProtection Indicates whether deletion protection is enabled. 
   */
  public fun deletionProtection(deletionProtection: Boolean) {
    cdkBuilder.deletionProtection(deletionProtection)
  }

  /**
   * Whether the load balancer has an internet-routable address.
   *
   * Default: false
   *
   * @param internetFacing Whether the load balancer has an internet-routable address. 
   */
  public fun internetFacing(internetFacing: Boolean) {
    cdkBuilder.internetFacing(internetFacing)
  }

  /**
   * Name of the load balancer.
   *
   * Default: - Automatically generated name.
   *
   * @param loadBalancerName Name of the load balancer. 
   */
  public fun loadBalancerName(loadBalancerName: String) {
    cdkBuilder.loadBalancerName(loadBalancerName)
  }

  /**
   * The VPC network to place the load balancer in.
   *
   * @param vpc The VPC network to place the load balancer in. 
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  /**
   * Which subnets place the load balancer in.
   *
   * Default: - the Vpc default strategy.
   *
   * @param vpcSubnets Which subnets place the load balancer in. 
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(vpcSubnets)
    cdkBuilder.vpcSubnets(builder.build())
  }

  /**
   * Which subnets place the load balancer in.
   *
   * Default: - the Vpc default strategy.
   *
   * @param vpcSubnets Which subnets place the load balancer in. 
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    cdkBuilder.vpcSubnets(vpcSubnets)
  }

  public fun build(): NetworkLoadBalancer = cdkBuilder.build()
}
