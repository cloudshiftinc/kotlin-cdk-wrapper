@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@CdkDslMarker
public class CfnScalingPolicyPredictiveScalingConfigurationPropertyDsl {
  private val cdkBuilder: CfnScalingPolicy.PredictiveScalingConfigurationProperty.Builder =
      CfnScalingPolicy.PredictiveScalingConfigurationProperty.builder()

  private val _metricSpecifications: MutableList<Any> = mutableListOf()

  public fun maxCapacityBreachBehavior(maxCapacityBreachBehavior: String) {
    cdkBuilder.maxCapacityBreachBehavior(maxCapacityBreachBehavior)
  }

  public fun maxCapacityBuffer(maxCapacityBuffer: Number) {
    cdkBuilder.maxCapacityBuffer(maxCapacityBuffer)
  }

  public fun metricSpecifications(vararg metricSpecifications: Any) {
    _metricSpecifications.addAll(listOf(*metricSpecifications))
  }

  public fun metricSpecifications(metricSpecifications: Collection<Any>) {
    _metricSpecifications.addAll(metricSpecifications)
  }

  public fun metricSpecifications(metricSpecifications: IResolvable) {
    cdkBuilder.metricSpecifications(metricSpecifications)
  }

  public fun mode(mode: String) {
    cdkBuilder.mode(mode)
  }

  public fun schedulingBufferTime(schedulingBufferTime: Number) {
    cdkBuilder.schedulingBufferTime(schedulingBufferTime)
  }

  public fun build(): CfnScalingPolicy.PredictiveScalingConfigurationProperty {
    if(_metricSpecifications.isNotEmpty()) cdkBuilder.metricSpecifications(_metricSpecifications)
    return cdkBuilder.build()
  }
}
