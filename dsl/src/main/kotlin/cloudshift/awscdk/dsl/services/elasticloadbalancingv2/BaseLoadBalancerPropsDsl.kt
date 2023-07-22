@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerProps

/**
 * Shared properties of both Application and Network Load Balancers.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * Subnet subnet;
 * SubnetFilter subnetFilter;
 * Vpc vpc;
 * BaseLoadBalancerProps baseLoadBalancerProps = BaseLoadBalancerProps.builder()
 * .vpc(vpc)
 * // the properties below are optional
 * .deletionProtection(false)
 * .internetFacing(false)
 * .loadBalancerName("loadBalancerName")
 * .vpcSubnets(SubnetSelection.builder()
 * .availabilityZones(List.of("availabilityZones"))
 * .onePerAz(false)
 * .subnetFilters(List.of(subnetFilter))
 * .subnetGroupName("subnetGroupName")
 * .subnets(List.of(subnet))
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class BaseLoadBalancerPropsDsl {
  private val cdkBuilder: BaseLoadBalancerProps.Builder = BaseLoadBalancerProps.builder()

  /**
   * @param deletionProtection Indicates whether deletion protection is enabled.
   */
  public fun deletionProtection(deletionProtection: Boolean) {
    cdkBuilder.deletionProtection(deletionProtection)
  }

  /**
   * @param internetFacing Whether the load balancer has an internet-routable address.
   */
  public fun internetFacing(internetFacing: Boolean) {
    cdkBuilder.internetFacing(internetFacing)
  }

  /**
   * @param loadBalancerName Name of the load balancer.
   */
  public fun loadBalancerName(loadBalancerName: String) {
    cdkBuilder.loadBalancerName(loadBalancerName)
  }

  /**
   * @param vpc The VPC network to place the load balancer in. 
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  /**
   * @param vpcSubnets Which subnets place the load balancer in.
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(vpcSubnets)
    cdkBuilder.vpcSubnets(builder.build())
  }

  /**
   * @param vpcSubnets Which subnets place the load balancer in.
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    cdkBuilder.vpcSubnets(vpcSubnets)
  }

  public fun build(): BaseLoadBalancerProps = cdkBuilder.build()
}
