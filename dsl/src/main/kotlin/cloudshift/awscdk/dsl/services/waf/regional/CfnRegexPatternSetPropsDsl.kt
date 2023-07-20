@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.waf.regional.CfnRegexPatternSetProps

@CdkDslMarker
public class CfnRegexPatternSetPropsDsl {
  private val cdkBuilder: CfnRegexPatternSetProps.Builder = CfnRegexPatternSetProps.builder()

  private val _regexPatternStrings: MutableList<String> = mutableListOf()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun regexPatternStrings(vararg regexPatternStrings: String) {
    _regexPatternStrings.addAll(listOf(*regexPatternStrings))
  }

  public fun regexPatternStrings(regexPatternStrings: Collection<String>) {
    _regexPatternStrings.addAll(regexPatternStrings)
  }

  public fun build(): CfnRegexPatternSetProps {
    if(_regexPatternStrings.isNotEmpty()) cdkBuilder.regexPatternStrings(_regexPatternStrings)
    return cdkBuilder.build()
  }
}
