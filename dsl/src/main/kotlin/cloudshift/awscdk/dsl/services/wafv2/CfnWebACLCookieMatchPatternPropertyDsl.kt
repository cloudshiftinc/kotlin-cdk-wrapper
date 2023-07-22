@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLCookieMatchPatternPropertyDsl {
  private val cdkBuilder: CfnWebACL.CookieMatchPatternProperty.Builder =
      CfnWebACL.CookieMatchPatternProperty.builder()

  private val _excludedCookies: MutableList<String> = mutableListOf()

  private val _includedCookies: MutableList<String> = mutableListOf()

  /**
   * @param all Inspect all cookies.
   */
  public fun all(all: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(all)
    cdkBuilder.all(builder.map)
  }

  /**
   * @param all Inspect all cookies.
   */
  public fun all(all: Any) {
    cdkBuilder.all(all)
  }

  /**
   * @param excludedCookies Inspect only the cookies whose keys don't match any of the strings
   * specified here.
   */
  public fun excludedCookies(vararg excludedCookies: String) {
    _excludedCookies.addAll(listOf(*excludedCookies))
  }

  /**
   * @param excludedCookies Inspect only the cookies whose keys don't match any of the strings
   * specified here.
   */
  public fun excludedCookies(excludedCookies: Collection<String>) {
    _excludedCookies.addAll(excludedCookies)
  }

  /**
   * @param includedCookies Inspect only the cookies that have a key that matches one of the strings
   * specified here.
   */
  public fun includedCookies(vararg includedCookies: String) {
    _includedCookies.addAll(listOf(*includedCookies))
  }

  /**
   * @param includedCookies Inspect only the cookies that have a key that matches one of the strings
   * specified here.
   */
  public fun includedCookies(includedCookies: Collection<String>) {
    _includedCookies.addAll(includedCookies)
  }

  public fun build(): CfnWebACL.CookieMatchPatternProperty {
    if(_excludedCookies.isNotEmpty()) cdkBuilder.excludedCookies(_excludedCookies)
    if(_includedCookies.isNotEmpty()) cdkBuilder.includedCookies(_includedCookies)
    return cdkBuilder.build()
  }
}
