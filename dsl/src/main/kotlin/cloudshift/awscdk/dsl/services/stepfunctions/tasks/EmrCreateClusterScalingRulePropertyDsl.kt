@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@CdkDslMarker
public class EmrCreateClusterScalingRulePropertyDsl {
  private val cdkBuilder: EmrCreateCluster.ScalingRuleProperty.Builder =
      EmrCreateCluster.ScalingRuleProperty.builder()

  public fun action(block: EmrCreateClusterScalingActionPropertyDsl.() -> Unit = {}) {
    val builder = EmrCreateClusterScalingActionPropertyDsl()
    builder.apply(block)
    cdkBuilder.action(builder.build())
  }

  public fun action(action: EmrCreateCluster.ScalingActionProperty) {
    cdkBuilder.action(action)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun trigger(block: EmrCreateClusterScalingTriggerPropertyDsl.() -> Unit = {}) {
    val builder = EmrCreateClusterScalingTriggerPropertyDsl()
    builder.apply(block)
    cdkBuilder.trigger(builder.build())
  }

  public fun trigger(trigger: EmrCreateCluster.ScalingTriggerProperty) {
    cdkBuilder.trigger(trigger)
  }

  public fun build(): EmrCreateCluster.ScalingRuleProperty = cdkBuilder.build()
}
