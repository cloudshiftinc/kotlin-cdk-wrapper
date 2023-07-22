@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnPatchBaseline

@CdkDslMarker
public class CfnPatchBaselineRuleGroupPropertyDsl {
  private val cdkBuilder: CfnPatchBaseline.RuleGroupProperty.Builder =
      CfnPatchBaseline.RuleGroupProperty.builder()

  private val _patchRules: MutableList<Any> = mutableListOf()

  /**
   * @param patchRules The rules that make up the rule group.
   */
  public fun patchRules(vararg patchRules: Any) {
    _patchRules.addAll(listOf(*patchRules))
  }

  /**
   * @param patchRules The rules that make up the rule group.
   */
  public fun patchRules(patchRules: Collection<Any>) {
    _patchRules.addAll(patchRules)
  }

  /**
   * @param patchRules The rules that make up the rule group.
   */
  public fun patchRules(patchRules: IResolvable) {
    cdkBuilder.patchRules(patchRules)
  }

  public fun build(): CfnPatchBaseline.RuleGroupProperty {
    if(_patchRules.isNotEmpty()) cdkBuilder.patchRules(_patchRules)
    return cdkBuilder.build()
  }
}
