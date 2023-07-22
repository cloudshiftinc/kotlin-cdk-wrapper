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

  /**
   * @param data The rules definition file for this namespace. 
   */
  public fun `data`(`data`: String) {
    cdkBuilder.`data`(`data`)
  }

  /**
   * @param name The name of the rule groups namespace. 
   * This property is required.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tags A list of key and value pairs for the workspace resources.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags A list of key and value pairs for the workspace resources.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param workspace The ARN of the workspace that contains this rule groups namespace. 
   */
  public fun workspace(workspace: String) {
    cdkBuilder.workspace(workspace)
  }

  public fun build(): CfnRuleGroupsNamespaceProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
