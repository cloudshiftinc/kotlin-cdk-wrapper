@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTrafficRoute
import software.amazon.awscdk.CfnTrafficRouting

@CdkDslMarker
public class CfnTrafficRoutingDsl {
  private val cdkBuilder: CfnTrafficRouting.Builder = CfnTrafficRouting.builder()

  private val _targetGroups: MutableList<String> = mutableListOf()

  /**
   * @param prodTrafficRoute The listener to be used by your load balancer to direct traffic to your
   * target groups. 
   */
  public fun prodTrafficRoute(prodTrafficRoute: CfnTrafficRouteDsl.() -> Unit = {}) {
    val builder = CfnTrafficRouteDsl()
    builder.apply(prodTrafficRoute)
    cdkBuilder.prodTrafficRoute(builder.build())
  }

  /**
   * @param prodTrafficRoute The listener to be used by your load balancer to direct traffic to your
   * target groups. 
   */
  public fun prodTrafficRoute(prodTrafficRoute: CfnTrafficRoute) {
    cdkBuilder.prodTrafficRoute(prodTrafficRoute)
  }

  /**
   * @param targetGroups The logical IDs of the blue and green, respectively,
   * AWS::ElasticLoadBalancingV2::TargetGroup target groups. 
   */
  public fun targetGroups(vararg targetGroups: String) {
    _targetGroups.addAll(listOf(*targetGroups))
  }

  /**
   * @param targetGroups The logical IDs of the blue and green, respectively,
   * AWS::ElasticLoadBalancingV2::TargetGroup target groups. 
   */
  public fun targetGroups(targetGroups: Collection<String>) {
    _targetGroups.addAll(targetGroups)
  }

  /**
   * @param testTrafficRoute The listener to be used by your load balancer to direct traffic to your
   * target groups. 
   */
  public fun testTrafficRoute(testTrafficRoute: CfnTrafficRouteDsl.() -> Unit = {}) {
    val builder = CfnTrafficRouteDsl()
    builder.apply(testTrafficRoute)
    cdkBuilder.testTrafficRoute(builder.build())
  }

  /**
   * @param testTrafficRoute The listener to be used by your load balancer to direct traffic to your
   * target groups. 
   */
  public fun testTrafficRoute(testTrafficRoute: CfnTrafficRoute) {
    cdkBuilder.testTrafficRoute(testTrafficRoute)
  }

  public fun build(): CfnTrafficRouting {
    if(_targetGroups.isNotEmpty()) cdkBuilder.targetGroups(_targetGroups)
    return cdkBuilder.build()
  }
}
