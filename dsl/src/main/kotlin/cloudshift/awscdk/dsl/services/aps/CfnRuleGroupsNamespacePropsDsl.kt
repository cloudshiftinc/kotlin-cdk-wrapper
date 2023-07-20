@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.aps

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.aps.CfnRuleGroupsNamespaceProps

@CdkDslMarker
public class CfnRuleGroupsNamespacePropsDsl {
  private val cdkBuilder: CfnRuleGroupsNamespaceProps.Builder =
      CfnRuleGroupsNamespaceProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun `data`(`data`: String) {
    cdkBuilder.`data`(`data`)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun workspace(workspace: String) {
    cdkBuilder.workspace(workspace)
  }

  public fun build(): CfnRuleGroupsNamespaceProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
