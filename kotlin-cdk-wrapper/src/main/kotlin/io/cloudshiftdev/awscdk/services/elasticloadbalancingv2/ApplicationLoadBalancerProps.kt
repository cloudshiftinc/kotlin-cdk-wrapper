@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining an Application Load Balancer.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * TaskDefinition taskDefinition;
 * Vpc vpc;
 * FargateService service = FargateService.Builder.create(this,
 * "Service").cluster(cluster).taskDefinition(taskDefinition).build();
 * ApplicationLoadBalancer lb = ApplicationLoadBalancer.Builder.create(this,
 * "LB").vpc(vpc).internetFacing(true).build();
 * ApplicationListener listener = lb.addListener("Listener",
 * BaseApplicationListenerProps.builder().port(80).build());
 * service.registerLoadBalancerTargets(EcsTarget.builder()
 * .containerName("web")
 * .containerPort(80)
 * .newTargetGroupId("ECS")
 * .listener(ListenerConfig.applicationListener(listener, AddApplicationTargetsProps.builder()
 * .protocol(ApplicationProtocol.HTTPS)
 * .build()))
 * .build());
 * ```
 */
public interface ApplicationLoadBalancerProps : BaseLoadBalancerProps {
  /**
   * Determines how the load balancer handles requests that might pose a security risk to your
   * application.
   *
   * Default: DesyncMitigationMode.DEFENSIVE
   */
  public fun desyncMitigationMode(): DesyncMitigationMode? =
      unwrap(this).getDesyncMitigationMode()?.let(DesyncMitigationMode::wrap)

  /**
   * Indicates whether HTTP headers with invalid header fields are removed by the load balancer
   * (true) or routed to targets (false).
   *
   * Default: false
   */
  public fun dropInvalidHeaderFields(): Boolean? = unwrap(this).getDropInvalidHeaderFields()

  /**
   * Indicates whether HTTP/2 is enabled.
   *
   * Default: true
   */
  public fun http2Enabled(): Boolean? = unwrap(this).getHttp2Enabled()

  /**
   * The load balancer idle timeout, in seconds.
   *
   * Default: 60
   */
  public fun idleTimeout(): Duration? = unwrap(this).getIdleTimeout()?.let(Duration::wrap)

  /**
   * The type of IP addresses to use.
   *
   * Default: IpAddressType.IPV4
   */
  public fun ipAddressType(): IpAddressType? =
      unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

  /**
   * Security group to associate with this load balancer.
   *
   * Default: A security group is created
   */
  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  /**
   * A builder for [ApplicationLoadBalancerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deletionProtection Indicates whether deletion protection is enabled.
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * @param desyncMitigationMode Determines how the load balancer handles requests that might pose
     * a security risk to your application.
     */
    public fun desyncMitigationMode(desyncMitigationMode: DesyncMitigationMode)

    /**
     * @param dropInvalidHeaderFields Indicates whether HTTP headers with invalid header fields are
     * removed by the load balancer (true) or routed to targets (false).
     */
    public fun dropInvalidHeaderFields(dropInvalidHeaderFields: Boolean)

    /**
     * @param http2Enabled Indicates whether HTTP/2 is enabled.
     */
    public fun http2Enabled(http2Enabled: Boolean)

    /**
     * @param idleTimeout The load balancer idle timeout, in seconds.
     */
    public fun idleTimeout(idleTimeout: Duration)

    /**
     * @param internetFacing Whether the load balancer has an internet-routable address.
     */
    public fun internetFacing(internetFacing: Boolean)

    /**
     * @param ipAddressType The type of IP addresses to use.
     */
    public fun ipAddressType(ipAddressType: IpAddressType)

    /**
     * @param loadBalancerName Name of the load balancer.
     */
    public fun loadBalancerName(loadBalancerName: String)

    /**
     * @param securityGroup Security group to associate with this load balancer.
     */
    public fun securityGroup(securityGroup: ISecurityGroup)

    /**
     * @param vpc The VPC network to place the load balancer in. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnets Which subnets place the load balancer in.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * @param vpcSubnets Which subnets place the load balancer in.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f697656458aa2de18c67293ca49b91fb052853eaaa6860bf0c9997bcf6a3b0e9")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps.builder()

    /**
     * @param deletionProtection Indicates whether deletion protection is enabled.
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * @param desyncMitigationMode Determines how the load balancer handles requests that might pose
     * a security risk to your application.
     */
    override fun desyncMitigationMode(desyncMitigationMode: DesyncMitigationMode) {
      cdkBuilder.desyncMitigationMode(desyncMitigationMode.let(DesyncMitigationMode::unwrap))
    }

    /**
     * @param dropInvalidHeaderFields Indicates whether HTTP headers with invalid header fields are
     * removed by the load balancer (true) or routed to targets (false).
     */
    override fun dropInvalidHeaderFields(dropInvalidHeaderFields: Boolean) {
      cdkBuilder.dropInvalidHeaderFields(dropInvalidHeaderFields)
    }

    /**
     * @param http2Enabled Indicates whether HTTP/2 is enabled.
     */
    override fun http2Enabled(http2Enabled: Boolean) {
      cdkBuilder.http2Enabled(http2Enabled)
    }

    /**
     * @param idleTimeout The load balancer idle timeout, in seconds.
     */
    override fun idleTimeout(idleTimeout: Duration) {
      cdkBuilder.idleTimeout(idleTimeout.let(Duration::unwrap))
    }

    /**
     * @param internetFacing Whether the load balancer has an internet-routable address.
     */
    override fun internetFacing(internetFacing: Boolean) {
      cdkBuilder.internetFacing(internetFacing)
    }

    /**
     * @param ipAddressType The type of IP addresses to use.
     */
    override fun ipAddressType(ipAddressType: IpAddressType) {
      cdkBuilder.ipAddressType(ipAddressType.let(IpAddressType::unwrap))
    }

    /**
     * @param loadBalancerName Name of the load balancer.
     */
    override fun loadBalancerName(loadBalancerName: String) {
      cdkBuilder.loadBalancerName(loadBalancerName)
    }

    /**
     * @param securityGroup Security group to associate with this load balancer.
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    /**
     * @param vpc The VPC network to place the load balancer in. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * @param vpcSubnets Which subnets place the load balancer in.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * @param vpcSubnets Which subnets place the load balancer in.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f697656458aa2de18c67293ca49b91fb052853eaaa6860bf0c9997bcf6a3b0e9")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps,
  ) : CdkObject(cdkObject), ApplicationLoadBalancerProps {
    /**
     * Indicates whether deletion protection is enabled.
     *
     * Default: false
     */
    override fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

    /**
     * Determines how the load balancer handles requests that might pose a security risk to your
     * application.
     *
     * Default: DesyncMitigationMode.DEFENSIVE
     */
    override fun desyncMitigationMode(): DesyncMitigationMode? =
        unwrap(this).getDesyncMitigationMode()?.let(DesyncMitigationMode::wrap)

    /**
     * Indicates whether HTTP headers with invalid header fields are removed by the load balancer
     * (true) or routed to targets (false).
     *
     * Default: false
     */
    override fun dropInvalidHeaderFields(): Boolean? = unwrap(this).getDropInvalidHeaderFields()

    /**
     * Indicates whether HTTP/2 is enabled.
     *
     * Default: true
     */
    override fun http2Enabled(): Boolean? = unwrap(this).getHttp2Enabled()

    /**
     * The load balancer idle timeout, in seconds.
     *
     * Default: 60
     */
    override fun idleTimeout(): Duration? = unwrap(this).getIdleTimeout()?.let(Duration::wrap)

    /**
     * Whether the load balancer has an internet-routable address.
     *
     * Default: false
     */
    override fun internetFacing(): Boolean? = unwrap(this).getInternetFacing()

    /**
     * The type of IP addresses to use.
     *
     * Default: IpAddressType.IPV4
     */
    override fun ipAddressType(): IpAddressType? =
        unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

    /**
     * Name of the load balancer.
     *
     * Default: - Automatically generated name.
     */
    override fun loadBalancerName(): String? = unwrap(this).getLoadBalancerName()

    /**
     * Security group to associate with this load balancer.
     *
     * Default: A security group is created
     */
    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    /**
     * The VPC network to place the load balancer in.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    /**
     * Which subnets place the load balancer in.
     *
     * Default: - the Vpc default strategy.
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationLoadBalancerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps):
        ApplicationLoadBalancerProps = CdkObjectWrappers.wrap(cdkObject) as?
        ApplicationLoadBalancerProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationLoadBalancerProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps
  }
}
