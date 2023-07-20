@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling.common

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals
import software.amazon.awscdk.services.autoscaling.common.ScalingInterval

@CdkDslMarker
public class ArbitraryIntervalsDsl {
  private val cdkBuilder: ArbitraryIntervals.Builder = ArbitraryIntervals.builder()

  private val _intervals: MutableList<ScalingInterval> = mutableListOf()

  public fun absolute(absolute: Boolean) {
    cdkBuilder.absolute(absolute)
  }

  public fun intervals(intervals: ScalingIntervalDsl.() -> Unit) {
    _intervals.add(ScalingIntervalDsl().apply(intervals).build())
  }

  public fun intervals(intervals: Collection<ScalingInterval>) {
    _intervals.addAll(intervals)
  }

  public fun build(): ArbitraryIntervals {
    if(_intervals.isNotEmpty()) cdkBuilder.intervals(_intervals)
    return cdkBuilder.build()
  }
}
