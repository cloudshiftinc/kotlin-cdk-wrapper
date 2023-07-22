@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnRule

@CdkDslMarker
public class CfnRuleRunCommandParametersPropertyDsl {
  private val cdkBuilder: CfnRule.RunCommandParametersProperty.Builder =
      CfnRule.RunCommandParametersProperty.builder()

  private val _runCommandTargets: MutableList<Any> = mutableListOf()

  /**
   * @param runCommandTargets Currently, we support including only one RunCommandTarget block, which
   * specifies either an array of InstanceIds or a tag. 
   */
  public fun runCommandTargets(vararg runCommandTargets: Any) {
    _runCommandTargets.addAll(listOf(*runCommandTargets))
  }

  /**
   * @param runCommandTargets Currently, we support including only one RunCommandTarget block, which
   * specifies either an array of InstanceIds or a tag. 
   */
  public fun runCommandTargets(runCommandTargets: Collection<Any>) {
    _runCommandTargets.addAll(runCommandTargets)
  }

  /**
   * @param runCommandTargets Currently, we support including only one RunCommandTarget block, which
   * specifies either an array of InstanceIds or a tag. 
   */
  public fun runCommandTargets(runCommandTargets: IResolvable) {
    cdkBuilder.runCommandTargets(runCommandTargets)
  }

  public fun build(): CfnRule.RunCommandParametersProperty {
    if(_runCommandTargets.isNotEmpty()) cdkBuilder.runCommandTargets(_runCommandTargets)
    return cdkBuilder.build()
  }
}
