@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnParameterGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticache.*;
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
public interface CfnParameterGroupProps {
  /**
   * The name of the cache parameter group family that this cache parameter group is compatible
   * with.
   *
   * Valid values are: `valkey8` | `valkey7` | `memcached1.4` | `memcached1.5` | `memcached1.6` |
   * `redis2.6` | `redis2.8` | `redis3.2` | `redis4.0` | `redis5.0` | `redis6.x` | `redis7`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-cacheparametergroupfamily)
   */
  public fun cacheParameterGroupFamily(): String

  /**
   * The description for this cache parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-description)
   */
  public fun description(): String

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
   */
  public fun properties(): Any? = unwrap(this).getProperties()

  /**
   * A tag that can be added to an ElastiCache parameter group.
   *
   * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
   * parameter groups. A tag with a null Value is permitted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnParameterGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cacheParameterGroupFamily The name of the cache parameter group family that this cache
     * parameter group is compatible with. 
     * Valid values are: `valkey8` | `valkey7` | `memcached1.4` | `memcached1.5` | `memcached1.6` |
     * `redis2.6` | `redis2.8` | `redis3.2` | `redis4.0` | `redis5.0` | `redis6.x` | `redis7`
     */
    public fun cacheParameterGroupFamily(cacheParameterGroupFamily: String)

    /**
     * @param description The description for this cache parameter group. 
     */
    public fun description(description: String)

    /**
     * @param properties A comma-delimited list of parameter name/value pairs.
     * For example:
     *
     * ```
     * "Properties" : { "cas_disabled" : "1", "chunk_size_growth_factor" : "1.02"
     * }
     * ```
     */
    public fun properties(properties: Map<String, String>)

    /**
     * @param properties A comma-delimited list of parameter name/value pairs.
     * For example:
     *
     * ```
     * "Properties" : { "cas_disabled" : "1", "chunk_size_growth_factor" : "1.02"
     * }
     * ```
     */
    public fun properties(properties: IResolvable)

    /**
     * @param tags A tag that can be added to an ElastiCache parameter group.
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * parameter groups. A tag with a null Value is permitted.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A tag that can be added to an ElastiCache parameter group.
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * parameter groups. A tag with a null Value is permitted.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticache.CfnParameterGroupProps.Builder =
        software.amazon.awscdk.services.elasticache.CfnParameterGroupProps.builder()

    /**
     * @param cacheParameterGroupFamily The name of the cache parameter group family that this cache
     * parameter group is compatible with. 
     * Valid values are: `valkey8` | `valkey7` | `memcached1.4` | `memcached1.5` | `memcached1.6` |
     * `redis2.6` | `redis2.8` | `redis3.2` | `redis4.0` | `redis5.0` | `redis6.x` | `redis7`
     */
    override fun cacheParameterGroupFamily(cacheParameterGroupFamily: String) {
      cdkBuilder.cacheParameterGroupFamily(cacheParameterGroupFamily)
    }

    /**
     * @param description The description for this cache parameter group. 
     */
    override fun description(description: String) {
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
    override fun properties(properties: Map<String, String>) {
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
    override fun properties(properties: IResolvable) {
      cdkBuilder.properties(properties.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param tags A tag that can be added to an ElastiCache parameter group.
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * parameter groups. A tag with a null Value is permitted.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A tag that can be added to an ElastiCache parameter group.
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * parameter groups. A tag with a null Value is permitted.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.elasticache.CfnParameterGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticache.CfnParameterGroupProps,
  ) : CdkObject(cdkObject),
      CfnParameterGroupProps {
    /**
     * The name of the cache parameter group family that this cache parameter group is compatible
     * with.
     *
     * Valid values are: `valkey8` | `valkey7` | `memcached1.4` | `memcached1.5` | `memcached1.6` |
     * `redis2.6` | `redis2.8` | `redis3.2` | `redis4.0` | `redis5.0` | `redis6.x` | `redis7`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-cacheparametergroupfamily)
     */
    override fun cacheParameterGroupFamily(): String = unwrap(this).getCacheParameterGroupFamily()

    /**
     * The description for this cache parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-description)
     */
    override fun description(): String = unwrap(this).getDescription()

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
     */
    override fun properties(): Any? = unwrap(this).getProperties()

    /**
     * A tag that can be added to an ElastiCache parameter group.
     *
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * parameter groups. A tag with a null Value is permitted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnParameterGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnParameterGroupProps):
        CfnParameterGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnParameterGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnParameterGroupProps):
        software.amazon.awscdk.services.elasticache.CfnParameterGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticache.CfnParameterGroupProps
  }
}
