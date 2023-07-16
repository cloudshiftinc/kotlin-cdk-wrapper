@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupCookieMatchPatternPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.CookieMatchPatternProperty.Builder =
      CfnRuleGroup.CookieMatchPatternProperty.builder()

  private val _excludedCookies: MutableList<String> = mutableListOf()

  private val _includedCookies: MutableList<String> = mutableListOf()

  public fun all(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.all(builder.map)
  }

  public fun all(all: Any) {
    cdkBuilder.all(all)
  }

  public fun excludedCookies(vararg excludedCookies: String) {
    _excludedCookies.addAll(listOf(*excludedCookies))
  }

  public fun excludedCookies(excludedCookies: Collection<String>) {
    _excludedCookies.addAll(excludedCookies)
  }

  public fun includedCookies(vararg includedCookies: String) {
    _includedCookies.addAll(listOf(*includedCookies))
  }

  public fun includedCookies(includedCookies: Collection<String>) {
    _includedCookies.addAll(includedCookies)
  }

  public fun build(): CfnRuleGroup.CookieMatchPatternProperty {
    if(_excludedCookies.isNotEmpty()) cdkBuilder.excludedCookies(_excludedCookies)
    if(_includedCookies.isNotEmpty()) cdkBuilder.includedCookies(_includedCookies)
    return cdkBuilder.build()
  }
}
