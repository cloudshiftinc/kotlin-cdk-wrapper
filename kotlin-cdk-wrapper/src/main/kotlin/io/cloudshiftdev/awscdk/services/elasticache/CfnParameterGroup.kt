@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ElastiCache::ParameterGroup` type creates a new cache parameter group.
 *
 * Cache parameter groups control the parameters for a cache cluster.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticache.*;
 * CfnParameterGroup cfnParameterGroup = CfnParameterGroup.Builder.create(this,
 * "MyCfnParameterGroup")
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
public open class CfnParameterGroup(
  cdkObject: software.amazon.awscdk.services.elasticache.CfnParameterGroup,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnParameterGroupProps,
  ) :
      this(software.amazon.awscdk.services.elasticache.CfnParameterGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnParameterGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnParameterGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnParameterGroupProps(props)
  )

  /**
   * A user-specified name for the cache parameter group.
   */
  public open fun attrCacheParameterGroupName(): String =
      unwrap(this).getAttrCacheParameterGroupName()

  /**
   * The name of the cache parameter group family that this cache parameter group is compatible
   * with.
   */
  public open fun cacheParameterGroupFamily(): String = unwrap(this).getCacheParameterGroupFamily()

  /**
   * The name of the cache parameter group family that this cache parameter group is compatible
   * with.
   */
  public open fun cacheParameterGroupFamily(`value`: String) {
    unwrap(this).setCacheParameterGroupFamily(`value`)
  }

  /**
   * The description for this cache parameter group.
   */
  public open fun description(): String = unwrap(this).getDescription()

  /**
   * The description for this cache parameter group.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A comma-delimited list of parameter name/value pairs.
   */
  public open fun properties(): Any? = unwrap(this).getProperties()

  /**
   * A comma-delimited list of parameter name/value pairs.
   */
  public open fun properties(`value`: IResolvable) {
    unwrap(this).setProperties(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A comma-delimited list of parameter name/value pairs.
   */
  public open fun properties(`value`: Map<String, String>) {
    unwrap(this).setProperties(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A tag that can be added to an ElastiCache parameter group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A tag that can be added to an ElastiCache parameter group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A tag that can be added to an ElastiCache parameter group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.elasticache.CfnParameterGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the cache parameter group family that this cache parameter group is compatible
     * with.
     *
     * Valid values are: `memcached1.4` | `memcached1.5` | `memcached1.6` | `redis2.6` | `redis2.8`
     * | `redis3.2` | `redis4.0` | `redis5.0` | `redis6.x` | `redis7`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-cacheparametergroupfamily)
     * @param cacheParameterGroupFamily The name of the cache parameter group family that this cache
     * parameter group is compatible with. 
     */
    public fun cacheParameterGroupFamily(cacheParameterGroupFamily: String)

    /**
     * The description for this cache parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-description)
     * @param description The description for this cache parameter group. 
     */
    public fun description(description: String)

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
    public fun properties(properties: IResolvable)

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
    public fun properties(properties: Map<String, String>)

    /**
     * A tag that can be added to an ElastiCache parameter group.
     *
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * parameter groups. A tag with a null Value is permitted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-tags)
     * @param tags A tag that can be added to an ElastiCache parameter group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A tag that can be added to an ElastiCache parameter group.
     *
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * parameter groups. A tag with a null Value is permitted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-tags)
     * @param tags A tag that can be added to an ElastiCache parameter group. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticache.CfnParameterGroup.Builder =
        software.amazon.awscdk.services.elasticache.CfnParameterGroup.Builder.create(scope, id)

    /**
     * The name of the cache parameter group family that this cache parameter group is compatible
     * with.
     *
     * Valid values are: `memcached1.4` | `memcached1.5` | `memcached1.6` | `redis2.6` | `redis2.8`
     * | `redis3.2` | `redis4.0` | `redis5.0` | `redis6.x` | `redis7`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-cacheparametergroupfamily)
     * @param cacheParameterGroupFamily The name of the cache parameter group family that this cache
     * parameter group is compatible with. 
     */
    override fun cacheParameterGroupFamily(cacheParameterGroupFamily: String) {
      cdkBuilder.cacheParameterGroupFamily(cacheParameterGroupFamily)
    }

    /**
     * The description for this cache parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-description)
     * @param description The description for this cache parameter group. 
     */
    override fun description(description: String) {
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
    override fun properties(properties: IResolvable) {
      cdkBuilder.properties(properties.let(IResolvable.Companion::unwrap))
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
    override fun properties(properties: Map<String, String>) {
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
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
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
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.elasticache.CfnParameterGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.elasticache.CfnParameterGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnParameterGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnParameterGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnParameterGroup):
        CfnParameterGroup = CfnParameterGroup(cdkObject)

    internal fun unwrap(wrapped: CfnParameterGroup):
        software.amazon.awscdk.services.elasticache.CfnParameterGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.elasticache.CfnParameterGroup
  }
}
