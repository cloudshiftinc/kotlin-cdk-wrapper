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

/**
 * The filter to use to identify the subset of headers to inspect in a web request.
 *
 * You must specify exactly one setting: either `All` , `IncludedHeaders` , or `ExcludedHeaders` .
 *
 * Example JSON: `"MatchPattern": { "ExcludedHeaders": [ "KeyToExclude1", "KeyToExclude2" ] }`
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * Object all;
 * HeaderMatchPatternProperty headerMatchPatternProperty = HeaderMatchPatternProperty.builder()
 * .all(all)
 * .excludedHeaders(List.of("excludedHeaders"))
 * .includedHeaders(List.of("includedHeaders"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-headermatchpattern.html)
 */
@CdkDslMarker
public class CfnRuleGroupHeaderMatchPatternPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.HeaderMatchPatternProperty.Builder =
      CfnRuleGroup.HeaderMatchPatternProperty.builder()

  private val _excludedHeaders: MutableList<String> = mutableListOf()

  private val _includedHeaders: MutableList<String> = mutableListOf()

  /**
   * @param all Inspect all headers.
   */
  public fun all(all: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(all)
    cdkBuilder.all(builder.map)
  }

  /**
   * @param all Inspect all headers.
   */
  public fun all(all: Any) {
    cdkBuilder.all(all)
  }

  /**
   * @param excludedHeaders Inspect only the headers whose keys don't match any of the strings
   * specified here.
   */
  public fun excludedHeaders(vararg excludedHeaders: String) {
    _excludedHeaders.addAll(listOf(*excludedHeaders))
  }

  /**
   * @param excludedHeaders Inspect only the headers whose keys don't match any of the strings
   * specified here.
   */
  public fun excludedHeaders(excludedHeaders: Collection<String>) {
    _excludedHeaders.addAll(excludedHeaders)
  }

  /**
   * @param includedHeaders Inspect only the headers that have a key that matches one of the strings
   * specified here.
   */
  public fun includedHeaders(vararg includedHeaders: String) {
    _includedHeaders.addAll(listOf(*includedHeaders))
  }

  /**
   * @param includedHeaders Inspect only the headers that have a key that matches one of the strings
   * specified here.
   */
  public fun includedHeaders(includedHeaders: Collection<String>) {
    _includedHeaders.addAll(includedHeaders)
  }

  public fun build(): CfnRuleGroup.HeaderMatchPatternProperty {
    if(_excludedHeaders.isNotEmpty()) cdkBuilder.excludedHeaders(_excludedHeaders)
    if(_includedHeaders.isNotEmpty()) cdkBuilder.includedHeaders(_includedHeaders)
    return cdkBuilder.build()
  }
}
