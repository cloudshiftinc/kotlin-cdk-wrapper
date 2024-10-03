@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cassandra

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * You can use the `AWS::Cassandra::Keyspace` resource to create a new keyspace in Amazon Keyspaces
 * (for Apache Cassandra).
 *
 * For more information, see [Create a keyspace and a
 * table](https://docs.aws.amazon.com/keyspaces/latest/devguide/getting-started.ddl.html) in the
 * *Amazon Keyspaces Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cassandra.*;
 * CfnKeyspace cfnKeyspace = CfnKeyspace.Builder.create(this, "MyCfnKeyspace")
 * .keyspaceName("keyspaceName")
 * .replicationSpecification(ReplicationSpecificationProperty.builder()
 * .regionList(List.of("regionList"))
 * .replicationStrategy("replicationStrategy")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html)
 */
public open class CfnKeyspace(
  cdkObject: software.amazon.awscdk.services.cassandra.CfnKeyspace,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.cassandra.CfnKeyspace(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnKeyspaceProps,
  ) :
      this(software.amazon.awscdk.services.cassandra.CfnKeyspace(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnKeyspaceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnKeyspaceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnKeyspaceProps(props)
  )

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the keyspace to be created.
   */
  public open fun keyspaceName(): String? = unwrap(this).getKeyspaceName()

  /**
   * The name of the keyspace to be created.
   */
  public open fun keyspaceName(`value`: String) {
    unwrap(this).setKeyspaceName(`value`)
  }

  /**
   * Specifies the `ReplicationStrategy` of a keyspace.
   *
   * The options are:.
   */
  public open fun replicationSpecification(): Any? = unwrap(this).getReplicationSpecification()

  /**
   * Specifies the `ReplicationStrategy` of a keyspace.
   *
   * The options are:.
   */
  public open fun replicationSpecification(`value`: IResolvable) {
    unwrap(this).setReplicationSpecification(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies the `ReplicationStrategy` of a keyspace.
   *
   * The options are:.
   */
  public open fun replicationSpecification(`value`: ReplicationSpecificationProperty) {
    unwrap(this).setReplicationSpecification(`value`.let(ReplicationSpecificationProperty.Companion::unwrap))
  }

  /**
   * Specifies the `ReplicationStrategy` of a keyspace.
   *
   * The options are:.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4b1bede2435f41adef41613f37e680c8a1837f23db1cf0a2ca1b71069e15f308")
  public open
      fun replicationSpecification(`value`: ReplicationSpecificationProperty.Builder.() -> Unit):
      Unit = replicationSpecification(ReplicationSpecificationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cassandra.CfnKeyspace].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the keyspace to be created.
     *
     * The keyspace name is case sensitive. If you don't specify a name, AWS CloudFormation
     * generates a unique ID and uses that ID for the keyspace name. For more information, see [Name
     * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * *Length constraints:* Minimum length of 3. Maximum length of 255.
     *
     * *Pattern:* `^[a-zA-Z0-9][a-zA-Z0-9_]{1,47}$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-keyspacename)
     * @param keyspaceName The name of the keyspace to be created. 
     */
    public fun keyspaceName(keyspaceName: String)

    /**
     * Specifies the `ReplicationStrategy` of a keyspace. The options are:.
     *
     * * `SINGLE_REGION` for a single Region keyspace (optional) or
     * * `MULTI_REGION` for a multi-Region keyspace
     *
     * If no `ReplicationStrategy` is provided, the default is `SINGLE_REGION` . If you choose
     * `MULTI_REGION` , you must also provide a `RegionList` with the AWS Regions that the keyspace is
     * replicated in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-replicationspecification)
     * @param replicationSpecification Specifies the `ReplicationStrategy` of a keyspace. The
     * options are:. 
     */
    public fun replicationSpecification(replicationSpecification: IResolvable)

    /**
     * Specifies the `ReplicationStrategy` of a keyspace. The options are:.
     *
     * * `SINGLE_REGION` for a single Region keyspace (optional) or
     * * `MULTI_REGION` for a multi-Region keyspace
     *
     * If no `ReplicationStrategy` is provided, the default is `SINGLE_REGION` . If you choose
     * `MULTI_REGION` , you must also provide a `RegionList` with the AWS Regions that the keyspace is
     * replicated in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-replicationspecification)
     * @param replicationSpecification Specifies the `ReplicationStrategy` of a keyspace. The
     * options are:. 
     */
    public fun replicationSpecification(replicationSpecification: ReplicationSpecificationProperty)

    /**
     * Specifies the `ReplicationStrategy` of a keyspace. The options are:.
     *
     * * `SINGLE_REGION` for a single Region keyspace (optional) or
     * * `MULTI_REGION` for a multi-Region keyspace
     *
     * If no `ReplicationStrategy` is provided, the default is `SINGLE_REGION` . If you choose
     * `MULTI_REGION` , you must also provide a `RegionList` with the AWS Regions that the keyspace is
     * replicated in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-replicationspecification)
     * @param replicationSpecification Specifies the `ReplicationStrategy` of a keyspace. The
     * options are:. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76f12a1a314629c5ff4d1adb2520615cc22de7ac912ee07a76a8a78bcdb405d0")
    public
        fun replicationSpecification(replicationSpecification: ReplicationSpecificationProperty.Builder.() -> Unit)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cassandra.CfnKeyspace.Builder =
        software.amazon.awscdk.services.cassandra.CfnKeyspace.Builder.create(scope, id)

    /**
     * The name of the keyspace to be created.
     *
     * The keyspace name is case sensitive. If you don't specify a name, AWS CloudFormation
     * generates a unique ID and uses that ID for the keyspace name. For more information, see [Name
     * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * *Length constraints:* Minimum length of 3. Maximum length of 255.
     *
     * *Pattern:* `^[a-zA-Z0-9][a-zA-Z0-9_]{1,47}$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-keyspacename)
     * @param keyspaceName The name of the keyspace to be created. 
     */
    override fun keyspaceName(keyspaceName: String) {
      cdkBuilder.keyspaceName(keyspaceName)
    }

    /**
     * Specifies the `ReplicationStrategy` of a keyspace. The options are:.
     *
     * * `SINGLE_REGION` for a single Region keyspace (optional) or
     * * `MULTI_REGION` for a multi-Region keyspace
     *
     * If no `ReplicationStrategy` is provided, the default is `SINGLE_REGION` . If you choose
     * `MULTI_REGION` , you must also provide a `RegionList` with the AWS Regions that the keyspace is
     * replicated in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-replicationspecification)
     * @param replicationSpecification Specifies the `ReplicationStrategy` of a keyspace. The
     * options are:. 
     */
    override fun replicationSpecification(replicationSpecification: IResolvable) {
      cdkBuilder.replicationSpecification(replicationSpecification.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies the `ReplicationStrategy` of a keyspace. The options are:.
     *
     * * `SINGLE_REGION` for a single Region keyspace (optional) or
     * * `MULTI_REGION` for a multi-Region keyspace
     *
     * If no `ReplicationStrategy` is provided, the default is `SINGLE_REGION` . If you choose
     * `MULTI_REGION` , you must also provide a `RegionList` with the AWS Regions that the keyspace is
     * replicated in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-replicationspecification)
     * @param replicationSpecification Specifies the `ReplicationStrategy` of a keyspace. The
     * options are:. 
     */
    override
        fun replicationSpecification(replicationSpecification: ReplicationSpecificationProperty) {
      cdkBuilder.replicationSpecification(replicationSpecification.let(ReplicationSpecificationProperty.Companion::unwrap))
    }

    /**
     * Specifies the `ReplicationStrategy` of a keyspace. The options are:.
     *
     * * `SINGLE_REGION` for a single Region keyspace (optional) or
     * * `MULTI_REGION` for a multi-Region keyspace
     *
     * If no `ReplicationStrategy` is provided, the default is `SINGLE_REGION` . If you choose
     * `MULTI_REGION` , you must also provide a `RegionList` with the AWS Regions that the keyspace is
     * replicated in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-replicationspecification)
     * @param replicationSpecification Specifies the `ReplicationStrategy` of a keyspace. The
     * options are:. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76f12a1a314629c5ff4d1adb2520615cc22de7ac912ee07a76a8a78bcdb405d0")
    override
        fun replicationSpecification(replicationSpecification: ReplicationSpecificationProperty.Builder.() -> Unit):
        Unit = replicationSpecification(ReplicationSpecificationProperty(replicationSpecification))

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html#cfn-cassandra-keyspace-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cassandra.CfnKeyspace = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cassandra.CfnKeyspace.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnKeyspace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnKeyspace(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnKeyspace): CfnKeyspace
        = CfnKeyspace(cdkObject)

    internal fun unwrap(wrapped: CfnKeyspace): software.amazon.awscdk.services.cassandra.CfnKeyspace
        = wrapped.cdkObject as software.amazon.awscdk.services.cassandra.CfnKeyspace
  }

  /**
   * You can use `ReplicationSpecification` to configure the `ReplicationStrategy` of a keyspace in
   * Amazon Keyspaces .
   *
   * The `ReplicationSpecification` property is `CreateOnly` and cannot be changed after the
   * keyspace has been created. This property applies automatically to all tables in the keyspace.
   *
   * For more information, see [Multi-Region
   * Replication](https://docs.aws.amazon.com/keyspaces/latest/devguide/multiRegion-replication.html)
   * in the *Amazon Keyspaces Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cassandra.*;
   * ReplicationSpecificationProperty replicationSpecificationProperty =
   * ReplicationSpecificationProperty.builder()
   * .regionList(List.of("regionList"))
   * .replicationStrategy("replicationStrategy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-keyspace-replicationspecification.html)
   */
  public interface ReplicationSpecificationProperty {
    /**
     * Specifies the AWS Regions that the keyspace is replicated in.
     *
     * You must specify at least two and up to six Regions, including the Region that the keyspace
     * is being created in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-keyspace-replicationspecification.html#cfn-cassandra-keyspace-replicationspecification-regionlist)
     */
    public fun regionList(): List<String> = unwrap(this).getRegionList() ?: emptyList()

    /**
     * The options are:.
     *
     * * `SINGLE_REGION` (optional)
     * * `MULTI_REGION`
     *
     * If no value is specified, the default is `SINGLE_REGION` . If `MULTI_REGION` is specified,
     * `RegionList` is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-keyspace-replicationspecification.html#cfn-cassandra-keyspace-replicationspecification-replicationstrategy)
     */
    public fun replicationStrategy(): String? = unwrap(this).getReplicationStrategy()

    /**
     * A builder for [ReplicationSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param regionList Specifies the AWS Regions that the keyspace is replicated in.
       * You must specify at least two and up to six Regions, including the Region that the keyspace
       * is being created in.
       */
      public fun regionList(regionList: List<String>)

      /**
       * @param regionList Specifies the AWS Regions that the keyspace is replicated in.
       * You must specify at least two and up to six Regions, including the Region that the keyspace
       * is being created in.
       */
      public fun regionList(vararg regionList: String)

      /**
       * @param replicationStrategy The options are:.
       * * `SINGLE_REGION` (optional)
       * * `MULTI_REGION`
       *
       * If no value is specified, the default is `SINGLE_REGION` . If `MULTI_REGION` is specified,
       * `RegionList` is required.
       */
      public fun replicationStrategy(replicationStrategy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cassandra.CfnKeyspace.ReplicationSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.cassandra.CfnKeyspace.ReplicationSpecificationProperty.builder()

      /**
       * @param regionList Specifies the AWS Regions that the keyspace is replicated in.
       * You must specify at least two and up to six Regions, including the Region that the keyspace
       * is being created in.
       */
      override fun regionList(regionList: List<String>) {
        cdkBuilder.regionList(regionList)
      }

      /**
       * @param regionList Specifies the AWS Regions that the keyspace is replicated in.
       * You must specify at least two and up to six Regions, including the Region that the keyspace
       * is being created in.
       */
      override fun regionList(vararg regionList: String): Unit = regionList(regionList.toList())

      /**
       * @param replicationStrategy The options are:.
       * * `SINGLE_REGION` (optional)
       * * `MULTI_REGION`
       *
       * If no value is specified, the default is `SINGLE_REGION` . If `MULTI_REGION` is specified,
       * `RegionList` is required.
       */
      override fun replicationStrategy(replicationStrategy: String) {
        cdkBuilder.replicationStrategy(replicationStrategy)
      }

      public fun build():
          software.amazon.awscdk.services.cassandra.CfnKeyspace.ReplicationSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cassandra.CfnKeyspace.ReplicationSpecificationProperty,
    ) : CdkObject(cdkObject),
        ReplicationSpecificationProperty {
      /**
       * Specifies the AWS Regions that the keyspace is replicated in.
       *
       * You must specify at least two and up to six Regions, including the Region that the keyspace
       * is being created in.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-keyspace-replicationspecification.html#cfn-cassandra-keyspace-replicationspecification-regionlist)
       */
      override fun regionList(): List<String> = unwrap(this).getRegionList() ?: emptyList()

      /**
       * The options are:.
       *
       * * `SINGLE_REGION` (optional)
       * * `MULTI_REGION`
       *
       * If no value is specified, the default is `SINGLE_REGION` . If `MULTI_REGION` is specified,
       * `RegionList` is required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-keyspace-replicationspecification.html#cfn-cassandra-keyspace-replicationspecification-replicationstrategy)
       */
      override fun replicationStrategy(): String? = unwrap(this).getReplicationStrategy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnKeyspace.ReplicationSpecificationProperty):
          ReplicationSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ReplicationSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationSpecificationProperty):
          software.amazon.awscdk.services.cassandra.CfnKeyspace.ReplicationSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cassandra.CfnKeyspace.ReplicationSpecificationProperty
    }
  }
}
