@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.waf.regional.CfnRegexPatternSet
import software.constructs.Construct

@CdkDslMarker
public class CfnRegexPatternSetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRegexPatternSet.Builder = CfnRegexPatternSet.Builder.create(scope, id)

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

  public fun build(): CfnRegexPatternSet {
    if(_regexPatternStrings.isNotEmpty()) cdkBuilder.regexPatternStrings(_regexPatternStrings)
    return cdkBuilder.build()
  }
}
