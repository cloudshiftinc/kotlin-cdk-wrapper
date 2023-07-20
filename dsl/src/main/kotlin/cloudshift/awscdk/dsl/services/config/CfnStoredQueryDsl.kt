@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.config.CfnStoredQuery
import software.constructs.Construct

@CdkDslMarker
public class CfnStoredQueryDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnStoredQuery.Builder = CfnStoredQuery.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun queryDescription(queryDescription: String) {
    cdkBuilder.queryDescription(queryDescription)
  }

  public fun queryExpression(queryExpression: String) {
    cdkBuilder.queryExpression(queryExpression)
  }

  public fun queryName(queryName: String) {
    cdkBuilder.queryName(queryName)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnStoredQuery {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
