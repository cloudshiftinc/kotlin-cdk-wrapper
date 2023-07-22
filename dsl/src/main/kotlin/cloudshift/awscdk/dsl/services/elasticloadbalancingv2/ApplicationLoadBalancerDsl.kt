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
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.DesyncMitigationMode
import software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType
import software.constructs.Construct

/**
 * Define an Application Load Balancer.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.autoscaling.AutoScalingGroup;
 * AutoScalingGroup asg;
 * Vpc vpc;
 * // Create the load balancer in a VPC. 'internetFacing' is 'false'
 * // by default, which creates an internal load balancer.
 * ApplicationLoadBalancer lb = ApplicationLoadBalancer.Builder.create(this, "LB")
 * .vpc(vpc)
 * .internetFacing(true)
 * .build();
 * // Add a listener and open up the load balancer's security group
 * // to the world.
 * ApplicationListener listener = lb.addListener("Listener", BaseApplicationListenerProps.builder()
 * .port(80)
 * // 'open: true' is the default, you can leave it out if you want. Set it
 * // to 'false' and use `listener.connections` if you want to be selective
 * // about who can access the load balancer.
 * .open(true)
 * .build());
 * // Create an AutoScaling group and add it as a load balancing
 * // target to the listener.
 * listener.addTargets("ApplicationFleet", AddApplicationTargetsProps.builder()
 * .port(8080)
 * .targets(List.of(asg))
 * .build());
 * ```
 */
@CdkDslMarker
public class ApplicationLoadBalancerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: ApplicationLoadBalancer.Builder =
      ApplicationLoadBalancer.Builder.create(scope, id)

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
   * Determines how the load balancer handles requests that might pose a security risk to your
   * application.
   *
   * Default: DesyncMitigationMode.DEFENSIVE
   *
   * @param desyncMitigationMode Determines how the load balancer handles requests that might pose a
   * security risk to your application. 
   */
  public fun desyncMitigationMode(desyncMitigationMode: DesyncMitigationMode) {
    cdkBuilder.desyncMitigationMode(desyncMitigationMode)
  }

  /**
   * Indicates whether HTTP headers with invalid header fields are removed by the load balancer
   * (true) or routed to targets (false).
   *
   * Default: false
   *
   * @param dropInvalidHeaderFields Indicates whether HTTP headers with invalid header fields are
   * removed by the load balancer (true) or routed to targets (false). 
   */
  public fun dropInvalidHeaderFields(dropInvalidHeaderFields: Boolean) {
    cdkBuilder.dropInvalidHeaderFields(dropInvalidHeaderFields)
  }

  /**
   * Indicates whether HTTP/2 is enabled.
   *
   * Default: true
   *
   * @param http2Enabled Indicates whether HTTP/2 is enabled. 
   */
  public fun http2Enabled(http2Enabled: Boolean) {
    cdkBuilder.http2Enabled(http2Enabled)
  }

  /**
   * The load balancer idle timeout, in seconds.
   *
   * Default: 60
   *
   * @param idleTimeout The load balancer idle timeout, in seconds. 
   */
  public fun idleTimeout(idleTimeout: Duration) {
    cdkBuilder.idleTimeout(idleTimeout)
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
   * The type of IP addresses to use.
   *
   * Only applies to application load balancers.
   *
   * Default: IpAddressType.Ipv4
   *
   * @param ipAddressType The type of IP addresses to use. 
   */
  public fun ipAddressType(ipAddressType: IpAddressType) {
    cdkBuilder.ipAddressType(ipAddressType)
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
   * Security group to associate with this load balancer.
   *
   * Default: A security group is created
   *
   * @param securityGroup Security group to associate with this load balancer. 
   */
  public fun securityGroup(securityGroup: ISecurityGroup) {
    cdkBuilder.securityGroup(securityGroup)
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

  public fun build(): ApplicationLoadBalancer = cdkBuilder.build()
}
