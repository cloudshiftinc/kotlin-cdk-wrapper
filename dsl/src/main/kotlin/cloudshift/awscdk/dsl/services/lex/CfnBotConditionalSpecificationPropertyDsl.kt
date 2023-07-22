@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotConditionalSpecificationPropertyDsl {
  private val cdkBuilder: CfnBot.ConditionalSpecificationProperty.Builder =
      CfnBot.ConditionalSpecificationProperty.builder()

  private val _conditionalBranches: MutableList<Any> = mutableListOf()

  /**
   * @param conditionalBranches A list of conditional branches. 
   * A conditional branch is made up of a condition, a response and a next step. The response and
   * next step are executed when the condition is true.
   */
  public fun conditionalBranches(vararg conditionalBranches: Any) {
    _conditionalBranches.addAll(listOf(*conditionalBranches))
  }

  /**
   * @param conditionalBranches A list of conditional branches. 
   * A conditional branch is made up of a condition, a response and a next step. The response and
   * next step are executed when the condition is true.
   */
  public fun conditionalBranches(conditionalBranches: Collection<Any>) {
    _conditionalBranches.addAll(conditionalBranches)
  }

  /**
   * @param conditionalBranches A list of conditional branches. 
   * A conditional branch is made up of a condition, a response and a next step. The response and
   * next step are executed when the condition is true.
   */
  public fun conditionalBranches(conditionalBranches: IResolvable) {
    cdkBuilder.conditionalBranches(conditionalBranches)
  }

  /**
   * @param defaultBranch The conditional branch that should be followed when the conditions for
   * other branches are not satisfied. 
   * A conditional branch is made up of a condition, a response and a next step.
   */
  public fun defaultBranch(defaultBranch: IResolvable) {
    cdkBuilder.defaultBranch(defaultBranch)
  }

  /**
   * @param defaultBranch The conditional branch that should be followed when the conditions for
   * other branches are not satisfied. 
   * A conditional branch is made up of a condition, a response and a next step.
   */
  public fun defaultBranch(defaultBranch: CfnBot.DefaultConditionalBranchProperty) {
    cdkBuilder.defaultBranch(defaultBranch)
  }

  /**
   * @param isActive Determines whether a conditional branch is active. 
   * When `IsActive` is false, the conditions are not evaluated.
   */
  public fun isActive(isActive: Boolean) {
    cdkBuilder.isActive(isActive)
  }

  /**
   * @param isActive Determines whether a conditional branch is active. 
   * When `IsActive` is false, the conditions are not evaluated.
   */
  public fun isActive(isActive: IResolvable) {
    cdkBuilder.isActive(isActive)
  }

  public fun build(): CfnBot.ConditionalSpecificationProperty {
    if(_conditionalBranches.isNotEmpty()) cdkBuilder.conditionalBranches(_conditionalBranches)
    return cdkBuilder.build()
  }
}
