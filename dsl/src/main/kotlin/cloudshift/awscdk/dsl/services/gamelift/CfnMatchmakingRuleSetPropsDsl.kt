@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSetProps

@CdkDslMarker
public class CfnMatchmakingRuleSetPropsDsl {
  private val cdkBuilder: CfnMatchmakingRuleSetProps.Builder = CfnMatchmakingRuleSetProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun ruleSetBody(ruleSetBody: String) {
    cdkBuilder.ruleSetBody(ruleSetBody)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnMatchmakingRuleSetProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
