@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appconfig.CfnEnvironment
import software.constructs.Construct

@CdkDslMarker
public class CfnEnvironmentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnEnvironment.Builder = CfnEnvironment.Builder.create(scope, id)

  private val _monitors: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnEnvironment.TagsProperty> = mutableListOf()

  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun monitors(vararg monitors: Any) {
    _monitors.addAll(listOf(*monitors))
  }

  public fun monitors(monitors: Collection<Any>) {
    _monitors.addAll(monitors)
  }

  public fun monitors(monitors: IResolvable) {
    cdkBuilder.monitors(monitors)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun tags(tags: CfnEnvironmentTagsPropertyDsl.() -> Unit) {
    _tags.add(CfnEnvironmentTagsPropertyDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnEnvironment.TagsProperty>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnEnvironment {
    if(_monitors.isNotEmpty()) cdkBuilder.monitors(_monitors)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
