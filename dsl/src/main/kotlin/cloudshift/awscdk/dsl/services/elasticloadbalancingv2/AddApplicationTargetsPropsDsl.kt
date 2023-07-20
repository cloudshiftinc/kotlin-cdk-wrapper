@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetsProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion
import software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget
import software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition
import software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupLoadBalancingAlgorithmType

@CdkDslMarker
public class AddApplicationTargetsPropsDsl {
  private val cdkBuilder: AddApplicationTargetsProps.Builder = AddApplicationTargetsProps.builder()

  private val _conditions: MutableList<ListenerCondition> = mutableListOf()

  private val _targets: MutableList<IApplicationLoadBalancerTarget> = mutableListOf()

  public fun conditions(vararg conditions: ListenerCondition) {
    _conditions.addAll(listOf(*conditions))
  }

  public fun conditions(conditions: Collection<ListenerCondition>) {
    _conditions.addAll(conditions)
  }

  public fun deregistrationDelay(deregistrationDelay: Duration) {
    cdkBuilder.deregistrationDelay(deregistrationDelay)
  }

  public fun healthCheck(block: HealthCheckDsl.() -> Unit = {}) {
    val builder = HealthCheckDsl()
    builder.apply(block)
    cdkBuilder.healthCheck(builder.build())
  }

  public fun healthCheck(healthCheck: HealthCheck) {
    cdkBuilder.healthCheck(healthCheck)
  }

  public
      fun loadBalancingAlgorithmType(loadBalancingAlgorithmType: TargetGroupLoadBalancingAlgorithmType) {
    cdkBuilder.loadBalancingAlgorithmType(loadBalancingAlgorithmType)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun protocol(protocol: ApplicationProtocol) {
    cdkBuilder.protocol(protocol)
  }

  public fun protocolVersion(protocolVersion: ApplicationProtocolVersion) {
    cdkBuilder.protocolVersion(protocolVersion)
  }

  public fun slowStart(slowStart: Duration) {
    cdkBuilder.slowStart(slowStart)
  }

  public fun stickinessCookieDuration(stickinessCookieDuration: Duration) {
    cdkBuilder.stickinessCookieDuration(stickinessCookieDuration)
  }

  public fun stickinessCookieName(stickinessCookieName: String) {
    cdkBuilder.stickinessCookieName(stickinessCookieName)
  }

  public fun targetGroupName(targetGroupName: String) {
    cdkBuilder.targetGroupName(targetGroupName)
  }

  public fun targets(vararg targets: IApplicationLoadBalancerTarget) {
    _targets.addAll(listOf(*targets))
  }

  public fun targets(targets: Collection<IApplicationLoadBalancerTarget>) {
    _targets.addAll(targets)
  }

  public fun build(): AddApplicationTargetsProps {
    if(_conditions.isNotEmpty()) cdkBuilder.conditions(_conditions)
    if(_targets.isNotEmpty()) cdkBuilder.targets(_targets)
    return cdkBuilder.build()
  }
}
