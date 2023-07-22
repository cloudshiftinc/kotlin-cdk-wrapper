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

/**
 * Provides the details of a stored query.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * CfnStoredQuery cfnStoredQuery = CfnStoredQuery.Builder.create(this, "MyCfnStoredQuery")
 * .queryExpression("queryExpression")
 * .queryName("queryName")
 * // the properties below are optional
 * .queryDescription("queryDescription")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html)
 */
@CdkDslMarker
public class CfnStoredQueryDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnStoredQuery.Builder = CfnStoredQuery.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * A unique description for the query.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html#cfn-config-storedquery-querydescription)
   * @param queryDescription A unique description for the query. 
   */
  public fun queryDescription(queryDescription: String) {
    cdkBuilder.queryDescription(queryDescription)
  }

  /**
   * The expression of the query.
   *
   * For example, `SELECT resourceId, resourceType,
   * supplementaryConfiguration.BucketVersioningConfiguration.status WHERE resourceType =
   * 'AWS::S3::Bucket' AND supplementaryConfiguration.BucketVersioningConfiguration.status = 'Off'.`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html#cfn-config-storedquery-queryexpression)
   * @param queryExpression The expression of the query. 
   */
  public fun queryExpression(queryExpression: String) {
    cdkBuilder.queryExpression(queryExpression)
  }

  /**
   * The name of the query.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html#cfn-config-storedquery-queryname)
   * @param queryName The name of the query. 
   */
  public fun queryName(queryName: String) {
    cdkBuilder.queryName(queryName)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html#cfn-config-storedquery-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-storedquery.html#cfn-config-storedquery-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnStoredQuery {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
