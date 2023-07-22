@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps
import software.amazon.awscdk.services.elasticloadbalancingv2.TargetType

/**
 * Result of attaching a target to load balancer.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * Object targetJson;
 * LoadBalancerTargetProps loadBalancerTargetProps = LoadBalancerTargetProps.builder()
 * .targetType(TargetType.INSTANCE)
 * // the properties below are optional
 * .targetJson(targetJson)
 * .build();
 * ```
 */
@CdkDslMarker
public class LoadBalancerTargetPropsDsl {
  private val cdkBuilder: LoadBalancerTargetProps.Builder = LoadBalancerTargetProps.builder()

  /**
   * @param targetJson JSON representing the target's direct addition to the TargetGroup list.
   * May be omitted if the target is going to register itself later.
   */
  public fun targetJson(targetJson: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(targetJson)
    cdkBuilder.targetJson(builder.map)
  }

  /**
   * @param targetJson JSON representing the target's direct addition to the TargetGroup list.
   * May be omitted if the target is going to register itself later.
   */
  public fun targetJson(targetJson: Any) {
    cdkBuilder.targetJson(targetJson)
  }

  /**
   * @param targetType What kind of target this is. 
   */
  public fun targetType(targetType: TargetType) {
    cdkBuilder.targetType(targetType)
  }

  public fun build(): LoadBalancerTargetProps = cdkBuilder.build()
}
