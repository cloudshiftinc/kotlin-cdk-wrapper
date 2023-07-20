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

  public fun constraints(constraints: IResolvable) {
    cdkBuilder.constraints(constraints)
  }

  public fun constraints(constraints: CfnInstanceGroupConfig.ScalingConstraintsProperty) {
    cdkBuilder.constraints(constraints)
  }

  public fun rules(vararg rules: Any) {
    _rules.addAll(listOf(*rules))
  }

  public fun rules(rules: Collection<Any>) {
    _rules.addAll(rules)
  }

  public fun rules(rules: IResolvable) {
    cdkBuilder.rules(rules)
  }

  public fun build(): CfnInstanceGroupConfig.AutoScalingPolicyProperty {
    if(_rules.isNotEmpty()) cdkBuilder.rules(_rules)
    return cdkBuilder.build()
  }
}
