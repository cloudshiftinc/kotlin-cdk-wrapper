@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.config.CfnStoredQueryProps

@CdkDslMarker
public class CfnStoredQueryPropsDsl {
  private val cdkBuilder: CfnStoredQueryProps.Builder = CfnStoredQueryProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param queryDescription A unique description for the query.
   */
  public fun queryDescription(queryDescription: String) {
    cdkBuilder.queryDescription(queryDescription)
  }

  /**
   * @param queryExpression The expression of the query. 
   * For example, `SELECT resourceId, resourceType,
   * supplementaryConfiguration.BucketVersioningConfiguration.status WHERE resourceType =
   * 'AWS::S3::Bucket' AND supplementaryConfiguration.BucketVersioningConfiguration.status = 'Off'.`
   */
  public fun queryExpression(queryExpression: String) {
    cdkBuilder.queryExpression(queryExpression)
  }

  /**
   * @param queryName The name of the query. 
   */
  public fun queryName(queryName: String) {
    cdkBuilder.queryName(queryName)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnStoredQueryProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
