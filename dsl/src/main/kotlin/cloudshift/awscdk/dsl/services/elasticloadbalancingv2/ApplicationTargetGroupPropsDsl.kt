@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroupProps
import software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget
import software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupLoadBalancingAlgorithmType
import software.amazon.awscdk.services.elasticloadbalancingv2.TargetType

@CdkDslMarker
public class ApplicationTargetGroupPropsDsl {
  private val cdkBuilder: ApplicationTargetGroupProps.Builder =
      ApplicationTargetGroupProps.builder()

  private val _targets: MutableList<IApplicationLoadBalancerTarget> = mutableListOf()

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

  public fun targetType(targetType: TargetType) {
    cdkBuilder.targetType(targetType)
  }

  public fun targets(vararg targets: IApplicationLoadBalancerTarget) {
    _targets.addAll(listOf(*targets))
  }

  public fun targets(targets: Collection<IApplicationLoadBalancerTarget>) {
    _targets.addAll(targets)
  }

  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): ApplicationTargetGroupProps {
    if(_targets.isNotEmpty()) cdkBuilder.targets(_targets)
    return cdkBuilder.build()
  }
}
