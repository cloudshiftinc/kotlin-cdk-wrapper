@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.resourcegroups

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.resourcegroups.CfnGroup
import software.constructs.Construct

@CdkDslMarker
public class CfnGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnGroup.Builder = CfnGroup.Builder.create(scope, id)

  private val _configuration: MutableList<Any> = mutableListOf()

  private val _resources: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun configuration(vararg configuration: Any) {
    _configuration.addAll(listOf(*configuration))
  }

  public fun configuration(configuration: Collection<Any>) {
    _configuration.addAll(configuration)
  }

  public fun configuration(configuration: IResolvable) {
    cdkBuilder.configuration(configuration)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun resourceQuery(resourceQuery: IResolvable) {
    cdkBuilder.resourceQuery(resourceQuery)
  }

  public fun resourceQuery(resourceQuery: CfnGroup.ResourceQueryProperty) {
    cdkBuilder.resourceQuery(resourceQuery)
  }

  public fun resources(vararg resources: String) {
    _resources.addAll(listOf(*resources))
  }

  public fun resources(resources: Collection<String>) {
    _resources.addAll(resources)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnGroup {
    if(_configuration.isNotEmpty()) cdkBuilder.configuration(_configuration)
    if(_resources.isNotEmpty()) cdkBuilder.resources(_resources)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
