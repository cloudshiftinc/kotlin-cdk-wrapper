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

  public fun conditionalBranches(vararg conditionalBranches: Any) {
    _conditionalBranches.addAll(listOf(*conditionalBranches))
  }

  public fun conditionalBranches(conditionalBranches: Collection<Any>) {
    _conditionalBranches.addAll(conditionalBranches)
  }

  public fun conditionalBranches(conditionalBranches: IResolvable) {
    cdkBuilder.conditionalBranches(conditionalBranches)
  }

  public fun defaultBranch(defaultBranch: IResolvable) {
    cdkBuilder.defaultBranch(defaultBranch)
  }

  public fun defaultBranch(defaultBranch: CfnBot.DefaultConditionalBranchProperty) {
    cdkBuilder.defaultBranch(defaultBranch)
  }

  public fun isActive(isActive: Boolean) {
    cdkBuilder.isActive(isActive)
  }

  public fun isActive(isActive: IResolvable) {
    cdkBuilder.isActive(isActive)
  }

  public fun build(): CfnBot.ConditionalSpecificationProperty {
    if(_conditionalBranches.isNotEmpty()) cdkBuilder.conditionalBranches(_conditionalBranches)
    return cdkBuilder.build()
  }
}
