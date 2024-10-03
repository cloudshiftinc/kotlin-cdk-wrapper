@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnTargetGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * CfnTargetGroupProps cfnTargetGroupProps = CfnTargetGroupProps.builder()
 * .healthCheckEnabled(false)
 * .healthCheckIntervalSeconds(123)
 * .healthCheckPath("healthCheckPath")
 * .healthCheckPort("healthCheckPort")
 * .healthCheckProtocol("healthCheckProtocol")
 * .healthCheckTimeoutSeconds(123)
 * .healthyThresholdCount(123)
 * .ipAddressType("ipAddressType")
 * .matcher(MatcherProperty.builder()
 * .grpcCode("grpcCode")
 * .httpCode("httpCode")
 * .build())
 * .name("name")
 * .port(123)
 * .protocol("protocol")
 * .protocolVersion("protocolVersion")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .targetGroupAttributes(List.of(TargetGroupAttributeProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .targets(List.of(TargetDescriptionProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .availabilityZone("availabilityZone")
 * .port(123)
 * .build()))
 * .targetType("targetType")
 * .unhealthyThresholdCount(123)
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html)
 */
public interface CfnTargetGroupProps {
  /**
   * Indicates whether health checks are enabled.
   *
   * If the target type is `lambda` , health checks are disabled by default but can be enabled. If
   * the target type is `instance` , `ip` , or `alb` , health checks are always enabled and cannot be
   * disabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckenabled)
   */
  public fun healthCheckEnabled(): Any? = unwrap(this).getHealthCheckEnabled()

  /**
   * The approximate amount of time, in seconds, between health checks of an individual target.
   *
   * The range is 5-300. If the target group protocol is TCP, TLS, UDP, TCP_UDP, HTTP or HTTPS, the
   * default is 30 seconds. If the target group protocol is GENEVE, the default is 10 seconds. If the
   * target type is `lambda` , the default is 35 seconds.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckintervalseconds)
   */
  public fun healthCheckIntervalSeconds(): Number? = unwrap(this).getHealthCheckIntervalSeconds()

  /**
   * [HTTP/HTTPS health checks] The destination for health checks on the targets.
   *
   * [HTTP1 or HTTP2 protocol version] The ping path. The default is /.
   *
   * [GRPC protocol version] The path of a custom health check method with the format
   * /package.service/method. The default is / AWS .ALB/healthcheck.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckpath)
   */
  public fun healthCheckPath(): String? = unwrap(this).getHealthCheckPath()

  /**
   * The port the load balancer uses when performing health checks on targets.
   *
   * If the protocol is HTTP, HTTPS, TCP, TLS, UDP, or TCP_UDP, the default is `traffic-port` ,
   * which is the port on which each target receives traffic from the load balancer. If the protocol is
   * GENEVE, the default is port 80.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckport)
   */
  public fun healthCheckPort(): String? = unwrap(this).getHealthCheckPort()

  /**
   * The protocol the load balancer uses when performing health checks on targets.
   *
   * For Application Load Balancers, the default is HTTP. For Network Load Balancers and Gateway
   * Load Balancers, the default is TCP. The TCP protocol is not supported for health checks if the
   * protocol of the target group is HTTP or HTTPS. The GENEVE, TLS, UDP, and TCP_UDP protocols are not
   * supported for health checks.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckprotocol)
   */
  public fun healthCheckProtocol(): String? = unwrap(this).getHealthCheckProtocol()

  /**
   * The amount of time, in seconds, during which no response from a target means a failed health
   * check.
   *
   * The range is 2–120 seconds. For target groups with a protocol of HTTP, the default is 6
   * seconds. For target groups with a protocol of TCP, TLS or HTTPS, the default is 10 seconds. For
   * target groups with a protocol of GENEVE, the default is 5 seconds. If the target type is `lambda`
   * , the default is 30 seconds.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthchecktimeoutseconds)
   */
  public fun healthCheckTimeoutSeconds(): Number? = unwrap(this).getHealthCheckTimeoutSeconds()

  /**
   * The number of consecutive health check successes required before considering a target healthy.
   *
   * The range is 2-10. If the target group protocol is TCP, TCP_UDP, UDP, TLS, HTTP or HTTPS, the
   * default is 5. For target groups with a protocol of GENEVE, the default is 5. If the target type is
   * `lambda` , the default is 5.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthythresholdcount)
   */
  public fun healthyThresholdCount(): Number? = unwrap(this).getHealthyThresholdCount()

  /**
   * The type of IP address used for this target group.
   *
   * The possible values are `ipv4` and `ipv6` . This is an optional parameter. If not specified,
   * the IP address type defaults to `ipv4` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-ipaddresstype)
   */
  public fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  /**
   * [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a successful
   * response from a target.
   *
   * For target groups with a protocol of TCP, TCP_UDP, UDP or TLS the range is 200-599. For target
   * groups with a protocol of HTTP or HTTPS, the range is 200-499. For target groups with a protocol
   * of GENEVE, the range is 200-399.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-matcher)
   */
  public fun matcher(): Any? = unwrap(this).getMatcher()

  /**
   * The name of the target group.
   *
   * This name must be unique per region per account, can have a maximum of 32 characters, must
   * contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The port on which the targets receive traffic.
   *
   * This port is used unless you specify a port override when registering the target. If the target
   * is a Lambda function, this parameter does not apply. If the protocol is GENEVE, the supported port
   * is 6081.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-port)
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * The protocol to use for routing traffic to the targets.
   *
   * For Application Load Balancers, the supported protocols are HTTP and HTTPS. For Network Load
   * Balancers, the supported protocols are TCP, TLS, UDP, or TCP_UDP. For Gateway Load Balancers, the
   * supported protocol is GENEVE. A TCP_UDP listener must be associated with a TCP_UDP target group.
   * If the target is a Lambda function, this parameter does not apply.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-protocol)
   */
  public fun protocol(): String? = unwrap(this).getProtocol()

  /**
   * [HTTP/HTTPS protocol] The protocol version.
   *
   * The possible values are `GRPC` , `HTTP1` , and `HTTP2` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-protocolversion)
   */
  public fun protocolVersion(): String? = unwrap(this).getProtocolVersion()

  /**
   * The tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The target group attributes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattributes)
   */
  public fun targetGroupAttributes(): Any? = unwrap(this).getTargetGroupAttributes()

  /**
   * The type of target that you must specify when registering targets with this target group.
   *
   * You can't specify targets for a target group using more than one target type.
   *
   * * `instance` - Register targets by instance ID. This is the default value.
   * * `ip` - Register targets by IP address. You can specify IP addresses from the subnets of the
   * virtual private cloud (VPC) for the target group, the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12,
   * and 192.168.0.0/16), and the RFC 6598 range (100.64.0.0/10). You can't specify publicly routable
   * IP addresses.
   * * `lambda` - Register a single Lambda function as a target.
   * * `alb` - Register a single Application Load Balancer as a target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targettype)
   */
  public fun targetType(): String? = unwrap(this).getTargetType()

  /**
   * The targets.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targets)
   */
  public fun targets(): Any? = unwrap(this).getTargets()

  /**
   * The number of consecutive health check failures required before considering a target unhealthy.
   *
   * The range is 2-10. If the target group protocol is TCP, TCP_UDP, UDP, TLS, HTTP or HTTPS, the
   * default is 2. For target groups with a protocol of GENEVE, the default is 2. If the target type is
   * `lambda` , the default is 5.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-unhealthythresholdcount)
   */
  public fun unhealthyThresholdCount(): Number? = unwrap(this).getUnhealthyThresholdCount()

  /**
   * The identifier of the virtual private cloud (VPC).
   *
   * If the target is a Lambda function, this parameter does not apply. Otherwise, this parameter is
   * required.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-vpcid)
   */
  public fun vpcId(): String? = unwrap(this).getVpcId()

  /**
   * A builder for [CfnTargetGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param healthCheckEnabled Indicates whether health checks are enabled.
     * If the target type is `lambda` , health checks are disabled by default but can be enabled. If
     * the target type is `instance` , `ip` , or `alb` , health checks are always enabled and cannot be
     * disabled.
     */
    public fun healthCheckEnabled(healthCheckEnabled: Boolean)

    /**
     * @param healthCheckEnabled Indicates whether health checks are enabled.
     * If the target type is `lambda` , health checks are disabled by default but can be enabled. If
     * the target type is `instance` , `ip` , or `alb` , health checks are always enabled and cannot be
     * disabled.
     */
    public fun healthCheckEnabled(healthCheckEnabled: IResolvable)

    /**
     * @param healthCheckIntervalSeconds The approximate amount of time, in seconds, between health
     * checks of an individual target.
     * The range is 5-300. If the target group protocol is TCP, TLS, UDP, TCP_UDP, HTTP or HTTPS,
     * the default is 30 seconds. If the target group protocol is GENEVE, the default is 10 seconds. If
     * the target type is `lambda` , the default is 35 seconds.
     */
    public fun healthCheckIntervalSeconds(healthCheckIntervalSeconds: Number)

    /**
     * @param healthCheckPath [HTTP/HTTPS health checks] The destination for health checks on the
     * targets.
     * [HTTP1 or HTTP2 protocol version] The ping path. The default is /.
     *
     * [GRPC protocol version] The path of a custom health check method with the format
     * /package.service/method. The default is / AWS .ALB/healthcheck.
     */
    public fun healthCheckPath(healthCheckPath: String)

    /**
     * @param healthCheckPort The port the load balancer uses when performing health checks on
     * targets.
     * If the protocol is HTTP, HTTPS, TCP, TLS, UDP, or TCP_UDP, the default is `traffic-port` ,
     * which is the port on which each target receives traffic from the load balancer. If the protocol
     * is GENEVE, the default is port 80.
     */
    public fun healthCheckPort(healthCheckPort: String)

    /**
     * @param healthCheckProtocol The protocol the load balancer uses when performing health checks
     * on targets.
     * For Application Load Balancers, the default is HTTP. For Network Load Balancers and Gateway
     * Load Balancers, the default is TCP. The TCP protocol is not supported for health checks if the
     * protocol of the target group is HTTP or HTTPS. The GENEVE, TLS, UDP, and TCP_UDP protocols are
     * not supported for health checks.
     */
    public fun healthCheckProtocol(healthCheckProtocol: String)

    /**
     * @param healthCheckTimeoutSeconds The amount of time, in seconds, during which no response
     * from a target means a failed health check.
     * The range is 2–120 seconds. For target groups with a protocol of HTTP, the default is 6
     * seconds. For target groups with a protocol of TCP, TLS or HTTPS, the default is 10 seconds. For
     * target groups with a protocol of GENEVE, the default is 5 seconds. If the target type is
     * `lambda` , the default is 30 seconds.
     */
    public fun healthCheckTimeoutSeconds(healthCheckTimeoutSeconds: Number)

    /**
     * @param healthyThresholdCount The number of consecutive health check successes required before
     * considering a target healthy.
     * The range is 2-10. If the target group protocol is TCP, TCP_UDP, UDP, TLS, HTTP or HTTPS, the
     * default is 5. For target groups with a protocol of GENEVE, the default is 5. If the target type
     * is `lambda` , the default is 5.
     */
    public fun healthyThresholdCount(healthyThresholdCount: Number)

    /**
     * @param ipAddressType The type of IP address used for this target group.
     * The possible values are `ipv4` and `ipv6` . This is an optional parameter. If not specified,
     * the IP address type defaults to `ipv4` .
     */
    public fun ipAddressType(ipAddressType: String)

    /**
     * @param matcher [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a
     * successful response from a target.
     * For target groups with a protocol of TCP, TCP_UDP, UDP or TLS the range is 200-599. For
     * target groups with a protocol of HTTP or HTTPS, the range is 200-499. For target groups with a
     * protocol of GENEVE, the range is 200-399.
     */
    public fun matcher(matcher: IResolvable)

    /**
     * @param matcher [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a
     * successful response from a target.
     * For target groups with a protocol of TCP, TCP_UDP, UDP or TLS the range is 200-599. For
     * target groups with a protocol of HTTP or HTTPS, the range is 200-499. For target groups with a
     * protocol of GENEVE, the range is 200-399.
     */
    public fun matcher(matcher: CfnTargetGroup.MatcherProperty)

    /**
     * @param matcher [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a
     * successful response from a target.
     * For target groups with a protocol of TCP, TCP_UDP, UDP or TLS the range is 200-599. For
     * target groups with a protocol of HTTP or HTTPS, the range is 200-499. For target groups with a
     * protocol of GENEVE, the range is 200-399.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("416c71eccd26db2c39cf20fe0dccd7d456308f17ecd8926f38c832132c97d22e")
    public fun matcher(matcher: CfnTargetGroup.MatcherProperty.Builder.() -> Unit)

    /**
     * @param name The name of the target group.
     * This name must be unique per region per account, can have a maximum of 32 characters, must
     * contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
     */
    public fun name(name: String)

    /**
     * @param port The port on which the targets receive traffic.
     * This port is used unless you specify a port override when registering the target. If the
     * target is a Lambda function, this parameter does not apply. If the protocol is GENEVE, the
     * supported port is 6081.
     */
    public fun port(port: Number)

    /**
     * @param protocol The protocol to use for routing traffic to the targets.
     * For Application Load Balancers, the supported protocols are HTTP and HTTPS. For Network Load
     * Balancers, the supported protocols are TCP, TLS, UDP, or TCP_UDP. For Gateway Load Balancers,
     * the supported protocol is GENEVE. A TCP_UDP listener must be associated with a TCP_UDP target
     * group. If the target is a Lambda function, this parameter does not apply.
     */
    public fun protocol(protocol: String)

    /**
     * @param protocolVersion [HTTP/HTTPS protocol] The protocol version.
     * The possible values are `GRPC` , `HTTP1` , and `HTTP2` .
     */
    public fun protocolVersion(protocolVersion: String)

    /**
     * @param tags The tags.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param targetGroupAttributes The target group attributes.
     */
    public fun targetGroupAttributes(targetGroupAttributes: IResolvable)

    /**
     * @param targetGroupAttributes The target group attributes.
     */
    public fun targetGroupAttributes(targetGroupAttributes: List<Any>)

    /**
     * @param targetGroupAttributes The target group attributes.
     */
    public fun targetGroupAttributes(vararg targetGroupAttributes: Any)

    /**
     * @param targetType The type of target that you must specify when registering targets with this
     * target group.
     * You can't specify targets for a target group using more than one target type.
     *
     * * `instance` - Register targets by instance ID. This is the default value.
     * * `ip` - Register targets by IP address. You can specify IP addresses from the subnets of the
     * virtual private cloud (VPC) for the target group, the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12,
     * and 192.168.0.0/16), and the RFC 6598 range (100.64.0.0/10). You can't specify publicly routable
     * IP addresses.
     * * `lambda` - Register a single Lambda function as a target.
     * * `alb` - Register a single Application Load Balancer as a target.
     */
    public fun targetType(targetType: String)

    /**
     * @param targets The targets.
     */
    public fun targets(targets: IResolvable)

    /**
     * @param targets The targets.
     */
    public fun targets(targets: List<Any>)

    /**
     * @param targets The targets.
     */
    public fun targets(vararg targets: Any)

    /**
     * @param unhealthyThresholdCount The number of consecutive health check failures required
     * before considering a target unhealthy.
     * The range is 2-10. If the target group protocol is TCP, TCP_UDP, UDP, TLS, HTTP or HTTPS, the
     * default is 2. For target groups with a protocol of GENEVE, the default is 2. If the target type
     * is `lambda` , the default is 5.
     */
    public fun unhealthyThresholdCount(unhealthyThresholdCount: Number)

    /**
     * @param vpcId The identifier of the virtual private cloud (VPC).
     * If the target is a Lambda function, this parameter does not apply. Otherwise, this parameter
     * is required.
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroupProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroupProps.builder()

    /**
     * @param healthCheckEnabled Indicates whether health checks are enabled.
     * If the target type is `lambda` , health checks are disabled by default but can be enabled. If
     * the target type is `instance` , `ip` , or `alb` , health checks are always enabled and cannot be
     * disabled.
     */
    override fun healthCheckEnabled(healthCheckEnabled: Boolean) {
      cdkBuilder.healthCheckEnabled(healthCheckEnabled)
    }

    /**
     * @param healthCheckEnabled Indicates whether health checks are enabled.
     * If the target type is `lambda` , health checks are disabled by default but can be enabled. If
     * the target type is `instance` , `ip` , or `alb` , health checks are always enabled and cannot be
     * disabled.
     */
    override fun healthCheckEnabled(healthCheckEnabled: IResolvable) {
      cdkBuilder.healthCheckEnabled(healthCheckEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param healthCheckIntervalSeconds The approximate amount of time, in seconds, between health
     * checks of an individual target.
     * The range is 5-300. If the target group protocol is TCP, TLS, UDP, TCP_UDP, HTTP or HTTPS,
     * the default is 30 seconds. If the target group protocol is GENEVE, the default is 10 seconds. If
     * the target type is `lambda` , the default is 35 seconds.
     */
    override fun healthCheckIntervalSeconds(healthCheckIntervalSeconds: Number) {
      cdkBuilder.healthCheckIntervalSeconds(healthCheckIntervalSeconds)
    }

    /**
     * @param healthCheckPath [HTTP/HTTPS health checks] The destination for health checks on the
     * targets.
     * [HTTP1 or HTTP2 protocol version] The ping path. The default is /.
     *
     * [GRPC protocol version] The path of a custom health check method with the format
     * /package.service/method. The default is / AWS .ALB/healthcheck.
     */
    override fun healthCheckPath(healthCheckPath: String) {
      cdkBuilder.healthCheckPath(healthCheckPath)
    }

    /**
     * @param healthCheckPort The port the load balancer uses when performing health checks on
     * targets.
     * If the protocol is HTTP, HTTPS, TCP, TLS, UDP, or TCP_UDP, the default is `traffic-port` ,
     * which is the port on which each target receives traffic from the load balancer. If the protocol
     * is GENEVE, the default is port 80.
     */
    override fun healthCheckPort(healthCheckPort: String) {
      cdkBuilder.healthCheckPort(healthCheckPort)
    }

    /**
     * @param healthCheckProtocol The protocol the load balancer uses when performing health checks
     * on targets.
     * For Application Load Balancers, the default is HTTP. For Network Load Balancers and Gateway
     * Load Balancers, the default is TCP. The TCP protocol is not supported for health checks if the
     * protocol of the target group is HTTP or HTTPS. The GENEVE, TLS, UDP, and TCP_UDP protocols are
     * not supported for health checks.
     */
    override fun healthCheckProtocol(healthCheckProtocol: String) {
      cdkBuilder.healthCheckProtocol(healthCheckProtocol)
    }

    /**
     * @param healthCheckTimeoutSeconds The amount of time, in seconds, during which no response
     * from a target means a failed health check.
     * The range is 2–120 seconds. For target groups with a protocol of HTTP, the default is 6
     * seconds. For target groups with a protocol of TCP, TLS or HTTPS, the default is 10 seconds. For
     * target groups with a protocol of GENEVE, the default is 5 seconds. If the target type is
     * `lambda` , the default is 30 seconds.
     */
    override fun healthCheckTimeoutSeconds(healthCheckTimeoutSeconds: Number) {
      cdkBuilder.healthCheckTimeoutSeconds(healthCheckTimeoutSeconds)
    }

    /**
     * @param healthyThresholdCount The number of consecutive health check successes required before
     * considering a target healthy.
     * The range is 2-10. If the target group protocol is TCP, TCP_UDP, UDP, TLS, HTTP or HTTPS, the
     * default is 5. For target groups with a protocol of GENEVE, the default is 5. If the target type
     * is `lambda` , the default is 5.
     */
    override fun healthyThresholdCount(healthyThresholdCount: Number) {
      cdkBuilder.healthyThresholdCount(healthyThresholdCount)
    }

    /**
     * @param ipAddressType The type of IP address used for this target group.
     * The possible values are `ipv4` and `ipv6` . This is an optional parameter. If not specified,
     * the IP address type defaults to `ipv4` .
     */
    override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

    /**
     * @param matcher [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a
     * successful response from a target.
     * For target groups with a protocol of TCP, TCP_UDP, UDP or TLS the range is 200-599. For
     * target groups with a protocol of HTTP or HTTPS, the range is 200-499. For target groups with a
     * protocol of GENEVE, the range is 200-399.
     */
    override fun matcher(matcher: IResolvable) {
      cdkBuilder.matcher(matcher.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param matcher [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a
     * successful response from a target.
     * For target groups with a protocol of TCP, TCP_UDP, UDP or TLS the range is 200-599. For
     * target groups with a protocol of HTTP or HTTPS, the range is 200-499. For target groups with a
     * protocol of GENEVE, the range is 200-399.
     */
    override fun matcher(matcher: CfnTargetGroup.MatcherProperty) {
      cdkBuilder.matcher(matcher.let(CfnTargetGroup.MatcherProperty.Companion::unwrap))
    }

    /**
     * @param matcher [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a
     * successful response from a target.
     * For target groups with a protocol of TCP, TCP_UDP, UDP or TLS the range is 200-599. For
     * target groups with a protocol of HTTP or HTTPS, the range is 200-499. For target groups with a
     * protocol of GENEVE, the range is 200-399.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("416c71eccd26db2c39cf20fe0dccd7d456308f17ecd8926f38c832132c97d22e")
    override fun matcher(matcher: CfnTargetGroup.MatcherProperty.Builder.() -> Unit): Unit =
        matcher(CfnTargetGroup.MatcherProperty(matcher))

    /**
     * @param name The name of the target group.
     * This name must be unique per region per account, can have a maximum of 32 characters, must
     * contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param port The port on which the targets receive traffic.
     * This port is used unless you specify a port override when registering the target. If the
     * target is a Lambda function, this parameter does not apply. If the protocol is GENEVE, the
     * supported port is 6081.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param protocol The protocol to use for routing traffic to the targets.
     * For Application Load Balancers, the supported protocols are HTTP and HTTPS. For Network Load
     * Balancers, the supported protocols are TCP, TLS, UDP, or TCP_UDP. For Gateway Load Balancers,
     * the supported protocol is GENEVE. A TCP_UDP listener must be associated with a TCP_UDP target
     * group. If the target is a Lambda function, this parameter does not apply.
     */
    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    /**
     * @param protocolVersion [HTTP/HTTPS protocol] The protocol version.
     * The possible values are `GRPC` , `HTTP1` , and `HTTP2` .
     */
    override fun protocolVersion(protocolVersion: String) {
      cdkBuilder.protocolVersion(protocolVersion)
    }

    /**
     * @param tags The tags.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param targetGroupAttributes The target group attributes.
     */
    override fun targetGroupAttributes(targetGroupAttributes: IResolvable) {
      cdkBuilder.targetGroupAttributes(targetGroupAttributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param targetGroupAttributes The target group attributes.
     */
    override fun targetGroupAttributes(targetGroupAttributes: List<Any>) {
      cdkBuilder.targetGroupAttributes(targetGroupAttributes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param targetGroupAttributes The target group attributes.
     */
    override fun targetGroupAttributes(vararg targetGroupAttributes: Any): Unit =
        targetGroupAttributes(targetGroupAttributes.toList())

    /**
     * @param targetType The type of target that you must specify when registering targets with this
     * target group.
     * You can't specify targets for a target group using more than one target type.
     *
     * * `instance` - Register targets by instance ID. This is the default value.
     * * `ip` - Register targets by IP address. You can specify IP addresses from the subnets of the
     * virtual private cloud (VPC) for the target group, the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12,
     * and 192.168.0.0/16), and the RFC 6598 range (100.64.0.0/10). You can't specify publicly routable
     * IP addresses.
     * * `lambda` - Register a single Lambda function as a target.
     * * `alb` - Register a single Application Load Balancer as a target.
     */
    override fun targetType(targetType: String) {
      cdkBuilder.targetType(targetType)
    }

    /**
     * @param targets The targets.
     */
    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param targets The targets.
     */
    override fun targets(targets: List<Any>) {
      cdkBuilder.targets(targets.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param targets The targets.
     */
    override fun targets(vararg targets: Any): Unit = targets(targets.toList())

    /**
     * @param unhealthyThresholdCount The number of consecutive health check failures required
     * before considering a target unhealthy.
     * The range is 2-10. If the target group protocol is TCP, TCP_UDP, UDP, TLS, HTTP or HTTPS, the
     * default is 2. For target groups with a protocol of GENEVE, the default is 2. If the target type
     * is `lambda` , the default is 5.
     */
    override fun unhealthyThresholdCount(unhealthyThresholdCount: Number) {
      cdkBuilder.unhealthyThresholdCount(unhealthyThresholdCount)
    }

    /**
     * @param vpcId The identifier of the virtual private cloud (VPC).
     * If the target is a Lambda function, this parameter does not apply. Otherwise, this parameter
     * is required.
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroupProps,
  ) : CdkObject(cdkObject),
      CfnTargetGroupProps {
    /**
     * Indicates whether health checks are enabled.
     *
     * If the target type is `lambda` , health checks are disabled by default but can be enabled. If
     * the target type is `instance` , `ip` , or `alb` , health checks are always enabled and cannot be
     * disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckenabled)
     */
    override fun healthCheckEnabled(): Any? = unwrap(this).getHealthCheckEnabled()

    /**
     * The approximate amount of time, in seconds, between health checks of an individual target.
     *
     * The range is 5-300. If the target group protocol is TCP, TLS, UDP, TCP_UDP, HTTP or HTTPS,
     * the default is 30 seconds. If the target group protocol is GENEVE, the default is 10 seconds. If
     * the target type is `lambda` , the default is 35 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckintervalseconds)
     */
    override fun healthCheckIntervalSeconds(): Number? =
        unwrap(this).getHealthCheckIntervalSeconds()

    /**
     * [HTTP/HTTPS health checks] The destination for health checks on the targets.
     *
     * [HTTP1 or HTTP2 protocol version] The ping path. The default is /.
     *
     * [GRPC protocol version] The path of a custom health check method with the format
     * /package.service/method. The default is / AWS .ALB/healthcheck.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckpath)
     */
    override fun healthCheckPath(): String? = unwrap(this).getHealthCheckPath()

    /**
     * The port the load balancer uses when performing health checks on targets.
     *
     * If the protocol is HTTP, HTTPS, TCP, TLS, UDP, or TCP_UDP, the default is `traffic-port` ,
     * which is the port on which each target receives traffic from the load balancer. If the protocol
     * is GENEVE, the default is port 80.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckport)
     */
    override fun healthCheckPort(): String? = unwrap(this).getHealthCheckPort()

    /**
     * The protocol the load balancer uses when performing health checks on targets.
     *
     * For Application Load Balancers, the default is HTTP. For Network Load Balancers and Gateway
     * Load Balancers, the default is TCP. The TCP protocol is not supported for health checks if the
     * protocol of the target group is HTTP or HTTPS. The GENEVE, TLS, UDP, and TCP_UDP protocols are
     * not supported for health checks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckprotocol)
     */
    override fun healthCheckProtocol(): String? = unwrap(this).getHealthCheckProtocol()

    /**
     * The amount of time, in seconds, during which no response from a target means a failed health
     * check.
     *
     * The range is 2–120 seconds. For target groups with a protocol of HTTP, the default is 6
     * seconds. For target groups with a protocol of TCP, TLS or HTTPS, the default is 10 seconds. For
     * target groups with a protocol of GENEVE, the default is 5 seconds. If the target type is
     * `lambda` , the default is 30 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthchecktimeoutseconds)
     */
    override fun healthCheckTimeoutSeconds(): Number? = unwrap(this).getHealthCheckTimeoutSeconds()

    /**
     * The number of consecutive health check successes required before considering a target
     * healthy.
     *
     * The range is 2-10. If the target group protocol is TCP, TCP_UDP, UDP, TLS, HTTP or HTTPS, the
     * default is 5. For target groups with a protocol of GENEVE, the default is 5. If the target type
     * is `lambda` , the default is 5.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthythresholdcount)
     */
    override fun healthyThresholdCount(): Number? = unwrap(this).getHealthyThresholdCount()

    /**
     * The type of IP address used for this target group.
     *
     * The possible values are `ipv4` and `ipv6` . This is an optional parameter. If not specified,
     * the IP address type defaults to `ipv4` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-ipaddresstype)
     */
    override fun ipAddressType(): String? = unwrap(this).getIpAddressType()

    /**
     * [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a successful
     * response from a target.
     *
     * For target groups with a protocol of TCP, TCP_UDP, UDP or TLS the range is 200-599. For
     * target groups with a protocol of HTTP or HTTPS, the range is 200-499. For target groups with a
     * protocol of GENEVE, the range is 200-399.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-matcher)
     */
    override fun matcher(): Any? = unwrap(this).getMatcher()

    /**
     * The name of the target group.
     *
     * This name must be unique per region per account, can have a maximum of 32 characters, must
     * contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The port on which the targets receive traffic.
     *
     * This port is used unless you specify a port override when registering the target. If the
     * target is a Lambda function, this parameter does not apply. If the protocol is GENEVE, the
     * supported port is 6081.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-port)
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * The protocol to use for routing traffic to the targets.
     *
     * For Application Load Balancers, the supported protocols are HTTP and HTTPS. For Network Load
     * Balancers, the supported protocols are TCP, TLS, UDP, or TCP_UDP. For Gateway Load Balancers,
     * the supported protocol is GENEVE. A TCP_UDP listener must be associated with a TCP_UDP target
     * group. If the target is a Lambda function, this parameter does not apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-protocol)
     */
    override fun protocol(): String? = unwrap(this).getProtocol()

    /**
     * [HTTP/HTTPS protocol] The protocol version.
     *
     * The possible values are `GRPC` , `HTTP1` , and `HTTP2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-protocolversion)
     */
    override fun protocolVersion(): String? = unwrap(this).getProtocolVersion()

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The target group attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattributes)
     */
    override fun targetGroupAttributes(): Any? = unwrap(this).getTargetGroupAttributes()

    /**
     * The type of target that you must specify when registering targets with this target group.
     *
     * You can't specify targets for a target group using more than one target type.
     *
     * * `instance` - Register targets by instance ID. This is the default value.
     * * `ip` - Register targets by IP address. You can specify IP addresses from the subnets of the
     * virtual private cloud (VPC) for the target group, the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12,
     * and 192.168.0.0/16), and the RFC 6598 range (100.64.0.0/10). You can't specify publicly routable
     * IP addresses.
     * * `lambda` - Register a single Lambda function as a target.
     * * `alb` - Register a single Application Load Balancer as a target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targettype)
     */
    override fun targetType(): String? = unwrap(this).getTargetType()

    /**
     * The targets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targets)
     */
    override fun targets(): Any? = unwrap(this).getTargets()

    /**
     * The number of consecutive health check failures required before considering a target
     * unhealthy.
     *
     * The range is 2-10. If the target group protocol is TCP, TCP_UDP, UDP, TLS, HTTP or HTTPS, the
     * default is 2. For target groups with a protocol of GENEVE, the default is 2. If the target type
     * is `lambda` , the default is 5.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-unhealthythresholdcount)
     */
    override fun unhealthyThresholdCount(): Number? = unwrap(this).getUnhealthyThresholdCount()

    /**
     * The identifier of the virtual private cloud (VPC).
     *
     * If the target is a Lambda function, this parameter does not apply. Otherwise, this parameter
     * is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-vpcid)
     */
    override fun vpcId(): String? = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTargetGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroupProps):
        CfnTargetGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnTargetGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTargetGroupProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroupProps
  }
}
