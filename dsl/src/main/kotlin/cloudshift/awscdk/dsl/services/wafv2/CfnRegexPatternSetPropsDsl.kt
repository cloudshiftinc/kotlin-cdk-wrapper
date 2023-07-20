@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.wafv2.CfnRegexPatternSetProps

@CdkDslMarker
public class CfnRegexPatternSetPropsDsl {
  private val cdkBuilder: CfnRegexPatternSetProps.Builder = CfnRegexPatternSetProps.builder()

  private val _regularExpressionList: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun regularExpressionList(vararg regularExpressionList: String) {
    _regularExpressionList.addAll(listOf(*regularExpressionList))
  }

  public fun regularExpressionList(regularExpressionList: Collection<String>) {
    _regularExpressionList.addAll(regularExpressionList)
  }

  public fun scope(scope: String) {
    cdkBuilder.scope(scope)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnRegexPatternSetProps {
    if(_regularExpressionList.isNotEmpty()) cdkBuilder.regularExpressionList(_regularExpressionList)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
