@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroupProps

/**
 * Properties for defining a `CfnTargetGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
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
@CdkDslMarker
public class CfnTargetGroupPropsDsl {
  private val cdkBuilder: CfnTargetGroupProps.Builder = CfnTargetGroupProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _targetGroupAttributes: MutableList<Any> = mutableListOf()

  private val _targets: MutableList<Any> = mutableListOf()

  /**
   * @param healthCheckEnabled Indicates whether health checks are enabled.
   * If the target type is `lambda` , health checks are disabled by default but can be enabled. If
   * the target type is `instance` , `ip` , or `alb` , health checks are always enabled and cannot be
   * disabled.
   */
  public fun healthCheckEnabled(healthCheckEnabled: Boolean) {
    cdkBuilder.healthCheckEnabled(healthCheckEnabled)
  }

  /**
   * @param healthCheckEnabled Indicates whether health checks are enabled.
   * If the target type is `lambda` , health checks are disabled by default but can be enabled. If
   * the target type is `instance` , `ip` , or `alb` , health checks are always enabled and cannot be
   * disabled.
   */
  public fun healthCheckEnabled(healthCheckEnabled: IResolvable) {
    cdkBuilder.healthCheckEnabled(healthCheckEnabled)
  }

  /**
   * @param healthCheckIntervalSeconds The approximate amount of time, in seconds, between health
   * checks of an individual target.
   * The range is 5-300. If the target group protocol is TCP, TLS, UDP, TCP_UDP, HTTP or HTTPS, the
   * default is 30 seconds. If the target group protocol is GENEVE, the default is 10 seconds. If the
   * target type is `lambda` , the default is 35 seconds.
   */
  public fun healthCheckIntervalSeconds(healthCheckIntervalSeconds: Number) {
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
  public fun healthCheckPath(healthCheckPath: String) {
    cdkBuilder.healthCheckPath(healthCheckPath)
  }

  /**
   * @param healthCheckPort The port the load balancer uses when performing health checks on
   * targets.
   * If the protocol is HTTP, HTTPS, TCP, TLS, UDP, or TCP_UDP, the default is `traffic-port` ,
   * which is the port on which each target receives traffic from the load balancer. If the protocol is
   * GENEVE, the default is port 80.
   */
  public fun healthCheckPort(healthCheckPort: String) {
    cdkBuilder.healthCheckPort(healthCheckPort)
  }

  /**
   * @param healthCheckProtocol The protocol the load balancer uses when performing health checks on
   * targets.
   * For Application Load Balancers, the default is HTTP. For Network Load Balancers and Gateway
   * Load Balancers, the default is TCP. The TCP protocol is not supported for health checks if the
   * protocol of the target group is HTTP or HTTPS. The GENEVE, TLS, UDP, and TCP_UDP protocols are not
   * supported for health checks.
   */
  public fun healthCheckProtocol(healthCheckProtocol: String) {
    cdkBuilder.healthCheckProtocol(healthCheckProtocol)
  }

  /**
   * @param healthCheckTimeoutSeconds The amount of time, in seconds, during which no response from
   * a target means a failed health check.
   * The range is 2–120 seconds. For target groups with a protocol of HTTP, the default is 6
   * seconds. For target groups with a protocol of TCP, TLS or HTTPS, the default is 10 seconds. For
   * target groups with a protocol of GENEVE, the default is 5 seconds. If the target type is `lambda`
   * , the default is 30 seconds.
   */
  public fun healthCheckTimeoutSeconds(healthCheckTimeoutSeconds: Number) {
    cdkBuilder.healthCheckTimeoutSeconds(healthCheckTimeoutSeconds)
  }

  /**
   * @param healthyThresholdCount The number of consecutive health check successes required before
   * considering a target healthy.
   * The range is 2-10. If the target group protocol is TCP, TCP_UDP, UDP, TLS, HTTP or HTTPS, the
   * default is 5. For target groups with a protocol of GENEVE, the default is 5. If the target type is
   * `lambda` , the default is 5.
   */
  public fun healthyThresholdCount(healthyThresholdCount: Number) {
    cdkBuilder.healthyThresholdCount(healthyThresholdCount)
  }

  /**
   * @param ipAddressType The type of IP address used for this target group.
   * The possible values are `ipv4` and `ipv6` . This is an optional parameter. If not specified,
   * the IP address type defaults to `ipv4` .
   */
  public fun ipAddressType(ipAddressType: String) {
    cdkBuilder.ipAddressType(ipAddressType)
  }

  /**
   * @param matcher [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a
   * successful response from a target.
   * For target groups with a protocol of TCP, TCP_UDP, UDP or TLS the range is 200-599. For target
   * groups with a protocol of HTTP or HTTPS, the range is 200-499. For target groups with a protocol
   * of GENEVE, the range is 200-399.
   */
  public fun matcher(matcher: IResolvable) {
    cdkBuilder.matcher(matcher)
  }

  /**
   * @param matcher [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a
   * successful response from a target.
   * For target groups with a protocol of TCP, TCP_UDP, UDP or TLS the range is 200-599. For target
   * groups with a protocol of HTTP or HTTPS, the range is 200-499. For target groups with a protocol
   * of GENEVE, the range is 200-399.
   */
  public fun matcher(matcher: CfnTargetGroup.MatcherProperty) {
    cdkBuilder.matcher(matcher)
  }

  /**
   * @param name The name of the target group.
   * This name must be unique per region per account, can have a maximum of 32 characters, must
   * contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param port The port on which the targets receive traffic.
   * This port is used unless you specify a port override when registering the target. If the target
   * is a Lambda function, this parameter does not apply. If the protocol is GENEVE, the supported port
   * is 6081.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param protocol The protocol to use for routing traffic to the targets.
   * For Application Load Balancers, the supported protocols are HTTP and HTTPS. For Network Load
   * Balancers, the supported protocols are TCP, TLS, UDP, or TCP_UDP. For Gateway Load Balancers, the
   * supported protocol is GENEVE. A TCP_UDP listener must be associated with a TCP_UDP target group.
   * If the target is a Lambda function, this parameter does not apply.
   */
  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * @param protocolVersion [HTTP/HTTPS protocol] The protocol version.
   * The possible values are `GRPC` , `HTTP1` , and `HTTP2` .
   */
  public fun protocolVersion(protocolVersion: String) {
    cdkBuilder.protocolVersion(protocolVersion)
  }

  /**
   * @param tags The tags.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param targetGroupAttributes The attributes.
   */
  public fun targetGroupAttributes(vararg targetGroupAttributes: Any) {
    _targetGroupAttributes.addAll(listOf(*targetGroupAttributes))
  }

  /**
   * @param targetGroupAttributes The attributes.
   */
  public fun targetGroupAttributes(targetGroupAttributes: Collection<Any>) {
    _targetGroupAttributes.addAll(targetGroupAttributes)
  }

  /**
   * @param targetGroupAttributes The attributes.
   */
  public fun targetGroupAttributes(targetGroupAttributes: IResolvable) {
    cdkBuilder.targetGroupAttributes(targetGroupAttributes)
  }

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
  public fun targetType(targetType: String) {
    cdkBuilder.targetType(targetType)
  }

  /**
   * @param targets The targets.
   */
  public fun targets(vararg targets: Any) {
    _targets.addAll(listOf(*targets))
  }

  /**
   * @param targets The targets.
   */
  public fun targets(targets: Collection<Any>) {
    _targets.addAll(targets)
  }

  /**
   * @param targets The targets.
   */
  public fun targets(targets: IResolvable) {
    cdkBuilder.targets(targets)
  }

  /**
   * @param unhealthyThresholdCount The number of consecutive health check failures required before
   * considering a target unhealthy.
   * The range is 2-10. If the target group protocol is TCP, TCP_UDP, UDP, TLS, HTTP or HTTPS, the
   * default is 2. For target groups with a protocol of GENEVE, the default is 2. If the target type is
   * `lambda` , the default is 5.
   */
  public fun unhealthyThresholdCount(unhealthyThresholdCount: Number) {
    cdkBuilder.unhealthyThresholdCount(unhealthyThresholdCount)
  }

  /**
   * @param vpcId The identifier of the virtual private cloud (VPC).
   * If the target is a Lambda function, this parameter does not apply. Otherwise, this parameter is
   * required.
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnTargetGroupProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_targetGroupAttributes.isNotEmpty()) cdkBuilder.targetGroupAttributes(_targetGroupAttributes)
    if(_targets.isNotEmpty()) cdkBuilder.targets(_targets)
    return cdkBuilder.build()
  }
}
