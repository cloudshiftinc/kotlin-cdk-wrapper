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
import software.amazon.awscdk.services.elasticache.CfnParameterGroupProps

/**
 * Properties for defining a `CfnParameterGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticache.*;
 * CfnParameterGroupProps cfnParameterGroupProps = CfnParameterGroupProps.builder()
 * .cacheParameterGroupFamily("cacheParameterGroupFamily")
 * .description("description")
 * // the properties below are optional
 * .properties(Map.of(
 * "propertiesKey", "properties"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html)
 */
@CdkDslMarker
public class CfnParameterGroupPropsDsl {
  private val cdkBuilder: CfnParameterGroupProps.Builder = CfnParameterGroupProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param cacheParameterGroupFamily The name of the cache parameter group family that this cache
   * parameter group is compatible with. 
   * Valid values are: `memcached1.4` | `memcached1.5` | `memcached1.6` | `redis2.6` | `redis2.8` |
   * `redis3.2` | `redis4.0` | `redis5.0` | `redis6.x` | `redis7`
   */
  public fun cacheParameterGroupFamily(cacheParameterGroupFamily: String) {
    cdkBuilder.cacheParameterGroupFamily(cacheParameterGroupFamily)
  }

  /**
   * @param description The description for this cache parameter group. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param properties A comma-delimited list of parameter name/value pairs.
   * For example:
   *
   * ```
   * "Properties" : { "cas_disabled" : "1", "chunk_size_growth_factor" : "1.02"
   * }
   * ```
   */
  public fun properties(properties: Map<String, String>) {
    cdkBuilder.properties(properties)
  }

  /**
   * @param properties A comma-delimited list of parameter name/value pairs.
   * For example:
   *
   * ```
   * "Properties" : { "cas_disabled" : "1", "chunk_size_growth_factor" : "1.02"
   * }
   * ```
   */
  public fun properties(properties: IResolvable) {
    cdkBuilder.properties(properties)
  }

  /**
   * @param tags A tag that can be added to an ElastiCache parameter group.
   * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
   * parameter groups. A tag with a null Value is permitted.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags A tag that can be added to an ElastiCache parameter group.
   * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
   * parameter groups. A tag with a null Value is permitted.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnParameterGroupProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
