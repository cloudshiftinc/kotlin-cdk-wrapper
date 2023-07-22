@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@CdkDslMarker
public class EmrCreateClusterAutoScalingPolicyPropertyDsl {
  private val cdkBuilder: EmrCreateCluster.AutoScalingPolicyProperty.Builder =
      EmrCreateCluster.AutoScalingPolicyProperty.builder()

  private val _rules: MutableList<EmrCreateCluster.ScalingRuleProperty> = mutableListOf()

  /**
   * @param constraints The upper and lower EC2 instance limits for an automatic scaling policy. 
   * Automatic scaling activity will not cause an instance
   * group to grow above or below these limits.
   */
  public fun constraints(constraints: EmrCreateClusterScalingConstraintsPropertyDsl.() -> Unit =
      {}) {
    val builder = EmrCreateClusterScalingConstraintsPropertyDsl()
    builder.apply(constraints)
    cdkBuilder.constraints(builder.build())
  }

  /**
   * @param constraints The upper and lower EC2 instance limits for an automatic scaling policy. 
   * Automatic scaling activity will not cause an instance
   * group to grow above or below these limits.
   */
  public fun constraints(constraints: EmrCreateCluster.ScalingConstraintsProperty) {
    cdkBuilder.constraints(constraints)
  }

  /**
   * @param rules The scale-in and scale-out rules that comprise the automatic scaling policy. 
   */
  public fun rules(rules: EmrCreateClusterScalingRulePropertyDsl.() -> Unit) {
    _rules.add(EmrCreateClusterScalingRulePropertyDsl().apply(rules).build())
  }

  /**
   * @param rules The scale-in and scale-out rules that comprise the automatic scaling policy. 
   */
  public fun rules(rules: Collection<EmrCreateCluster.ScalingRuleProperty>) {
    _rules.addAll(rules)
  }

  public fun build(): EmrCreateCluster.AutoScalingPolicyProperty {
    if(_rules.isNotEmpty()) cdkBuilder.rules(_rules)
    return cdkBuilder.build()
  }
}
