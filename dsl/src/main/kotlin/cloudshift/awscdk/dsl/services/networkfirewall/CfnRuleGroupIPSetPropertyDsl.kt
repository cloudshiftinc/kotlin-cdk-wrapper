@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupIPSetPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.IPSetProperty.Builder = CfnRuleGroup.IPSetProperty.builder()

  private val _definition: MutableList<String> = mutableListOf()

  public fun definition(vararg definition: String) {
    _definition.addAll(listOf(*definition))
  }

  public fun definition(definition: Collection<String>) {
    _definition.addAll(definition)
  }

  public fun build(): CfnRuleGroup.IPSetProperty {
    if(_definition.isNotEmpty()) cdkBuilder.definition(_definition)
    return cdkBuilder.build()
  }
}
