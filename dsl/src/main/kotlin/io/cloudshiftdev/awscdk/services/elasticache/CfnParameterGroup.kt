package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnParameterGroup
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.elasticache.CfnParameterGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /**  */
    public open fun attrId(): String = unwrap(this).getAttrId()

    /**
     * The name of the cache parameter group family that this cache parameter group is compatible
     * with.
     */
    public open fun cacheParameterGroupFamily(): String =
        unwrap(this).getCacheParameterGroupFamily()

    /**
     * The name of the cache parameter group family that this cache parameter group is compatible
     * with.
     */
    public open fun cacheParameterGroupFamily(`value`: String) {
        unwrap(this).setCacheParameterGroupFamily(`value`)
    }

    /** The description for this cache parameter group. */
    public open fun description(): String = unwrap(this).getDescription()

    /** The description for this cache parameter group. */
    public open fun description(`value`: String) {
        unwrap(this).setDescription(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** A comma-delimited list of parameter name/value pairs. */
    public open fun properties(): Any? = unwrap(this).getProperties()

    /** A comma-delimited list of parameter name/value pairs. */
    public open fun properties(`value`: IResolvable) {
        unwrap(this).setProperties(`value`.let(IResolvable::unwrap))
    }

    /** A comma-delimited list of parameter name/value pairs. */
    public open fun properties(`value`: Map<String, String>) {
        unwrap(this).setProperties(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** A tag that can be added to an ElastiCache parameter group. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** A tag that can be added to an ElastiCache parameter group. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** A tag that can be added to an ElastiCache parameter group. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.elasticache.CfnParameterGroup]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The name of the cache parameter group family that this cache parameter group is
         * compatible with.
         *
         * Valid values are: `memcached1.4` | `memcached1.5` | `memcached1.6` | `redis2.6` |
         * `redis2.8` | `redis3.2` | `redis4.0` | `redis5.0` | `redis6.x` | `redis7`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-cacheparametergroupfamily)
         *
         * @param cacheParameterGroupFamily The name of the cache parameter group family that this
         *   cache parameter group is compatible with.
         */
        public fun cacheParameterGroupFamily(cacheParameterGroupFamily: String)

        /**
         * The description for this cache parameter group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-description)
         *
         * @param description The description for this cache parameter group.
         */
        public fun description(description: String)

        /**
         * A comma-delimited list of parameter name/value pairs.
         *
         * For example:
         * ```
         * "Properties" : { "cas_disabled" : "1", "chunk_size_growth_factor" : "1.02"
         * }
         * ```
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-properties)
         *
         * @param properties A comma-delimited list of parameter name/value pairs.
         */
        public fun properties(properties: IResolvable)

        /**
         * A comma-delimited list of parameter name/value pairs.
         *
         * For example:
         * ```
         * "Properties" : { "cas_disabled" : "1", "chunk_size_growth_factor" : "1.02"
         * }
         * ```
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-properties)
         *
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
         *
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
         *
         * @param tags A tag that can be added to an ElastiCache parameter group.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.elasticache.CfnParameterGroup.Builder =
            software.amazon.awscdk.services.elasticache.CfnParameterGroup.Builder.create(scope, id)

        /**
         * The name of the cache parameter group family that this cache parameter group is
         * compatible with.
         *
         * Valid values are: `memcached1.4` | `memcached1.5` | `memcached1.6` | `redis2.6` |
         * `redis2.8` | `redis3.2` | `redis4.0` | `redis5.0` | `redis6.x` | `redis7`
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-cacheparametergroupfamily)
         *
         * @param cacheParameterGroupFamily The name of the cache parameter group family that this
         *   cache parameter group is compatible with.
         */
        override fun cacheParameterGroupFamily(cacheParameterGroupFamily: String) {
            cdkBuilder.cacheParameterGroupFamily(cacheParameterGroupFamily)
        }

        /**
         * The description for this cache parameter group.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-description)
         *
         * @param description The description for this cache parameter group.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * A comma-delimited list of parameter name/value pairs.
         *
         * For example:
         * ```
         * "Properties" : { "cas_disabled" : "1", "chunk_size_growth_factor" : "1.02"
         * }
         * ```
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-properties)
         *
         * @param properties A comma-delimited list of parameter name/value pairs.
         */
        override fun properties(properties: IResolvable) {
            cdkBuilder.properties(properties.let(IResolvable::unwrap))
        }

        /**
         * A comma-delimited list of parameter name/value pairs.
         *
         * For example:
         * ```
         * "Properties" : { "cas_disabled" : "1", "chunk_size_growth_factor" : "1.02"
         * }
         * ```
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-properties)
         *
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
         *
         * @param tags A tag that can be added to an ElastiCache parameter group.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * A tag that can be added to an ElastiCache parameter group.
         *
         * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
         * parameter groups. A tag with a null Value is permitted.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-parametergroup.html#cfn-elasticache-parametergroup-tags)
         *
         * @param tags A tag that can be added to an ElastiCache parameter group.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.elasticache.CfnParameterGroup =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnParameterGroup {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnParameterGroup(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.elasticache.CfnParameterGroup
        ): CfnParameterGroup = CfnParameterGroup(cdkObject)

        internal fun unwrap(
            wrapped: CfnParameterGroup
        ): software.amazon.awscdk.services.elasticache.CfnParameterGroup = wrapped.cdkObject
    }
}
