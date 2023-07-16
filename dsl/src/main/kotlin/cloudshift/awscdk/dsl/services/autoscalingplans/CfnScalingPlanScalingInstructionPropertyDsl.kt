@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscalingplans

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan

@CdkDslMarker
public class CfnScalingPlanScalingInstructionPropertyDsl {
  private val cdkBuilder: CfnScalingPlan.ScalingInstructionProperty.Builder =
      CfnScalingPlan.ScalingInstructionProperty.builder()

  private val _targetTrackingConfigurations: MutableList<Any> = mutableListOf()

  public fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: IResolvable) {
    cdkBuilder.customizedLoadMetricSpecification(customizedLoadMetricSpecification)
  }

  public
      fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: CfnScalingPlan.CustomizedLoadMetricSpecificationProperty) {
    cdkBuilder.customizedLoadMetricSpecification(customizedLoadMetricSpecification)
  }

  public fun disableDynamicScaling(disableDynamicScaling: Boolean) {
    cdkBuilder.disableDynamicScaling(disableDynamicScaling)
  }

  public fun disableDynamicScaling(disableDynamicScaling: IResolvable) {
    cdkBuilder.disableDynamicScaling(disableDynamicScaling)
  }

  public fun maxCapacity(maxCapacity: Number) {
    cdkBuilder.maxCapacity(maxCapacity)
  }

  public fun minCapacity(minCapacity: Number) {
    cdkBuilder.minCapacity(minCapacity)
  }

  public fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: IResolvable) {
    cdkBuilder.predefinedLoadMetricSpecification(predefinedLoadMetricSpecification)
  }

  public
      fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: CfnScalingPlan.PredefinedLoadMetricSpecificationProperty) {
    cdkBuilder.predefinedLoadMetricSpecification(predefinedLoadMetricSpecification)
  }

  public fun predictiveScalingMaxCapacityBehavior(predictiveScalingMaxCapacityBehavior: String) {
    cdkBuilder.predictiveScalingMaxCapacityBehavior(predictiveScalingMaxCapacityBehavior)
  }

  public fun predictiveScalingMaxCapacityBuffer(predictiveScalingMaxCapacityBuffer: Number) {
    cdkBuilder.predictiveScalingMaxCapacityBuffer(predictiveScalingMaxCapacityBuffer)
  }

  public fun predictiveScalingMode(predictiveScalingMode: String) {
    cdkBuilder.predictiveScalingMode(predictiveScalingMode)
  }

  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  public fun scalableDimension(scalableDimension: String) {
    cdkBuilder.scalableDimension(scalableDimension)
  }

  public fun scalingPolicyUpdateBehavior(scalingPolicyUpdateBehavior: String) {
    cdkBuilder.scalingPolicyUpdateBehavior(scalingPolicyUpdateBehavior)
  }

  public fun scheduledActionBufferTime(scheduledActionBufferTime: Number) {
    cdkBuilder.scheduledActionBufferTime(scheduledActionBufferTime)
  }

  public fun serviceNamespace(serviceNamespace: String) {
    cdkBuilder.serviceNamespace(serviceNamespace)
  }

  public fun targetTrackingConfigurations(vararg targetTrackingConfigurations: Any) {
    _targetTrackingConfigurations.addAll(listOf(*targetTrackingConfigurations))
  }

  public fun targetTrackingConfigurations(targetTrackingConfigurations: Collection<Any>) {
    _targetTrackingConfigurations.addAll(targetTrackingConfigurations)
  }

  public fun targetTrackingConfigurations(targetTrackingConfigurations: IResolvable) {
    cdkBuilder.targetTrackingConfigurations(targetTrackingConfigurations)
  }

  public fun build(): CfnScalingPlan.ScalingInstructionProperty {
    if(_targetTrackingConfigurations.isNotEmpty())
        cdkBuilder.targetTrackingConfigurations(_targetTrackingConfigurations)
    return cdkBuilder.build()
  }
}
