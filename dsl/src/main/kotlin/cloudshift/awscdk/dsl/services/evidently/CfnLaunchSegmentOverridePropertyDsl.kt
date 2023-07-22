@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.evidently.CfnLaunch

@CdkDslMarker
public class CfnLaunchSegmentOverridePropertyDsl {
  private val cdkBuilder: CfnLaunch.SegmentOverrideProperty.Builder =
      CfnLaunch.SegmentOverrideProperty.builder()

  private val _weights: MutableList<Any> = mutableListOf()

  /**
   * @param evaluationOrder A number indicating the order to use to evaluate segment overrides, if
   * there are more than one. 
   * Segment overrides with lower numbers are evaluated first.
   */
  public fun evaluationOrder(evaluationOrder: Number) {
    cdkBuilder.evaluationOrder(evaluationOrder)
  }

  /**
   * @param segment The ARN of the segment to use for this override. 
   */
  public fun segment(segment: String) {
    cdkBuilder.segment(segment)
  }

  /**
   * @param weights The traffic allocation percentages among the feature variations to assign to
   * this segment. 
   * This is a set of key-value pairs. The keys are variation names. The values represent the amount
   * of traffic to allocate to that variation for this segment. This is expressed in thousandths of a
   * percent, so a weight of 50000 represents 50% of traffic.
   */
  public fun weights(vararg weights: Any) {
    _weights.addAll(listOf(*weights))
  }

  /**
   * @param weights The traffic allocation percentages among the feature variations to assign to
   * this segment. 
   * This is a set of key-value pairs. The keys are variation names. The values represent the amount
   * of traffic to allocate to that variation for this segment. This is expressed in thousandths of a
   * percent, so a weight of 50000 represents 50% of traffic.
   */
  public fun weights(weights: Collection<Any>) {
    _weights.addAll(weights)
  }

  /**
   * @param weights The traffic allocation percentages among the feature variations to assign to
   * this segment. 
   * This is a set of key-value pairs. The keys are variation names. The values represent the amount
   * of traffic to allocate to that variation for this segment. This is expressed in thousandths of a
   * percent, so a weight of 50000 represents 50% of traffic.
   */
  public fun weights(weights: IResolvable) {
    cdkBuilder.weights(weights)
  }

  public fun build(): CfnLaunch.SegmentOverrideProperty {
    if(_weights.isNotEmpty()) cdkBuilder.weights(_weights)
    return cdkBuilder.build()
  }
}
