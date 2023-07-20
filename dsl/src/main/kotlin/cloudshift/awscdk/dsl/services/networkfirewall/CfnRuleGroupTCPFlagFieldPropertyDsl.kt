@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupTCPFlagFieldPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.TCPFlagFieldProperty.Builder =
      CfnRuleGroup.TCPFlagFieldProperty.builder()

  private val _flags: MutableList<String> = mutableListOf()

  private val _masks: MutableList<String> = mutableListOf()

  public fun flags(vararg flags: String) {
    _flags.addAll(listOf(*flags))
  }

  public fun flags(flags: Collection<String>) {
    _flags.addAll(flags)
  }

  public fun masks(vararg masks: String) {
    _masks.addAll(listOf(*masks))
  }

  public fun masks(masks: Collection<String>) {
    _masks.addAll(masks)
  }

  public fun build(): CfnRuleGroup.TCPFlagFieldProperty {
    if(_flags.isNotEmpty()) cdkBuilder.flags(_flags)
    if(_masks.isNotEmpty()) cdkBuilder.masks(_masks)
    return cdkBuilder.build()
  }
}
