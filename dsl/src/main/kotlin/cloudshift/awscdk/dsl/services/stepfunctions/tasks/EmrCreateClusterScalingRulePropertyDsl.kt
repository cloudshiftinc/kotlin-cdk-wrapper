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

  /**
   * @param action The conditions that trigger an automatic scaling activity. 
   */
  public fun action(action: EmrCreateClusterScalingActionPropertyDsl.() -> Unit = {}) {
    val builder = EmrCreateClusterScalingActionPropertyDsl()
    builder.apply(action)
    cdkBuilder.action(builder.build())
  }

  /**
   * @param action The conditions that trigger an automatic scaling activity. 
   */
  public fun action(action: EmrCreateCluster.ScalingActionProperty) {
    cdkBuilder.action(action)
  }

  /**
   * @param description A friendly, more verbose description of the automatic scaling rule.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name The name used to identify an automatic scaling rule. 
   * Rule names must be unique within a scaling policy.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param trigger The CloudWatch alarm definition that determines when automatic scaling activity
   * is triggered. 
   */
  public fun trigger(trigger: EmrCreateClusterScalingTriggerPropertyDsl.() -> Unit = {}) {
    val builder = EmrCreateClusterScalingTriggerPropertyDsl()
    builder.apply(trigger)
    cdkBuilder.trigger(builder.build())
  }

  /**
   * @param trigger The CloudWatch alarm definition that determines when automatic scaling activity
   * is triggered. 
   */
  public fun trigger(trigger: EmrCreateCluster.ScalingTriggerProperty) {
    cdkBuilder.trigger(trigger)
  }

  public fun build(): EmrCreateCluster.ScalingRuleProperty = cdkBuilder.build()
}
