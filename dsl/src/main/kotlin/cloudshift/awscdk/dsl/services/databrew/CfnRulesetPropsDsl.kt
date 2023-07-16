@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnRulesetProps

@CdkDslMarker
public class CfnRulesetPropsDsl {
  private val cdkBuilder: CfnRulesetProps.Builder = CfnRulesetProps.builder()

  private val _rules: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun rules(vararg rules: Any) {
    _rules.addAll(listOf(*rules))
  }

  public fun rules(rules: Collection<Any>) {
    _rules.addAll(rules)
  }

  public fun rules(rules: IResolvable) {
    cdkBuilder.rules(rules)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun targetArn(targetArn: String) {
    cdkBuilder.targetArn(targetArn)
  }

  public fun build(): CfnRulesetProps {
    if(_rules.isNotEmpty()) cdkBuilder.rules(_rules)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
