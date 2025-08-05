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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining an Application Load Balancer.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.autoscaling.AutoScalingGroup;
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
 *
 * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/application-load-balancers.html#load-balancer-attributes)
 */
public interface ApplicationLoadBalancerProps : BaseLoadBalancerProps {
  /**
   * The client keep alive duration.
   *
   * The valid range is 60 to 604800 seconds (1 minute to 7 days).
   *
   * Default: - Duration.seconds(3600)
   */
  public fun clientKeepAlive(): Duration? = unwrap(this).getClientKeepAlive()?.let(Duration::wrap)

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
   * Indicates whether the Application Load Balancer should preserve the host header in the HTTP
   * request and send it to the target without any change.
   *
   * Default: false
   */
  public fun preserveHostHeader(): Boolean? = unwrap(this).getPreserveHostHeader()

  /**
   * Indicates whether the X-Forwarded-For header should preserve the source port that the client
   * used to connect to the load balancer.
   *
   * Default: false
   */
  public fun preserveXffClientPort(): Boolean? = unwrap(this).getPreserveXffClientPort()

  /**
   * Security group to associate with this load balancer.
   *
   * Default: A security group is created
   */
  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  /**
   * Indicates whether to allow a WAF-enabled load balancer to route requests to targets if it is
   * unable to forward the request to AWS WAF.
   *
   * Default: false
   */
  public fun wafFailOpen(): Boolean? = unwrap(this).getWafFailOpen()

  /**
   * Indicates whether the two headers (x-amzn-tls-version and x-amzn-tls-cipher-suite), which
   * contain information about the negotiated TLS version and cipher suite, are added to the client
   * request before sending it to the target.
   *
   * The x-amzn-tls-version header has information about the TLS protocol version negotiated with
   * the client,
   * and the x-amzn-tls-cipher-suite header has information about the cipher suite negotiated with
   * the client.
   *
   * Both headers are in OpenSSL format.
   *
   * Default: false
   */
  public fun xAmznTlsVersionAndCipherSuiteHeaders(): Boolean? =
      unwrap(this).getXAmznTlsVersionAndCipherSuiteHeaders()

  /**
   * Enables you to modify, preserve, or remove the X-Forwarded-For header in the HTTP request
   * before the Application Load Balancer sends the request to the target.
   *
   * Default: XffHeaderProcessingMode.APPEND
   */
  public fun xffHeaderProcessingMode(): XffHeaderProcessingMode? =
      unwrap(this).getXffHeaderProcessingMode()?.let(XffHeaderProcessingMode::wrap)

  /**
   * A builder for [ApplicationLoadBalancerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clientKeepAlive The client keep alive duration.
     * The valid range is 60 to 604800 seconds (1 minute to 7 days).
     */
    public fun clientKeepAlive(clientKeepAlive: Duration)

    /**
     * @param crossZoneEnabled Indicates whether cross-zone load balancing is enabled.
     */
    public fun crossZoneEnabled(crossZoneEnabled: Boolean)

    /**
     * @param deletionProtection Indicates whether deletion protection is enabled.
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * @param denyAllIgwTraffic Indicates whether the load balancer blocks traffic through the
     * Internet Gateway (IGW).
     */
    public fun denyAllIgwTraffic(denyAllIgwTraffic: Boolean)

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
     * @param minimumCapacityUnit The minimum capacity (LCU) for a load balancer.
     */
    public fun minimumCapacityUnit(minimumCapacityUnit: Number)

    /**
     * @param preserveHostHeader Indicates whether the Application Load Balancer should preserve the
     * host header in the HTTP request and send it to the target without any change.
     */
    public fun preserveHostHeader(preserveHostHeader: Boolean)

    /**
     * @param preserveXffClientPort Indicates whether the X-Forwarded-For header should preserve the
     * source port that the client used to connect to the load balancer.
     */
    public fun preserveXffClientPort(preserveXffClientPort: Boolean)

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

    /**
     * @param wafFailOpen Indicates whether to allow a WAF-enabled load balancer to route requests
     * to targets if it is unable to forward the request to AWS WAF.
     */
    public fun wafFailOpen(wafFailOpen: Boolean)

    /**
     * @param xAmznTlsVersionAndCipherSuiteHeaders Indicates whether the two headers
     * (x-amzn-tls-version and x-amzn-tls-cipher-suite), which contain information about the negotiated
     * TLS version and cipher suite, are added to the client request before sending it to the target.
     * The x-amzn-tls-version header has information about the TLS protocol version negotiated with
     * the client,
     * and the x-amzn-tls-cipher-suite header has information about the cipher suite negotiated with
     * the client.
     *
     * Both headers are in OpenSSL format.
     */
    public fun xAmznTlsVersionAndCipherSuiteHeaders(xAmznTlsVersionAndCipherSuiteHeaders: Boolean)

    /**
     * @param xffHeaderProcessingMode Enables you to modify, preserve, or remove the X-Forwarded-For
     * header in the HTTP request before the Application Load Balancer sends the request to the target.
     */
    public fun xffHeaderProcessingMode(xffHeaderProcessingMode: XffHeaderProcessingMode)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps.builder()

    /**
     * @param clientKeepAlive The client keep alive duration.
     * The valid range is 60 to 604800 seconds (1 minute to 7 days).
     */
    override fun clientKeepAlive(clientKeepAlive: Duration) {
      cdkBuilder.clientKeepAlive(clientKeepAlive.let(Duration.Companion::unwrap))
    }

    /**
     * @param crossZoneEnabled Indicates whether cross-zone load balancing is enabled.
     */
    override fun crossZoneEnabled(crossZoneEnabled: Boolean) {
      cdkBuilder.crossZoneEnabled(crossZoneEnabled)
    }

    /**
     * @param deletionProtection Indicates whether deletion protection is enabled.
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * @param denyAllIgwTraffic Indicates whether the load balancer blocks traffic through the
     * Internet Gateway (IGW).
     */
    override fun denyAllIgwTraffic(denyAllIgwTraffic: Boolean) {
      cdkBuilder.denyAllIgwTraffic(denyAllIgwTraffic)
    }

    /**
     * @param desyncMitigationMode Determines how the load balancer handles requests that might pose
     * a security risk to your application.
     */
    override fun desyncMitigationMode(desyncMitigationMode: DesyncMitigationMode) {
      cdkBuilder.desyncMitigationMode(desyncMitigationMode.let(DesyncMitigationMode.Companion::unwrap))
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
      cdkBuilder.idleTimeout(idleTimeout.let(Duration.Companion::unwrap))
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
      cdkBuilder.ipAddressType(ipAddressType.let(IpAddressType.Companion::unwrap))
    }

    /**
     * @param loadBalancerName Name of the load balancer.
     */
    override fun loadBalancerName(loadBalancerName: String) {
      cdkBuilder.loadBalancerName(loadBalancerName)
    }

    /**
     * @param minimumCapacityUnit The minimum capacity (LCU) for a load balancer.
     */
    override fun minimumCapacityUnit(minimumCapacityUnit: Number) {
      cdkBuilder.minimumCapacityUnit(minimumCapacityUnit)
    }

    /**
     * @param preserveHostHeader Indicates whether the Application Load Balancer should preserve the
     * host header in the HTTP request and send it to the target without any change.
     */
    override fun preserveHostHeader(preserveHostHeader: Boolean) {
      cdkBuilder.preserveHostHeader(preserveHostHeader)
    }

    /**
     * @param preserveXffClientPort Indicates whether the X-Forwarded-For header should preserve the
     * source port that the client used to connect to the load balancer.
     */
    override fun preserveXffClientPort(preserveXffClientPort: Boolean) {
      cdkBuilder.preserveXffClientPort(preserveXffClientPort)
    }

    /**
     * @param securityGroup Security group to associate with this load balancer.
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup.Companion::unwrap))
    }

    /**
     * @param vpc The VPC network to place the load balancer in. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    /**
     * @param vpcSubnets Which subnets place the load balancer in.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * @param vpcSubnets Which subnets place the load balancer in.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f697656458aa2de18c67293ca49b91fb052853eaaa6860bf0c9997bcf6a3b0e9")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    /**
     * @param wafFailOpen Indicates whether to allow a WAF-enabled load balancer to route requests
     * to targets if it is unable to forward the request to AWS WAF.
     */
    override fun wafFailOpen(wafFailOpen: Boolean) {
      cdkBuilder.wafFailOpen(wafFailOpen)
    }

    /**
     * @param xAmznTlsVersionAndCipherSuiteHeaders Indicates whether the two headers
     * (x-amzn-tls-version and x-amzn-tls-cipher-suite), which contain information about the negotiated
     * TLS version and cipher suite, are added to the client request before sending it to the target.
     * The x-amzn-tls-version header has information about the TLS protocol version negotiated with
     * the client,
     * and the x-amzn-tls-cipher-suite header has information about the cipher suite negotiated with
     * the client.
     *
     * Both headers are in OpenSSL format.
     */
    override
        fun xAmznTlsVersionAndCipherSuiteHeaders(xAmznTlsVersionAndCipherSuiteHeaders: Boolean) {
      cdkBuilder.xAmznTlsVersionAndCipherSuiteHeaders(xAmznTlsVersionAndCipherSuiteHeaders)
    }

    /**
     * @param xffHeaderProcessingMode Enables you to modify, preserve, or remove the X-Forwarded-For
     * header in the HTTP request before the Application Load Balancer sends the request to the target.
     */
    override fun xffHeaderProcessingMode(xffHeaderProcessingMode: XffHeaderProcessingMode) {
      cdkBuilder.xffHeaderProcessingMode(xffHeaderProcessingMode.let(XffHeaderProcessingMode.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps,
  ) : CdkObject(cdkObject),
      ApplicationLoadBalancerProps {
    /**
     * The client keep alive duration.
     *
     * The valid range is 60 to 604800 seconds (1 minute to 7 days).
     *
     * Default: - Duration.seconds(3600)
     */
    override fun clientKeepAlive(): Duration? =
        unwrap(this).getClientKeepAlive()?.let(Duration::wrap)

    /**
     * Indicates whether cross-zone load balancing is enabled.
     *
     * Default: - false for Network Load Balancers and true for Application Load Balancers.
     * This can not be `false` for Application Load Balancers.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-loadbalancerattribute.html)
     */
    override fun crossZoneEnabled(): Boolean? = unwrap(this).getCrossZoneEnabled()

    /**
     * Indicates whether deletion protection is enabled.
     *
     * Default: false
     */
    override fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

    /**
     * Indicates whether the load balancer blocks traffic through the Internet Gateway (IGW).
     *
     * Default: - false for internet-facing load balancers and true for internal load balancers
     */
    override fun denyAllIgwTraffic(): Boolean? = unwrap(this).getDenyAllIgwTraffic()

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
     * The minimum capacity (LCU) for a load balancer.
     *
     * Default: undefined - ELB default is 0 LCU
     *
     * [Documentation](https://exampleloadbalancer.com/ondemand_capacity_reservation_calculator.html)
     */
    override fun minimumCapacityUnit(): Number? = unwrap(this).getMinimumCapacityUnit()

    /**
     * Indicates whether the Application Load Balancer should preserve the host header in the HTTP
     * request and send it to the target without any change.
     *
     * Default: false
     */
    override fun preserveHostHeader(): Boolean? = unwrap(this).getPreserveHostHeader()

    /**
     * Indicates whether the X-Forwarded-For header should preserve the source port that the client
     * used to connect to the load balancer.
     *
     * Default: false
     */
    override fun preserveXffClientPort(): Boolean? = unwrap(this).getPreserveXffClientPort()

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

    /**
     * Indicates whether to allow a WAF-enabled load balancer to route requests to targets if it is
     * unable to forward the request to AWS WAF.
     *
     * Default: false
     */
    override fun wafFailOpen(): Boolean? = unwrap(this).getWafFailOpen()

    /**
     * Indicates whether the two headers (x-amzn-tls-version and x-amzn-tls-cipher-suite), which
     * contain information about the negotiated TLS version and cipher suite, are added to the client
     * request before sending it to the target.
     *
     * The x-amzn-tls-version header has information about the TLS protocol version negotiated with
     * the client,
     * and the x-amzn-tls-cipher-suite header has information about the cipher suite negotiated with
     * the client.
     *
     * Both headers are in OpenSSL format.
     *
     * Default: false
     */
    override fun xAmznTlsVersionAndCipherSuiteHeaders(): Boolean? =
        unwrap(this).getXAmznTlsVersionAndCipherSuiteHeaders()

    /**
     * Enables you to modify, preserve, or remove the X-Forwarded-For header in the HTTP request
     * before the Application Load Balancer sends the request to the target.
     *
     * Default: XffHeaderProcessingMode.APPEND
     */
    override fun xffHeaderProcessingMode(): XffHeaderProcessingMode? =
        unwrap(this).getXffHeaderProcessingMode()?.let(XffHeaderProcessingMode::wrap)
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
