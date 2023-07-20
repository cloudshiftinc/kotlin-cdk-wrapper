@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticache.CfnParameterGroup
import software.constructs.Construct

@CdkDslMarker
public class CfnParameterGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnParameterGroup.Builder = CfnParameterGroup.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun cacheParameterGroupFamily(cacheParameterGroupFamily: String) {
    cdkBuilder.cacheParameterGroupFamily(cacheParameterGroupFamily)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun properties(properties: Map<String, String>) {
    cdkBuilder.properties(properties)
  }

  public fun properties(properties: IResolvable) {
    cdkBuilder.properties(properties)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnParameterGroup {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
