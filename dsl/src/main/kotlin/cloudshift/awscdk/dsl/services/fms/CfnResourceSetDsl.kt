@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fms

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.fms.CfnResourceSet
import software.constructs.Construct

@CdkDslMarker
public class CfnResourceSetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResourceSet.Builder = CfnResourceSet.Builder.create(scope, id)

  private val _resourceTypeList: MutableList<String> = mutableListOf()

  private val _resources: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun resourceTypeList(vararg resourceTypeList: String) {
    _resourceTypeList.addAll(listOf(*resourceTypeList))
  }

  public fun resourceTypeList(resourceTypeList: Collection<String>) {
    _resourceTypeList.addAll(resourceTypeList)
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

  public fun build(): CfnResourceSet {
    if(_resourceTypeList.isNotEmpty()) cdkBuilder.resourceTypeList(_resourceTypeList)
    if(_resources.isNotEmpty()) cdkBuilder.resources(_resources)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
