@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnRule

@CdkDslMarker
public class CfnRuleForwardPropertyDsl {
  private val cdkBuilder: CfnRule.ForwardProperty.Builder = CfnRule.ForwardProperty.builder()

  private val _targetGroups: MutableList<Any> = mutableListOf()

  /**
   * @param targetGroups The target groups. 
   * Traffic matching the rule is forwarded to the specified target groups. With forward actions,
   * you can assign a weight that controls the prioritization and selection of each target group. This
   * means that requests are distributed to individual target groups based on their weights. For
   * example, if two target groups have the same weight, each target group receives half of the
   * traffic.
   *
   * The default value is 1. This means that if only one target group is provided, there is no need
   * to set the weight; 100% of traffic will go to that target group.
   */
  public fun targetGroups(vararg targetGroups: Any) {
    _targetGroups.addAll(listOf(*targetGroups))
  }

  /**
   * @param targetGroups The target groups. 
   * Traffic matching the rule is forwarded to the specified target groups. With forward actions,
   * you can assign a weight that controls the prioritization and selection of each target group. This
   * means that requests are distributed to individual target groups based on their weights. For
   * example, if two target groups have the same weight, each target group receives half of the
   * traffic.
   *
   * The default value is 1. This means that if only one target group is provided, there is no need
   * to set the weight; 100% of traffic will go to that target group.
   */
  public fun targetGroups(targetGroups: Collection<Any>) {
    _targetGroups.addAll(targetGroups)
  }

  /**
   * @param targetGroups The target groups. 
   * Traffic matching the rule is forwarded to the specified target groups. With forward actions,
   * you can assign a weight that controls the prioritization and selection of each target group. This
   * means that requests are distributed to individual target groups based on their weights. For
   * example, if two target groups have the same weight, each target group receives half of the
   * traffic.
   *
   * The default value is 1. This means that if only one target group is provided, there is no need
   * to set the weight; 100% of traffic will go to that target group.
   */
  public fun targetGroups(targetGroups: IResolvable) {
    cdkBuilder.targetGroups(targetGroups)
  }

  public fun build(): CfnRule.ForwardProperty {
    if(_targetGroups.isNotEmpty()) cdkBuilder.targetGroups(_targetGroups)
    return cdkBuilder.build()
  }
}
