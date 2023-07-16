@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53recoverycontrol

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanel
import software.constructs.Construct

@CdkDslMarker
public class CfnControlPanelDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnControlPanel.Builder = CfnControlPanel.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun clusterArn(clusterArn: String) {
    cdkBuilder.clusterArn(clusterArn)
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

  public fun build(): CfnControlPanel {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
