@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

@CdkDslMarker
public class CfnInstanceGroupConfigAutoScalingPolicyPropertyDsl {
  private val cdkBuilder: CfnInstanceGroupConfig.AutoScalingPolicyProperty.Builder =
      CfnInstanceGroupConfig.AutoScalingPolicyProperty.builder()

  private val _rules: MutableList<Any> = mutableListOf()

  /**
   * @param constraints The upper and lower Amazon EC2 instance limits for an automatic scaling
   * policy. 
   * Automatic scaling activity will not cause an instance group to grow above or below these
   * limits.
   */
  public fun constraints(constraints: IResolvable) {
    cdkBuilder.constraints(constraints)
  }

  /**
   * @param constraints The upper and lower Amazon EC2 instance limits for an automatic scaling
   * policy. 
   * Automatic scaling activity will not cause an instance group to grow above or below these
   * limits.
   */
  public fun constraints(constraints: CfnInstanceGroupConfig.ScalingConstraintsProperty) {
    cdkBuilder.constraints(constraints)
  }

  /**
   * @param rules The scale-in and scale-out rules that comprise the automatic scaling policy. 
   */
  public fun rules(vararg rules: Any) {
    _rules.addAll(listOf(*rules))
  }

  /**
   * @param rules The scale-in and scale-out rules that comprise the automatic scaling policy. 
   */
  public fun rules(rules: Collection<Any>) {
    _rules.addAll(rules)
  }

  /**
   * @param rules The scale-in and scale-out rules that comprise the automatic scaling policy. 
   */
  public fun rules(rules: IResolvable) {
    cdkBuilder.rules(rules)
  }

  public fun build(): CfnInstanceGroupConfig.AutoScalingPolicyProperty {
    if(_rules.isNotEmpty()) cdkBuilder.rules(_rules)
    return cdkBuilder.build()
  }
}
