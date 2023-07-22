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

  /**
   * The name of the cache parameter group family that this cache parameter group is compatible
   * with.
   *
   * Valid values are: `memcached1.4` | `memcached1.5` | `memcached1.6` | `redis2.6` | `redis2.8` |
   * `redis3.2` | `redis4.0` | `redis5.0` | `redis6.x` | `redis7`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-cacheparametergroupfamily)
   * @param cacheParameterGroupFamily The name of the cache parameter group family that this cache
   * parameter group is compatible with. 
   */
  public fun cacheParameterGroupFamily(cacheParameterGroupFamily: String) {
    cdkBuilder.cacheParameterGroupFamily(cacheParameterGroupFamily)
  }

  /**
   * The description for this cache parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-description)
   * @param description The description for this cache parameter group. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * A comma-delimited list of parameter name/value pairs.
   *
   * For example:
   *
   * ```
   * "Properties" : { "cas_disabled" : "1", "chunk_size_growth_factor" : "1.02"
   * }
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-properties)
   * @param properties A comma-delimited list of parameter name/value pairs. 
   */
  public fun properties(properties: Map<String, String>) {
    cdkBuilder.properties(properties)
  }

  /**
   * A comma-delimited list of parameter name/value pairs.
   *
   * For example:
   *
   * ```
   * "Properties" : { "cas_disabled" : "1", "chunk_size_growth_factor" : "1.02"
   * }
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-properties)
   * @param properties A comma-delimited list of parameter name/value pairs. 
   */
  public fun properties(properties: IResolvable) {
    cdkBuilder.properties(properties)
  }

  /**
   * A tag that can be added to an ElastiCache parameter group.
   *
   * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
   * parameter groups. A tag with a null Value is permitted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-tags)
   * @param tags A tag that can be added to an ElastiCache parameter group. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * A tag that can be added to an ElastiCache parameter group.
   *
   * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
   * parameter groups. A tag with a null Value is permitted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-tags)
   * @param tags A tag that can be added to an ElastiCache parameter group. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnParameterGroup {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
