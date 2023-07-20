@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnSchedulingPolicy

@CdkDslMarker
public class CfnSchedulingPolicyFairsharePolicyPropertyDsl {
  private val cdkBuilder: CfnSchedulingPolicy.FairsharePolicyProperty.Builder =
      CfnSchedulingPolicy.FairsharePolicyProperty.builder()

  private val _shareDistribution: MutableList<Any> = mutableListOf()

  public fun computeReservation(computeReservation: Number) {
    cdkBuilder.computeReservation(computeReservation)
  }

  public fun shareDecaySeconds(shareDecaySeconds: Number) {
    cdkBuilder.shareDecaySeconds(shareDecaySeconds)
  }

  public fun shareDistribution(vararg shareDistribution: Any) {
    _shareDistribution.addAll(listOf(*shareDistribution))
  }

  public fun shareDistribution(shareDistribution: Collection<Any>) {
    _shareDistribution.addAll(shareDistribution)
  }

  public fun shareDistribution(shareDistribution: IResolvable) {
    cdkBuilder.shareDistribution(shareDistribution)
  }

  public fun build(): CfnSchedulingPolicy.FairsharePolicyProperty {
    if(_shareDistribution.isNotEmpty()) cdkBuilder.shareDistribution(_shareDistribution)
    return cdkBuilder.build()
  }
}
