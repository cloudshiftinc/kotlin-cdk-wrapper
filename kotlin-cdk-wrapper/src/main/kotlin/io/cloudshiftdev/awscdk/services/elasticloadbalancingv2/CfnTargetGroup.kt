@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a target group for an Application Load Balancer, a Network Load Balancer, or a Gateway
 * Load Balancer.
 *
 * Before you register a Lambda function as a target, you must create a `AWS::Lambda::Permission`
 * resource that grants the Elastic Load Balancing service principal permission to invoke the Lambda
 * function.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * CfnTargetGroup cfnTargetGroup = CfnTargetGroup.Builder.create(this, "MyCfnTargetGroup")
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
public open class CfnTargetGroup(
  cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTargetGroupProps,
  ) :
      this(software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTargetGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTargetGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTargetGroupProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the load balancer that routes traffic to this target group.
   */
  public open fun attrLoadBalancerArns(): List<String> = unwrap(this).getAttrLoadBalancerArns()

  /**
   * The Amazon Resource Name (ARN) of the target group.
   */
  public open fun attrTargetGroupArn(): String = unwrap(this).getAttrTargetGroupArn()

  /**
   * The full name of the target group.
   *
   * For example, `targetgroup/my-target-group/cbf133c568e0d028` .
   */
  public open fun attrTargetGroupFullName(): String = unwrap(this).getAttrTargetGroupFullName()

  /**
   * The name of the target group.
   *
   * For example, `my-target-group` .
   */
  public open fun attrTargetGroupName(): String = unwrap(this).getAttrTargetGroupName()

  /**
   * Indicates whether health checks are enabled.
   */
  public open fun healthCheckEnabled(): Any? = unwrap(this).getHealthCheckEnabled()

  /**
   * Indicates whether health checks are enabled.
   */
  public open fun healthCheckEnabled(`value`: Boolean) {
    unwrap(this).setHealthCheckEnabled(`value`)
  }

  /**
   * Indicates whether health checks are enabled.
   */
  public open fun healthCheckEnabled(`value`: IResolvable) {
    unwrap(this).setHealthCheckEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The approximate amount of time, in seconds, between health checks of an individual target.
   */
  public open fun healthCheckIntervalSeconds(): Number? =
      unwrap(this).getHealthCheckIntervalSeconds()

  /**
   * The approximate amount of time, in seconds, between health checks of an individual target.
   */
  public open fun healthCheckIntervalSeconds(`value`: Number) {
    unwrap(this).setHealthCheckIntervalSeconds(`value`)
  }

  /**
   * [HTTP/HTTPS health checks] The destination for health checks on the targets.
   */
  public open fun healthCheckPath(): String? = unwrap(this).getHealthCheckPath()

  /**
   * [HTTP/HTTPS health checks] The destination for health checks on the targets.
   */
  public open fun healthCheckPath(`value`: String) {
    unwrap(this).setHealthCheckPath(`value`)
  }

  /**
   * The port the load balancer uses when performing health checks on targets.
   */
  public open fun healthCheckPort(): String? = unwrap(this).getHealthCheckPort()

  /**
   * The port the load balancer uses when performing health checks on targets.
   */
  public open fun healthCheckPort(`value`: String) {
    unwrap(this).setHealthCheckPort(`value`)
  }

  /**
   * The protocol the load balancer uses when performing health checks on targets.
   */
  public open fun healthCheckProtocol(): String? = unwrap(this).getHealthCheckProtocol()

  /**
   * The protocol the load balancer uses when performing health checks on targets.
   */
  public open fun healthCheckProtocol(`value`: String) {
    unwrap(this).setHealthCheckProtocol(`value`)
  }

  /**
   * The amount of time, in seconds, during which no response from a target means a failed health
   * check.
   */
  public open fun healthCheckTimeoutSeconds(): Number? = unwrap(this).getHealthCheckTimeoutSeconds()

  /**
   * The amount of time, in seconds, during which no response from a target means a failed health
   * check.
   */
  public open fun healthCheckTimeoutSeconds(`value`: Number) {
    unwrap(this).setHealthCheckTimeoutSeconds(`value`)
  }

  /**
   * The number of consecutive health check successes required before considering a target healthy.
   */
  public open fun healthyThresholdCount(): Number? = unwrap(this).getHealthyThresholdCount()

  /**
   * The number of consecutive health check successes required before considering a target healthy.
   */
  public open fun healthyThresholdCount(`value`: Number) {
    unwrap(this).setHealthyThresholdCount(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The type of IP address used for this target group.
   */
  public open fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  /**
   * The type of IP address used for this target group.
   */
  public open fun ipAddressType(`value`: String) {
    unwrap(this).setIpAddressType(`value`)
  }

  /**
   * [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a successful
   * response from a target.
   */
  public open fun matcher(): Any? = unwrap(this).getMatcher()

  /**
   * [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a successful
   * response from a target.
   */
  public open fun matcher(`value`: IResolvable) {
    unwrap(this).setMatcher(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a successful
   * response from a target.
   */
  public open fun matcher(`value`: MatcherProperty) {
    unwrap(this).setMatcher(`value`.let(MatcherProperty.Companion::unwrap))
  }

  /**
   * [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a successful
   * response from a target.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6953856f3003f994e810858fb1c90dfc78aedf88a46fd53642692cffe2eb21c3")
  public open fun matcher(`value`: MatcherProperty.Builder.() -> Unit): Unit =
      matcher(MatcherProperty(`value`))

  /**
   * The name of the target group.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the target group.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The port on which the targets receive traffic.
   */
  public open fun port(): Number? = unwrap(this).getPort()

  /**
   * The port on which the targets receive traffic.
   */
  public open fun port(`value`: Number) {
    unwrap(this).setPort(`value`)
  }

  /**
   * The protocol to use for routing traffic to the targets.
   */
  public open fun protocol(): String? = unwrap(this).getProtocol()

  /**
   * The protocol to use for routing traffic to the targets.
   */
  public open fun protocol(`value`: String) {
    unwrap(this).setProtocol(`value`)
  }

  /**
   * [HTTP/HTTPS protocol] The protocol version.
   */
  public open fun protocolVersion(): String? = unwrap(this).getProtocolVersion()

  /**
   * [HTTP/HTTPS protocol] The protocol version.
   */
  public open fun protocolVersion(`value`: String) {
    unwrap(this).setProtocolVersion(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The attributes.
   */
  public open fun targetGroupAttributes(): Any? = unwrap(this).getTargetGroupAttributes()

  /**
   * The attributes.
   */
  public open fun targetGroupAttributes(`value`: IResolvable) {
    unwrap(this).setTargetGroupAttributes(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The attributes.
   */
  public open fun targetGroupAttributes(`value`: List<Any>) {
    unwrap(this).setTargetGroupAttributes(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The attributes.
   */
  public open fun targetGroupAttributes(vararg `value`: Any): Unit =
      targetGroupAttributes(`value`.toList())

  /**
   * The type of target that you must specify when registering targets with this target group.
   */
  public open fun targetType(): String? = unwrap(this).getTargetType()

  /**
   * The type of target that you must specify when registering targets with this target group.
   */
  public open fun targetType(`value`: String) {
    unwrap(this).setTargetType(`value`)
  }

  /**
   * The targets.
   */
  public open fun targets(): Any? = unwrap(this).getTargets()

  /**
   * The targets.
   */
  public open fun targets(`value`: IResolvable) {
    unwrap(this).setTargets(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The targets.
   */
  public open fun targets(`value`: List<Any>) {
    unwrap(this).setTargets(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The targets.
   */
  public open fun targets(vararg `value`: Any): Unit = targets(`value`.toList())

  /**
   * The number of consecutive health check failures required before considering a target unhealthy.
   */
  public open fun unhealthyThresholdCount(): Number? = unwrap(this).getUnhealthyThresholdCount()

  /**
   * The number of consecutive health check failures required before considering a target unhealthy.
   */
  public open fun unhealthyThresholdCount(`value`: Number) {
    unwrap(this).setUnhealthyThresholdCount(`value`)
  }

  /**
   * The identifier of the virtual private cloud (VPC).
   */
  public open fun vpcId(): String? = unwrap(this).getVpcId()

  /**
   * The identifier of the virtual private cloud (VPC).
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.CfnTargetGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Indicates whether health checks are enabled.
     *
     * If the target type is `lambda` , health checks are disabled by default but can be enabled. If
     * the target type is `instance` , `ip` , or `alb` , health checks are always enabled and cannot be
     * disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckenabled)
     * @param healthCheckEnabled Indicates whether health checks are enabled. 
     */
    public fun healthCheckEnabled(healthCheckEnabled: Boolean)

    /**
     * Indicates whether health checks are enabled.
     *
     * If the target type is `lambda` , health checks are disabled by default but can be enabled. If
     * the target type is `instance` , `ip` , or `alb` , health checks are always enabled and cannot be
     * disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckenabled)
     * @param healthCheckEnabled Indicates whether health checks are enabled. 
     */
    public fun healthCheckEnabled(healthCheckEnabled: IResolvable)

    /**
     * The approximate amount of time, in seconds, between health checks of an individual target.
     *
     * The range is 5-300. If the target group protocol is TCP, TLS, UDP, TCP_UDP, HTTP or HTTPS,
     * the default is 30 seconds. If the target group protocol is GENEVE, the default is 10 seconds. If
     * the target type is `lambda` , the default is 35 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckintervalseconds)
     * @param healthCheckIntervalSeconds The approximate amount of time, in seconds, between health
     * checks of an individual target. 
     */
    public fun healthCheckIntervalSeconds(healthCheckIntervalSeconds: Number)

    /**
     * [HTTP/HTTPS health checks] The destination for health checks on the targets.
     *
     * [HTTP1 or HTTP2 protocol version] The ping path. The default is /.
     *
     * [GRPC protocol version] The path of a custom health check method with the format
     * /package.service/method. The default is / AWS .ALB/healthcheck.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckpath)
     * @param healthCheckPath [HTTP/HTTPS health checks] The destination for health checks on the
     * targets. 
     */
    public fun healthCheckPath(healthCheckPath: String)

    /**
     * The port the load balancer uses when performing health checks on targets.
     *
     * If the protocol is HTTP, HTTPS, TCP, TLS, UDP, or TCP_UDP, the default is `traffic-port` ,
     * which is the port on which each target receives traffic from the load balancer. If the protocol
     * is GENEVE, the default is port 80.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckport)
     * @param healthCheckPort The port the load balancer uses when performing health checks on
     * targets. 
     */
    public fun healthCheckPort(healthCheckPort: String)

    /**
     * The protocol the load balancer uses when performing health checks on targets.
     *
     * For Application Load Balancers, the default is HTTP. For Network Load Balancers and Gateway
     * Load Balancers, the default is TCP. The TCP protocol is not supported for health checks if the
     * protocol of the target group is HTTP or HTTPS. The GENEVE, TLS, UDP, and TCP_UDP protocols are
     * not supported for health checks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckprotocol)
     * @param healthCheckProtocol The protocol the load balancer uses when performing health checks
     * on targets. 
     */
    public fun healthCheckProtocol(healthCheckProtocol: String)

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
     * @param healthCheckTimeoutSeconds The amount of time, in seconds, during which no response
     * from a target means a failed health check. 
     */
    public fun healthCheckTimeoutSeconds(healthCheckTimeoutSeconds: Number)

    /**
     * The number of consecutive health check successes required before considering a target
     * healthy.
     *
     * The range is 2-10. If the target group protocol is TCP, TCP_UDP, UDP, TLS, HTTP or HTTPS, the
     * default is 5. For target groups with a protocol of GENEVE, the default is 5. If the target type
     * is `lambda` , the default is 5.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthythresholdcount)
     * @param healthyThresholdCount The number of consecutive health check successes required before
     * considering a target healthy. 
     */
    public fun healthyThresholdCount(healthyThresholdCount: Number)

    /**
     * The type of IP address used for this target group.
     *
     * The possible values are `ipv4` and `ipv6` . This is an optional parameter. If not specified,
     * the IP address type defaults to `ipv4` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-ipaddresstype)
     * @param ipAddressType The type of IP address used for this target group. 
     */
    public fun ipAddressType(ipAddressType: String)

    /**
     * [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a successful
     * response from a target.
     *
     * For target groups with a protocol of TCP, TCP_UDP, UDP or TLS the range is 200-599. For
     * target groups with a protocol of HTTP or HTTPS, the range is 200-499. For target groups with a
     * protocol of GENEVE, the range is 200-399.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-matcher)
     * @param matcher [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a
     * successful response from a target. 
     */
    public fun matcher(matcher: IResolvable)

    /**
     * [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a successful
     * response from a target.
     *
     * For target groups with a protocol of TCP, TCP_UDP, UDP or TLS the range is 200-599. For
     * target groups with a protocol of HTTP or HTTPS, the range is 200-499. For target groups with a
     * protocol of GENEVE, the range is 200-399.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-matcher)
     * @param matcher [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a
     * successful response from a target. 
     */
    public fun matcher(matcher: MatcherProperty)

    /**
     * [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a successful
     * response from a target.
     *
     * For target groups with a protocol of TCP, TCP_UDP, UDP or TLS the range is 200-599. For
     * target groups with a protocol of HTTP or HTTPS, the range is 200-499. For target groups with a
     * protocol of GENEVE, the range is 200-399.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-matcher)
     * @param matcher [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a
     * successful response from a target. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33940954ca624bb4d6d5ab1fa461595b5a719f17704474e9f0e09d8e43dede3f")
    public fun matcher(matcher: MatcherProperty.Builder.() -> Unit)

    /**
     * The name of the target group.
     *
     * This name must be unique per region per account, can have a maximum of 32 characters, must
     * contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-name)
     * @param name The name of the target group. 
     */
    public fun name(name: String)

    /**
     * The port on which the targets receive traffic.
     *
     * This port is used unless you specify a port override when registering the target. If the
     * target is a Lambda function, this parameter does not apply. If the protocol is GENEVE, the
     * supported port is 6081.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-port)
     * @param port The port on which the targets receive traffic. 
     */
    public fun port(port: Number)

    /**
     * The protocol to use for routing traffic to the targets.
     *
     * For Application Load Balancers, the supported protocols are HTTP and HTTPS. For Network Load
     * Balancers, the supported protocols are TCP, TLS, UDP, or TCP_UDP. For Gateway Load Balancers,
     * the supported protocol is GENEVE. A TCP_UDP listener must be associated with a TCP_UDP target
     * group. If the target is a Lambda function, this parameter does not apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-protocol)
     * @param protocol The protocol to use for routing traffic to the targets. 
     */
    public fun protocol(protocol: String)

    /**
     * [HTTP/HTTPS protocol] The protocol version.
     *
     * The possible values are `GRPC` , `HTTP1` , and `HTTP2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-protocolversion)
     * @param protocolVersion [HTTP/HTTPS protocol] The protocol version. 
     */
    public fun protocolVersion(protocolVersion: String)

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-tags)
     * @param tags The tags. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-tags)
     * @param tags The tags. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattributes)
     * @param targetGroupAttributes The attributes. 
     */
    public fun targetGroupAttributes(targetGroupAttributes: IResolvable)

    /**
     * The attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattributes)
     * @param targetGroupAttributes The attributes. 
     */
    public fun targetGroupAttributes(targetGroupAttributes: List<Any>)

    /**
     * The attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattributes)
     * @param targetGroupAttributes The attributes. 
     */
    public fun targetGroupAttributes(vararg targetGroupAttributes: Any)

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
     * @param targetType The type of target that you must specify when registering targets with this
     * target group. 
     */
    public fun targetType(targetType: String)

    /**
     * The targets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targets)
     * @param targets The targets. 
     */
    public fun targets(targets: IResolvable)

    /**
     * The targets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targets)
     * @param targets The targets. 
     */
    public fun targets(targets: List<Any>)

    /**
     * The targets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targets)
     * @param targets The targets. 
     */
    public fun targets(vararg targets: Any)

    /**
     * The number of consecutive health check failures required before considering a target
     * unhealthy.
     *
     * The range is 2-10. If the target group protocol is TCP, TCP_UDP, UDP, TLS, HTTP or HTTPS, the
     * default is 2. For target groups with a protocol of GENEVE, the default is 2. If the target type
     * is `lambda` , the default is 5.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-unhealthythresholdcount)
     * @param unhealthyThresholdCount The number of consecutive health check failures required
     * before considering a target unhealthy. 
     */
    public fun unhealthyThresholdCount(unhealthyThresholdCount: Number)

    /**
     * The identifier of the virtual private cloud (VPC).
     *
     * If the target is a Lambda function, this parameter does not apply. Otherwise, this parameter
     * is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-vpcid)
     * @param vpcId The identifier of the virtual private cloud (VPC). 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.Builder.create(scope,
        id)

    /**
     * Indicates whether health checks are enabled.
     *
     * If the target type is `lambda` , health checks are disabled by default but can be enabled. If
     * the target type is `instance` , `ip` , or `alb` , health checks are always enabled and cannot be
     * disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckenabled)
     * @param healthCheckEnabled Indicates whether health checks are enabled. 
     */
    override fun healthCheckEnabled(healthCheckEnabled: Boolean) {
      cdkBuilder.healthCheckEnabled(healthCheckEnabled)
    }

    /**
     * Indicates whether health checks are enabled.
     *
     * If the target type is `lambda` , health checks are disabled by default but can be enabled. If
     * the target type is `instance` , `ip` , or `alb` , health checks are always enabled and cannot be
     * disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckenabled)
     * @param healthCheckEnabled Indicates whether health checks are enabled. 
     */
    override fun healthCheckEnabled(healthCheckEnabled: IResolvable) {
      cdkBuilder.healthCheckEnabled(healthCheckEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * The approximate amount of time, in seconds, between health checks of an individual target.
     *
     * The range is 5-300. If the target group protocol is TCP, TLS, UDP, TCP_UDP, HTTP or HTTPS,
     * the default is 30 seconds. If the target group protocol is GENEVE, the default is 10 seconds. If
     * the target type is `lambda` , the default is 35 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckintervalseconds)
     * @param healthCheckIntervalSeconds The approximate amount of time, in seconds, between health
     * checks of an individual target. 
     */
    override fun healthCheckIntervalSeconds(healthCheckIntervalSeconds: Number) {
      cdkBuilder.healthCheckIntervalSeconds(healthCheckIntervalSeconds)
    }

    /**
     * [HTTP/HTTPS health checks] The destination for health checks on the targets.
     *
     * [HTTP1 or HTTP2 protocol version] The ping path. The default is /.
     *
     * [GRPC protocol version] The path of a custom health check method with the format
     * /package.service/method. The default is / AWS .ALB/healthcheck.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckpath)
     * @param healthCheckPath [HTTP/HTTPS health checks] The destination for health checks on the
     * targets. 
     */
    override fun healthCheckPath(healthCheckPath: String) {
      cdkBuilder.healthCheckPath(healthCheckPath)
    }

    /**
     * The port the load balancer uses when performing health checks on targets.
     *
     * If the protocol is HTTP, HTTPS, TCP, TLS, UDP, or TCP_UDP, the default is `traffic-port` ,
     * which is the port on which each target receives traffic from the load balancer. If the protocol
     * is GENEVE, the default is port 80.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckport)
     * @param healthCheckPort The port the load balancer uses when performing health checks on
     * targets. 
     */
    override fun healthCheckPort(healthCheckPort: String) {
      cdkBuilder.healthCheckPort(healthCheckPort)
    }

    /**
     * The protocol the load balancer uses when performing health checks on targets.
     *
     * For Application Load Balancers, the default is HTTP. For Network Load Balancers and Gateway
     * Load Balancers, the default is TCP. The TCP protocol is not supported for health checks if the
     * protocol of the target group is HTTP or HTTPS. The GENEVE, TLS, UDP, and TCP_UDP protocols are
     * not supported for health checks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthcheckprotocol)
     * @param healthCheckProtocol The protocol the load balancer uses when performing health checks
     * on targets. 
     */
    override fun healthCheckProtocol(healthCheckProtocol: String) {
      cdkBuilder.healthCheckProtocol(healthCheckProtocol)
    }

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
     * @param healthCheckTimeoutSeconds The amount of time, in seconds, during which no response
     * from a target means a failed health check. 
     */
    override fun healthCheckTimeoutSeconds(healthCheckTimeoutSeconds: Number) {
      cdkBuilder.healthCheckTimeoutSeconds(healthCheckTimeoutSeconds)
    }

    /**
     * The number of consecutive health check successes required before considering a target
     * healthy.
     *
     * The range is 2-10. If the target group protocol is TCP, TCP_UDP, UDP, TLS, HTTP or HTTPS, the
     * default is 5. For target groups with a protocol of GENEVE, the default is 5. If the target type
     * is `lambda` , the default is 5.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-healthythresholdcount)
     * @param healthyThresholdCount The number of consecutive health check successes required before
     * considering a target healthy. 
     */
    override fun healthyThresholdCount(healthyThresholdCount: Number) {
      cdkBuilder.healthyThresholdCount(healthyThresholdCount)
    }

    /**
     * The type of IP address used for this target group.
     *
     * The possible values are `ipv4` and `ipv6` . This is an optional parameter. If not specified,
     * the IP address type defaults to `ipv4` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-ipaddresstype)
     * @param ipAddressType The type of IP address used for this target group. 
     */
    override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

    /**
     * [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a successful
     * response from a target.
     *
     * For target groups with a protocol of TCP, TCP_UDP, UDP or TLS the range is 200-599. For
     * target groups with a protocol of HTTP or HTTPS, the range is 200-499. For target groups with a
     * protocol of GENEVE, the range is 200-399.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-matcher)
     * @param matcher [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a
     * successful response from a target. 
     */
    override fun matcher(matcher: IResolvable) {
      cdkBuilder.matcher(matcher.let(IResolvable.Companion::unwrap))
    }

    /**
     * [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a successful
     * response from a target.
     *
     * For target groups with a protocol of TCP, TCP_UDP, UDP or TLS the range is 200-599. For
     * target groups with a protocol of HTTP or HTTPS, the range is 200-499. For target groups with a
     * protocol of GENEVE, the range is 200-399.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-matcher)
     * @param matcher [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a
     * successful response from a target. 
     */
    override fun matcher(matcher: MatcherProperty) {
      cdkBuilder.matcher(matcher.let(MatcherProperty.Companion::unwrap))
    }

    /**
     * [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a successful
     * response from a target.
     *
     * For target groups with a protocol of TCP, TCP_UDP, UDP or TLS the range is 200-599. For
     * target groups with a protocol of HTTP or HTTPS, the range is 200-499. For target groups with a
     * protocol of GENEVE, the range is 200-399.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-matcher)
     * @param matcher [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a
     * successful response from a target. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33940954ca624bb4d6d5ab1fa461595b5a719f17704474e9f0e09d8e43dede3f")
    override fun matcher(matcher: MatcherProperty.Builder.() -> Unit): Unit =
        matcher(MatcherProperty(matcher))

    /**
     * The name of the target group.
     *
     * This name must be unique per region per account, can have a maximum of 32 characters, must
     * contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-name)
     * @param name The name of the target group. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The port on which the targets receive traffic.
     *
     * This port is used unless you specify a port override when registering the target. If the
     * target is a Lambda function, this parameter does not apply. If the protocol is GENEVE, the
     * supported port is 6081.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-port)
     * @param port The port on which the targets receive traffic. 
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * The protocol to use for routing traffic to the targets.
     *
     * For Application Load Balancers, the supported protocols are HTTP and HTTPS. For Network Load
     * Balancers, the supported protocols are TCP, TLS, UDP, or TCP_UDP. For Gateway Load Balancers,
     * the supported protocol is GENEVE. A TCP_UDP listener must be associated with a TCP_UDP target
     * group. If the target is a Lambda function, this parameter does not apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-protocol)
     * @param protocol The protocol to use for routing traffic to the targets. 
     */
    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    /**
     * [HTTP/HTTPS protocol] The protocol version.
     *
     * The possible values are `GRPC` , `HTTP1` , and `HTTP2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-protocolversion)
     * @param protocolVersion [HTTP/HTTPS protocol] The protocol version. 
     */
    override fun protocolVersion(protocolVersion: String) {
      cdkBuilder.protocolVersion(protocolVersion)
    }

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-tags)
     * @param tags The tags. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-tags)
     * @param tags The tags. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattributes)
     * @param targetGroupAttributes The attributes. 
     */
    override fun targetGroupAttributes(targetGroupAttributes: IResolvable) {
      cdkBuilder.targetGroupAttributes(targetGroupAttributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * The attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattributes)
     * @param targetGroupAttributes The attributes. 
     */
    override fun targetGroupAttributes(targetGroupAttributes: List<Any>) {
      cdkBuilder.targetGroupAttributes(targetGroupAttributes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattributes)
     * @param targetGroupAttributes The attributes. 
     */
    override fun targetGroupAttributes(vararg targetGroupAttributes: Any): Unit =
        targetGroupAttributes(targetGroupAttributes.toList())

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
     * @param targetType The type of target that you must specify when registering targets with this
     * target group. 
     */
    override fun targetType(targetType: String) {
      cdkBuilder.targetType(targetType)
    }

    /**
     * The targets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targets)
     * @param targets The targets. 
     */
    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable.Companion::unwrap))
    }

    /**
     * The targets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targets)
     * @param targets The targets. 
     */
    override fun targets(targets: List<Any>) {
      cdkBuilder.targets(targets.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The targets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-targets)
     * @param targets The targets. 
     */
    override fun targets(vararg targets: Any): Unit = targets(targets.toList())

    /**
     * The number of consecutive health check failures required before considering a target
     * unhealthy.
     *
     * The range is 2-10. If the target group protocol is TCP, TCP_UDP, UDP, TLS, HTTP or HTTPS, the
     * default is 2. For target groups with a protocol of GENEVE, the default is 2. If the target type
     * is `lambda` , the default is 5.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-unhealthythresholdcount)
     * @param unhealthyThresholdCount The number of consecutive health check failures required
     * before considering a target unhealthy. 
     */
    override fun unhealthyThresholdCount(unhealthyThresholdCount: Number) {
      cdkBuilder.unhealthyThresholdCount(unhealthyThresholdCount)
    }

    /**
     * The identifier of the virtual private cloud (VPC).
     *
     * If the target is a Lambda function, this parameter does not apply. Otherwise, this parameter
     * is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-targetgroup.html#cfn-elasticloadbalancingv2-targetgroup-vpcid)
     * @param vpcId The identifier of the virtual private cloud (VPC). 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTargetGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTargetGroup(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup):
        CfnTargetGroup = CfnTargetGroup(cdkObject)

    internal fun unwrap(wrapped: CfnTargetGroup):
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup
  }

  /**
   * Specifies the HTTP codes that healthy targets must use when responding to an HTTP health check.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
   * MatcherProperty matcherProperty = MatcherProperty.builder()
   * .grpcCode("grpcCode")
   * .httpCode("httpCode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-matcher.html)
   */
  public interface MatcherProperty {
    /**
     * You can specify values between 0 and 99.
     *
     * You can specify multiple values (for example, "0,1") or a range of values (for example,
     * "0-5"). The default value is 12.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-matcher.html#cfn-elasticloadbalancingv2-targetgroup-matcher-grpccode)
     */
    public fun grpcCode(): String? = unwrap(this).getGrpcCode()

    /**
     * For Application Load Balancers, you can specify values between 200 and 499, with the default
     * value being 200.
     *
     * You can specify multiple values (for example, "200,202") or a range of values (for example,
     * "200-299").
     *
     * For Network Load Balancers, you can specify values between 200 and 599, with the default
     * value being 200-399. You can specify multiple values (for example, "200,202") or a range of
     * values (for example, "200-299").
     *
     * For Gateway Load Balancers, this must be "200–399".
     *
     * Note that when using shorthand syntax, some values such as commas need to be escaped.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-matcher.html#cfn-elasticloadbalancingv2-targetgroup-matcher-httpcode)
     */
    public fun httpCode(): String? = unwrap(this).getHttpCode()

    /**
     * A builder for [MatcherProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param grpcCode You can specify values between 0 and 99.
       * You can specify multiple values (for example, "0,1") or a range of values (for example,
       * "0-5"). The default value is 12.
       */
      public fun grpcCode(grpcCode: String)

      /**
       * @param httpCode For Application Load Balancers, you can specify values between 200 and 499,
       * with the default value being 200.
       * You can specify multiple values (for example, "200,202") or a range of values (for example,
       * "200-299").
       *
       * For Network Load Balancers, you can specify values between 200 and 599, with the default
       * value being 200-399. You can specify multiple values (for example, "200,202") or a range of
       * values (for example, "200-299").
       *
       * For Gateway Load Balancers, this must be "200–399".
       *
       * Note that when using shorthand syntax, some values such as commas need to be escaped.
       */
      public fun httpCode(httpCode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.MatcherProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.MatcherProperty.builder()

      /**
       * @param grpcCode You can specify values between 0 and 99.
       * You can specify multiple values (for example, "0,1") or a range of values (for example,
       * "0-5"). The default value is 12.
       */
      override fun grpcCode(grpcCode: String) {
        cdkBuilder.grpcCode(grpcCode)
      }

      /**
       * @param httpCode For Application Load Balancers, you can specify values between 200 and 499,
       * with the default value being 200.
       * You can specify multiple values (for example, "200,202") or a range of values (for example,
       * "200-299").
       *
       * For Network Load Balancers, you can specify values between 200 and 599, with the default
       * value being 200-399. You can specify multiple values (for example, "200,202") or a range of
       * values (for example, "200-299").
       *
       * For Gateway Load Balancers, this must be "200–399".
       *
       * Note that when using shorthand syntax, some values such as commas need to be escaped.
       */
      override fun httpCode(httpCode: String) {
        cdkBuilder.httpCode(httpCode)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.MatcherProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.MatcherProperty,
    ) : CdkObject(cdkObject), MatcherProperty {
      /**
       * You can specify values between 0 and 99.
       *
       * You can specify multiple values (for example, "0,1") or a range of values (for example,
       * "0-5"). The default value is 12.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-matcher.html#cfn-elasticloadbalancingv2-targetgroup-matcher-grpccode)
       */
      override fun grpcCode(): String? = unwrap(this).getGrpcCode()

      /**
       * For Application Load Balancers, you can specify values between 200 and 499, with the
       * default value being 200.
       *
       * You can specify multiple values (for example, "200,202") or a range of values (for example,
       * "200-299").
       *
       * For Network Load Balancers, you can specify values between 200 and 599, with the default
       * value being 200-399. You can specify multiple values (for example, "200,202") or a range of
       * values (for example, "200-299").
       *
       * For Gateway Load Balancers, this must be "200–399".
       *
       * Note that when using shorthand syntax, some values such as commas need to be escaped.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-matcher.html#cfn-elasticloadbalancingv2-targetgroup-matcher-httpcode)
       */
      override fun httpCode(): String? = unwrap(this).getHttpCode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MatcherProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.MatcherProperty):
          MatcherProperty = CdkObjectWrappers.wrap(cdkObject) as? MatcherProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MatcherProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.MatcherProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.MatcherProperty
    }
  }

  /**
   * Specifies a target to add to a target group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
   * TargetDescriptionProperty targetDescriptionProperty = TargetDescriptionProperty.builder()
   * .id("id")
   * // the properties below are optional
   * .availabilityZone("availabilityZone")
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetdescription.html)
   */
  public interface TargetDescriptionProperty {
    /**
     * An Availability Zone or `all` .
     *
     * This determines whether the target receives traffic from the load balancer nodes in the
     * specified Availability Zone or from all enabled Availability Zones for the load balancer.
     *
     * For Application Load Balancer target groups, the specified Availability Zone value is only
     * applicable when cross-zone load balancing is off. Otherwise the parameter is ignored and treated
     * as `all` .
     *
     * This parameter is not supported if the target type of the target group is `instance` or `alb`
     * .
     *
     * If the target type is `ip` and the IP address is in a subnet of the VPC for the target group,
     * the Availability Zone is automatically detected and this parameter is optional. If the IP
     * address is outside the VPC, this parameter is required.
     *
     * For Application Load Balancer target groups with cross-zone load balancing off, if the target
     * type is `ip` and the IP address is outside of the VPC for the target group, this should be an
     * Availability Zone inside the VPC for the target group.
     *
     * If the target type is `lambda` , this parameter is optional and the only supported value is
     * `all` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetdescription.html#cfn-elasticloadbalancingv2-targetgroup-targetdescription-availabilityzone)
     */
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The ID of the target.
     *
     * If the target type of the target group is `instance` , specify an instance ID. If the target
     * type is `ip` , specify an IP address. If the target type is `lambda` , specify the ARN of the
     * Lambda function. If the target type is `alb` , specify the ARN of the Application Load Balancer
     * target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetdescription.html#cfn-elasticloadbalancingv2-targetgroup-targetdescription-id)
     */
    public fun id(): String

    /**
     * The port on which the target is listening.
     *
     * If the target group protocol is GENEVE, the supported port is 6081. If the target type is
     * `alb` , the targeted Application Load Balancer must have at least one listener whose port
     * matches the target group port. This parameter is not used if the target is a Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetdescription.html#cfn-elasticloadbalancingv2-targetgroup-targetdescription-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * A builder for [TargetDescriptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param availabilityZone An Availability Zone or `all` .
       * This determines whether the target receives traffic from the load balancer nodes in the
       * specified Availability Zone or from all enabled Availability Zones for the load balancer.
       *
       * For Application Load Balancer target groups, the specified Availability Zone value is only
       * applicable when cross-zone load balancing is off. Otherwise the parameter is ignored and
       * treated as `all` .
       *
       * This parameter is not supported if the target type of the target group is `instance` or
       * `alb` .
       *
       * If the target type is `ip` and the IP address is in a subnet of the VPC for the target
       * group, the Availability Zone is automatically detected and this parameter is optional. If the
       * IP address is outside the VPC, this parameter is required.
       *
       * For Application Load Balancer target groups with cross-zone load balancing off, if the
       * target type is `ip` and the IP address is outside of the VPC for the target group, this should
       * be an Availability Zone inside the VPC for the target group.
       *
       * If the target type is `lambda` , this parameter is optional and the only supported value is
       * `all` .
       */
      public fun availabilityZone(availabilityZone: String)

      /**
       * @param id The ID of the target. 
       * If the target type of the target group is `instance` , specify an instance ID. If the
       * target type is `ip` , specify an IP address. If the target type is `lambda` , specify the ARN
       * of the Lambda function. If the target type is `alb` , specify the ARN of the Application Load
       * Balancer target.
       */
      public fun id(id: String)

      /**
       * @param port The port on which the target is listening.
       * If the target group protocol is GENEVE, the supported port is 6081. If the target type is
       * `alb` , the targeted Application Load Balancer must have at least one listener whose port
       * matches the target group port. This parameter is not used if the target is a Lambda function.
       */
      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetDescriptionProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetDescriptionProperty.builder()

      /**
       * @param availabilityZone An Availability Zone or `all` .
       * This determines whether the target receives traffic from the load balancer nodes in the
       * specified Availability Zone or from all enabled Availability Zones for the load balancer.
       *
       * For Application Load Balancer target groups, the specified Availability Zone value is only
       * applicable when cross-zone load balancing is off. Otherwise the parameter is ignored and
       * treated as `all` .
       *
       * This parameter is not supported if the target type of the target group is `instance` or
       * `alb` .
       *
       * If the target type is `ip` and the IP address is in a subnet of the VPC for the target
       * group, the Availability Zone is automatically detected and this parameter is optional. If the
       * IP address is outside the VPC, this parameter is required.
       *
       * For Application Load Balancer target groups with cross-zone load balancing off, if the
       * target type is `ip` and the IP address is outside of the VPC for the target group, this should
       * be an Availability Zone inside the VPC for the target group.
       *
       * If the target type is `lambda` , this parameter is optional and the only supported value is
       * `all` .
       */
      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      /**
       * @param id The ID of the target. 
       * If the target type of the target group is `instance` , specify an instance ID. If the
       * target type is `ip` , specify an IP address. If the target type is `lambda` , specify the ARN
       * of the Lambda function. If the target type is `alb` , specify the ARN of the Application Load
       * Balancer target.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param port The port on which the target is listening.
       * If the target group protocol is GENEVE, the supported port is 6081. If the target type is
       * `alb` , the targeted Application Load Balancer must have at least one listener whose port
       * matches the target group port. This parameter is not used if the target is a Lambda function.
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetDescriptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetDescriptionProperty,
    ) : CdkObject(cdkObject), TargetDescriptionProperty {
      /**
       * An Availability Zone or `all` .
       *
       * This determines whether the target receives traffic from the load balancer nodes in the
       * specified Availability Zone or from all enabled Availability Zones for the load balancer.
       *
       * For Application Load Balancer target groups, the specified Availability Zone value is only
       * applicable when cross-zone load balancing is off. Otherwise the parameter is ignored and
       * treated as `all` .
       *
       * This parameter is not supported if the target type of the target group is `instance` or
       * `alb` .
       *
       * If the target type is `ip` and the IP address is in a subnet of the VPC for the target
       * group, the Availability Zone is automatically detected and this parameter is optional. If the
       * IP address is outside the VPC, this parameter is required.
       *
       * For Application Load Balancer target groups with cross-zone load balancing off, if the
       * target type is `ip` and the IP address is outside of the VPC for the target group, this should
       * be an Availability Zone inside the VPC for the target group.
       *
       * If the target type is `lambda` , this parameter is optional and the only supported value is
       * `all` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetdescription.html#cfn-elasticloadbalancingv2-targetgroup-targetdescription-availabilityzone)
       */
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      /**
       * The ID of the target.
       *
       * If the target type of the target group is `instance` , specify an instance ID. If the
       * target type is `ip` , specify an IP address. If the target type is `lambda` , specify the ARN
       * of the Lambda function. If the target type is `alb` , specify the ARN of the Application Load
       * Balancer target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetdescription.html#cfn-elasticloadbalancingv2-targetgroup-targetdescription-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The port on which the target is listening.
       *
       * If the target group protocol is GENEVE, the supported port is 6081. If the target type is
       * `alb` , the targeted Application Load Balancer must have at least one listener whose port
       * matches the target group port. This parameter is not used if the target is a Lambda function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetdescription.html#cfn-elasticloadbalancingv2-targetgroup-targetdescription-port)
       */
      override fun port(): Number? = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetDescriptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetDescriptionProperty):
          TargetDescriptionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TargetDescriptionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetDescriptionProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetDescriptionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetDescriptionProperty
    }
  }

  /**
   * Specifies a target group attribute.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
   * TargetGroupAttributeProperty targetGroupAttributeProperty =
   * TargetGroupAttributeProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetgroupattribute.html)
   */
  public interface TargetGroupAttributeProperty {
    /**
     * The name of the attribute.
     *
     * The following attributes are supported by all load balancers:
     *
     * * `deregistration_delay.timeout_seconds` - The amount of time, in seconds, for Elastic Load
     * Balancing to wait before changing the state of a deregistering target from `draining` to
     * `unused` . The range is 0-3600 seconds. The default value is 300 seconds. If the target is a
     * Lambda function, this attribute is not supported.
     * * `stickiness.enabled` - Indicates whether target stickiness is enabled. The value is `true`
     * or `false` . The default is `false` .
     * * `stickiness.type` - Indicates the type of stickiness. The possible values are:
     * * `lb_cookie` and `app_cookie` for Application Load Balancers.
     * * `source_ip` for Network Load Balancers.
     * * `source_ip_dest_ip` and `source_ip_dest_ip_proto` for Gateway Load Balancers.
     *
     * The following attributes are supported by Application Load Balancers and Network Load
     * Balancers:
     *
     * * `load_balancing.cross_zone.enabled` - Indicates whether cross zone load balancing is
     * enabled. The value is `true` , `false` or `use_load_balancer_configuration` . The default is
     * `use_load_balancer_configuration` .
     * * `target_group_health.dns_failover.minimum_healthy_targets.count` - The minimum number of
     * targets that must be healthy. If the number of healthy targets is below this value, mark the
     * zone as unhealthy in DNS, so that traffic is routed only to healthy zones. The possible values
     * are `off` or an integer from 1 to the maximum number of targets. The default is `off` .
     * * `target_group_health.dns_failover.minimum_healthy_targets.percentage` - The minimum
     * percentage of targets that must be healthy. If the percentage of healthy targets is below this
     * value, mark the zone as unhealthy in DNS, so that traffic is routed only to healthy zones. The
     * possible values are `off` or an integer from 1 to 100. The default is `off` .
     * * `target_group_health.unhealthy_state_routing.minimum_healthy_targets.count` - The minimum
     * number of targets that must be healthy. If the number of healthy targets is below this value,
     * send traffic to all targets, including unhealthy targets. The possible values are 1 to the
     * maximum number of targets. The default is 1.
     * * `target_group_health.unhealthy_state_routing.minimum_healthy_targets.percentage` - The
     * minimum percentage of targets that must be healthy. If the percentage of healthy targets is
     * below this value, send traffic to all targets, including unhealthy targets. The possible values
     * are `off` or an integer from 1 to 100. The default is `off` .
     *
     * The following attributes are supported only if the load balancer is an Application Load
     * Balancer and the target is an instance or an IP address:
     *
     * * `load_balancing.algorithm.type` - The load balancing algorithm determines how the load
     * balancer selects targets when routing requests. The value is `round_robin` ,
     * `least_outstanding_requests` , or `weighted_random` . The default is `round_robin` .
     * * `load_balancing.algorithm.anomaly_mitigation` - Only available when
     * `load_balancing.algorithm.type` is `weighted_random` . Indicates whether anomaly mitigation is
     * enabled. The value is `on` or `off` . The default is `off` .
     * * `slow_start.duration_seconds` - The time period, in seconds, during which a newly
     * registered target receives an increasing share of the traffic to the target group. After this
     * time period ends, the target receives its full share of traffic. The range is 30-900 seconds (15
     * minutes). The default is 0 seconds (disabled).
     * * `stickiness.app_cookie.cookie_name` - Indicates the name of the application-based cookie.
     * Names that start with the following prefixes are not allowed: `AWSALB` , `AWSALBAPP` , and
     * `AWSALBTG` ; they're reserved for use by the load balancer.
     * * `stickiness.app_cookie.duration_seconds` - The time period, in seconds, during which
     * requests from a client should be routed to the same target. After this time period expires, the
     * application-based cookie is considered stale. The range is 1 second to 1 week (604800 seconds).
     * The default value is 1 day (86400 seconds).
     * * `stickiness.lb_cookie.duration_seconds` - The time period, in seconds, during which
     * requests from a client should be routed to the same target. After this time period expires, the
     * load balancer-generated cookie is considered stale. The range is 1 second to 1 week (604800
     * seconds). The default value is 1 day (86400 seconds).
     *
     * The following attribute is supported only if the load balancer is an Application Load
     * Balancer and the target is a Lambda function:
     *
     * * `lambda.multi_value_headers.enabled` - Indicates whether the request and response headers
     * that are exchanged between the load balancer and the Lambda function include arrays of values or
     * strings. The value is `true` or `false` . The default is `false` . If the value is `false` and
     * the request contains a duplicate header field name or query parameter key, the load balancer
     * uses the last value sent by the client.
     *
     * The following attributes are supported only by Network Load Balancers:
     *
     * * `deregistration_delay.connection_termination.enabled` - Indicates whether the load balancer
     * terminates connections at the end of the deregistration timeout. The value is `true` or `false`
     * . For new UDP/TCP_UDP target groups the default is `true` . Otherwise, the default is `false` .
     * * `preserve_client_ip.enabled` - Indicates whether client IP preservation is enabled. The
     * value is `true` or `false` . The default is disabled if the target group type is IP address and
     * the target group protocol is TCP or TLS. Otherwise, the default is enabled. Client IP
     * preservation cannot be disabled for UDP and TCP_UDP target groups.
     * * `proxy_protocol_v2.enabled` - Indicates whether Proxy Protocol version 2 is enabled. The
     * value is `true` or `false` . The default is `false` .
     * * `target_health_state.unhealthy.connection_termination.enabled` - Indicates whether the load
     * balancer terminates connections to unhealthy targets. The value is `true` or `false` . The
     * default is `true` .
     * * `target_health_state.unhealthy.draining_interval_seconds` - The amount of time for Elastic
     * Load Balancing to wait before changing the state of an unhealthy target from
     * `unhealthy.draining` to `unhealthy` . The range is 0-360000 seconds. The default value is 0
     * seconds.
     *
     * Note: This attribute can only be configured when
     * `target_health_state.unhealthy.connection_termination.enabled` is `false` .
     *
     * The following attributes are supported only by Gateway Load Balancers:
     *
     * * `target_failover.on_deregistration` - Indicates how the Gateway Load Balancer handles
     * existing flows when a target is deregistered. The possible values are `rebalance` and
     * `no_rebalance` . The default is `no_rebalance` . The two attributes (
     * `target_failover.on_deregistration` and `target_failover.on_unhealthy` ) can't be set
     * independently. The value you set for both attributes must be the same.
     * * `target_failover.on_unhealthy` - Indicates how the Gateway Load Balancer handles existing
     * flows when a target is unhealthy. The possible values are `rebalance` and `no_rebalance` . The
     * default is `no_rebalance` . The two attributes ( `target_failover.on_deregistration` and
     * `target_failover.on_unhealthy` ) cannot be set independently. The value you set for both
     * attributes must be the same.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetgroupattribute.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattribute-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * The value of the attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetgroupattribute.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattribute-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [TargetGroupAttributeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The name of the attribute.
       * The following attributes are supported by all load balancers:
       *
       * * `deregistration_delay.timeout_seconds` - The amount of time, in seconds, for Elastic Load
       * Balancing to wait before changing the state of a deregistering target from `draining` to
       * `unused` . The range is 0-3600 seconds. The default value is 300 seconds. If the target is a
       * Lambda function, this attribute is not supported.
       * * `stickiness.enabled` - Indicates whether target stickiness is enabled. The value is
       * `true` or `false` . The default is `false` .
       * * `stickiness.type` - Indicates the type of stickiness. The possible values are:
       * * `lb_cookie` and `app_cookie` for Application Load Balancers.
       * * `source_ip` for Network Load Balancers.
       * * `source_ip_dest_ip` and `source_ip_dest_ip_proto` for Gateway Load Balancers.
       *
       * The following attributes are supported by Application Load Balancers and Network Load
       * Balancers:
       *
       * * `load_balancing.cross_zone.enabled` - Indicates whether cross zone load balancing is
       * enabled. The value is `true` , `false` or `use_load_balancer_configuration` . The default is
       * `use_load_balancer_configuration` .
       * * `target_group_health.dns_failover.minimum_healthy_targets.count` - The minimum number of
       * targets that must be healthy. If the number of healthy targets is below this value, mark the
       * zone as unhealthy in DNS, so that traffic is routed only to healthy zones. The possible values
       * are `off` or an integer from 1 to the maximum number of targets. The default is `off` .
       * * `target_group_health.dns_failover.minimum_healthy_targets.percentage` - The minimum
       * percentage of targets that must be healthy. If the percentage of healthy targets is below this
       * value, mark the zone as unhealthy in DNS, so that traffic is routed only to healthy zones. The
       * possible values are `off` or an integer from 1 to 100. The default is `off` .
       * * `target_group_health.unhealthy_state_routing.minimum_healthy_targets.count` - The minimum
       * number of targets that must be healthy. If the number of healthy targets is below this value,
       * send traffic to all targets, including unhealthy targets. The possible values are 1 to the
       * maximum number of targets. The default is 1.
       * * `target_group_health.unhealthy_state_routing.minimum_healthy_targets.percentage` - The
       * minimum percentage of targets that must be healthy. If the percentage of healthy targets is
       * below this value, send traffic to all targets, including unhealthy targets. The possible
       * values are `off` or an integer from 1 to 100. The default is `off` .
       *
       * The following attributes are supported only if the load balancer is an Application Load
       * Balancer and the target is an instance or an IP address:
       *
       * * `load_balancing.algorithm.type` - The load balancing algorithm determines how the load
       * balancer selects targets when routing requests. The value is `round_robin` ,
       * `least_outstanding_requests` , or `weighted_random` . The default is `round_robin` .
       * * `load_balancing.algorithm.anomaly_mitigation` - Only available when
       * `load_balancing.algorithm.type` is `weighted_random` . Indicates whether anomaly mitigation is
       * enabled. The value is `on` or `off` . The default is `off` .
       * * `slow_start.duration_seconds` - The time period, in seconds, during which a newly
       * registered target receives an increasing share of the traffic to the target group. After this
       * time period ends, the target receives its full share of traffic. The range is 30-900 seconds
       * (15 minutes). The default is 0 seconds (disabled).
       * * `stickiness.app_cookie.cookie_name` - Indicates the name of the application-based cookie.
       * Names that start with the following prefixes are not allowed: `AWSALB` , `AWSALBAPP` , and
       * `AWSALBTG` ; they're reserved for use by the load balancer.
       * * `stickiness.app_cookie.duration_seconds` - The time period, in seconds, during which
       * requests from a client should be routed to the same target. After this time period expires,
       * the application-based cookie is considered stale. The range is 1 second to 1 week (604800
       * seconds). The default value is 1 day (86400 seconds).
       * * `stickiness.lb_cookie.duration_seconds` - The time period, in seconds, during which
       * requests from a client should be routed to the same target. After this time period expires,
       * the load balancer-generated cookie is considered stale. The range is 1 second to 1 week
       * (604800 seconds). The default value is 1 day (86400 seconds).
       *
       * The following attribute is supported only if the load balancer is an Application Load
       * Balancer and the target is a Lambda function:
       *
       * * `lambda.multi_value_headers.enabled` - Indicates whether the request and response headers
       * that are exchanged between the load balancer and the Lambda function include arrays of values
       * or strings. The value is `true` or `false` . The default is `false` . If the value is `false`
       * and the request contains a duplicate header field name or query parameter key, the load
       * balancer uses the last value sent by the client.
       *
       * The following attributes are supported only by Network Load Balancers:
       *
       * * `deregistration_delay.connection_termination.enabled` - Indicates whether the load
       * balancer terminates connections at the end of the deregistration timeout. The value is `true`
       * or `false` . For new UDP/TCP_UDP target groups the default is `true` . Otherwise, the default
       * is `false` .
       * * `preserve_client_ip.enabled` - Indicates whether client IP preservation is enabled. The
       * value is `true` or `false` . The default is disabled if the target group type is IP address
       * and the target group protocol is TCP or TLS. Otherwise, the default is enabled. Client IP
       * preservation cannot be disabled for UDP and TCP_UDP target groups.
       * * `proxy_protocol_v2.enabled` - Indicates whether Proxy Protocol version 2 is enabled. The
       * value is `true` or `false` . The default is `false` .
       * * `target_health_state.unhealthy.connection_termination.enabled` - Indicates whether the
       * load balancer terminates connections to unhealthy targets. The value is `true` or `false` .
       * The default is `true` .
       * * `target_health_state.unhealthy.draining_interval_seconds` - The amount of time for
       * Elastic Load Balancing to wait before changing the state of an unhealthy target from
       * `unhealthy.draining` to `unhealthy` . The range is 0-360000 seconds. The default value is 0
       * seconds.
       *
       * Note: This attribute can only be configured when
       * `target_health_state.unhealthy.connection_termination.enabled` is `false` .
       *
       * The following attributes are supported only by Gateway Load Balancers:
       *
       * * `target_failover.on_deregistration` - Indicates how the Gateway Load Balancer handles
       * existing flows when a target is deregistered. The possible values are `rebalance` and
       * `no_rebalance` . The default is `no_rebalance` . The two attributes (
       * `target_failover.on_deregistration` and `target_failover.on_unhealthy` ) can't be set
       * independently. The value you set for both attributes must be the same.
       * * `target_failover.on_unhealthy` - Indicates how the Gateway Load Balancer handles existing
       * flows when a target is unhealthy. The possible values are `rebalance` and `no_rebalance` . The
       * default is `no_rebalance` . The two attributes ( `target_failover.on_deregistration` and
       * `target_failover.on_unhealthy` ) cannot be set independently. The value you set for both
       * attributes must be the same.
       */
      public fun key(key: String)

      /**
       * @param value The value of the attribute.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetGroupAttributeProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetGroupAttributeProperty.builder()

      /**
       * @param key The name of the attribute.
       * The following attributes are supported by all load balancers:
       *
       * * `deregistration_delay.timeout_seconds` - The amount of time, in seconds, for Elastic Load
       * Balancing to wait before changing the state of a deregistering target from `draining` to
       * `unused` . The range is 0-3600 seconds. The default value is 300 seconds. If the target is a
       * Lambda function, this attribute is not supported.
       * * `stickiness.enabled` - Indicates whether target stickiness is enabled. The value is
       * `true` or `false` . The default is `false` .
       * * `stickiness.type` - Indicates the type of stickiness. The possible values are:
       * * `lb_cookie` and `app_cookie` for Application Load Balancers.
       * * `source_ip` for Network Load Balancers.
       * * `source_ip_dest_ip` and `source_ip_dest_ip_proto` for Gateway Load Balancers.
       *
       * The following attributes are supported by Application Load Balancers and Network Load
       * Balancers:
       *
       * * `load_balancing.cross_zone.enabled` - Indicates whether cross zone load balancing is
       * enabled. The value is `true` , `false` or `use_load_balancer_configuration` . The default is
       * `use_load_balancer_configuration` .
       * * `target_group_health.dns_failover.minimum_healthy_targets.count` - The minimum number of
       * targets that must be healthy. If the number of healthy targets is below this value, mark the
       * zone as unhealthy in DNS, so that traffic is routed only to healthy zones. The possible values
       * are `off` or an integer from 1 to the maximum number of targets. The default is `off` .
       * * `target_group_health.dns_failover.minimum_healthy_targets.percentage` - The minimum
       * percentage of targets that must be healthy. If the percentage of healthy targets is below this
       * value, mark the zone as unhealthy in DNS, so that traffic is routed only to healthy zones. The
       * possible values are `off` or an integer from 1 to 100. The default is `off` .
       * * `target_group_health.unhealthy_state_routing.minimum_healthy_targets.count` - The minimum
       * number of targets that must be healthy. If the number of healthy targets is below this value,
       * send traffic to all targets, including unhealthy targets. The possible values are 1 to the
       * maximum number of targets. The default is 1.
       * * `target_group_health.unhealthy_state_routing.minimum_healthy_targets.percentage` - The
       * minimum percentage of targets that must be healthy. If the percentage of healthy targets is
       * below this value, send traffic to all targets, including unhealthy targets. The possible
       * values are `off` or an integer from 1 to 100. The default is `off` .
       *
       * The following attributes are supported only if the load balancer is an Application Load
       * Balancer and the target is an instance or an IP address:
       *
       * * `load_balancing.algorithm.type` - The load balancing algorithm determines how the load
       * balancer selects targets when routing requests. The value is `round_robin` ,
       * `least_outstanding_requests` , or `weighted_random` . The default is `round_robin` .
       * * `load_balancing.algorithm.anomaly_mitigation` - Only available when
       * `load_balancing.algorithm.type` is `weighted_random` . Indicates whether anomaly mitigation is
       * enabled. The value is `on` or `off` . The default is `off` .
       * * `slow_start.duration_seconds` - The time period, in seconds, during which a newly
       * registered target receives an increasing share of the traffic to the target group. After this
       * time period ends, the target receives its full share of traffic. The range is 30-900 seconds
       * (15 minutes). The default is 0 seconds (disabled).
       * * `stickiness.app_cookie.cookie_name` - Indicates the name of the application-based cookie.
       * Names that start with the following prefixes are not allowed: `AWSALB` , `AWSALBAPP` , and
       * `AWSALBTG` ; they're reserved for use by the load balancer.
       * * `stickiness.app_cookie.duration_seconds` - The time period, in seconds, during which
       * requests from a client should be routed to the same target. After this time period expires,
       * the application-based cookie is considered stale. The range is 1 second to 1 week (604800
       * seconds). The default value is 1 day (86400 seconds).
       * * `stickiness.lb_cookie.duration_seconds` - The time period, in seconds, during which
       * requests from a client should be routed to the same target. After this time period expires,
       * the load balancer-generated cookie is considered stale. The range is 1 second to 1 week
       * (604800 seconds). The default value is 1 day (86400 seconds).
       *
       * The following attribute is supported only if the load balancer is an Application Load
       * Balancer and the target is a Lambda function:
       *
       * * `lambda.multi_value_headers.enabled` - Indicates whether the request and response headers
       * that are exchanged between the load balancer and the Lambda function include arrays of values
       * or strings. The value is `true` or `false` . The default is `false` . If the value is `false`
       * and the request contains a duplicate header field name or query parameter key, the load
       * balancer uses the last value sent by the client.
       *
       * The following attributes are supported only by Network Load Balancers:
       *
       * * `deregistration_delay.connection_termination.enabled` - Indicates whether the load
       * balancer terminates connections at the end of the deregistration timeout. The value is `true`
       * or `false` . For new UDP/TCP_UDP target groups the default is `true` . Otherwise, the default
       * is `false` .
       * * `preserve_client_ip.enabled` - Indicates whether client IP preservation is enabled. The
       * value is `true` or `false` . The default is disabled if the target group type is IP address
       * and the target group protocol is TCP or TLS. Otherwise, the default is enabled. Client IP
       * preservation cannot be disabled for UDP and TCP_UDP target groups.
       * * `proxy_protocol_v2.enabled` - Indicates whether Proxy Protocol version 2 is enabled. The
       * value is `true` or `false` . The default is `false` .
       * * `target_health_state.unhealthy.connection_termination.enabled` - Indicates whether the
       * load balancer terminates connections to unhealthy targets. The value is `true` or `false` .
       * The default is `true` .
       * * `target_health_state.unhealthy.draining_interval_seconds` - The amount of time for
       * Elastic Load Balancing to wait before changing the state of an unhealthy target from
       * `unhealthy.draining` to `unhealthy` . The range is 0-360000 seconds. The default value is 0
       * seconds.
       *
       * Note: This attribute can only be configured when
       * `target_health_state.unhealthy.connection_termination.enabled` is `false` .
       *
       * The following attributes are supported only by Gateway Load Balancers:
       *
       * * `target_failover.on_deregistration` - Indicates how the Gateway Load Balancer handles
       * existing flows when a target is deregistered. The possible values are `rebalance` and
       * `no_rebalance` . The default is `no_rebalance` . The two attributes (
       * `target_failover.on_deregistration` and `target_failover.on_unhealthy` ) can't be set
       * independently. The value you set for both attributes must be the same.
       * * `target_failover.on_unhealthy` - Indicates how the Gateway Load Balancer handles existing
       * flows when a target is unhealthy. The possible values are `rebalance` and `no_rebalance` . The
       * default is `no_rebalance` . The two attributes ( `target_failover.on_deregistration` and
       * `target_failover.on_unhealthy` ) cannot be set independently. The value you set for both
       * attributes must be the same.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value of the attribute.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetGroupAttributeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetGroupAttributeProperty,
    ) : CdkObject(cdkObject), TargetGroupAttributeProperty {
      /**
       * The name of the attribute.
       *
       * The following attributes are supported by all load balancers:
       *
       * * `deregistration_delay.timeout_seconds` - The amount of time, in seconds, for Elastic Load
       * Balancing to wait before changing the state of a deregistering target from `draining` to
       * `unused` . The range is 0-3600 seconds. The default value is 300 seconds. If the target is a
       * Lambda function, this attribute is not supported.
       * * `stickiness.enabled` - Indicates whether target stickiness is enabled. The value is
       * `true` or `false` . The default is `false` .
       * * `stickiness.type` - Indicates the type of stickiness. The possible values are:
       * * `lb_cookie` and `app_cookie` for Application Load Balancers.
       * * `source_ip` for Network Load Balancers.
       * * `source_ip_dest_ip` and `source_ip_dest_ip_proto` for Gateway Load Balancers.
       *
       * The following attributes are supported by Application Load Balancers and Network Load
       * Balancers:
       *
       * * `load_balancing.cross_zone.enabled` - Indicates whether cross zone load balancing is
       * enabled. The value is `true` , `false` or `use_load_balancer_configuration` . The default is
       * `use_load_balancer_configuration` .
       * * `target_group_health.dns_failover.minimum_healthy_targets.count` - The minimum number of
       * targets that must be healthy. If the number of healthy targets is below this value, mark the
       * zone as unhealthy in DNS, so that traffic is routed only to healthy zones. The possible values
       * are `off` or an integer from 1 to the maximum number of targets. The default is `off` .
       * * `target_group_health.dns_failover.minimum_healthy_targets.percentage` - The minimum
       * percentage of targets that must be healthy. If the percentage of healthy targets is below this
       * value, mark the zone as unhealthy in DNS, so that traffic is routed only to healthy zones. The
       * possible values are `off` or an integer from 1 to 100. The default is `off` .
       * * `target_group_health.unhealthy_state_routing.minimum_healthy_targets.count` - The minimum
       * number of targets that must be healthy. If the number of healthy targets is below this value,
       * send traffic to all targets, including unhealthy targets. The possible values are 1 to the
       * maximum number of targets. The default is 1.
       * * `target_group_health.unhealthy_state_routing.minimum_healthy_targets.percentage` - The
       * minimum percentage of targets that must be healthy. If the percentage of healthy targets is
       * below this value, send traffic to all targets, including unhealthy targets. The possible
       * values are `off` or an integer from 1 to 100. The default is `off` .
       *
       * The following attributes are supported only if the load balancer is an Application Load
       * Balancer and the target is an instance or an IP address:
       *
       * * `load_balancing.algorithm.type` - The load balancing algorithm determines how the load
       * balancer selects targets when routing requests. The value is `round_robin` ,
       * `least_outstanding_requests` , or `weighted_random` . The default is `round_robin` .
       * * `load_balancing.algorithm.anomaly_mitigation` - Only available when
       * `load_balancing.algorithm.type` is `weighted_random` . Indicates whether anomaly mitigation is
       * enabled. The value is `on` or `off` . The default is `off` .
       * * `slow_start.duration_seconds` - The time period, in seconds, during which a newly
       * registered target receives an increasing share of the traffic to the target group. After this
       * time period ends, the target receives its full share of traffic. The range is 30-900 seconds
       * (15 minutes). The default is 0 seconds (disabled).
       * * `stickiness.app_cookie.cookie_name` - Indicates the name of the application-based cookie.
       * Names that start with the following prefixes are not allowed: `AWSALB` , `AWSALBAPP` , and
       * `AWSALBTG` ; they're reserved for use by the load balancer.
       * * `stickiness.app_cookie.duration_seconds` - The time period, in seconds, during which
       * requests from a client should be routed to the same target. After this time period expires,
       * the application-based cookie is considered stale. The range is 1 second to 1 week (604800
       * seconds). The default value is 1 day (86400 seconds).
       * * `stickiness.lb_cookie.duration_seconds` - The time period, in seconds, during which
       * requests from a client should be routed to the same target. After this time period expires,
       * the load balancer-generated cookie is considered stale. The range is 1 second to 1 week
       * (604800 seconds). The default value is 1 day (86400 seconds).
       *
       * The following attribute is supported only if the load balancer is an Application Load
       * Balancer and the target is a Lambda function:
       *
       * * `lambda.multi_value_headers.enabled` - Indicates whether the request and response headers
       * that are exchanged between the load balancer and the Lambda function include arrays of values
       * or strings. The value is `true` or `false` . The default is `false` . If the value is `false`
       * and the request contains a duplicate header field name or query parameter key, the load
       * balancer uses the last value sent by the client.
       *
       * The following attributes are supported only by Network Load Balancers:
       *
       * * `deregistration_delay.connection_termination.enabled` - Indicates whether the load
       * balancer terminates connections at the end of the deregistration timeout. The value is `true`
       * or `false` . For new UDP/TCP_UDP target groups the default is `true` . Otherwise, the default
       * is `false` .
       * * `preserve_client_ip.enabled` - Indicates whether client IP preservation is enabled. The
       * value is `true` or `false` . The default is disabled if the target group type is IP address
       * and the target group protocol is TCP or TLS. Otherwise, the default is enabled. Client IP
       * preservation cannot be disabled for UDP and TCP_UDP target groups.
       * * `proxy_protocol_v2.enabled` - Indicates whether Proxy Protocol version 2 is enabled. The
       * value is `true` or `false` . The default is `false` .
       * * `target_health_state.unhealthy.connection_termination.enabled` - Indicates whether the
       * load balancer terminates connections to unhealthy targets. The value is `true` or `false` .
       * The default is `true` .
       * * `target_health_state.unhealthy.draining_interval_seconds` - The amount of time for
       * Elastic Load Balancing to wait before changing the state of an unhealthy target from
       * `unhealthy.draining` to `unhealthy` . The range is 0-360000 seconds. The default value is 0
       * seconds.
       *
       * Note: This attribute can only be configured when
       * `target_health_state.unhealthy.connection_termination.enabled` is `false` .
       *
       * The following attributes are supported only by Gateway Load Balancers:
       *
       * * `target_failover.on_deregistration` - Indicates how the Gateway Load Balancer handles
       * existing flows when a target is deregistered. The possible values are `rebalance` and
       * `no_rebalance` . The default is `no_rebalance` . The two attributes (
       * `target_failover.on_deregistration` and `target_failover.on_unhealthy` ) can't be set
       * independently. The value you set for both attributes must be the same.
       * * `target_failover.on_unhealthy` - Indicates how the Gateway Load Balancer handles existing
       * flows when a target is unhealthy. The possible values are `rebalance` and `no_rebalance` . The
       * default is `no_rebalance` . The two attributes ( `target_failover.on_deregistration` and
       * `target_failover.on_unhealthy` ) cannot be set independently. The value you set for both
       * attributes must be the same.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetgroupattribute.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattribute-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
       * The value of the attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-targetgroup-targetgroupattribute.html#cfn-elasticloadbalancingv2-targetgroup-targetgroupattribute-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetGroupAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetGroupAttributeProperty):
          TargetGroupAttributeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TargetGroupAttributeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetGroupAttributeProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetGroupAttributeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.TargetGroupAttributeProperty
    }
  }
}
