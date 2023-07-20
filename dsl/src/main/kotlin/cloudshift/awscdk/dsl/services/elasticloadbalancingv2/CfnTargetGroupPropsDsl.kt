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

@CdkDslMarker
public class CfnTargetGroupPropsDsl {
  private val cdkBuilder: CfnTargetGroupProps.Builder = CfnTargetGroupProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _targetGroupAttributes: MutableList<Any> = mutableListOf()

  private val _targets: MutableList<Any> = mutableListOf()

  public fun healthCheckEnabled(healthCheckEnabled: Boolean) {
    cdkBuilder.healthCheckEnabled(healthCheckEnabled)
  }

  public fun healthCheckEnabled(healthCheckEnabled: IResolvable) {
    cdkBuilder.healthCheckEnabled(healthCheckEnabled)
  }

  public fun healthCheckIntervalSeconds(healthCheckIntervalSeconds: Number) {
    cdkBuilder.healthCheckIntervalSeconds(healthCheckIntervalSeconds)
  }

  public fun healthCheckPath(healthCheckPath: String) {
    cdkBuilder.healthCheckPath(healthCheckPath)
  }

  public fun healthCheckPort(healthCheckPort: String) {
    cdkBuilder.healthCheckPort(healthCheckPort)
  }

  public fun healthCheckProtocol(healthCheckProtocol: String) {
    cdkBuilder.healthCheckProtocol(healthCheckProtocol)
  }

  public fun healthCheckTimeoutSeconds(healthCheckTimeoutSeconds: Number) {
    cdkBuilder.healthCheckTimeoutSeconds(healthCheckTimeoutSeconds)
  }

  public fun healthyThresholdCount(healthyThresholdCount: Number) {
    cdkBuilder.healthyThresholdCount(healthyThresholdCount)
  }

  public fun ipAddressType(ipAddressType: String) {
    cdkBuilder.ipAddressType(ipAddressType)
  }

  public fun matcher(matcher: IResolvable) {
    cdkBuilder.matcher(matcher)
  }

  public fun matcher(matcher: CfnTargetGroup.MatcherProperty) {
    cdkBuilder.matcher(matcher)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
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

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun targetGroupAttributes(vararg targetGroupAttributes: Any) {
    _targetGroupAttributes.addAll(listOf(*targetGroupAttributes))
  }

  public fun targetGroupAttributes(targetGroupAttributes: Collection<Any>) {
    _targetGroupAttributes.addAll(targetGroupAttributes)
  }

  public fun targetGroupAttributes(targetGroupAttributes: IResolvable) {
    cdkBuilder.targetGroupAttributes(targetGroupAttributes)
  }

  public fun targetType(targetType: String) {
    cdkBuilder.targetType(targetType)
  }

  public fun targets(vararg targets: Any) {
    _targets.addAll(listOf(*targets))
  }

  public fun targets(targets: Collection<Any>) {
    _targets.addAll(targets)
  }

  public fun targets(targets: IResolvable) {
    cdkBuilder.targets(targets)
  }

  public fun unhealthyThresholdCount(unhealthyThresholdCount: Number) {
    cdkBuilder.unhealthyThresholdCount(unhealthyThresholdCount)
  }

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
