@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securitylake

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Initializes an Amazon Security Lake instance with the provided (or default) configuration.
 *
 * You can enable Security Lake in AWS Regions with customized settings before enabling log
 * collection in Regions. To specify particular Regions, configure these Regions using the
 * `configurations` parameter. If you have already enabled Security Lake in a Region when you call this
 * command, the command will update the Region if you provide new configuration parameters. If you have
 * not already enabled Security Lake in the Region when you call this API, it will set up the data lake
 * in the Region with the specified configurations.
 *
 * When you enable Security Lake , it starts ingesting security data after the `CreateAwsLogSource`
 * call. This includes ingesting security data from sources, storing data, and making data accessible
 * to subscribers. Security Lake also enables all the existing settings and resources that it stores or
 * maintains for your AWS account in the current Region, including security log and event data. For
 * more information, see the [Amazon Security Lake User
 * Guide](https://docs.aws.amazon.com//security-lake/latest/userguide/what-is-security-lake.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securitylake.*;
 * CfnDataLake cfnDataLake = CfnDataLake.Builder.create(this, "MyCfnDataLake")
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .lifecycleConfiguration(LifecycleConfigurationProperty.builder()
 * .expiration(ExpirationProperty.builder()
 * .days(123)
 * .build())
 * .transitions(List.of(TransitionsProperty.builder()
 * .days(123)
 * .storageClass("storageClass")
 * .build()))
 * .build())
 * .metaStoreManagerRoleArn("metaStoreManagerRoleArn")
 * .replicationConfiguration(ReplicationConfigurationProperty.builder()
 * .regions(List.of("regions"))
 * .roleArn("roleArn")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-datalake.html)
 */
public open class CfnDataLake(
  cdkObject: software.amazon.awscdk.services.securitylake.CfnDataLake,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.securitylake.CfnDataLake(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataLakeProps,
  ) :
      this(software.amazon.awscdk.services.securitylake.CfnDataLake(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDataLakeProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataLakeProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDataLakeProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the data lake.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The Amazon Resource Name (ARN) of the Amazon S3 bucket.
   */
  public open fun attrS3BucketArn(): String = unwrap(this).getAttrS3BucketArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Provides encryption details of the Amazon Security Lake object.
   */
  public open fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

  /**
   * Provides encryption details of the Amazon Security Lake object.
   */
  public open fun encryptionConfiguration(`value`: IResolvable) {
    unwrap(this).setEncryptionConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Provides encryption details of the Amazon Security Lake object.
   */
  public open fun encryptionConfiguration(`value`: EncryptionConfigurationProperty) {
    unwrap(this).setEncryptionConfiguration(`value`.let(EncryptionConfigurationProperty::unwrap))
  }

  /**
   * Provides encryption details of the Amazon Security Lake object.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0295aa22b829e93377cef18a1a56e399a008cac87d15115520f2c05d4dde43d4")
  public open
      fun encryptionConfiguration(`value`: EncryptionConfigurationProperty.Builder.() -> Unit): Unit
      = encryptionConfiguration(EncryptionConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * You can customize Security Lake to store data in your preferred AWS Regions for your preferred
   * amount of time.
   */
  public open fun lifecycleConfiguration(): Any? = unwrap(this).getLifecycleConfiguration()

  /**
   * You can customize Security Lake to store data in your preferred AWS Regions for your preferred
   * amount of time.
   */
  public open fun lifecycleConfiguration(`value`: IResolvable) {
    unwrap(this).setLifecycleConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * You can customize Security Lake to store data in your preferred AWS Regions for your preferred
   * amount of time.
   */
  public open fun lifecycleConfiguration(`value`: LifecycleConfigurationProperty) {
    unwrap(this).setLifecycleConfiguration(`value`.let(LifecycleConfigurationProperty::unwrap))
  }

  /**
   * You can customize Security Lake to store data in your preferred AWS Regions for your preferred
   * amount of time.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("481e444e780abe011a68ef87d5b5487bc534212a263c2dfdab987cca06de07fa")
  public open
      fun lifecycleConfiguration(`value`: LifecycleConfigurationProperty.Builder.() -> Unit): Unit =
      lifecycleConfiguration(LifecycleConfigurationProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) used to create and update the AWS Glue table.
   */
  public open fun metaStoreManagerRoleArn(): String? = unwrap(this).getMetaStoreManagerRoleArn()

  /**
   * The Amazon Resource Name (ARN) used to create and update the AWS Glue table.
   */
  public open fun metaStoreManagerRoleArn(`value`: String) {
    unwrap(this).setMetaStoreManagerRoleArn(`value`)
  }

  /**
   * Provides replication details of Amazon Security Lake object.
   */
  public open fun replicationConfiguration(): Any? = unwrap(this).getReplicationConfiguration()

  /**
   * Provides replication details of Amazon Security Lake object.
   */
  public open fun replicationConfiguration(`value`: IResolvable) {
    unwrap(this).setReplicationConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Provides replication details of Amazon Security Lake object.
   */
  public open fun replicationConfiguration(`value`: ReplicationConfigurationProperty) {
    unwrap(this).setReplicationConfiguration(`value`.let(ReplicationConfigurationProperty::unwrap))
  }

  /**
   * Provides replication details of Amazon Security Lake object.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cb02d29eae5a392ee9bafe3080d34ad466b81c4ce7fcb71a3c04ad3eecb94e97")
  public open
      fun replicationConfiguration(`value`: ReplicationConfigurationProperty.Builder.() -> Unit):
      Unit = replicationConfiguration(ReplicationConfigurationProperty(`value`))

  /**
   * An array of objects, one for each tag to associate with the data lake configuration.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of objects, one for each tag to associate with the data lake configuration.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of objects, one for each tag to associate with the data lake configuration.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.securitylake.CfnDataLake].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Provides encryption details of the Amazon Security Lake object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-datalake.html#cfn-securitylake-datalake-encryptionconfiguration)
     * @param encryptionConfiguration Provides encryption details of the Amazon Security Lake
     * object. 
     */
    public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

    /**
     * Provides encryption details of the Amazon Security Lake object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-datalake.html#cfn-securitylake-datalake-encryptionconfiguration)
     * @param encryptionConfiguration Provides encryption details of the Amazon Security Lake
     * object. 
     */
    public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty)

    /**
     * Provides encryption details of the Amazon Security Lake object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-datalake.html#cfn-securitylake-datalake-encryptionconfiguration)
     * @param encryptionConfiguration Provides encryption details of the Amazon Security Lake
     * object. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aec6179077b4d24890eaad31533b9f664438db37741d307a46e9cec24484f6a2")
    public
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * You can customize Security Lake to store data in your preferred AWS Regions for your
     * preferred amount of time.
     *
     * Lifecycle management can help you comply with different compliance requirements. For more
     * details, see [Lifecycle
     * management](https://docs.aws.amazon.com//security-lake/latest/userguide/lifecycle-management.html)
     * in the Amazon Security Lake User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-datalake.html#cfn-securitylake-datalake-lifecycleconfiguration)
     * @param lifecycleConfiguration You can customize Security Lake to store data in your preferred
     * AWS Regions for your preferred amount of time. 
     */
    public fun lifecycleConfiguration(lifecycleConfiguration: IResolvable)

    /**
     * You can customize Security Lake to store data in your preferred AWS Regions for your
     * preferred amount of time.
     *
     * Lifecycle management can help you comply with different compliance requirements. For more
     * details, see [Lifecycle
     * management](https://docs.aws.amazon.com//security-lake/latest/userguide/lifecycle-management.html)
     * in the Amazon Security Lake User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-datalake.html#cfn-securitylake-datalake-lifecycleconfiguration)
     * @param lifecycleConfiguration You can customize Security Lake to store data in your preferred
     * AWS Regions for your preferred amount of time. 
     */
    public fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty)

    /**
     * You can customize Security Lake to store data in your preferred AWS Regions for your
     * preferred amount of time.
     *
     * Lifecycle management can help you comply with different compliance requirements. For more
     * details, see [Lifecycle
     * management](https://docs.aws.amazon.com//security-lake/latest/userguide/lifecycle-management.html)
     * in the Amazon Security Lake User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-datalake.html#cfn-securitylake-datalake-lifecycleconfiguration)
     * @param lifecycleConfiguration You can customize Security Lake to store data in your preferred
     * AWS Regions for your preferred amount of time. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7717584496caa65a45996fc3d9824c3e8628cc29eebd9dee2a71f8ec472ae825")
    public
        fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) used to create and update the AWS Glue table.
     *
     * This table contains partitions generated by the ingestion and normalization of AWS log
     * sources and custom sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-datalake.html#cfn-securitylake-datalake-metastoremanagerrolearn)
     * @param metaStoreManagerRoleArn The Amazon Resource Name (ARN) used to create and update the
     * AWS Glue table. 
     */
    public fun metaStoreManagerRoleArn(metaStoreManagerRoleArn: String)

    /**
     * Provides replication details of Amazon Security Lake object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-datalake.html#cfn-securitylake-datalake-replicationconfiguration)
     * @param replicationConfiguration Provides replication details of Amazon Security Lake object. 
     */
    public fun replicationConfiguration(replicationConfiguration: IResolvable)

    /**
     * Provides replication details of Amazon Security Lake object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-datalake.html#cfn-securitylake-datalake-replicationconfiguration)
     * @param replicationConfiguration Provides replication details of Amazon Security Lake object. 
     */
    public fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty)

    /**
     * Provides replication details of Amazon Security Lake object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-datalake.html#cfn-securitylake-datalake-replicationconfiguration)
     * @param replicationConfiguration Provides replication details of Amazon Security Lake object. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c6b18dd74e43b57599b312d62e2cb46ca3c8139f405dd3610191e41b2ea3312")
    public
        fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty.Builder.() -> Unit)

    /**
     * An array of objects, one for each tag to associate with the data lake configuration.
     *
     * For each tag, you must specify both a tag key and a tag value. A tag value cannot be null,
     * but it can be an empty string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-datalake.html#cfn-securitylake-datalake-tags)
     * @param tags An array of objects, one for each tag to associate with the data lake
     * configuration. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of objects, one for each tag to associate with the data lake configuration.
     *
     * For each tag, you must specify both a tag key and a tag value. A tag value cannot be null,
     * but it can be an empty string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-datalake.html#cfn-securitylake-datalake-tags)
     * @param tags An array of objects, one for each tag to associate with the data lake
     * configuration. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.securitylake.CfnDataLake.Builder =
        software.amazon.awscdk.services.securitylake.CfnDataLake.Builder.create(scope, id)

    /**
     * Provides encryption details of the Amazon Security Lake object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-datalake.html#cfn-securitylake-datalake-encryptionconfiguration)
     * @param encryptionConfiguration Provides encryption details of the Amazon Security Lake
     * object. 
     */
    override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Provides encryption details of the Amazon Security Lake object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-datalake.html#cfn-securitylake-datalake-encryptionconfiguration)
     * @param encryptionConfiguration Provides encryption details of the Amazon Security Lake
     * object. 
     */
    override fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfigurationProperty::unwrap))
    }

    /**
     * Provides encryption details of the Amazon Security Lake object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-datalake.html#cfn-securitylake-datalake-encryptionconfiguration)
     * @param encryptionConfiguration Provides encryption details of the Amazon Security Lake
     * object. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aec6179077b4d24890eaad31533b9f664438db37741d307a46e9cec24484f6a2")
    override
        fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit):
        Unit = encryptionConfiguration(EncryptionConfigurationProperty(encryptionConfiguration))

    /**
     * You can customize Security Lake to store data in your preferred AWS Regions for your
     * preferred amount of time.
     *
     * Lifecycle management can help you comply with different compliance requirements. For more
     * details, see [Lifecycle
     * management](https://docs.aws.amazon.com//security-lake/latest/userguide/lifecycle-management.html)
     * in the Amazon Security Lake User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-datalake.html#cfn-securitylake-datalake-lifecycleconfiguration)
     * @param lifecycleConfiguration You can customize Security Lake to store data in your preferred
     * AWS Regions for your preferred amount of time. 
     */
    override fun lifecycleConfiguration(lifecycleConfiguration: IResolvable) {
      cdkBuilder.lifecycleConfiguration(lifecycleConfiguration.let(IResolvable::unwrap))
    }

    /**
     * You can customize Security Lake to store data in your preferred AWS Regions for your
     * preferred amount of time.
     *
     * Lifecycle management can help you comply with different compliance requirements. For more
     * details, see [Lifecycle
     * management](https://docs.aws.amazon.com//security-lake/latest/userguide/lifecycle-management.html)
     * in the Amazon Security Lake User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-datalake.html#cfn-securitylake-datalake-lifecycleconfiguration)
     * @param lifecycleConfiguration You can customize Security Lake to store data in your preferred
     * AWS Regions for your preferred amount of time. 
     */
    override fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty) {
      cdkBuilder.lifecycleConfiguration(lifecycleConfiguration.let(LifecycleConfigurationProperty::unwrap))
    }

    /**
     * You can customize Security Lake to store data in your preferred AWS Regions for your
     * preferred amount of time.
     *
     * Lifecycle management can help you comply with different compliance requirements. For more
     * details, see [Lifecycle
     * management](https://docs.aws.amazon.com//security-lake/latest/userguide/lifecycle-management.html)
     * in the Amazon Security Lake User Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-datalake.html#cfn-securitylake-datalake-lifecycleconfiguration)
     * @param lifecycleConfiguration You can customize Security Lake to store data in your preferred
     * AWS Regions for your preferred amount of time. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7717584496caa65a45996fc3d9824c3e8628cc29eebd9dee2a71f8ec472ae825")
    override
        fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty.Builder.() -> Unit):
        Unit = lifecycleConfiguration(LifecycleConfigurationProperty(lifecycleConfiguration))

    /**
     * The Amazon Resource Name (ARN) used to create and update the AWS Glue table.
     *
     * This table contains partitions generated by the ingestion and normalization of AWS log
     * sources and custom sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-datalake.html#cfn-securitylake-datalake-metastoremanagerrolearn)
     * @param metaStoreManagerRoleArn The Amazon Resource Name (ARN) used to create and update the
     * AWS Glue table. 
     */
    override fun metaStoreManagerRoleArn(metaStoreManagerRoleArn: String) {
      cdkBuilder.metaStoreManagerRoleArn(metaStoreManagerRoleArn)
    }

    /**
     * Provides replication details of Amazon Security Lake object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-datalake.html#cfn-securitylake-datalake-replicationconfiguration)
     * @param replicationConfiguration Provides replication details of Amazon Security Lake object. 
     */
    override fun replicationConfiguration(replicationConfiguration: IResolvable) {
      cdkBuilder.replicationConfiguration(replicationConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Provides replication details of Amazon Security Lake object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-datalake.html#cfn-securitylake-datalake-replicationconfiguration)
     * @param replicationConfiguration Provides replication details of Amazon Security Lake object. 
     */
    override
        fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty) {
      cdkBuilder.replicationConfiguration(replicationConfiguration.let(ReplicationConfigurationProperty::unwrap))
    }

    /**
     * Provides replication details of Amazon Security Lake object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-datalake.html#cfn-securitylake-datalake-replicationconfiguration)
     * @param replicationConfiguration Provides replication details of Amazon Security Lake object. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c6b18dd74e43b57599b312d62e2cb46ca3c8139f405dd3610191e41b2ea3312")
    override
        fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty.Builder.() -> Unit):
        Unit = replicationConfiguration(ReplicationConfigurationProperty(replicationConfiguration))

    /**
     * An array of objects, one for each tag to associate with the data lake configuration.
     *
     * For each tag, you must specify both a tag key and a tag value. A tag value cannot be null,
     * but it can be an empty string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-datalake.html#cfn-securitylake-datalake-tags)
     * @param tags An array of objects, one for each tag to associate with the data lake
     * configuration. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of objects, one for each tag to associate with the data lake configuration.
     *
     * For each tag, you must specify both a tag key and a tag value. A tag value cannot be null,
     * but it can be an empty string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-datalake.html#cfn-securitylake-datalake-tags)
     * @param tags An array of objects, one for each tag to associate with the data lake
     * configuration. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.securitylake.CfnDataLake =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.securitylake.CfnDataLake.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataLake {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataLake(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.securitylake.CfnDataLake):
        CfnDataLake = CfnDataLake(cdkObject)

    internal fun unwrap(wrapped: CfnDataLake):
        software.amazon.awscdk.services.securitylake.CfnDataLake = wrapped.cdkObject as
        software.amazon.awscdk.services.securitylake.CfnDataLake
  }

  /**
   * Provides encryption details of the Amazon Security Lake object.
   *
   * The AWS shared responsibility model applies to data protection in Amazon Security Lake . As
   * described in this model, AWS is responsible for protecting the global infrastructure that runs all
   * of the AWS Cloud. You are responsible for maintaining control over your content that is hosted on
   * this infrastructure. For more details, see [Data
   * protection](https://docs.aws.amazon.com//security-lake/latest/userguide/data-protection.html) in
   * the Amazon Security Lake User Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securitylake.*;
   * EncryptionConfigurationProperty encryptionConfigurationProperty =
   * EncryptionConfigurationProperty.builder()
   * .kmsKeyId("kmsKeyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-datalake-encryptionconfiguration.html)
   */
  public interface EncryptionConfigurationProperty {
    /**
     * The ID of KMS encryption key used by Amazon Security Lake to encrypt the Security Lake
     * object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-datalake-encryptionconfiguration.html#cfn-securitylake-datalake-encryptionconfiguration-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * A builder for [EncryptionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyId The ID of KMS encryption key used by Amazon Security Lake to encrypt the
       * Security Lake object.
       */
      public fun kmsKeyId(kmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securitylake.CfnDataLake.EncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.securitylake.CfnDataLake.EncryptionConfigurationProperty.builder()

      /**
       * @param kmsKeyId The ID of KMS encryption key used by Amazon Security Lake to encrypt the
       * Security Lake object.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.securitylake.CfnDataLake.EncryptionConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securitylake.CfnDataLake.EncryptionConfigurationProperty,
    ) : CdkObject(cdkObject), EncryptionConfigurationProperty {
      /**
       * The ID of KMS encryption key used by Amazon Security Lake to encrypt the Security Lake
       * object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-datalake-encryptionconfiguration.html#cfn-securitylake-datalake-encryptionconfiguration-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securitylake.CfnDataLake.EncryptionConfigurationProperty):
          EncryptionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EncryptionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionConfigurationProperty):
          software.amazon.awscdk.services.securitylake.CfnDataLake.EncryptionConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securitylake.CfnDataLake.EncryptionConfigurationProperty
    }
  }

  /**
   * Provides data expiration details of the Amazon Security Lake object.
   *
   * You can specify your preferred Amazon S3 storage class and the time period for S3 objects to
   * stay in that storage class before they expire. For more information about Amazon S3 Lifecycle
   * configurations, see [Managing your storage
   * lifecycle](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lifecycle-mgmt.html) in
   * the *Amazon Simple Storage Service User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securitylake.*;
   * ExpirationProperty expirationProperty = ExpirationProperty.builder()
   * .days(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-datalake-expiration.html)
   */
  public interface ExpirationProperty {
    /**
     * The number of days before data expires in the Amazon Security Lake object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-datalake-expiration.html#cfn-securitylake-datalake-expiration-days)
     */
    public fun days(): Number? = unwrap(this).getDays()

    /**
     * A builder for [ExpirationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param days The number of days before data expires in the Amazon Security Lake object.
       */
      public fun days(days: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securitylake.CfnDataLake.ExpirationProperty.Builder =
          software.amazon.awscdk.services.securitylake.CfnDataLake.ExpirationProperty.builder()

      /**
       * @param days The number of days before data expires in the Amazon Security Lake object.
       */
      override fun days(days: Number) {
        cdkBuilder.days(days)
      }

      public fun build():
          software.amazon.awscdk.services.securitylake.CfnDataLake.ExpirationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securitylake.CfnDataLake.ExpirationProperty,
    ) : CdkObject(cdkObject), ExpirationProperty {
      /**
       * The number of days before data expires in the Amazon Security Lake object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-datalake-expiration.html#cfn-securitylake-datalake-expiration-days)
       */
      override fun days(): Number? = unwrap(this).getDays()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExpirationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securitylake.CfnDataLake.ExpirationProperty):
          ExpirationProperty = CdkObjectWrappers.wrap(cdkObject) as? ExpirationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExpirationProperty):
          software.amazon.awscdk.services.securitylake.CfnDataLake.ExpirationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.securitylake.CfnDataLake.ExpirationProperty
    }
  }

  /**
   * Provides lifecycle details of Amazon Security Lake object.
   *
   * To manage your data so that it is stored cost effectively, you can configure retention settings
   * for the data. You can specify your preferred Amazon S3 storage class and the time period for
   * Amazon S3 objects to stay in that storage class before they transition to a different storage
   * class or expire. For more information about Amazon S3 Lifecycle configurations, see [Managing your
   * storage
   * lifecycle](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lifecycle-mgmt.html) in
   * the *Amazon Simple Storage Service User Guide* .
   *
   * In Security Lake , you specify retention settings at the Region level. For example, you might
   * choose to transition all S3 objects in a specific AWS Region to the `S3 Standard-IA` storage class
   * 30 days after they're written to the data lake. The default Amazon S3 storage class is S3
   * Standard.
   *
   *
   * Security Lake doesn't support Amazon S3 Object Lock. When the data lake buckets are created, S3
   * Object Lock is disabled by default. Enabling S3 Object Lock with default retention mode interrupts
   * the delivery of normalized log data to the data lake.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securitylake.*;
   * LifecycleConfigurationProperty lifecycleConfigurationProperty =
   * LifecycleConfigurationProperty.builder()
   * .expiration(ExpirationProperty.builder()
   * .days(123)
   * .build())
   * .transitions(List.of(TransitionsProperty.builder()
   * .days(123)
   * .storageClass("storageClass")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-datalake-lifecycleconfiguration.html)
   */
  public interface LifecycleConfigurationProperty {
    /**
     * Provides data expiration details of the Amazon Security Lake object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-datalake-lifecycleconfiguration.html#cfn-securitylake-datalake-lifecycleconfiguration-expiration)
     */
    public fun expiration(): Any? = unwrap(this).getExpiration()

    /**
     * Provides data storage transition details of Amazon Security Lake object.
     *
     * By configuring these settings, you can specify your preferred Amazon S3 storage class and the
     * time period for S3 objects to stay in that storage class before they transition to a different
     * storage class.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-datalake-lifecycleconfiguration.html#cfn-securitylake-datalake-lifecycleconfiguration-transitions)
     */
    public fun transitions(): Any? = unwrap(this).getTransitions()

    /**
     * A builder for [LifecycleConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param expiration Provides data expiration details of the Amazon Security Lake object.
       */
      public fun expiration(expiration: IResolvable)

      /**
       * @param expiration Provides data expiration details of the Amazon Security Lake object.
       */
      public fun expiration(expiration: ExpirationProperty)

      /**
       * @param expiration Provides data expiration details of the Amazon Security Lake object.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0e191ac056fa996440f095270b37e7bf36c1ef9b13530acc80d3173766ca7cff")
      public fun expiration(expiration: ExpirationProperty.Builder.() -> Unit)

      /**
       * @param transitions Provides data storage transition details of Amazon Security Lake object.
       * By configuring these settings, you can specify your preferred Amazon S3 storage class and
       * the time period for S3 objects to stay in that storage class before they transition to a
       * different storage class.
       */
      public fun transitions(transitions: IResolvable)

      /**
       * @param transitions Provides data storage transition details of Amazon Security Lake object.
       * By configuring these settings, you can specify your preferred Amazon S3 storage class and
       * the time period for S3 objects to stay in that storage class before they transition to a
       * different storage class.
       */
      public fun transitions(transitions: List<Any>)

      /**
       * @param transitions Provides data storage transition details of Amazon Security Lake object.
       * By configuring these settings, you can specify your preferred Amazon S3 storage class and
       * the time period for S3 objects to stay in that storage class before they transition to a
       * different storage class.
       */
      public fun transitions(vararg transitions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securitylake.CfnDataLake.LifecycleConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.securitylake.CfnDataLake.LifecycleConfigurationProperty.builder()

      /**
       * @param expiration Provides data expiration details of the Amazon Security Lake object.
       */
      override fun expiration(expiration: IResolvable) {
        cdkBuilder.expiration(expiration.let(IResolvable::unwrap))
      }

      /**
       * @param expiration Provides data expiration details of the Amazon Security Lake object.
       */
      override fun expiration(expiration: ExpirationProperty) {
        cdkBuilder.expiration(expiration.let(ExpirationProperty::unwrap))
      }

      /**
       * @param expiration Provides data expiration details of the Amazon Security Lake object.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0e191ac056fa996440f095270b37e7bf36c1ef9b13530acc80d3173766ca7cff")
      override fun expiration(expiration: ExpirationProperty.Builder.() -> Unit): Unit =
          expiration(ExpirationProperty(expiration))

      /**
       * @param transitions Provides data storage transition details of Amazon Security Lake object.
       * By configuring these settings, you can specify your preferred Amazon S3 storage class and
       * the time period for S3 objects to stay in that storage class before they transition to a
       * different storage class.
       */
      override fun transitions(transitions: IResolvable) {
        cdkBuilder.transitions(transitions.let(IResolvable::unwrap))
      }

      /**
       * @param transitions Provides data storage transition details of Amazon Security Lake object.
       * By configuring these settings, you can specify your preferred Amazon S3 storage class and
       * the time period for S3 objects to stay in that storage class before they transition to a
       * different storage class.
       */
      override fun transitions(transitions: List<Any>) {
        cdkBuilder.transitions(transitions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param transitions Provides data storage transition details of Amazon Security Lake object.
       * By configuring these settings, you can specify your preferred Amazon S3 storage class and
       * the time period for S3 objects to stay in that storage class before they transition to a
       * different storage class.
       */
      override fun transitions(vararg transitions: Any): Unit = transitions(transitions.toList())

      public fun build():
          software.amazon.awscdk.services.securitylake.CfnDataLake.LifecycleConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securitylake.CfnDataLake.LifecycleConfigurationProperty,
    ) : CdkObject(cdkObject), LifecycleConfigurationProperty {
      /**
       * Provides data expiration details of the Amazon Security Lake object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-datalake-lifecycleconfiguration.html#cfn-securitylake-datalake-lifecycleconfiguration-expiration)
       */
      override fun expiration(): Any? = unwrap(this).getExpiration()

      /**
       * Provides data storage transition details of Amazon Security Lake object.
       *
       * By configuring these settings, you can specify your preferred Amazon S3 storage class and
       * the time period for S3 objects to stay in that storage class before they transition to a
       * different storage class.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-datalake-lifecycleconfiguration.html#cfn-securitylake-datalake-lifecycleconfiguration-transitions)
       */
      override fun transitions(): Any? = unwrap(this).getTransitions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LifecycleConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securitylake.CfnDataLake.LifecycleConfigurationProperty):
          LifecycleConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LifecycleConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LifecycleConfigurationProperty):
          software.amazon.awscdk.services.securitylake.CfnDataLake.LifecycleConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securitylake.CfnDataLake.LifecycleConfigurationProperty
    }
  }

  /**
   * Provides replication configuration details for objects stored in the Amazon Security Lake data
   * lake.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securitylake.*;
   * ReplicationConfigurationProperty replicationConfigurationProperty =
   * ReplicationConfigurationProperty.builder()
   * .regions(List.of("regions"))
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-datalake-replicationconfiguration.html)
   */
  public interface ReplicationConfigurationProperty {
    /**
     * Specifies one or more centralized rollup Regions.
     *
     * The AWS Region specified in the region parameter of the `CreateDataLake` or `UpdateDataLake`
     * operations contributes data to the rollup Region or Regions specified in this parameter.
     *
     * Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. S3
     * buckets that are configured for object replication can be owned by the same AWS account or by
     * different accounts. You can replicate objects to a single destination bucket or to multiple
     * destination buckets. The destination buckets can be in different Regions or within the same
     * Region as the source bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-datalake-replicationconfiguration.html#cfn-securitylake-datalake-replicationconfiguration-regions)
     */
    public fun regions(): List<String> = unwrap(this).getRegions() ?: emptyList()

    /**
     * Replication settings for the Amazon S3 buckets.
     *
     * This parameter uses the AWS Identity and Access Management (IAM) role you created that is
     * managed by Security Lake , to ensure the replication setting is correct.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-datalake-replicationconfiguration.html#cfn-securitylake-datalake-replicationconfiguration-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * A builder for [ReplicationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param regions Specifies one or more centralized rollup Regions.
       * The AWS Region specified in the region parameter of the `CreateDataLake` or
       * `UpdateDataLake` operations contributes data to the rollup Region or Regions specified in this
       * parameter.
       *
       * Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. S3
       * buckets that are configured for object replication can be owned by the same AWS account or by
       * different accounts. You can replicate objects to a single destination bucket or to multiple
       * destination buckets. The destination buckets can be in different Regions or within the same
       * Region as the source bucket.
       */
      public fun regions(regions: List<String>)

      /**
       * @param regions Specifies one or more centralized rollup Regions.
       * The AWS Region specified in the region parameter of the `CreateDataLake` or
       * `UpdateDataLake` operations contributes data to the rollup Region or Regions specified in this
       * parameter.
       *
       * Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. S3
       * buckets that are configured for object replication can be owned by the same AWS account or by
       * different accounts. You can replicate objects to a single destination bucket or to multiple
       * destination buckets. The destination buckets can be in different Regions or within the same
       * Region as the source bucket.
       */
      public fun regions(vararg regions: String)

      /**
       * @param roleArn Replication settings for the Amazon S3 buckets.
       * This parameter uses the AWS Identity and Access Management (IAM) role you created that is
       * managed by Security Lake , to ensure the replication setting is correct.
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securitylake.CfnDataLake.ReplicationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.securitylake.CfnDataLake.ReplicationConfigurationProperty.builder()

      /**
       * @param regions Specifies one or more centralized rollup Regions.
       * The AWS Region specified in the region parameter of the `CreateDataLake` or
       * `UpdateDataLake` operations contributes data to the rollup Region or Regions specified in this
       * parameter.
       *
       * Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. S3
       * buckets that are configured for object replication can be owned by the same AWS account or by
       * different accounts. You can replicate objects to a single destination bucket or to multiple
       * destination buckets. The destination buckets can be in different Regions or within the same
       * Region as the source bucket.
       */
      override fun regions(regions: List<String>) {
        cdkBuilder.regions(regions)
      }

      /**
       * @param regions Specifies one or more centralized rollup Regions.
       * The AWS Region specified in the region parameter of the `CreateDataLake` or
       * `UpdateDataLake` operations contributes data to the rollup Region or Regions specified in this
       * parameter.
       *
       * Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. S3
       * buckets that are configured for object replication can be owned by the same AWS account or by
       * different accounts. You can replicate objects to a single destination bucket or to multiple
       * destination buckets. The destination buckets can be in different Regions or within the same
       * Region as the source bucket.
       */
      override fun regions(vararg regions: String): Unit = regions(regions.toList())

      /**
       * @param roleArn Replication settings for the Amazon S3 buckets.
       * This parameter uses the AWS Identity and Access Management (IAM) role you created that is
       * managed by Security Lake , to ensure the replication setting is correct.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.securitylake.CfnDataLake.ReplicationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securitylake.CfnDataLake.ReplicationConfigurationProperty,
    ) : CdkObject(cdkObject), ReplicationConfigurationProperty {
      /**
       * Specifies one or more centralized rollup Regions.
       *
       * The AWS Region specified in the region parameter of the `CreateDataLake` or
       * `UpdateDataLake` operations contributes data to the rollup Region or Regions specified in this
       * parameter.
       *
       * Replication enables automatic, asynchronous copying of objects across Amazon S3 buckets. S3
       * buckets that are configured for object replication can be owned by the same AWS account or by
       * different accounts. You can replicate objects to a single destination bucket or to multiple
       * destination buckets. The destination buckets can be in different Regions or within the same
       * Region as the source bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-datalake-replicationconfiguration.html#cfn-securitylake-datalake-replicationconfiguration-regions)
       */
      override fun regions(): List<String> = unwrap(this).getRegions() ?: emptyList()

      /**
       * Replication settings for the Amazon S3 buckets.
       *
       * This parameter uses the AWS Identity and Access Management (IAM) role you created that is
       * managed by Security Lake , to ensure the replication setting is correct.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-datalake-replicationconfiguration.html#cfn-securitylake-datalake-replicationconfiguration-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securitylake.CfnDataLake.ReplicationConfigurationProperty):
          ReplicationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ReplicationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationConfigurationProperty):
          software.amazon.awscdk.services.securitylake.CfnDataLake.ReplicationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securitylake.CfnDataLake.ReplicationConfigurationProperty
    }
  }

  /**
   * Provides transition lifecycle details of the Amazon Security Lake object.
   *
   * For more information about Amazon S3 Lifecycle configurations, see [Managing your storage
   * lifecycle](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lifecycle-mgmt.html) in
   * the *Amazon Simple Storage Service User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securitylake.*;
   * TransitionsProperty transitionsProperty = TransitionsProperty.builder()
   * .days(123)
   * .storageClass("storageClass")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-datalake-transitions.html)
   */
  public interface TransitionsProperty {
    /**
     * The number of days before data transitions to a different S3 Storage Class in the Amazon
     * Security Lake object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-datalake-transitions.html#cfn-securitylake-datalake-transitions-days)
     */
    public fun days(): Number? = unwrap(this).getDays()

    /**
     * The list of storage classes that you can choose from based on the data access, resiliency,
     * and cost requirements of your workloads.
     *
     * The default storage class is S3 Standard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-datalake-transitions.html#cfn-securitylake-datalake-transitions-storageclass)
     */
    public fun storageClass(): String? = unwrap(this).getStorageClass()

    /**
     * A builder for [TransitionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param days The number of days before data transitions to a different S3 Storage Class in
       * the Amazon Security Lake object.
       */
      public fun days(days: Number)

      /**
       * @param storageClass The list of storage classes that you can choose from based on the data
       * access, resiliency, and cost requirements of your workloads.
       * The default storage class is S3 Standard.
       */
      public fun storageClass(storageClass: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securitylake.CfnDataLake.TransitionsProperty.Builder =
          software.amazon.awscdk.services.securitylake.CfnDataLake.TransitionsProperty.builder()

      /**
       * @param days The number of days before data transitions to a different S3 Storage Class in
       * the Amazon Security Lake object.
       */
      override fun days(days: Number) {
        cdkBuilder.days(days)
      }

      /**
       * @param storageClass The list of storage classes that you can choose from based on the data
       * access, resiliency, and cost requirements of your workloads.
       * The default storage class is S3 Standard.
       */
      override fun storageClass(storageClass: String) {
        cdkBuilder.storageClass(storageClass)
      }

      public fun build():
          software.amazon.awscdk.services.securitylake.CfnDataLake.TransitionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securitylake.CfnDataLake.TransitionsProperty,
    ) : CdkObject(cdkObject), TransitionsProperty {
      /**
       * The number of days before data transitions to a different S3 Storage Class in the Amazon
       * Security Lake object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-datalake-transitions.html#cfn-securitylake-datalake-transitions-days)
       */
      override fun days(): Number? = unwrap(this).getDays()

      /**
       * The list of storage classes that you can choose from based on the data access, resiliency,
       * and cost requirements of your workloads.
       *
       * The default storage class is S3 Standard.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-datalake-transitions.html#cfn-securitylake-datalake-transitions-storageclass)
       */
      override fun storageClass(): String? = unwrap(this).getStorageClass()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TransitionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securitylake.CfnDataLake.TransitionsProperty):
          TransitionsProperty = CdkObjectWrappers.wrap(cdkObject) as? TransitionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransitionsProperty):
          software.amazon.awscdk.services.securitylake.CfnDataLake.TransitionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.securitylake.CfnDataLake.TransitionsProperty
    }
  }
}
