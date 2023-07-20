@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions
import software.amazon.awscdk.services.appmesh.TcpTimeout
import software.amazon.awscdk.services.appmesh.WeightedTarget

@CdkDslMarker
public class TcpRouteSpecOptionsDsl {
  private val cdkBuilder: TcpRouteSpecOptions.Builder = TcpRouteSpecOptions.builder()

  private val _weightedTargets: MutableList<WeightedTarget> = mutableListOf()

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun timeout(block: TcpTimeoutDsl.() -> Unit = {}) {
    val builder = TcpTimeoutDsl()
    builder.apply(block)
    cdkBuilder.timeout(builder.build())
  }

  public fun timeout(timeout: TcpTimeout) {
    cdkBuilder.timeout(timeout)
  }

  public fun weightedTargets(weightedTargets: WeightedTargetDsl.() -> Unit) {
    _weightedTargets.add(WeightedTargetDsl().apply(weightedTargets).build())
  }

  public fun weightedTargets(weightedTargets: Collection<WeightedTarget>) {
    _weightedTargets.addAll(weightedTargets)
  }

  public fun build(): TcpRouteSpecOptions {
    if(_weightedTargets.isNotEmpty()) cdkBuilder.weightedTargets(_weightedTargets)
    return cdkBuilder.build()
  }
}
