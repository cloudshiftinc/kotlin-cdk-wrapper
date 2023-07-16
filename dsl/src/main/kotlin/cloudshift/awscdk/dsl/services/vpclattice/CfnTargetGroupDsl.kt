@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnTargetGroup
import software.constructs.Construct

@CdkDslMarker
public class CfnTargetGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTargetGroup.Builder = CfnTargetGroup.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _targets: MutableList<Any> = mutableListOf()

  public fun config(config: IResolvable) {
    cdkBuilder.config(config)
  }

  public fun config(config: CfnTargetGroup.TargetGroupConfigProperty) {
    cdkBuilder.config(config)
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

  public fun targets(vararg targets: Any) {
    _targets.addAll(listOf(*targets))
  }

  public fun targets(targets: Collection<Any>) {
    _targets.addAll(targets)
  }

  public fun targets(targets: IResolvable) {
    cdkBuilder.targets(targets)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnTargetGroup {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_targets.isNotEmpty()) cdkBuilder.targets(_targets)
    return cdkBuilder.build()
  }
}
