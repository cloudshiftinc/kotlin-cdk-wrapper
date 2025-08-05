@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.athena

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
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The AWS::Athena::WorkGroup resource specifies an Amazon Athena workgroup, which contains a name,
 * description, creation time, state, and other configuration, listed under `WorkGroupConfiguration` .
 *
 * Each workgroup enables you to isolate queries for you or your group from other queries in the
 * same account. For more information, see
 * [CreateWorkGroup](https://docs.aws.amazon.com/athena/latest/APIReference/API_CreateWorkGroup.html)
 * in the *Amazon Athena API Reference* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.athena.*;
 * CfnWorkGroup cfnWorkGroup = CfnWorkGroup.Builder.create(this, "MyCfnWorkGroup")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .recursiveDeleteOption(false)
 * .state("state")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .workGroupConfiguration(WorkGroupConfigurationProperty.builder()
 * .additionalConfiguration("additionalConfiguration")
 * .bytesScannedCutoffPerQuery(123)
 * .customerContentEncryptionConfiguration(CustomerContentEncryptionConfigurationProperty.builder()
 * .kmsKey("kmsKey")
 * .build())
 * .enforceWorkGroupConfiguration(false)
 * .engineVersion(EngineVersionProperty.builder()
 * .effectiveEngineVersion("effectiveEngineVersion")
 * .selectedEngineVersion("selectedEngineVersion")
 * .build())
 * .executionRole("executionRole")
 * .managedQueryResultsConfiguration(ManagedQueryResultsConfigurationProperty.builder()
 * .enabled(false)
 * .encryptionConfiguration(ManagedStorageEncryptionConfigurationProperty.builder()
 * .kmsKey("kmsKey")
 * .build())
 * .build())
 * .publishCloudWatchMetricsEnabled(false)
 * .requesterPaysEnabled(false)
 * .resultConfiguration(ResultConfigurationProperty.builder()
 * .aclConfiguration(AclConfigurationProperty.builder()
 * .s3AclOption("s3AclOption")
 * .build())
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .encryptionOption("encryptionOption")
 * // the properties below are optional
 * .kmsKey("kmsKey")
 * .build())
 * .expectedBucketOwner("expectedBucketOwner")
 * .outputLocation("outputLocation")
 * .build())
 * .build())
 * .workGroupConfigurationUpdates(WorkGroupConfigurationUpdatesProperty.builder()
 * .additionalConfiguration("additionalConfiguration")
 * .bytesScannedCutoffPerQuery(123)
 * .customerContentEncryptionConfiguration(CustomerContentEncryptionConfigurationProperty.builder()
 * .kmsKey("kmsKey")
 * .build())
 * .enforceWorkGroupConfiguration(false)
 * .engineVersion(EngineVersionProperty.builder()
 * .effectiveEngineVersion("effectiveEngineVersion")
 * .selectedEngineVersion("selectedEngineVersion")
 * .build())
 * .executionRole("executionRole")
 * .managedQueryResultsConfiguration(ManagedQueryResultsConfigurationProperty.builder()
 * .enabled(false)
 * .encryptionConfiguration(ManagedStorageEncryptionConfigurationProperty.builder()
 * .kmsKey("kmsKey")
 * .build())
 * .build())
 * .publishCloudWatchMetricsEnabled(false)
 * .removeBytesScannedCutoffPerQuery(false)
 * .removeCustomerContentEncryptionConfiguration(false)
 * .requesterPaysEnabled(false)
 * .resultConfigurationUpdates(ResultConfigurationUpdatesProperty.builder()
 * .aclConfiguration(AclConfigurationProperty.builder()
 * .s3AclOption("s3AclOption")
 * .build())
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .encryptionOption("encryptionOption")
 * // the properties below are optional
 * .kmsKey("kmsKey")
 * .build())
 * .expectedBucketOwner("expectedBucketOwner")
 * .outputLocation("outputLocation")
 * .removeAclConfiguration(false)
 * .removeEncryptionConfiguration(false)
 * .removeExpectedBucketOwner(false)
 * .removeOutputLocation(false)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html)
 */
public open class CfnWorkGroup(
  cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWorkGroupProps,
  ) :
      this(software.amazon.awscdk.services.athena.CfnWorkGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnWorkGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWorkGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnWorkGroupProps(props)
  )

  /**
   * The date and time the workgroup was created, as a UNIX timestamp in seconds.
   *
   * For example: `1582761016` .
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * Read only.
   *
   * The engine version on which the query runs. If the user requests a valid engine version other
   * than Auto, the effective engine version is the same as the engine version that the user requested.
   * If the user requests Auto, the effective engine version is chosen by Athena. When a request to
   * update the engine version is made by a CreateWorkGroup or UpdateWorkGroup operation, the
   * EffectiveEngineVersion field is ignored.
   */
  public open fun attrWorkGroupConfigurationEngineVersionEffectiveEngineVersion(): String =
      unwrap(this).getAttrWorkGroupConfigurationEngineVersionEffectiveEngineVersion()

  /**
   * Read only.
   *
   * The engine version on which the query runs. If the user requests a valid engine version other
   * than Auto, the effective engine version is the same as the engine version that the user requested.
   * If the user requests Auto, the effective engine version is chosen by Athena. When a request to
   * update the engine version is made by a `CreateWorkGroup` or `UpdateWorkGroup` operation, the
   * `EffectiveEngineVersion` field is ignored.
   */
  public open fun attrWorkGroupConfigurationUpdatesEngineVersionEffectiveEngineVersion(): String =
      unwrap(this).getAttrWorkGroupConfigurationUpdatesEngineVersionEffectiveEngineVersion()

  /**
   * The workgroup description.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The workgroup description.
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
   * The workgroup name.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The workgroup name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The option to delete a workgroup and its contents even if the workgroup contains any named
   * queries.
   */
  public open fun recursiveDeleteOption(): Any? = unwrap(this).getRecursiveDeleteOption()

  /**
   * The option to delete a workgroup and its contents even if the workgroup contains any named
   * queries.
   */
  public open fun recursiveDeleteOption(`value`: Boolean) {
    unwrap(this).setRecursiveDeleteOption(`value`)
  }

  /**
   * The option to delete a workgroup and its contents even if the workgroup contains any named
   * queries.
   */
  public open fun recursiveDeleteOption(`value`: IResolvable) {
    unwrap(this).setRecursiveDeleteOption(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The state of the workgroup: ENABLED or DISABLED.
   */
  public open fun state(): String? = unwrap(this).getState()

  /**
   * The state of the workgroup: ENABLED or DISABLED.
   */
  public open fun state(`value`: String) {
    unwrap(this).setState(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags (key-value pairs) to associate with this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags (key-value pairs) to associate with this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags (key-value pairs) to associate with this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The configuration of the workgroup, which includes the location in Amazon S3 where query
   * results are stored, the encryption option, if any, used for query results, whether Amazon
   * CloudWatch Metrics are enabled for the workgroup, and the limit for the amount of bytes scanned
   * (cutoff) per query, if it is specified.
   */
  public open fun workGroupConfiguration(): Any? = unwrap(this).getWorkGroupConfiguration()

  /**
   * The configuration of the workgroup, which includes the location in Amazon S3 where query
   * results are stored, the encryption option, if any, used for query results, whether Amazon
   * CloudWatch Metrics are enabled for the workgroup, and the limit for the amount of bytes scanned
   * (cutoff) per query, if it is specified.
   */
  public open fun workGroupConfiguration(`value`: IResolvable) {
    unwrap(this).setWorkGroupConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration of the workgroup, which includes the location in Amazon S3 where query
   * results are stored, the encryption option, if any, used for query results, whether Amazon
   * CloudWatch Metrics are enabled for the workgroup, and the limit for the amount of bytes scanned
   * (cutoff) per query, if it is specified.
   */
  public open fun workGroupConfiguration(`value`: WorkGroupConfigurationProperty) {
    unwrap(this).setWorkGroupConfiguration(`value`.let(WorkGroupConfigurationProperty.Companion::unwrap))
  }

  /**
   * The configuration of the workgroup, which includes the location in Amazon S3 where query
   * results are stored, the encryption option, if any, used for query results, whether Amazon
   * CloudWatch Metrics are enabled for the workgroup, and the limit for the amount of bytes scanned
   * (cutoff) per query, if it is specified.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("08197e3fea4e971d51770d7d6af42009dd155bda64d71821f596e2f93d8aa30c")
  public open
      fun workGroupConfiguration(`value`: WorkGroupConfigurationProperty.Builder.() -> Unit): Unit =
      workGroupConfiguration(WorkGroupConfigurationProperty(`value`))

  /**
   * (deprecated) The configuration information that will be updated for this workgroup, which
   * includes the location in Amazon S3 where query results are stored, the encryption option, if any,
   * used for query results, whether the Amazon CloudWatch Metrics are enabled for the workgroup,
   * whether the workgroup settings override the client-side settings, and the data usage limit for the
   * amount of bytes scanned per query, if it is specified.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun workGroupConfigurationUpdates(): Any? =
      unwrap(this).getWorkGroupConfigurationUpdates()

  /**
   * (deprecated) The configuration information that will be updated for this workgroup, which
   * includes the location in Amazon S3 where query results are stored, the encryption option, if any,
   * used for query results, whether the Amazon CloudWatch Metrics are enabled for the workgroup,
   * whether the workgroup settings override the client-side settings, and the data usage limit for the
   * amount of bytes scanned per query, if it is specified.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun workGroupConfigurationUpdates(`value`: IResolvable) {
    unwrap(this).setWorkGroupConfigurationUpdates(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * (deprecated) The configuration information that will be updated for this workgroup, which
   * includes the location in Amazon S3 where query results are stored, the encryption option, if any,
   * used for query results, whether the Amazon CloudWatch Metrics are enabled for the workgroup,
   * whether the workgroup settings override the client-side settings, and the data usage limit for the
   * amount of bytes scanned per query, if it is specified.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun workGroupConfigurationUpdates(`value`: WorkGroupConfigurationUpdatesProperty) {
    unwrap(this).setWorkGroupConfigurationUpdates(`value`.let(WorkGroupConfigurationUpdatesProperty.Companion::unwrap))
  }

  /**
   * (deprecated) The configuration information that will be updated for this workgroup, which
   * includes the location in Amazon S3 where query results are stored, the encryption option, if any,
   * used for query results, whether the Amazon CloudWatch Metrics are enabled for the workgroup,
   * whether the workgroup settings override the client-side settings, and the data usage limit for the
   * amount of bytes scanned per query, if it is specified.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("81379921322b3083fce70b877509398af0dda282e1c4b62f97bad46eefba2cff")
  public open
      fun workGroupConfigurationUpdates(`value`: WorkGroupConfigurationUpdatesProperty.Builder.() -> Unit):
      Unit = workGroupConfigurationUpdates(WorkGroupConfigurationUpdatesProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.athena.CfnWorkGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The workgroup description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-description)
     * @param description The workgroup description. 
     */
    public fun description(description: String)

    /**
     * The workgroup name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-name)
     * @param name The workgroup name. 
     */
    public fun name(name: String)

    /**
     * The option to delete a workgroup and its contents even if the workgroup contains any named
     * queries.
     *
     * The default is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-recursivedeleteoption)
     * @param recursiveDeleteOption The option to delete a workgroup and its contents even if the
     * workgroup contains any named queries. 
     */
    public fun recursiveDeleteOption(recursiveDeleteOption: Boolean)

    /**
     * The option to delete a workgroup and its contents even if the workgroup contains any named
     * queries.
     *
     * The default is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-recursivedeleteoption)
     * @param recursiveDeleteOption The option to delete a workgroup and its contents even if the
     * workgroup contains any named queries. 
     */
    public fun recursiveDeleteOption(recursiveDeleteOption: IResolvable)

    /**
     * The state of the workgroup: ENABLED or DISABLED.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-state)
     * @param state The state of the workgroup: ENABLED or DISABLED. 
     */
    public fun state(state: String)

    /**
     * The tags (key-value pairs) to associate with this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-tags)
     * @param tags The tags (key-value pairs) to associate with this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags (key-value pairs) to associate with this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-tags)
     * @param tags The tags (key-value pairs) to associate with this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The configuration of the workgroup, which includes the location in Amazon S3 where query
     * results are stored, the encryption option, if any, used for query results, whether Amazon
     * CloudWatch Metrics are enabled for the workgroup, and the limit for the amount of bytes scanned
     * (cutoff) per query, if it is specified.
     *
     * The `EnforceWorkGroupConfiguration` option determines whether workgroup settings override
     * client-side query settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-workgroupconfiguration)
     * @param workGroupConfiguration The configuration of the workgroup, which includes the location
     * in Amazon S3 where query results are stored, the encryption option, if any, used for query
     * results, whether Amazon CloudWatch Metrics are enabled for the workgroup, and the limit for the
     * amount of bytes scanned (cutoff) per query, if it is specified. 
     */
    public fun workGroupConfiguration(workGroupConfiguration: IResolvable)

    /**
     * The configuration of the workgroup, which includes the location in Amazon S3 where query
     * results are stored, the encryption option, if any, used for query results, whether Amazon
     * CloudWatch Metrics are enabled for the workgroup, and the limit for the amount of bytes scanned
     * (cutoff) per query, if it is specified.
     *
     * The `EnforceWorkGroupConfiguration` option determines whether workgroup settings override
     * client-side query settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-workgroupconfiguration)
     * @param workGroupConfiguration The configuration of the workgroup, which includes the location
     * in Amazon S3 where query results are stored, the encryption option, if any, used for query
     * results, whether Amazon CloudWatch Metrics are enabled for the workgroup, and the limit for the
     * amount of bytes scanned (cutoff) per query, if it is specified. 
     */
    public fun workGroupConfiguration(workGroupConfiguration: WorkGroupConfigurationProperty)

    /**
     * The configuration of the workgroup, which includes the location in Amazon S3 where query
     * results are stored, the encryption option, if any, used for query results, whether Amazon
     * CloudWatch Metrics are enabled for the workgroup, and the limit for the amount of bytes scanned
     * (cutoff) per query, if it is specified.
     *
     * The `EnforceWorkGroupConfiguration` option determines whether workgroup settings override
     * client-side query settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-workgroupconfiguration)
     * @param workGroupConfiguration The configuration of the workgroup, which includes the location
     * in Amazon S3 where query results are stored, the encryption option, if any, used for query
     * results, whether Amazon CloudWatch Metrics are enabled for the workgroup, and the limit for the
     * amount of bytes scanned (cutoff) per query, if it is specified. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bdbf5df75bff28bcf2c4c135c41719aff877729fee462a9515aa8f25de7d5083")
    public
        fun workGroupConfiguration(workGroupConfiguration: WorkGroupConfigurationProperty.Builder.() -> Unit)

    /**
     * (deprecated) The configuration information that will be updated for this workgroup, which
     * includes the location in Amazon S3 where query results are stored, the encryption option, if
     * any, used for query results, whether the Amazon CloudWatch Metrics are enabled for the
     * workgroup, whether the workgroup settings override the client-side settings, and the data usage
     * limit for the amount of bytes scanned per query, if it is specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-workgroupconfigurationupdates)
     * @deprecated this property has been deprecated
     * @param workGroupConfigurationUpdates The configuration information that will be updated for
     * this workgroup, which includes the location in Amazon S3 where query results are stored, the
     * encryption option, if any, used for query results, whether the Amazon CloudWatch Metrics are
     * enabled for the workgroup, whether the workgroup settings override the client-side settings, and
     * the data usage limit for the amount of bytes scanned per query, if it is specified. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: IResolvable)

    /**
     * (deprecated) The configuration information that will be updated for this workgroup, which
     * includes the location in Amazon S3 where query results are stored, the encryption option, if
     * any, used for query results, whether the Amazon CloudWatch Metrics are enabled for the
     * workgroup, whether the workgroup settings override the client-side settings, and the data usage
     * limit for the amount of bytes scanned per query, if it is specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-workgroupconfigurationupdates)
     * @deprecated this property has been deprecated
     * @param workGroupConfigurationUpdates The configuration information that will be updated for
     * this workgroup, which includes the location in Amazon S3 where query results are stored, the
     * encryption option, if any, used for query results, whether the Amazon CloudWatch Metrics are
     * enabled for the workgroup, whether the workgroup settings override the client-side settings, and
     * the data usage limit for the amount of bytes scanned per query, if it is specified. 
     */
    @Deprecated(message = "deprecated in CDK")
    public
        fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: WorkGroupConfigurationUpdatesProperty)

    /**
     * (deprecated) The configuration information that will be updated for this workgroup, which
     * includes the location in Amazon S3 where query results are stored, the encryption option, if
     * any, used for query results, whether the Amazon CloudWatch Metrics are enabled for the
     * workgroup, whether the workgroup settings override the client-side settings, and the data usage
     * limit for the amount of bytes scanned per query, if it is specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-workgroupconfigurationupdates)
     * @deprecated this property has been deprecated
     * @param workGroupConfigurationUpdates The configuration information that will be updated for
     * this workgroup, which includes the location in Amazon S3 where query results are stored, the
     * encryption option, if any, used for query results, whether the Amazon CloudWatch Metrics are
     * enabled for the workgroup, whether the workgroup settings override the client-side settings, and
     * the data usage limit for the amount of bytes scanned per query, if it is specified. 
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95c10e9a5235a94633db4c700f62ba4abe1b553349608ed18808f312a27a927f")
    public
        fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: WorkGroupConfigurationUpdatesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.athena.CfnWorkGroup.Builder =
        software.amazon.awscdk.services.athena.CfnWorkGroup.Builder.create(scope, id)

    /**
     * The workgroup description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-description)
     * @param description The workgroup description. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The workgroup name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-name)
     * @param name The workgroup name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The option to delete a workgroup and its contents even if the workgroup contains any named
     * queries.
     *
     * The default is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-recursivedeleteoption)
     * @param recursiveDeleteOption The option to delete a workgroup and its contents even if the
     * workgroup contains any named queries. 
     */
    override fun recursiveDeleteOption(recursiveDeleteOption: Boolean) {
      cdkBuilder.recursiveDeleteOption(recursiveDeleteOption)
    }

    /**
     * The option to delete a workgroup and its contents even if the workgroup contains any named
     * queries.
     *
     * The default is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-recursivedeleteoption)
     * @param recursiveDeleteOption The option to delete a workgroup and its contents even if the
     * workgroup contains any named queries. 
     */
    override fun recursiveDeleteOption(recursiveDeleteOption: IResolvable) {
      cdkBuilder.recursiveDeleteOption(recursiveDeleteOption.let(IResolvable.Companion::unwrap))
    }

    /**
     * The state of the workgroup: ENABLED or DISABLED.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-state)
     * @param state The state of the workgroup: ENABLED or DISABLED. 
     */
    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    /**
     * The tags (key-value pairs) to associate with this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-tags)
     * @param tags The tags (key-value pairs) to associate with this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags (key-value pairs) to associate with this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-tags)
     * @param tags The tags (key-value pairs) to associate with this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The configuration of the workgroup, which includes the location in Amazon S3 where query
     * results are stored, the encryption option, if any, used for query results, whether Amazon
     * CloudWatch Metrics are enabled for the workgroup, and the limit for the amount of bytes scanned
     * (cutoff) per query, if it is specified.
     *
     * The `EnforceWorkGroupConfiguration` option determines whether workgroup settings override
     * client-side query settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-workgroupconfiguration)
     * @param workGroupConfiguration The configuration of the workgroup, which includes the location
     * in Amazon S3 where query results are stored, the encryption option, if any, used for query
     * results, whether Amazon CloudWatch Metrics are enabled for the workgroup, and the limit for the
     * amount of bytes scanned (cutoff) per query, if it is specified. 
     */
    override fun workGroupConfiguration(workGroupConfiguration: IResolvable) {
      cdkBuilder.workGroupConfiguration(workGroupConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration of the workgroup, which includes the location in Amazon S3 where query
     * results are stored, the encryption option, if any, used for query results, whether Amazon
     * CloudWatch Metrics are enabled for the workgroup, and the limit for the amount of bytes scanned
     * (cutoff) per query, if it is specified.
     *
     * The `EnforceWorkGroupConfiguration` option determines whether workgroup settings override
     * client-side query settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-workgroupconfiguration)
     * @param workGroupConfiguration The configuration of the workgroup, which includes the location
     * in Amazon S3 where query results are stored, the encryption option, if any, used for query
     * results, whether Amazon CloudWatch Metrics are enabled for the workgroup, and the limit for the
     * amount of bytes scanned (cutoff) per query, if it is specified. 
     */
    override fun workGroupConfiguration(workGroupConfiguration: WorkGroupConfigurationProperty) {
      cdkBuilder.workGroupConfiguration(workGroupConfiguration.let(WorkGroupConfigurationProperty.Companion::unwrap))
    }

    /**
     * The configuration of the workgroup, which includes the location in Amazon S3 where query
     * results are stored, the encryption option, if any, used for query results, whether Amazon
     * CloudWatch Metrics are enabled for the workgroup, and the limit for the amount of bytes scanned
     * (cutoff) per query, if it is specified.
     *
     * The `EnforceWorkGroupConfiguration` option determines whether workgroup settings override
     * client-side query settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-workgroupconfiguration)
     * @param workGroupConfiguration The configuration of the workgroup, which includes the location
     * in Amazon S3 where query results are stored, the encryption option, if any, used for query
     * results, whether Amazon CloudWatch Metrics are enabled for the workgroup, and the limit for the
     * amount of bytes scanned (cutoff) per query, if it is specified. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bdbf5df75bff28bcf2c4c135c41719aff877729fee462a9515aa8f25de7d5083")
    override
        fun workGroupConfiguration(workGroupConfiguration: WorkGroupConfigurationProperty.Builder.() -> Unit):
        Unit = workGroupConfiguration(WorkGroupConfigurationProperty(workGroupConfiguration))

    /**
     * (deprecated) The configuration information that will be updated for this workgroup, which
     * includes the location in Amazon S3 where query results are stored, the encryption option, if
     * any, used for query results, whether the Amazon CloudWatch Metrics are enabled for the
     * workgroup, whether the workgroup settings override the client-side settings, and the data usage
     * limit for the amount of bytes scanned per query, if it is specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-workgroupconfigurationupdates)
     * @deprecated this property has been deprecated
     * @param workGroupConfigurationUpdates The configuration information that will be updated for
     * this workgroup, which includes the location in Amazon S3 where query results are stored, the
     * encryption option, if any, used for query results, whether the Amazon CloudWatch Metrics are
     * enabled for the workgroup, whether the workgroup settings override the client-side settings, and
     * the data usage limit for the amount of bytes scanned per query, if it is specified. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: IResolvable) {
      cdkBuilder.workGroupConfigurationUpdates(workGroupConfigurationUpdates.let(IResolvable.Companion::unwrap))
    }

    /**
     * (deprecated) The configuration information that will be updated for this workgroup, which
     * includes the location in Amazon S3 where query results are stored, the encryption option, if
     * any, used for query results, whether the Amazon CloudWatch Metrics are enabled for the
     * workgroup, whether the workgroup settings override the client-side settings, and the data usage
     * limit for the amount of bytes scanned per query, if it is specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-workgroupconfigurationupdates)
     * @deprecated this property has been deprecated
     * @param workGroupConfigurationUpdates The configuration information that will be updated for
     * this workgroup, which includes the location in Amazon S3 where query results are stored, the
     * encryption option, if any, used for query results, whether the Amazon CloudWatch Metrics are
     * enabled for the workgroup, whether the workgroup settings override the client-side settings, and
     * the data usage limit for the amount of bytes scanned per query, if it is specified. 
     */
    @Deprecated(message = "deprecated in CDK")
    override
        fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: WorkGroupConfigurationUpdatesProperty) {
      cdkBuilder.workGroupConfigurationUpdates(workGroupConfigurationUpdates.let(WorkGroupConfigurationUpdatesProperty.Companion::unwrap))
    }

    /**
     * (deprecated) The configuration information that will be updated for this workgroup, which
     * includes the location in Amazon S3 where query results are stored, the encryption option, if
     * any, used for query results, whether the Amazon CloudWatch Metrics are enabled for the
     * workgroup, whether the workgroup settings override the client-side settings, and the data usage
     * limit for the amount of bytes scanned per query, if it is specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-workgroupconfigurationupdates)
     * @deprecated this property has been deprecated
     * @param workGroupConfigurationUpdates The configuration information that will be updated for
     * this workgroup, which includes the location in Amazon S3 where query results are stored, the
     * encryption option, if any, used for query results, whether the Amazon CloudWatch Metrics are
     * enabled for the workgroup, whether the workgroup settings override the client-side settings, and
     * the data usage limit for the amount of bytes scanned per query, if it is specified. 
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95c10e9a5235a94633db4c700f62ba4abe1b553349608ed18808f312a27a927f")
    override
        fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: WorkGroupConfigurationUpdatesProperty.Builder.() -> Unit):
        Unit =
        workGroupConfigurationUpdates(WorkGroupConfigurationUpdatesProperty(workGroupConfigurationUpdates))

    public fun build(): software.amazon.awscdk.services.athena.CfnWorkGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.athena.CfnWorkGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWorkGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWorkGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup): CfnWorkGroup
        = CfnWorkGroup(cdkObject)

    internal fun unwrap(wrapped: CfnWorkGroup): software.amazon.awscdk.services.athena.CfnWorkGroup
        = wrapped.cdkObject as software.amazon.awscdk.services.athena.CfnWorkGroup
  }

  /**
   * Indicates that an Amazon S3 canned ACL should be set to control ownership of stored query
   * results, including data files inserted by Athena as the result of statements like CTAS or INSERT
   * INTO.
   *
   * When Athena stores query results in Amazon S3, the canned ACL is set with the `x-amz-acl`
   * request header. For more information about S3 Object Ownership, see [Object Ownership
   * settings](https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html#object-ownership-overview)
   * in the *Amazon S3 User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.athena.*;
   * AclConfigurationProperty aclConfigurationProperty = AclConfigurationProperty.builder()
   * .s3AclOption("s3AclOption")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-aclconfiguration.html)
   */
  public interface AclConfigurationProperty {
    /**
     * The Amazon S3 canned ACL that Athena should specify when storing query results, including
     * data files inserted by Athena as the result of statements like CTAS or INSERT INTO.
     *
     * Currently the only supported canned ACL is `BUCKET_OWNER_FULL_CONTROL` . If a query runs in a
     * workgroup and the workgroup overrides client-side settings, then the Amazon S3 canned ACL
     * specified in the workgroup's settings is used for all queries that run in the workgroup. For
     * more information about Amazon S3 canned ACLs, see [Canned
     * ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) in the
     * *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-aclconfiguration.html#cfn-athena-workgroup-aclconfiguration-s3acloption)
     */
    public fun s3AclOption(): String

    /**
     * A builder for [AclConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3AclOption The Amazon S3 canned ACL that Athena should specify when storing query
       * results, including data files inserted by Athena as the result of statements like CTAS or
       * INSERT INTO. 
       * Currently the only supported canned ACL is `BUCKET_OWNER_FULL_CONTROL` . If a query runs in
       * a workgroup and the workgroup overrides client-side settings, then the Amazon S3 canned ACL
       * specified in the workgroup's settings is used for all queries that run in the workgroup. For
       * more information about Amazon S3 canned ACLs, see [Canned
       * ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) in
       * the *Amazon S3 User Guide* .
       */
      public fun s3AclOption(s3AclOption: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.athena.CfnWorkGroup.AclConfigurationProperty.Builder =
          software.amazon.awscdk.services.athena.CfnWorkGroup.AclConfigurationProperty.builder()

      /**
       * @param s3AclOption The Amazon S3 canned ACL that Athena should specify when storing query
       * results, including data files inserted by Athena as the result of statements like CTAS or
       * INSERT INTO. 
       * Currently the only supported canned ACL is `BUCKET_OWNER_FULL_CONTROL` . If a query runs in
       * a workgroup and the workgroup overrides client-side settings, then the Amazon S3 canned ACL
       * specified in the workgroup's settings is used for all queries that run in the workgroup. For
       * more information about Amazon S3 canned ACLs, see [Canned
       * ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) in
       * the *Amazon S3 User Guide* .
       */
      override fun s3AclOption(s3AclOption: String) {
        cdkBuilder.s3AclOption(s3AclOption)
      }

      public fun build():
          software.amazon.awscdk.services.athena.CfnWorkGroup.AclConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.AclConfigurationProperty,
    ) : CdkObject(cdkObject),
        AclConfigurationProperty {
      /**
       * The Amazon S3 canned ACL that Athena should specify when storing query results, including
       * data files inserted by Athena as the result of statements like CTAS or INSERT INTO.
       *
       * Currently the only supported canned ACL is `BUCKET_OWNER_FULL_CONTROL` . If a query runs in
       * a workgroup and the workgroup overrides client-side settings, then the Amazon S3 canned ACL
       * specified in the workgroup's settings is used for all queries that run in the workgroup. For
       * more information about Amazon S3 canned ACLs, see [Canned
       * ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) in
       * the *Amazon S3 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-aclconfiguration.html#cfn-athena-workgroup-aclconfiguration-s3acloption)
       */
      override fun s3AclOption(): String = unwrap(this).getS3AclOption()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AclConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.AclConfigurationProperty):
          AclConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? AclConfigurationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AclConfigurationProperty):
          software.amazon.awscdk.services.athena.CfnWorkGroup.AclConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.athena.CfnWorkGroup.AclConfigurationProperty
    }
  }

  /**
   * Specifies the customer managed KMS key that is used to encrypt the user's data stores in
   * Athena.
   *
   * When an AWS managed key is used, this value is null. This setting does not apply to Athena SQL
   * workgroups.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.athena.*;
   * CustomerContentEncryptionConfigurationProperty customerContentEncryptionConfigurationProperty =
   * CustomerContentEncryptionConfigurationProperty.builder()
   * .kmsKey("kmsKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-customercontentencryptionconfiguration.html)
   */
  public interface CustomerContentEncryptionConfigurationProperty {
    /**
     * The customer managed KMS key that is used to encrypt the user's data stores in Athena.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-customercontentencryptionconfiguration.html#cfn-athena-workgroup-customercontentencryptionconfiguration-kmskey)
     */
    public fun kmsKey(): String

    /**
     * A builder for [CustomerContentEncryptionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKey The customer managed KMS key that is used to encrypt the user's data stores
       * in Athena. 
       */
      public fun kmsKey(kmsKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.athena.CfnWorkGroup.CustomerContentEncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.athena.CfnWorkGroup.CustomerContentEncryptionConfigurationProperty.builder()

      /**
       * @param kmsKey The customer managed KMS key that is used to encrypt the user's data stores
       * in Athena. 
       */
      override fun kmsKey(kmsKey: String) {
        cdkBuilder.kmsKey(kmsKey)
      }

      public fun build():
          software.amazon.awscdk.services.athena.CfnWorkGroup.CustomerContentEncryptionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.CustomerContentEncryptionConfigurationProperty,
    ) : CdkObject(cdkObject),
        CustomerContentEncryptionConfigurationProperty {
      /**
       * The customer managed KMS key that is used to encrypt the user's data stores in Athena.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-customercontentencryptionconfiguration.html#cfn-athena-workgroup-customercontentencryptionconfiguration-kmskey)
       */
      override fun kmsKey(): String = unwrap(this).getKmsKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomerContentEncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.CustomerContentEncryptionConfigurationProperty):
          CustomerContentEncryptionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomerContentEncryptionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomerContentEncryptionConfigurationProperty):
          software.amazon.awscdk.services.athena.CfnWorkGroup.CustomerContentEncryptionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.athena.CfnWorkGroup.CustomerContentEncryptionConfigurationProperty
    }
  }

  /**
   * If query results are encrypted in Amazon S3, indicates the encryption option used (for example,
   * `SSE_KMS` or `CSE_KMS` ) and key information.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.athena.*;
   * EncryptionConfigurationProperty encryptionConfigurationProperty =
   * EncryptionConfigurationProperty.builder()
   * .encryptionOption("encryptionOption")
   * // the properties below are optional
   * .kmsKey("kmsKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-encryptionconfiguration.html)
   */
  public interface EncryptionConfigurationProperty {
    /**
     * Indicates whether Amazon S3 server-side encryption with Amazon S3-managed keys ( `SSE_S3` ),
     * server-side encryption with KMS-managed keys ( `SSE_KMS` ), or client-side encryption with
     * KMS-managed keys ( `CSE_KMS` ) is used.
     *
     * If a query runs in a workgroup and the workgroup overrides client-side settings, then the
     * workgroup's setting for encryption is used. It specifies whether query results must be
     * encrypted, for all queries that run in this workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-encryptionconfiguration.html#cfn-athena-workgroup-encryptionconfiguration-encryptionoption)
     */
    public fun encryptionOption(): String

    /**
     * For `SSE_KMS` and `CSE_KMS` , this is the KMS key ARN or ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-encryptionconfiguration.html#cfn-athena-workgroup-encryptionconfiguration-kmskey)
     */
    public fun kmsKey(): String? = unwrap(this).getKmsKey()

    /**
     * A builder for [EncryptionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encryptionOption Indicates whether Amazon S3 server-side encryption with Amazon
       * S3-managed keys ( `SSE_S3` ), server-side encryption with KMS-managed keys ( `SSE_KMS` ), or
       * client-side encryption with KMS-managed keys ( `CSE_KMS` ) is used. 
       * If a query runs in a workgroup and the workgroup overrides client-side settings, then the
       * workgroup's setting for encryption is used. It specifies whether query results must be
       * encrypted, for all queries that run in this workgroup.
       */
      public fun encryptionOption(encryptionOption: String)

      /**
       * @param kmsKey For `SSE_KMS` and `CSE_KMS` , this is the KMS key ARN or ID.
       */
      public fun kmsKey(kmsKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.athena.CfnWorkGroup.EncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.athena.CfnWorkGroup.EncryptionConfigurationProperty.builder()

      /**
       * @param encryptionOption Indicates whether Amazon S3 server-side encryption with Amazon
       * S3-managed keys ( `SSE_S3` ), server-side encryption with KMS-managed keys ( `SSE_KMS` ), or
       * client-side encryption with KMS-managed keys ( `CSE_KMS` ) is used. 
       * If a query runs in a workgroup and the workgroup overrides client-side settings, then the
       * workgroup's setting for encryption is used. It specifies whether query results must be
       * encrypted, for all queries that run in this workgroup.
       */
      override fun encryptionOption(encryptionOption: String) {
        cdkBuilder.encryptionOption(encryptionOption)
      }

      /**
       * @param kmsKey For `SSE_KMS` and `CSE_KMS` , this is the KMS key ARN or ID.
       */
      override fun kmsKey(kmsKey: String) {
        cdkBuilder.kmsKey(kmsKey)
      }

      public fun build():
          software.amazon.awscdk.services.athena.CfnWorkGroup.EncryptionConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.EncryptionConfigurationProperty,
    ) : CdkObject(cdkObject),
        EncryptionConfigurationProperty {
      /**
       * Indicates whether Amazon S3 server-side encryption with Amazon S3-managed keys ( `SSE_S3`
       * ), server-side encryption with KMS-managed keys ( `SSE_KMS` ), or client-side encryption with
       * KMS-managed keys ( `CSE_KMS` ) is used.
       *
       * If a query runs in a workgroup and the workgroup overrides client-side settings, then the
       * workgroup's setting for encryption is used. It specifies whether query results must be
       * encrypted, for all queries that run in this workgroup.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-encryptionconfiguration.html#cfn-athena-workgroup-encryptionconfiguration-encryptionoption)
       */
      override fun encryptionOption(): String = unwrap(this).getEncryptionOption()

      /**
       * For `SSE_KMS` and `CSE_KMS` , this is the KMS key ARN or ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-encryptionconfiguration.html#cfn-athena-workgroup-encryptionconfiguration-kmskey)
       */
      override fun kmsKey(): String? = unwrap(this).getKmsKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.EncryptionConfigurationProperty):
          EncryptionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EncryptionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionConfigurationProperty):
          software.amazon.awscdk.services.athena.CfnWorkGroup.EncryptionConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.athena.CfnWorkGroup.EncryptionConfigurationProperty
    }
  }

  /**
   * The Athena engine version for running queries, or the PySpark engine version for running
   * sessions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.athena.*;
   * EngineVersionProperty engineVersionProperty = EngineVersionProperty.builder()
   * .effectiveEngineVersion("effectiveEngineVersion")
   * .selectedEngineVersion("selectedEngineVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-engineversion.html)
   */
  public interface EngineVersionProperty {
    /**
     * Read only.
     *
     * The engine version on which the query runs. If the user requests a valid engine version other
     * than Auto, the effective engine version is the same as the engine version that the user
     * requested. If the user requests Auto, the effective engine version is chosen by Athena. When a
     * request to update the engine version is made by a `CreateWorkGroup` or `UpdateWorkGroup`
     * operation, the `EffectiveEngineVersion` field is ignored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-engineversion.html#cfn-athena-workgroup-engineversion-effectiveengineversion)
     */
    public fun effectiveEngineVersion(): String? = unwrap(this).getEffectiveEngineVersion()

    /**
     * The engine version requested by the user.
     *
     * Possible values are determined by the output of `ListEngineVersions` , including AUTO. The
     * default is AUTO.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-engineversion.html#cfn-athena-workgroup-engineversion-selectedengineversion)
     */
    public fun selectedEngineVersion(): String? = unwrap(this).getSelectedEngineVersion()

    /**
     * A builder for [EngineVersionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param effectiveEngineVersion Read only.
       * The engine version on which the query runs. If the user requests a valid engine version
       * other than Auto, the effective engine version is the same as the engine version that the user
       * requested. If the user requests Auto, the effective engine version is chosen by Athena. When a
       * request to update the engine version is made by a `CreateWorkGroup` or `UpdateWorkGroup`
       * operation, the `EffectiveEngineVersion` field is ignored.
       */
      public fun effectiveEngineVersion(effectiveEngineVersion: String)

      /**
       * @param selectedEngineVersion The engine version requested by the user.
       * Possible values are determined by the output of `ListEngineVersions` , including AUTO. The
       * default is AUTO.
       */
      public fun selectedEngineVersion(selectedEngineVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.athena.CfnWorkGroup.EngineVersionProperty.Builder =
          software.amazon.awscdk.services.athena.CfnWorkGroup.EngineVersionProperty.builder()

      /**
       * @param effectiveEngineVersion Read only.
       * The engine version on which the query runs. If the user requests a valid engine version
       * other than Auto, the effective engine version is the same as the engine version that the user
       * requested. If the user requests Auto, the effective engine version is chosen by Athena. When a
       * request to update the engine version is made by a `CreateWorkGroup` or `UpdateWorkGroup`
       * operation, the `EffectiveEngineVersion` field is ignored.
       */
      override fun effectiveEngineVersion(effectiveEngineVersion: String) {
        cdkBuilder.effectiveEngineVersion(effectiveEngineVersion)
      }

      /**
       * @param selectedEngineVersion The engine version requested by the user.
       * Possible values are determined by the output of `ListEngineVersions` , including AUTO. The
       * default is AUTO.
       */
      override fun selectedEngineVersion(selectedEngineVersion: String) {
        cdkBuilder.selectedEngineVersion(selectedEngineVersion)
      }

      public fun build(): software.amazon.awscdk.services.athena.CfnWorkGroup.EngineVersionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.EngineVersionProperty,
    ) : CdkObject(cdkObject),
        EngineVersionProperty {
      /**
       * Read only.
       *
       * The engine version on which the query runs. If the user requests a valid engine version
       * other than Auto, the effective engine version is the same as the engine version that the user
       * requested. If the user requests Auto, the effective engine version is chosen by Athena. When a
       * request to update the engine version is made by a `CreateWorkGroup` or `UpdateWorkGroup`
       * operation, the `EffectiveEngineVersion` field is ignored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-engineversion.html#cfn-athena-workgroup-engineversion-effectiveengineversion)
       */
      override fun effectiveEngineVersion(): String? = unwrap(this).getEffectiveEngineVersion()

      /**
       * The engine version requested by the user.
       *
       * Possible values are determined by the output of `ListEngineVersions` , including AUTO. The
       * default is AUTO.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-engineversion.html#cfn-athena-workgroup-engineversion-selectedengineversion)
       */
      override fun selectedEngineVersion(): String? = unwrap(this).getSelectedEngineVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EngineVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.EngineVersionProperty):
          EngineVersionProperty = CdkObjectWrappers.wrap(cdkObject) as? EngineVersionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EngineVersionProperty):
          software.amazon.awscdk.services.athena.CfnWorkGroup.EngineVersionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.athena.CfnWorkGroup.EngineVersionProperty
    }
  }

  /**
   * The configuration for storing results in Athena owned storage, which includes whether this
   * feature is enabled;
   *
   * whether encryption configuration, if any, is used for encrypting query results.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.athena.*;
   * ManagedQueryResultsConfigurationProperty managedQueryResultsConfigurationProperty =
   * ManagedQueryResultsConfigurationProperty.builder()
   * .enabled(false)
   * .encryptionConfiguration(ManagedStorageEncryptionConfigurationProperty.builder()
   * .kmsKey("kmsKey")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-managedqueryresultsconfiguration.html)
   */
  public interface ManagedQueryResultsConfigurationProperty {
    /**
     * If set to true, allows you to store query results in Athena owned storage.
     *
     * If set to false, workgroup member stores query results in location specified under
     * `ResultConfiguration$OutputLocation` . The default is false. A workgroup cannot have the
     * `ResultConfiguration$OutputLocation` parameter when you set this field to true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-managedqueryresultsconfiguration.html#cfn-athena-workgroup-managedqueryresultsconfiguration-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * If you encrypt query and calculation results in Athena owned storage, this field indicates
     * the encryption option (for example, SSE_KMS or CSE_KMS) and key information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-managedqueryresultsconfiguration.html#cfn-athena-workgroup-managedqueryresultsconfiguration-encryptionconfiguration)
     */
    public fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

    /**
     * A builder for [ManagedQueryResultsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled If set to true, allows you to store query results in Athena owned storage.
       * If set to false, workgroup member stores query results in location specified under
       * `ResultConfiguration$OutputLocation` . The default is false. A workgroup cannot have the
       * `ResultConfiguration$OutputLocation` parameter when you set this field to true.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled If set to true, allows you to store query results in Athena owned storage.
       * If set to false, workgroup member stores query results in location specified under
       * `ResultConfiguration$OutputLocation` . The default is false. A workgroup cannot have the
       * `ResultConfiguration$OutputLocation` parameter when you set this field to true.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param encryptionConfiguration If you encrypt query and calculation results in Athena owned
       * storage, this field indicates the encryption option (for example, SSE_KMS or CSE_KMS) and key
       * information.
       */
      public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

      /**
       * @param encryptionConfiguration If you encrypt query and calculation results in Athena owned
       * storage, this field indicates the encryption option (for example, SSE_KMS or CSE_KMS) and key
       * information.
       */
      public
          fun encryptionConfiguration(encryptionConfiguration: ManagedStorageEncryptionConfigurationProperty)

      /**
       * @param encryptionConfiguration If you encrypt query and calculation results in Athena owned
       * storage, this field indicates the encryption option (for example, SSE_KMS or CSE_KMS) and key
       * information.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec85e7b60e4ac61d582b1d0556eb9095d404776d34ac5c4a6f5f83ec3be0e5ae")
      public
          fun encryptionConfiguration(encryptionConfiguration: ManagedStorageEncryptionConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.athena.CfnWorkGroup.ManagedQueryResultsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.athena.CfnWorkGroup.ManagedQueryResultsConfigurationProperty.builder()

      /**
       * @param enabled If set to true, allows you to store query results in Athena owned storage.
       * If set to false, workgroup member stores query results in location specified under
       * `ResultConfiguration$OutputLocation` . The default is false. A workgroup cannot have the
       * `ResultConfiguration$OutputLocation` parameter when you set this field to true.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled If set to true, allows you to store query results in Athena owned storage.
       * If set to false, workgroup member stores query results in location specified under
       * `ResultConfiguration$OutputLocation` . The default is false. A workgroup cannot have the
       * `ResultConfiguration$OutputLocation` parameter when you set this field to true.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param encryptionConfiguration If you encrypt query and calculation results in Athena owned
       * storage, this field indicates the encryption option (for example, SSE_KMS or CSE_KMS) and key
       * information.
       */
      override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param encryptionConfiguration If you encrypt query and calculation results in Athena owned
       * storage, this field indicates the encryption option (for example, SSE_KMS or CSE_KMS) and key
       * information.
       */
      override
          fun encryptionConfiguration(encryptionConfiguration: ManagedStorageEncryptionConfigurationProperty) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(ManagedStorageEncryptionConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param encryptionConfiguration If you encrypt query and calculation results in Athena owned
       * storage, this field indicates the encryption option (for example, SSE_KMS or CSE_KMS) and key
       * information.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec85e7b60e4ac61d582b1d0556eb9095d404776d34ac5c4a6f5f83ec3be0e5ae")
      override
          fun encryptionConfiguration(encryptionConfiguration: ManagedStorageEncryptionConfigurationProperty.Builder.() -> Unit):
          Unit =
          encryptionConfiguration(ManagedStorageEncryptionConfigurationProperty(encryptionConfiguration))

      public fun build():
          software.amazon.awscdk.services.athena.CfnWorkGroup.ManagedQueryResultsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.ManagedQueryResultsConfigurationProperty,
    ) : CdkObject(cdkObject),
        ManagedQueryResultsConfigurationProperty {
      /**
       * If set to true, allows you to store query results in Athena owned storage.
       *
       * If set to false, workgroup member stores query results in location specified under
       * `ResultConfiguration$OutputLocation` . The default is false. A workgroup cannot have the
       * `ResultConfiguration$OutputLocation` parameter when you set this field to true.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-managedqueryresultsconfiguration.html#cfn-athena-workgroup-managedqueryresultsconfiguration-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * If you encrypt query and calculation results in Athena owned storage, this field indicates
       * the encryption option (for example, SSE_KMS or CSE_KMS) and key information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-managedqueryresultsconfiguration.html#cfn-athena-workgroup-managedqueryresultsconfiguration-encryptionconfiguration)
       */
      override fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ManagedQueryResultsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.ManagedQueryResultsConfigurationProperty):
          ManagedQueryResultsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ManagedQueryResultsConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManagedQueryResultsConfigurationProperty):
          software.amazon.awscdk.services.athena.CfnWorkGroup.ManagedQueryResultsConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.athena.CfnWorkGroup.ManagedQueryResultsConfigurationProperty
    }
  }

  /**
   * Indicates the encryption configuration for Athena Managed Storage.
   *
   * If not setting this field, Managed Storage will encrypt the query results with Athena's
   * encryption key
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.athena.*;
   * ManagedStorageEncryptionConfigurationProperty managedStorageEncryptionConfigurationProperty =
   * ManagedStorageEncryptionConfigurationProperty.builder()
   * .kmsKey("kmsKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-managedstorageencryptionconfiguration.html)
   */
  public interface ManagedStorageEncryptionConfigurationProperty {
    /**
     * For SSE-KMS and CSE-KMS, this is the KMS key ARN or ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-managedstorageencryptionconfiguration.html#cfn-athena-workgroup-managedstorageencryptionconfiguration-kmskey)
     */
    public fun kmsKey(): String? = unwrap(this).getKmsKey()

    /**
     * A builder for [ManagedStorageEncryptionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKey For SSE-KMS and CSE-KMS, this is the KMS key ARN or ID.
       */
      public fun kmsKey(kmsKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.athena.CfnWorkGroup.ManagedStorageEncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.athena.CfnWorkGroup.ManagedStorageEncryptionConfigurationProperty.builder()

      /**
       * @param kmsKey For SSE-KMS and CSE-KMS, this is the KMS key ARN or ID.
       */
      override fun kmsKey(kmsKey: String) {
        cdkBuilder.kmsKey(kmsKey)
      }

      public fun build():
          software.amazon.awscdk.services.athena.CfnWorkGroup.ManagedStorageEncryptionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.ManagedStorageEncryptionConfigurationProperty,
    ) : CdkObject(cdkObject),
        ManagedStorageEncryptionConfigurationProperty {
      /**
       * For SSE-KMS and CSE-KMS, this is the KMS key ARN or ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-managedstorageencryptionconfiguration.html#cfn-athena-workgroup-managedstorageencryptionconfiguration-kmskey)
       */
      override fun kmsKey(): String? = unwrap(this).getKmsKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ManagedStorageEncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.ManagedStorageEncryptionConfigurationProperty):
          ManagedStorageEncryptionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ManagedStorageEncryptionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManagedStorageEncryptionConfigurationProperty):
          software.amazon.awscdk.services.athena.CfnWorkGroup.ManagedStorageEncryptionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.athena.CfnWorkGroup.ManagedStorageEncryptionConfigurationProperty
    }
  }

  /**
   * The location in Amazon S3 where query and calculation results are stored and the encryption
   * option, if any, used for query and calculation results.
   *
   * These are known as "client-side settings". If workgroup settings override client-side settings,
   * then the query uses the workgroup settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.athena.*;
   * ResultConfigurationProperty resultConfigurationProperty = ResultConfigurationProperty.builder()
   * .aclConfiguration(AclConfigurationProperty.builder()
   * .s3AclOption("s3AclOption")
   * .build())
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .encryptionOption("encryptionOption")
   * // the properties below are optional
   * .kmsKey("kmsKey")
   * .build())
   * .expectedBucketOwner("expectedBucketOwner")
   * .outputLocation("outputLocation")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfiguration.html)
   */
  public interface ResultConfigurationProperty {
    /**
     * Indicates that an Amazon S3 canned ACL should be set to control ownership of stored query
     * results.
     *
     * Currently the only supported canned ACL is `BUCKET_OWNER_FULL_CONTROL` . This is a
     * client-side setting. If workgroup settings override client-side settings, then the query uses
     * the ACL configuration that is specified for the workgroup, and also uses the location for
     * storing query results specified in the workgroup. See `EnforceWorkGroupConfiguration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfiguration.html#cfn-athena-workgroup-resultconfiguration-aclconfiguration)
     */
    public fun aclConfiguration(): Any? = unwrap(this).getAclConfiguration()

    /**
     * If query results are encrypted in Amazon S3, indicates the encryption option used (for
     * example, `SSE_KMS` or `CSE_KMS` ) and key information.
     *
     * This is a client-side setting. If workgroup settings override client-side settings, then the
     * query uses the encryption configuration that is specified for the workgroup, and also uses the
     * location for storing query results specified in the workgroup. See
     * `EnforceWorkGroupConfiguration` and [Override client-side
     * settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfiguration.html#cfn-athena-workgroup-resultconfiguration-encryptionconfiguration)
     */
    public fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

    /**
     * The account ID that you expect to be the owner of the Amazon S3 bucket specified by
     * `ResultConfiguration:OutputLocation` .
     *
     * If set, Athena uses the value for `ExpectedBucketOwner` when it makes Amazon S3 calls to your
     * specified output location. If the `ExpectedBucketOwner` account ID does not match the actual
     * owner of the Amazon S3 bucket, the call fails with a permissions error.
     *
     * This is a client-side setting. If workgroup settings override client-side settings, then the
     * query uses the `ExpectedBucketOwner` setting that is specified for the workgroup, and also uses
     * the location for storing query results specified in the workgroup. See
     * `EnforceWorkGroupConfiguration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfiguration.html#cfn-athena-workgroup-resultconfiguration-expectedbucketowner)
     */
    public fun expectedBucketOwner(): String? = unwrap(this).getExpectedBucketOwner()

    /**
     * The location in Amazon S3 where your query results are stored, such as
     * `s3://path/to/query/bucket/` .
     *
     * To run a query, you must specify the query results location using either a client-side
     * setting for individual queries or a location specified by the workgroup. If workgroup settings
     * override client-side settings, then the query uses the location specified for the workgroup. If
     * no query location is set, Athena issues an error. For more information, see [Work with query
     * results and recent queries](https://docs.aws.amazon.com/athena/latest/ug/querying.html) and
     * `EnforceWorkGroupConfiguration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfiguration.html#cfn-athena-workgroup-resultconfiguration-outputlocation)
     */
    public fun outputLocation(): String? = unwrap(this).getOutputLocation()

    /**
     * A builder for [ResultConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param aclConfiguration Indicates that an Amazon S3 canned ACL should be set to control
       * ownership of stored query results.
       * Currently the only supported canned ACL is `BUCKET_OWNER_FULL_CONTROL` . This is a
       * client-side setting. If workgroup settings override client-side settings, then the query uses
       * the ACL configuration that is specified for the workgroup, and also uses the location for
       * storing query results specified in the workgroup. See `EnforceWorkGroupConfiguration` .
       */
      public fun aclConfiguration(aclConfiguration: IResolvable)

      /**
       * @param aclConfiguration Indicates that an Amazon S3 canned ACL should be set to control
       * ownership of stored query results.
       * Currently the only supported canned ACL is `BUCKET_OWNER_FULL_CONTROL` . This is a
       * client-side setting. If workgroup settings override client-side settings, then the query uses
       * the ACL configuration that is specified for the workgroup, and also uses the location for
       * storing query results specified in the workgroup. See `EnforceWorkGroupConfiguration` .
       */
      public fun aclConfiguration(aclConfiguration: AclConfigurationProperty)

      /**
       * @param aclConfiguration Indicates that an Amazon S3 canned ACL should be set to control
       * ownership of stored query results.
       * Currently the only supported canned ACL is `BUCKET_OWNER_FULL_CONTROL` . This is a
       * client-side setting. If workgroup settings override client-side settings, then the query uses
       * the ACL configuration that is specified for the workgroup, and also uses the location for
       * storing query results specified in the workgroup. See `EnforceWorkGroupConfiguration` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("411aa155ffc38a1c109962c4dcdad1093e7373d6f7aa57cbcd23a0698ce99120")
      public fun aclConfiguration(aclConfiguration: AclConfigurationProperty.Builder.() -> Unit)

      /**
       * @param encryptionConfiguration If query results are encrypted in Amazon S3, indicates the
       * encryption option used (for example, `SSE_KMS` or `CSE_KMS` ) and key information.
       * This is a client-side setting. If workgroup settings override client-side settings, then
       * the query uses the encryption configuration that is specified for the workgroup, and also uses
       * the location for storing query results specified in the workgroup. See
       * `EnforceWorkGroupConfiguration` and [Override client-side
       * settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

      /**
       * @param encryptionConfiguration If query results are encrypted in Amazon S3, indicates the
       * encryption option used (for example, `SSE_KMS` or `CSE_KMS` ) and key information.
       * This is a client-side setting. If workgroup settings override client-side settings, then
       * the query uses the encryption configuration that is specified for the workgroup, and also uses
       * the location for storing query results specified in the workgroup. See
       * `EnforceWorkGroupConfiguration` and [Override client-side
       * settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty)

      /**
       * @param encryptionConfiguration If query results are encrypted in Amazon S3, indicates the
       * encryption option used (for example, `SSE_KMS` or `CSE_KMS` ) and key information.
       * This is a client-side setting. If workgroup settings override client-side settings, then
       * the query uses the encryption configuration that is specified for the workgroup, and also uses
       * the location for storing query results specified in the workgroup. See
       * `EnforceWorkGroupConfiguration` and [Override client-side
       * settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5203c5f393dec1aa3e91088a082705ed6f73eac66b6b62ee8a887ec08dd6f120")
      public
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit)

      /**
       * @param expectedBucketOwner The account ID that you expect to be the owner of the Amazon S3
       * bucket specified by `ResultConfiguration:OutputLocation` .
       * If set, Athena uses the value for `ExpectedBucketOwner` when it makes Amazon S3 calls to
       * your specified output location. If the `ExpectedBucketOwner` account ID does not match the
       * actual owner of the Amazon S3 bucket, the call fails with a permissions error.
       *
       * This is a client-side setting. If workgroup settings override client-side settings, then
       * the query uses the `ExpectedBucketOwner` setting that is specified for the workgroup, and also
       * uses the location for storing query results specified in the workgroup. See
       * `EnforceWorkGroupConfiguration` .
       */
      public fun expectedBucketOwner(expectedBucketOwner: String)

      /**
       * @param outputLocation The location in Amazon S3 where your query results are stored, such
       * as `s3://path/to/query/bucket/` .
       * To run a query, you must specify the query results location using either a client-side
       * setting for individual queries or a location specified by the workgroup. If workgroup settings
       * override client-side settings, then the query uses the location specified for the workgroup.
       * If no query location is set, Athena issues an error. For more information, see [Work with
       * query results and recent queries](https://docs.aws.amazon.com/athena/latest/ug/querying.html)
       * and `EnforceWorkGroupConfiguration` .
       */
      public fun outputLocation(outputLocation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationProperty.Builder =
          software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationProperty.builder()

      /**
       * @param aclConfiguration Indicates that an Amazon S3 canned ACL should be set to control
       * ownership of stored query results.
       * Currently the only supported canned ACL is `BUCKET_OWNER_FULL_CONTROL` . This is a
       * client-side setting. If workgroup settings override client-side settings, then the query uses
       * the ACL configuration that is specified for the workgroup, and also uses the location for
       * storing query results specified in the workgroup. See `EnforceWorkGroupConfiguration` .
       */
      override fun aclConfiguration(aclConfiguration: IResolvable) {
        cdkBuilder.aclConfiguration(aclConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param aclConfiguration Indicates that an Amazon S3 canned ACL should be set to control
       * ownership of stored query results.
       * Currently the only supported canned ACL is `BUCKET_OWNER_FULL_CONTROL` . This is a
       * client-side setting. If workgroup settings override client-side settings, then the query uses
       * the ACL configuration that is specified for the workgroup, and also uses the location for
       * storing query results specified in the workgroup. See `EnforceWorkGroupConfiguration` .
       */
      override fun aclConfiguration(aclConfiguration: AclConfigurationProperty) {
        cdkBuilder.aclConfiguration(aclConfiguration.let(AclConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param aclConfiguration Indicates that an Amazon S3 canned ACL should be set to control
       * ownership of stored query results.
       * Currently the only supported canned ACL is `BUCKET_OWNER_FULL_CONTROL` . This is a
       * client-side setting. If workgroup settings override client-side settings, then the query uses
       * the ACL configuration that is specified for the workgroup, and also uses the location for
       * storing query results specified in the workgroup. See `EnforceWorkGroupConfiguration` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("411aa155ffc38a1c109962c4dcdad1093e7373d6f7aa57cbcd23a0698ce99120")
      override fun aclConfiguration(aclConfiguration: AclConfigurationProperty.Builder.() -> Unit):
          Unit = aclConfiguration(AclConfigurationProperty(aclConfiguration))

      /**
       * @param encryptionConfiguration If query results are encrypted in Amazon S3, indicates the
       * encryption option used (for example, `SSE_KMS` or `CSE_KMS` ) and key information.
       * This is a client-side setting. If workgroup settings override client-side settings, then
       * the query uses the encryption configuration that is specified for the workgroup, and also uses
       * the location for storing query results specified in the workgroup. See
       * `EnforceWorkGroupConfiguration` and [Override client-side
       * settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param encryptionConfiguration If query results are encrypted in Amazon S3, indicates the
       * encryption option used (for example, `SSE_KMS` or `CSE_KMS` ) and key information.
       * This is a client-side setting. If workgroup settings override client-side settings, then
       * the query uses the encryption configuration that is specified for the workgroup, and also uses
       * the location for storing query results specified in the workgroup. See
       * `EnforceWorkGroupConfiguration` and [Override client-side
       * settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      override
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param encryptionConfiguration If query results are encrypted in Amazon S3, indicates the
       * encryption option used (for example, `SSE_KMS` or `CSE_KMS` ) and key information.
       * This is a client-side setting. If workgroup settings override client-side settings, then
       * the query uses the encryption configuration that is specified for the workgroup, and also uses
       * the location for storing query results specified in the workgroup. See
       * `EnforceWorkGroupConfiguration` and [Override client-side
       * settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5203c5f393dec1aa3e91088a082705ed6f73eac66b6b62ee8a887ec08dd6f120")
      override
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit):
          Unit = encryptionConfiguration(EncryptionConfigurationProperty(encryptionConfiguration))

      /**
       * @param expectedBucketOwner The account ID that you expect to be the owner of the Amazon S3
       * bucket specified by `ResultConfiguration:OutputLocation` .
       * If set, Athena uses the value for `ExpectedBucketOwner` when it makes Amazon S3 calls to
       * your specified output location. If the `ExpectedBucketOwner` account ID does not match the
       * actual owner of the Amazon S3 bucket, the call fails with a permissions error.
       *
       * This is a client-side setting. If workgroup settings override client-side settings, then
       * the query uses the `ExpectedBucketOwner` setting that is specified for the workgroup, and also
       * uses the location for storing query results specified in the workgroup. See
       * `EnforceWorkGroupConfiguration` .
       */
      override fun expectedBucketOwner(expectedBucketOwner: String) {
        cdkBuilder.expectedBucketOwner(expectedBucketOwner)
      }

      /**
       * @param outputLocation The location in Amazon S3 where your query results are stored, such
       * as `s3://path/to/query/bucket/` .
       * To run a query, you must specify the query results location using either a client-side
       * setting for individual queries or a location specified by the workgroup. If workgroup settings
       * override client-side settings, then the query uses the location specified for the workgroup.
       * If no query location is set, Athena issues an error. For more information, see [Work with
       * query results and recent queries](https://docs.aws.amazon.com/athena/latest/ug/querying.html)
       * and `EnforceWorkGroupConfiguration` .
       */
      override fun outputLocation(outputLocation: String) {
        cdkBuilder.outputLocation(outputLocation)
      }

      public fun build():
          software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationProperty,
    ) : CdkObject(cdkObject),
        ResultConfigurationProperty {
      /**
       * Indicates that an Amazon S3 canned ACL should be set to control ownership of stored query
       * results.
       *
       * Currently the only supported canned ACL is `BUCKET_OWNER_FULL_CONTROL` . This is a
       * client-side setting. If workgroup settings override client-side settings, then the query uses
       * the ACL configuration that is specified for the workgroup, and also uses the location for
       * storing query results specified in the workgroup. See `EnforceWorkGroupConfiguration` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfiguration.html#cfn-athena-workgroup-resultconfiguration-aclconfiguration)
       */
      override fun aclConfiguration(): Any? = unwrap(this).getAclConfiguration()

      /**
       * If query results are encrypted in Amazon S3, indicates the encryption option used (for
       * example, `SSE_KMS` or `CSE_KMS` ) and key information.
       *
       * This is a client-side setting. If workgroup settings override client-side settings, then
       * the query uses the encryption configuration that is specified for the workgroup, and also uses
       * the location for storing query results specified in the workgroup. See
       * `EnforceWorkGroupConfiguration` and [Override client-side
       * settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfiguration.html#cfn-athena-workgroup-resultconfiguration-encryptionconfiguration)
       */
      override fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

      /**
       * The account ID that you expect to be the owner of the Amazon S3 bucket specified by
       * `ResultConfiguration:OutputLocation` .
       *
       * If set, Athena uses the value for `ExpectedBucketOwner` when it makes Amazon S3 calls to
       * your specified output location. If the `ExpectedBucketOwner` account ID does not match the
       * actual owner of the Amazon S3 bucket, the call fails with a permissions error.
       *
       * This is a client-side setting. If workgroup settings override client-side settings, then
       * the query uses the `ExpectedBucketOwner` setting that is specified for the workgroup, and also
       * uses the location for storing query results specified in the workgroup. See
       * `EnforceWorkGroupConfiguration` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfiguration.html#cfn-athena-workgroup-resultconfiguration-expectedbucketowner)
       */
      override fun expectedBucketOwner(): String? = unwrap(this).getExpectedBucketOwner()

      /**
       * The location in Amazon S3 where your query results are stored, such as
       * `s3://path/to/query/bucket/` .
       *
       * To run a query, you must specify the query results location using either a client-side
       * setting for individual queries or a location specified by the workgroup. If workgroup settings
       * override client-side settings, then the query uses the location specified for the workgroup.
       * If no query location is set, Athena issues an error. For more information, see [Work with
       * query results and recent queries](https://docs.aws.amazon.com/athena/latest/ug/querying.html)
       * and `EnforceWorkGroupConfiguration` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfiguration.html#cfn-athena-workgroup-resultconfiguration-outputlocation)
       */
      override fun outputLocation(): String? = unwrap(this).getOutputLocation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResultConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationProperty):
          ResultConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ResultConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResultConfigurationProperty):
          software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationProperty
    }
  }

  /**
   * The information about the updates in the query results, such as output location and encryption
   * configuration for the query results.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.athena.*;
   * ResultConfigurationUpdatesProperty resultConfigurationUpdatesProperty =
   * ResultConfigurationUpdatesProperty.builder()
   * .aclConfiguration(AclConfigurationProperty.builder()
   * .s3AclOption("s3AclOption")
   * .build())
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .encryptionOption("encryptionOption")
   * // the properties below are optional
   * .kmsKey("kmsKey")
   * .build())
   * .expectedBucketOwner("expectedBucketOwner")
   * .outputLocation("outputLocation")
   * .removeAclConfiguration(false)
   * .removeEncryptionConfiguration(false)
   * .removeExpectedBucketOwner(false)
   * .removeOutputLocation(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html)
   */
  public interface ResultConfigurationUpdatesProperty {
    /**
     * The ACL configuration for the query results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-aclconfiguration)
     */
    public fun aclConfiguration(): Any? = unwrap(this).getAclConfiguration()

    /**
     * The encryption configuration for the query results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-encryptionconfiguration)
     */
    public fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

    /**
     * The AWS account ID that you expect to be the owner of the Amazon S3 bucket specified by
     * `ResultConfiguration$OutputLocation` .
     *
     * If set, Athena uses the value for `ExpectedBucketOwner` when it makes Amazon S3 calls to your
     * specified output location. If the `ExpectedBucketOwner` AWS account ID does not match the actual
     * owner of the Amazon S3 bucket, the call fails with a permissions error.
     *
     * If workgroup settings override client-side settings, then the query uses the
     * `ExpectedBucketOwner` setting that is specified for the workgroup, and also uses the location
     * for storing query results specified in the workgroup. See
     * `WorkGroupConfiguration$EnforceWorkGroupConfiguration` and [Workgroup Settings Override
     * Client-Side
     * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-expectedbucketowner)
     */
    public fun expectedBucketOwner(): String? = unwrap(this).getExpectedBucketOwner()

    /**
     * The location in Amazon S3 where your query results are stored, such as
     * `s3://path/to/query/bucket/` .
     *
     * For more information, see [Query
     * Results](https://docs.aws.amazon.com/athena/latest/ug/querying.html) If workgroup settings
     * override client-side settings, then the query uses the location for the query results and the
     * encryption configuration that are specified for the workgroup. The "workgroup settings override"
     * is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See
     * `EnforceWorkGroupConfiguration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-outputlocation)
     */
    public fun outputLocation(): String? = unwrap(this).getOutputLocation()

    /**
     * If set to `true` , indicates that the previously-specified ACL configuration for queries in
     * this workgroup should be ignored and set to null.
     *
     * If set to `false` or not set, and a value is present in the `AclConfiguration` of
     * `ResultConfigurationUpdates` , the `AclConfiguration` in the workgroup's `ResultConfiguration`
     * is updated with the new value. For more information, see [Workgroup Settings Override
     * Client-Side
     * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-removeaclconfiguration)
     */
    public fun removeAclConfiguration(): Any? = unwrap(this).getRemoveAclConfiguration()

    /**
     * If set to "true", indicates that the previously-specified encryption configuration (also
     * known as the client-side setting) for queries in this workgroup should be ignored and set to
     * null.
     *
     * If set to "false" or not set, and a value is present in the EncryptionConfiguration in
     * ResultConfigurationUpdates (the client-side setting), the EncryptionConfiguration in the
     * workgroup's ResultConfiguration will be updated with the new value. For more information, see
     * [Override Client-Side
     * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-removeencryptionconfiguration)
     */
    public fun removeEncryptionConfiguration(): Any? =
        unwrap(this).getRemoveEncryptionConfiguration()

    /**
     * If set to "true", removes the AWS account ID previously specified for
     * `ResultConfiguration$ExpectedBucketOwner` .
     *
     * If set to "false" or not set, and a value is present in the `ExpectedBucketOwner` in
     * `ResultConfigurationUpdates` (the client-side setting), the `ExpectedBucketOwner` in the
     * workgroup's `ResultConfiguration` is updated with the new value. For more information, see
     * [Workgroup Settings Override Client-Side
     * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-removeexpectedbucketowner)
     */
    public fun removeExpectedBucketOwner(): Any? = unwrap(this).getRemoveExpectedBucketOwner()

    /**
     * If set to "true", indicates that the previously-specified query results location (also known
     * as a client-side setting) for queries in this workgroup should be ignored and set to null.
     *
     * If set to "false" or not set, and a value is present in the OutputLocation in
     * ResultConfigurationUpdates (the client-side setting), the OutputLocation in the workgroup's
     * ResultConfiguration will be updated with the new value. For more information, see [Override
     * Client-Side
     * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-removeoutputlocation)
     */
    public fun removeOutputLocation(): Any? = unwrap(this).getRemoveOutputLocation()

    /**
     * A builder for [ResultConfigurationUpdatesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param aclConfiguration The ACL configuration for the query results.
       */
      public fun aclConfiguration(aclConfiguration: IResolvable)

      /**
       * @param aclConfiguration The ACL configuration for the query results.
       */
      public fun aclConfiguration(aclConfiguration: AclConfigurationProperty)

      /**
       * @param aclConfiguration The ACL configuration for the query results.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca1ee933f5c4842cb22a913294746eb4af230a932debbb6cce453856b9fde274")
      public fun aclConfiguration(aclConfiguration: AclConfigurationProperty.Builder.() -> Unit)

      /**
       * @param encryptionConfiguration The encryption configuration for the query results.
       */
      public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

      /**
       * @param encryptionConfiguration The encryption configuration for the query results.
       */
      public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty)

      /**
       * @param encryptionConfiguration The encryption configuration for the query results.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98e3b68155ccd82ee4bdbc2fae17690ccf3fddf288f298ec025740fd92dbe9c6")
      public
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit)

      /**
       * @param expectedBucketOwner The AWS account ID that you expect to be the owner of the Amazon
       * S3 bucket specified by `ResultConfiguration$OutputLocation` .
       * If set, Athena uses the value for `ExpectedBucketOwner` when it makes Amazon S3 calls to
       * your specified output location. If the `ExpectedBucketOwner` AWS account ID does not match the
       * actual owner of the Amazon S3 bucket, the call fails with a permissions error.
       *
       * If workgroup settings override client-side settings, then the query uses the
       * `ExpectedBucketOwner` setting that is specified for the workgroup, and also uses the location
       * for storing query results specified in the workgroup. See
       * `WorkGroupConfiguration$EnforceWorkGroupConfiguration` and [Workgroup Settings Override
       * Client-Side
       * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      public fun expectedBucketOwner(expectedBucketOwner: String)

      /**
       * @param outputLocation The location in Amazon S3 where your query results are stored, such
       * as `s3://path/to/query/bucket/` .
       * For more information, see [Query
       * Results](https://docs.aws.amazon.com/athena/latest/ug/querying.html) If workgroup settings
       * override client-side settings, then the query uses the location for the query results and the
       * encryption configuration that are specified for the workgroup. The "workgroup settings
       * override" is specified in EnforceWorkGroupConfiguration (true/false) in the
       * WorkGroupConfiguration. See `EnforceWorkGroupConfiguration` .
       */
      public fun outputLocation(outputLocation: String)

      /**
       * @param removeAclConfiguration If set to `true` , indicates that the previously-specified
       * ACL configuration for queries in this workgroup should be ignored and set to null.
       * If set to `false` or not set, and a value is present in the `AclConfiguration` of
       * `ResultConfigurationUpdates` , the `AclConfiguration` in the workgroup's `ResultConfiguration`
       * is updated with the new value. For more information, see [Workgroup Settings Override
       * Client-Side
       * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      public fun removeAclConfiguration(removeAclConfiguration: Boolean)

      /**
       * @param removeAclConfiguration If set to `true` , indicates that the previously-specified
       * ACL configuration for queries in this workgroup should be ignored and set to null.
       * If set to `false` or not set, and a value is present in the `AclConfiguration` of
       * `ResultConfigurationUpdates` , the `AclConfiguration` in the workgroup's `ResultConfiguration`
       * is updated with the new value. For more information, see [Workgroup Settings Override
       * Client-Side
       * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      public fun removeAclConfiguration(removeAclConfiguration: IResolvable)

      /**
       * @param removeEncryptionConfiguration If set to "true", indicates that the
       * previously-specified encryption configuration (also known as the client-side setting) for
       * queries in this workgroup should be ignored and set to null.
       * If set to "false" or not set, and a value is present in the EncryptionConfiguration in
       * ResultConfigurationUpdates (the client-side setting), the EncryptionConfiguration in the
       * workgroup's ResultConfiguration will be updated with the new value. For more information, see
       * [Override Client-Side
       * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      public fun removeEncryptionConfiguration(removeEncryptionConfiguration: Boolean)

      /**
       * @param removeEncryptionConfiguration If set to "true", indicates that the
       * previously-specified encryption configuration (also known as the client-side setting) for
       * queries in this workgroup should be ignored and set to null.
       * If set to "false" or not set, and a value is present in the EncryptionConfiguration in
       * ResultConfigurationUpdates (the client-side setting), the EncryptionConfiguration in the
       * workgroup's ResultConfiguration will be updated with the new value. For more information, see
       * [Override Client-Side
       * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      public fun removeEncryptionConfiguration(removeEncryptionConfiguration: IResolvable)

      /**
       * @param removeExpectedBucketOwner If set to "true", removes the AWS account ID previously
       * specified for `ResultConfiguration$ExpectedBucketOwner` .
       * If set to "false" or not set, and a value is present in the `ExpectedBucketOwner` in
       * `ResultConfigurationUpdates` (the client-side setting), the `ExpectedBucketOwner` in the
       * workgroup's `ResultConfiguration` is updated with the new value. For more information, see
       * [Workgroup Settings Override Client-Side
       * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      public fun removeExpectedBucketOwner(removeExpectedBucketOwner: Boolean)

      /**
       * @param removeExpectedBucketOwner If set to "true", removes the AWS account ID previously
       * specified for `ResultConfiguration$ExpectedBucketOwner` .
       * If set to "false" or not set, and a value is present in the `ExpectedBucketOwner` in
       * `ResultConfigurationUpdates` (the client-side setting), the `ExpectedBucketOwner` in the
       * workgroup's `ResultConfiguration` is updated with the new value. For more information, see
       * [Workgroup Settings Override Client-Side
       * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      public fun removeExpectedBucketOwner(removeExpectedBucketOwner: IResolvable)

      /**
       * @param removeOutputLocation If set to "true", indicates that the previously-specified query
       * results location (also known as a client-side setting) for queries in this workgroup should be
       * ignored and set to null.
       * If set to "false" or not set, and a value is present in the OutputLocation in
       * ResultConfigurationUpdates (the client-side setting), the OutputLocation in the workgroup's
       * ResultConfiguration will be updated with the new value. For more information, see [Override
       * Client-Side
       * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      public fun removeOutputLocation(removeOutputLocation: Boolean)

      /**
       * @param removeOutputLocation If set to "true", indicates that the previously-specified query
       * results location (also known as a client-side setting) for queries in this workgroup should be
       * ignored and set to null.
       * If set to "false" or not set, and a value is present in the OutputLocation in
       * ResultConfigurationUpdates (the client-side setting), the OutputLocation in the workgroup's
       * ResultConfiguration will be updated with the new value. For more information, see [Override
       * Client-Side
       * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      public fun removeOutputLocation(removeOutputLocation: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationUpdatesProperty.Builder
          =
          software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationUpdatesProperty.builder()

      /**
       * @param aclConfiguration The ACL configuration for the query results.
       */
      override fun aclConfiguration(aclConfiguration: IResolvable) {
        cdkBuilder.aclConfiguration(aclConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param aclConfiguration The ACL configuration for the query results.
       */
      override fun aclConfiguration(aclConfiguration: AclConfigurationProperty) {
        cdkBuilder.aclConfiguration(aclConfiguration.let(AclConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param aclConfiguration The ACL configuration for the query results.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca1ee933f5c4842cb22a913294746eb4af230a932debbb6cce453856b9fde274")
      override fun aclConfiguration(aclConfiguration: AclConfigurationProperty.Builder.() -> Unit):
          Unit = aclConfiguration(AclConfigurationProperty(aclConfiguration))

      /**
       * @param encryptionConfiguration The encryption configuration for the query results.
       */
      override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param encryptionConfiguration The encryption configuration for the query results.
       */
      override
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param encryptionConfiguration The encryption configuration for the query results.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98e3b68155ccd82ee4bdbc2fae17690ccf3fddf288f298ec025740fd92dbe9c6")
      override
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit):
          Unit = encryptionConfiguration(EncryptionConfigurationProperty(encryptionConfiguration))

      /**
       * @param expectedBucketOwner The AWS account ID that you expect to be the owner of the Amazon
       * S3 bucket specified by `ResultConfiguration$OutputLocation` .
       * If set, Athena uses the value for `ExpectedBucketOwner` when it makes Amazon S3 calls to
       * your specified output location. If the `ExpectedBucketOwner` AWS account ID does not match the
       * actual owner of the Amazon S3 bucket, the call fails with a permissions error.
       *
       * If workgroup settings override client-side settings, then the query uses the
       * `ExpectedBucketOwner` setting that is specified for the workgroup, and also uses the location
       * for storing query results specified in the workgroup. See
       * `WorkGroupConfiguration$EnforceWorkGroupConfiguration` and [Workgroup Settings Override
       * Client-Side
       * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      override fun expectedBucketOwner(expectedBucketOwner: String) {
        cdkBuilder.expectedBucketOwner(expectedBucketOwner)
      }

      /**
       * @param outputLocation The location in Amazon S3 where your query results are stored, such
       * as `s3://path/to/query/bucket/` .
       * For more information, see [Query
       * Results](https://docs.aws.amazon.com/athena/latest/ug/querying.html) If workgroup settings
       * override client-side settings, then the query uses the location for the query results and the
       * encryption configuration that are specified for the workgroup. The "workgroup settings
       * override" is specified in EnforceWorkGroupConfiguration (true/false) in the
       * WorkGroupConfiguration. See `EnforceWorkGroupConfiguration` .
       */
      override fun outputLocation(outputLocation: String) {
        cdkBuilder.outputLocation(outputLocation)
      }

      /**
       * @param removeAclConfiguration If set to `true` , indicates that the previously-specified
       * ACL configuration for queries in this workgroup should be ignored and set to null.
       * If set to `false` or not set, and a value is present in the `AclConfiguration` of
       * `ResultConfigurationUpdates` , the `AclConfiguration` in the workgroup's `ResultConfiguration`
       * is updated with the new value. For more information, see [Workgroup Settings Override
       * Client-Side
       * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      override fun removeAclConfiguration(removeAclConfiguration: Boolean) {
        cdkBuilder.removeAclConfiguration(removeAclConfiguration)
      }

      /**
       * @param removeAclConfiguration If set to `true` , indicates that the previously-specified
       * ACL configuration for queries in this workgroup should be ignored and set to null.
       * If set to `false` or not set, and a value is present in the `AclConfiguration` of
       * `ResultConfigurationUpdates` , the `AclConfiguration` in the workgroup's `ResultConfiguration`
       * is updated with the new value. For more information, see [Workgroup Settings Override
       * Client-Side
       * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      override fun removeAclConfiguration(removeAclConfiguration: IResolvable) {
        cdkBuilder.removeAclConfiguration(removeAclConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param removeEncryptionConfiguration If set to "true", indicates that the
       * previously-specified encryption configuration (also known as the client-side setting) for
       * queries in this workgroup should be ignored and set to null.
       * If set to "false" or not set, and a value is present in the EncryptionConfiguration in
       * ResultConfigurationUpdates (the client-side setting), the EncryptionConfiguration in the
       * workgroup's ResultConfiguration will be updated with the new value. For more information, see
       * [Override Client-Side
       * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      override fun removeEncryptionConfiguration(removeEncryptionConfiguration: Boolean) {
        cdkBuilder.removeEncryptionConfiguration(removeEncryptionConfiguration)
      }

      /**
       * @param removeEncryptionConfiguration If set to "true", indicates that the
       * previously-specified encryption configuration (also known as the client-side setting) for
       * queries in this workgroup should be ignored and set to null.
       * If set to "false" or not set, and a value is present in the EncryptionConfiguration in
       * ResultConfigurationUpdates (the client-side setting), the EncryptionConfiguration in the
       * workgroup's ResultConfiguration will be updated with the new value. For more information, see
       * [Override Client-Side
       * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      override fun removeEncryptionConfiguration(removeEncryptionConfiguration: IResolvable) {
        cdkBuilder.removeEncryptionConfiguration(removeEncryptionConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param removeExpectedBucketOwner If set to "true", removes the AWS account ID previously
       * specified for `ResultConfiguration$ExpectedBucketOwner` .
       * If set to "false" or not set, and a value is present in the `ExpectedBucketOwner` in
       * `ResultConfigurationUpdates` (the client-side setting), the `ExpectedBucketOwner` in the
       * workgroup's `ResultConfiguration` is updated with the new value. For more information, see
       * [Workgroup Settings Override Client-Side
       * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      override fun removeExpectedBucketOwner(removeExpectedBucketOwner: Boolean) {
        cdkBuilder.removeExpectedBucketOwner(removeExpectedBucketOwner)
      }

      /**
       * @param removeExpectedBucketOwner If set to "true", removes the AWS account ID previously
       * specified for `ResultConfiguration$ExpectedBucketOwner` .
       * If set to "false" or not set, and a value is present in the `ExpectedBucketOwner` in
       * `ResultConfigurationUpdates` (the client-side setting), the `ExpectedBucketOwner` in the
       * workgroup's `ResultConfiguration` is updated with the new value. For more information, see
       * [Workgroup Settings Override Client-Side
       * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      override fun removeExpectedBucketOwner(removeExpectedBucketOwner: IResolvable) {
        cdkBuilder.removeExpectedBucketOwner(removeExpectedBucketOwner.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param removeOutputLocation If set to "true", indicates that the previously-specified query
       * results location (also known as a client-side setting) for queries in this workgroup should be
       * ignored and set to null.
       * If set to "false" or not set, and a value is present in the OutputLocation in
       * ResultConfigurationUpdates (the client-side setting), the OutputLocation in the workgroup's
       * ResultConfiguration will be updated with the new value. For more information, see [Override
       * Client-Side
       * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      override fun removeOutputLocation(removeOutputLocation: Boolean) {
        cdkBuilder.removeOutputLocation(removeOutputLocation)
      }

      /**
       * @param removeOutputLocation If set to "true", indicates that the previously-specified query
       * results location (also known as a client-side setting) for queries in this workgroup should be
       * ignored and set to null.
       * If set to "false" or not set, and a value is present in the OutputLocation in
       * ResultConfigurationUpdates (the client-side setting), the OutputLocation in the workgroup's
       * ResultConfiguration will be updated with the new value. For more information, see [Override
       * Client-Side
       * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      override fun removeOutputLocation(removeOutputLocation: IResolvable) {
        cdkBuilder.removeOutputLocation(removeOutputLocation.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationUpdatesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationUpdatesProperty,
    ) : CdkObject(cdkObject),
        ResultConfigurationUpdatesProperty {
      /**
       * The ACL configuration for the query results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-aclconfiguration)
       */
      override fun aclConfiguration(): Any? = unwrap(this).getAclConfiguration()

      /**
       * The encryption configuration for the query results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-encryptionconfiguration)
       */
      override fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

      /**
       * The AWS account ID that you expect to be the owner of the Amazon S3 bucket specified by
       * `ResultConfiguration$OutputLocation` .
       *
       * If set, Athena uses the value for `ExpectedBucketOwner` when it makes Amazon S3 calls to
       * your specified output location. If the `ExpectedBucketOwner` AWS account ID does not match the
       * actual owner of the Amazon S3 bucket, the call fails with a permissions error.
       *
       * If workgroup settings override client-side settings, then the query uses the
       * `ExpectedBucketOwner` setting that is specified for the workgroup, and also uses the location
       * for storing query results specified in the workgroup. See
       * `WorkGroupConfiguration$EnforceWorkGroupConfiguration` and [Workgroup Settings Override
       * Client-Side
       * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-expectedbucketowner)
       */
      override fun expectedBucketOwner(): String? = unwrap(this).getExpectedBucketOwner()

      /**
       * The location in Amazon S3 where your query results are stored, such as
       * `s3://path/to/query/bucket/` .
       *
       * For more information, see [Query
       * Results](https://docs.aws.amazon.com/athena/latest/ug/querying.html) If workgroup settings
       * override client-side settings, then the query uses the location for the query results and the
       * encryption configuration that are specified for the workgroup. The "workgroup settings
       * override" is specified in EnforceWorkGroupConfiguration (true/false) in the
       * WorkGroupConfiguration. See `EnforceWorkGroupConfiguration` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-outputlocation)
       */
      override fun outputLocation(): String? = unwrap(this).getOutputLocation()

      /**
       * If set to `true` , indicates that the previously-specified ACL configuration for queries in
       * this workgroup should be ignored and set to null.
       *
       * If set to `false` or not set, and a value is present in the `AclConfiguration` of
       * `ResultConfigurationUpdates` , the `AclConfiguration` in the workgroup's `ResultConfiguration`
       * is updated with the new value. For more information, see [Workgroup Settings Override
       * Client-Side
       * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-removeaclconfiguration)
       */
      override fun removeAclConfiguration(): Any? = unwrap(this).getRemoveAclConfiguration()

      /**
       * If set to "true", indicates that the previously-specified encryption configuration (also
       * known as the client-side setting) for queries in this workgroup should be ignored and set to
       * null.
       *
       * If set to "false" or not set, and a value is present in the EncryptionConfiguration in
       * ResultConfigurationUpdates (the client-side setting), the EncryptionConfiguration in the
       * workgroup's ResultConfiguration will be updated with the new value. For more information, see
       * [Override Client-Side
       * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-removeencryptionconfiguration)
       */
      override fun removeEncryptionConfiguration(): Any? =
          unwrap(this).getRemoveEncryptionConfiguration()

      /**
       * If set to "true", removes the AWS account ID previously specified for
       * `ResultConfiguration$ExpectedBucketOwner` .
       *
       * If set to "false" or not set, and a value is present in the `ExpectedBucketOwner` in
       * `ResultConfigurationUpdates` (the client-side setting), the `ExpectedBucketOwner` in the
       * workgroup's `ResultConfiguration` is updated with the new value. For more information, see
       * [Workgroup Settings Override Client-Side
       * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-removeexpectedbucketowner)
       */
      override fun removeExpectedBucketOwner(): Any? = unwrap(this).getRemoveExpectedBucketOwner()

      /**
       * If set to "true", indicates that the previously-specified query results location (also
       * known as a client-side setting) for queries in this workgroup should be ignored and set to
       * null.
       *
       * If set to "false" or not set, and a value is present in the OutputLocation in
       * ResultConfigurationUpdates (the client-side setting), the OutputLocation in the workgroup's
       * ResultConfiguration will be updated with the new value. For more information, see [Override
       * Client-Side
       * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html#cfn-athena-workgroup-resultconfigurationupdates-removeoutputlocation)
       */
      override fun removeOutputLocation(): Any? = unwrap(this).getRemoveOutputLocation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ResultConfigurationUpdatesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationUpdatesProperty):
          ResultConfigurationUpdatesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ResultConfigurationUpdatesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResultConfigurationUpdatesProperty):
          software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationUpdatesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationUpdatesProperty
    }
  }

  /**
   * The configuration of the workgroup, which includes the location in Amazon S3 where query
   * results are stored, the encryption option, if any, used for query results, whether Amazon
   * CloudWatch Metrics are enabled for the workgroup, and the limit for the amount of bytes scanned
   * (cutoff) per query, if it is specified.
   *
   * The `EnforceWorkGroupConfiguration` option determines whether workgroup settings override
   * client-side query settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.athena.*;
   * WorkGroupConfigurationProperty workGroupConfigurationProperty =
   * WorkGroupConfigurationProperty.builder()
   * .additionalConfiguration("additionalConfiguration")
   * .bytesScannedCutoffPerQuery(123)
   * .customerContentEncryptionConfiguration(CustomerContentEncryptionConfigurationProperty.builder()
   * .kmsKey("kmsKey")
   * .build())
   * .enforceWorkGroupConfiguration(false)
   * .engineVersion(EngineVersionProperty.builder()
   * .effectiveEngineVersion("effectiveEngineVersion")
   * .selectedEngineVersion("selectedEngineVersion")
   * .build())
   * .executionRole("executionRole")
   * .managedQueryResultsConfiguration(ManagedQueryResultsConfigurationProperty.builder()
   * .enabled(false)
   * .encryptionConfiguration(ManagedStorageEncryptionConfigurationProperty.builder()
   * .kmsKey("kmsKey")
   * .build())
   * .build())
   * .publishCloudWatchMetricsEnabled(false)
   * .requesterPaysEnabled(false)
   * .resultConfiguration(ResultConfigurationProperty.builder()
   * .aclConfiguration(AclConfigurationProperty.builder()
   * .s3AclOption("s3AclOption")
   * .build())
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .encryptionOption("encryptionOption")
   * // the properties below are optional
   * .kmsKey("kmsKey")
   * .build())
   * .expectedBucketOwner("expectedBucketOwner")
   * .outputLocation("outputLocation")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html)
   */
  public interface WorkGroupConfigurationProperty {
    /**
     * Specifies a user defined JSON string that is passed to the session engine.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-additionalconfiguration)
     */
    public fun additionalConfiguration(): String? = unwrap(this).getAdditionalConfiguration()

    /**
     * The upper limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to
     * scan.
     *
     * No default is defined.
     *
     *
     * This property currently supports integer types. Support for long values is planned.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-bytesscannedcutoffperquery)
     */
    public fun bytesScannedCutoffPerQuery(): Number? = unwrap(this).getBytesScannedCutoffPerQuery()

    /**
     * Specifies the KMS key that is used to encrypt the user's data stores in Athena.
     *
     * This setting does not apply to Athena SQL workgroups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-customercontentencryptionconfiguration)
     */
    public fun customerContentEncryptionConfiguration(): Any? =
        unwrap(this).getCustomerContentEncryptionConfiguration()

    /**
     * If set to "true", the settings for the workgroup override client-side settings.
     *
     * If set to "false", client-side settings are used. For more information, see [Override
     * client-side
     * settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-enforceworkgroupconfiguration)
     */
    public fun enforceWorkGroupConfiguration(): Any? =
        unwrap(this).getEnforceWorkGroupConfiguration()

    /**
     * The engine version that all queries running on the workgroup use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-engineversion)
     */
    public fun engineVersion(): Any? = unwrap(this).getEngineVersion()

    /**
     * Role used to access user resources in an Athena for Apache Spark session.
     *
     * This property applies only to Spark-enabled workgroups in Athena.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-executionrole)
     */
    public fun executionRole(): String? = unwrap(this).getExecutionRole()

    /**
     * The configuration for storing results in Athena owned storage, which includes whether this
     * feature is enabled;
     *
     * whether encryption configuration, if any, is used for encrypting query results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-managedqueryresultsconfiguration)
     */
    public fun managedQueryResultsConfiguration(): Any? =
        unwrap(this).getManagedQueryResultsConfiguration()

    /**
     * Indicates that the Amazon CloudWatch metrics are enabled for the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-publishcloudwatchmetricsenabled)
     */
    public fun publishCloudWatchMetricsEnabled(): Any? =
        unwrap(this).getPublishCloudWatchMetricsEnabled()

    /**
     * If set to `true` , allows members assigned to a workgroup to reference Amazon S3 Requester
     * Pays buckets in queries.
     *
     * If set to `false` , workgroup members cannot query data from Requester Pays buckets, and
     * queries that retrieve data from Requester Pays buckets cause an error. The default is `false` .
     * For more information about Requester Pays buckets, see [Requester Pays
     * Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html) in the
     * *Amazon Simple Storage Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-requesterpaysenabled)
     */
    public fun requesterPaysEnabled(): Any? = unwrap(this).getRequesterPaysEnabled()

    /**
     * Specifies the location in Amazon S3 where query results are stored and the encryption option,
     * if any, used for query results.
     *
     * For more information, see [Work with query results and recent
     * queries](https://docs.aws.amazon.com/athena/latest/ug/querying.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-resultconfiguration)
     */
    public fun resultConfiguration(): Any? = unwrap(this).getResultConfiguration()

    /**
     * A builder for [WorkGroupConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param additionalConfiguration Specifies a user defined JSON string that is passed to the
       * session engine.
       */
      public fun additionalConfiguration(additionalConfiguration: String)

      /**
       * @param bytesScannedCutoffPerQuery The upper limit (cutoff) for the amount of bytes a single
       * query in a workgroup is allowed to scan.
       * No default is defined.
       *
       *
       * This property currently supports integer types. Support for long values is planned.
       */
      public fun bytesScannedCutoffPerQuery(bytesScannedCutoffPerQuery: Number)

      /**
       * @param customerContentEncryptionConfiguration Specifies the KMS key that is used to encrypt
       * the user's data stores in Athena.
       * This setting does not apply to Athena SQL workgroups.
       */
      public
          fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: IResolvable)

      /**
       * @param customerContentEncryptionConfiguration Specifies the KMS key that is used to encrypt
       * the user's data stores in Athena.
       * This setting does not apply to Athena SQL workgroups.
       */
      public
          fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: CustomerContentEncryptionConfigurationProperty)

      /**
       * @param customerContentEncryptionConfiguration Specifies the KMS key that is used to encrypt
       * the user's data stores in Athena.
       * This setting does not apply to Athena SQL workgroups.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e01ac5be3f4a3b617ab2842bacda21ef62ab41b6c08d71da726816a38ae7dd21")
      public
          fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: CustomerContentEncryptionConfigurationProperty.Builder.() -> Unit)

      /**
       * @param enforceWorkGroupConfiguration If set to "true", the settings for the workgroup
       * override client-side settings.
       * If set to "false", client-side settings are used. For more information, see [Override
       * client-side
       * settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      public fun enforceWorkGroupConfiguration(enforceWorkGroupConfiguration: Boolean)

      /**
       * @param enforceWorkGroupConfiguration If set to "true", the settings for the workgroup
       * override client-side settings.
       * If set to "false", client-side settings are used. For more information, see [Override
       * client-side
       * settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      public fun enforceWorkGroupConfiguration(enforceWorkGroupConfiguration: IResolvable)

      /**
       * @param engineVersion The engine version that all queries running on the workgroup use.
       */
      public fun engineVersion(engineVersion: IResolvable)

      /**
       * @param engineVersion The engine version that all queries running on the workgroup use.
       */
      public fun engineVersion(engineVersion: EngineVersionProperty)

      /**
       * @param engineVersion The engine version that all queries running on the workgroup use.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5983b34c50cefc1520e086b9661c01dfbc1ff46adf18519e782eb7e545b2c902")
      public fun engineVersion(engineVersion: EngineVersionProperty.Builder.() -> Unit)

      /**
       * @param executionRole Role used to access user resources in an Athena for Apache Spark
       * session.
       * This property applies only to Spark-enabled workgroups in Athena.
       */
      public fun executionRole(executionRole: String)

      /**
       * @param managedQueryResultsConfiguration The configuration for storing results in Athena
       * owned storage, which includes whether this feature is enabled;.
       * whether encryption configuration, if any, is used for encrypting query results.
       */
      public fun managedQueryResultsConfiguration(managedQueryResultsConfiguration: IResolvable)

      /**
       * @param managedQueryResultsConfiguration The configuration for storing results in Athena
       * owned storage, which includes whether this feature is enabled;.
       * whether encryption configuration, if any, is used for encrypting query results.
       */
      public
          fun managedQueryResultsConfiguration(managedQueryResultsConfiguration: ManagedQueryResultsConfigurationProperty)

      /**
       * @param managedQueryResultsConfiguration The configuration for storing results in Athena
       * owned storage, which includes whether this feature is enabled;.
       * whether encryption configuration, if any, is used for encrypting query results.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ecb1a07bbf99fc2dda155636c1e64fdbd1bac45d6624b1b5d0e4cb9851fd19b5")
      public
          fun managedQueryResultsConfiguration(managedQueryResultsConfiguration: ManagedQueryResultsConfigurationProperty.Builder.() -> Unit)

      /**
       * @param publishCloudWatchMetricsEnabled Indicates that the Amazon CloudWatch metrics are
       * enabled for the workgroup.
       */
      public fun publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled: Boolean)

      /**
       * @param publishCloudWatchMetricsEnabled Indicates that the Amazon CloudWatch metrics are
       * enabled for the workgroup.
       */
      public fun publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled: IResolvable)

      /**
       * @param requesterPaysEnabled If set to `true` , allows members assigned to a workgroup to
       * reference Amazon S3 Requester Pays buckets in queries.
       * If set to `false` , workgroup members cannot query data from Requester Pays buckets, and
       * queries that retrieve data from Requester Pays buckets cause an error. The default is `false`
       * . For more information about Requester Pays buckets, see [Requester Pays
       * Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html) in the
       * *Amazon Simple Storage Service Developer Guide* .
       */
      public fun requesterPaysEnabled(requesterPaysEnabled: Boolean)

      /**
       * @param requesterPaysEnabled If set to `true` , allows members assigned to a workgroup to
       * reference Amazon S3 Requester Pays buckets in queries.
       * If set to `false` , workgroup members cannot query data from Requester Pays buckets, and
       * queries that retrieve data from Requester Pays buckets cause an error. The default is `false`
       * . For more information about Requester Pays buckets, see [Requester Pays
       * Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html) in the
       * *Amazon Simple Storage Service Developer Guide* .
       */
      public fun requesterPaysEnabled(requesterPaysEnabled: IResolvable)

      /**
       * @param resultConfiguration Specifies the location in Amazon S3 where query results are
       * stored and the encryption option, if any, used for query results.
       * For more information, see [Work with query results and recent
       * queries](https://docs.aws.amazon.com/athena/latest/ug/querying.html) .
       */
      public fun resultConfiguration(resultConfiguration: IResolvable)

      /**
       * @param resultConfiguration Specifies the location in Amazon S3 where query results are
       * stored and the encryption option, if any, used for query results.
       * For more information, see [Work with query results and recent
       * queries](https://docs.aws.amazon.com/athena/latest/ug/querying.html) .
       */
      public fun resultConfiguration(resultConfiguration: ResultConfigurationProperty)

      /**
       * @param resultConfiguration Specifies the location in Amazon S3 where query results are
       * stored and the encryption option, if any, used for query results.
       * For more information, see [Work with query results and recent
       * queries](https://docs.aws.amazon.com/athena/latest/ug/querying.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("004561fbbfbe6dec63a390996bb2a4f0182fb92a2a15d27e6386401a651aca7d")
      public
          fun resultConfiguration(resultConfiguration: ResultConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationProperty.builder()

      /**
       * @param additionalConfiguration Specifies a user defined JSON string that is passed to the
       * session engine.
       */
      override fun additionalConfiguration(additionalConfiguration: String) {
        cdkBuilder.additionalConfiguration(additionalConfiguration)
      }

      /**
       * @param bytesScannedCutoffPerQuery The upper limit (cutoff) for the amount of bytes a single
       * query in a workgroup is allowed to scan.
       * No default is defined.
       *
       *
       * This property currently supports integer types. Support for long values is planned.
       */
      override fun bytesScannedCutoffPerQuery(bytesScannedCutoffPerQuery: Number) {
        cdkBuilder.bytesScannedCutoffPerQuery(bytesScannedCutoffPerQuery)
      }

      /**
       * @param customerContentEncryptionConfiguration Specifies the KMS key that is used to encrypt
       * the user's data stores in Athena.
       * This setting does not apply to Athena SQL workgroups.
       */
      override
          fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: IResolvable) {
        cdkBuilder.customerContentEncryptionConfiguration(customerContentEncryptionConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customerContentEncryptionConfiguration Specifies the KMS key that is used to encrypt
       * the user's data stores in Athena.
       * This setting does not apply to Athena SQL workgroups.
       */
      override
          fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: CustomerContentEncryptionConfigurationProperty) {
        cdkBuilder.customerContentEncryptionConfiguration(customerContentEncryptionConfiguration.let(CustomerContentEncryptionConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param customerContentEncryptionConfiguration Specifies the KMS key that is used to encrypt
       * the user's data stores in Athena.
       * This setting does not apply to Athena SQL workgroups.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e01ac5be3f4a3b617ab2842bacda21ef62ab41b6c08d71da726816a38ae7dd21")
      override
          fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: CustomerContentEncryptionConfigurationProperty.Builder.() -> Unit):
          Unit =
          customerContentEncryptionConfiguration(CustomerContentEncryptionConfigurationProperty(customerContentEncryptionConfiguration))

      /**
       * @param enforceWorkGroupConfiguration If set to "true", the settings for the workgroup
       * override client-side settings.
       * If set to "false", client-side settings are used. For more information, see [Override
       * client-side
       * settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      override fun enforceWorkGroupConfiguration(enforceWorkGroupConfiguration: Boolean) {
        cdkBuilder.enforceWorkGroupConfiguration(enforceWorkGroupConfiguration)
      }

      /**
       * @param enforceWorkGroupConfiguration If set to "true", the settings for the workgroup
       * override client-side settings.
       * If set to "false", client-side settings are used. For more information, see [Override
       * client-side
       * settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       */
      override fun enforceWorkGroupConfiguration(enforceWorkGroupConfiguration: IResolvable) {
        cdkBuilder.enforceWorkGroupConfiguration(enforceWorkGroupConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param engineVersion The engine version that all queries running on the workgroup use.
       */
      override fun engineVersion(engineVersion: IResolvable) {
        cdkBuilder.engineVersion(engineVersion.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param engineVersion The engine version that all queries running on the workgroup use.
       */
      override fun engineVersion(engineVersion: EngineVersionProperty) {
        cdkBuilder.engineVersion(engineVersion.let(EngineVersionProperty.Companion::unwrap))
      }

      /**
       * @param engineVersion The engine version that all queries running on the workgroup use.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5983b34c50cefc1520e086b9661c01dfbc1ff46adf18519e782eb7e545b2c902")
      override fun engineVersion(engineVersion: EngineVersionProperty.Builder.() -> Unit): Unit =
          engineVersion(EngineVersionProperty(engineVersion))

      /**
       * @param executionRole Role used to access user resources in an Athena for Apache Spark
       * session.
       * This property applies only to Spark-enabled workgroups in Athena.
       */
      override fun executionRole(executionRole: String) {
        cdkBuilder.executionRole(executionRole)
      }

      /**
       * @param managedQueryResultsConfiguration The configuration for storing results in Athena
       * owned storage, which includes whether this feature is enabled;.
       * whether encryption configuration, if any, is used for encrypting query results.
       */
      override fun managedQueryResultsConfiguration(managedQueryResultsConfiguration: IResolvable) {
        cdkBuilder.managedQueryResultsConfiguration(managedQueryResultsConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param managedQueryResultsConfiguration The configuration for storing results in Athena
       * owned storage, which includes whether this feature is enabled;.
       * whether encryption configuration, if any, is used for encrypting query results.
       */
      override
          fun managedQueryResultsConfiguration(managedQueryResultsConfiguration: ManagedQueryResultsConfigurationProperty) {
        cdkBuilder.managedQueryResultsConfiguration(managedQueryResultsConfiguration.let(ManagedQueryResultsConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param managedQueryResultsConfiguration The configuration for storing results in Athena
       * owned storage, which includes whether this feature is enabled;.
       * whether encryption configuration, if any, is used for encrypting query results.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ecb1a07bbf99fc2dda155636c1e64fdbd1bac45d6624b1b5d0e4cb9851fd19b5")
      override
          fun managedQueryResultsConfiguration(managedQueryResultsConfiguration: ManagedQueryResultsConfigurationProperty.Builder.() -> Unit):
          Unit =
          managedQueryResultsConfiguration(ManagedQueryResultsConfigurationProperty(managedQueryResultsConfiguration))

      /**
       * @param publishCloudWatchMetricsEnabled Indicates that the Amazon CloudWatch metrics are
       * enabled for the workgroup.
       */
      override fun publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled: Boolean) {
        cdkBuilder.publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled)
      }

      /**
       * @param publishCloudWatchMetricsEnabled Indicates that the Amazon CloudWatch metrics are
       * enabled for the workgroup.
       */
      override fun publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled: IResolvable) {
        cdkBuilder.publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param requesterPaysEnabled If set to `true` , allows members assigned to a workgroup to
       * reference Amazon S3 Requester Pays buckets in queries.
       * If set to `false` , workgroup members cannot query data from Requester Pays buckets, and
       * queries that retrieve data from Requester Pays buckets cause an error. The default is `false`
       * . For more information about Requester Pays buckets, see [Requester Pays
       * Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html) in the
       * *Amazon Simple Storage Service Developer Guide* .
       */
      override fun requesterPaysEnabled(requesterPaysEnabled: Boolean) {
        cdkBuilder.requesterPaysEnabled(requesterPaysEnabled)
      }

      /**
       * @param requesterPaysEnabled If set to `true` , allows members assigned to a workgroup to
       * reference Amazon S3 Requester Pays buckets in queries.
       * If set to `false` , workgroup members cannot query data from Requester Pays buckets, and
       * queries that retrieve data from Requester Pays buckets cause an error. The default is `false`
       * . For more information about Requester Pays buckets, see [Requester Pays
       * Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html) in the
       * *Amazon Simple Storage Service Developer Guide* .
       */
      override fun requesterPaysEnabled(requesterPaysEnabled: IResolvable) {
        cdkBuilder.requesterPaysEnabled(requesterPaysEnabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param resultConfiguration Specifies the location in Amazon S3 where query results are
       * stored and the encryption option, if any, used for query results.
       * For more information, see [Work with query results and recent
       * queries](https://docs.aws.amazon.com/athena/latest/ug/querying.html) .
       */
      override fun resultConfiguration(resultConfiguration: IResolvable) {
        cdkBuilder.resultConfiguration(resultConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param resultConfiguration Specifies the location in Amazon S3 where query results are
       * stored and the encryption option, if any, used for query results.
       * For more information, see [Work with query results and recent
       * queries](https://docs.aws.amazon.com/athena/latest/ug/querying.html) .
       */
      override fun resultConfiguration(resultConfiguration: ResultConfigurationProperty) {
        cdkBuilder.resultConfiguration(resultConfiguration.let(ResultConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param resultConfiguration Specifies the location in Amazon S3 where query results are
       * stored and the encryption option, if any, used for query results.
       * For more information, see [Work with query results and recent
       * queries](https://docs.aws.amazon.com/athena/latest/ug/querying.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("004561fbbfbe6dec63a390996bb2a4f0182fb92a2a15d27e6386401a651aca7d")
      override
          fun resultConfiguration(resultConfiguration: ResultConfigurationProperty.Builder.() -> Unit):
          Unit = resultConfiguration(ResultConfigurationProperty(resultConfiguration))

      public fun build():
          software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationProperty,
    ) : CdkObject(cdkObject),
        WorkGroupConfigurationProperty {
      /**
       * Specifies a user defined JSON string that is passed to the session engine.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-additionalconfiguration)
       */
      override fun additionalConfiguration(): String? = unwrap(this).getAdditionalConfiguration()

      /**
       * The upper limit (cutoff) for the amount of bytes a single query in a workgroup is allowed
       * to scan.
       *
       * No default is defined.
       *
       *
       * This property currently supports integer types. Support for long values is planned.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-bytesscannedcutoffperquery)
       */
      override fun bytesScannedCutoffPerQuery(): Number? =
          unwrap(this).getBytesScannedCutoffPerQuery()

      /**
       * Specifies the KMS key that is used to encrypt the user's data stores in Athena.
       *
       * This setting does not apply to Athena SQL workgroups.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-customercontentencryptionconfiguration)
       */
      override fun customerContentEncryptionConfiguration(): Any? =
          unwrap(this).getCustomerContentEncryptionConfiguration()

      /**
       * If set to "true", the settings for the workgroup override client-side settings.
       *
       * If set to "false", client-side settings are used. For more information, see [Override
       * client-side
       * settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-enforceworkgroupconfiguration)
       */
      override fun enforceWorkGroupConfiguration(): Any? =
          unwrap(this).getEnforceWorkGroupConfiguration()

      /**
       * The engine version that all queries running on the workgroup use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-engineversion)
       */
      override fun engineVersion(): Any? = unwrap(this).getEngineVersion()

      /**
       * Role used to access user resources in an Athena for Apache Spark session.
       *
       * This property applies only to Spark-enabled workgroups in Athena.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-executionrole)
       */
      override fun executionRole(): String? = unwrap(this).getExecutionRole()

      /**
       * The configuration for storing results in Athena owned storage, which includes whether this
       * feature is enabled;
       *
       * whether encryption configuration, if any, is used for encrypting query results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-managedqueryresultsconfiguration)
       */
      override fun managedQueryResultsConfiguration(): Any? =
          unwrap(this).getManagedQueryResultsConfiguration()

      /**
       * Indicates that the Amazon CloudWatch metrics are enabled for the workgroup.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-publishcloudwatchmetricsenabled)
       */
      override fun publishCloudWatchMetricsEnabled(): Any? =
          unwrap(this).getPublishCloudWatchMetricsEnabled()

      /**
       * If set to `true` , allows members assigned to a workgroup to reference Amazon S3 Requester
       * Pays buckets in queries.
       *
       * If set to `false` , workgroup members cannot query data from Requester Pays buckets, and
       * queries that retrieve data from Requester Pays buckets cause an error. The default is `false`
       * . For more information about Requester Pays buckets, see [Requester Pays
       * Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html) in the
       * *Amazon Simple Storage Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-requesterpaysenabled)
       */
      override fun requesterPaysEnabled(): Any? = unwrap(this).getRequesterPaysEnabled()

      /**
       * Specifies the location in Amazon S3 where query results are stored and the encryption
       * option, if any, used for query results.
       *
       * For more information, see [Work with query results and recent
       * queries](https://docs.aws.amazon.com/athena/latest/ug/querying.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfiguration.html#cfn-athena-workgroup-workgroupconfiguration-resultconfiguration)
       */
      override fun resultConfiguration(): Any? = unwrap(this).getResultConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WorkGroupConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationProperty):
          WorkGroupConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          WorkGroupConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkGroupConfigurationProperty):
          software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationProperty
    }
  }

  /**
   * The configuration information that will be updated for this workgroup, which includes the
   * location in Amazon S3 where query results are stored, the encryption option, if any, used for
   * query results, whether the Amazon CloudWatch Metrics are enabled for the workgroup, whether the
   * workgroup settings override the client-side settings, and the data usage limit for the amount of
   * bytes scanned per query, if it is specified.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.athena.*;
   * WorkGroupConfigurationUpdatesProperty workGroupConfigurationUpdatesProperty =
   * WorkGroupConfigurationUpdatesProperty.builder()
   * .additionalConfiguration("additionalConfiguration")
   * .bytesScannedCutoffPerQuery(123)
   * .customerContentEncryptionConfiguration(CustomerContentEncryptionConfigurationProperty.builder()
   * .kmsKey("kmsKey")
   * .build())
   * .enforceWorkGroupConfiguration(false)
   * .engineVersion(EngineVersionProperty.builder()
   * .effectiveEngineVersion("effectiveEngineVersion")
   * .selectedEngineVersion("selectedEngineVersion")
   * .build())
   * .executionRole("executionRole")
   * .managedQueryResultsConfiguration(ManagedQueryResultsConfigurationProperty.builder()
   * .enabled(false)
   * .encryptionConfiguration(ManagedStorageEncryptionConfigurationProperty.builder()
   * .kmsKey("kmsKey")
   * .build())
   * .build())
   * .publishCloudWatchMetricsEnabled(false)
   * .removeBytesScannedCutoffPerQuery(false)
   * .removeCustomerContentEncryptionConfiguration(false)
   * .requesterPaysEnabled(false)
   * .resultConfigurationUpdates(ResultConfigurationUpdatesProperty.builder()
   * .aclConfiguration(AclConfigurationProperty.builder()
   * .s3AclOption("s3AclOption")
   * .build())
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .encryptionOption("encryptionOption")
   * // the properties below are optional
   * .kmsKey("kmsKey")
   * .build())
   * .expectedBucketOwner("expectedBucketOwner")
   * .outputLocation("outputLocation")
   * .removeAclConfiguration(false)
   * .removeEncryptionConfiguration(false)
   * .removeExpectedBucketOwner(false)
   * .removeOutputLocation(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html)
   */
  public interface WorkGroupConfigurationUpdatesProperty {
    /**
     * Additional Configuration that are passed to Athena Spark Calculations running in this
     * workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-additionalconfiguration)
     */
    public fun additionalConfiguration(): String? = unwrap(this).getAdditionalConfiguration()

    /**
     * The upper data usage limit (cutoff) for the amount of bytes a single query in a workgroup is
     * allowed to scan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-bytesscannedcutoffperquery)
     */
    public fun bytesScannedCutoffPerQuery(): Number? = unwrap(this).getBytesScannedCutoffPerQuery()

    /**
     * Indicates the KMS key for encrypting notebook content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-customercontentencryptionconfiguration)
     */
    public fun customerContentEncryptionConfiguration(): Any? =
        unwrap(this).getCustomerContentEncryptionConfiguration()

    /**
     * If set to "true", the settings for the workgroup override client-side settings.
     *
     * If set to "false", client-side settings are used
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-enforceworkgroupconfiguration)
     */
    public fun enforceWorkGroupConfiguration(): Any? =
        unwrap(this).getEnforceWorkGroupConfiguration()

    /**
     * The Athena engine version for running queries.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-engineversion)
     */
    public fun engineVersion(): Any? = unwrap(this).getEngineVersion()

    /**
     * Execution Role ARN required to run Athena Spark Calculations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-executionrole)
     */
    public fun executionRole(): String? = unwrap(this).getExecutionRole()

    /**
     * The configuration for the managed query results and encryption option.
     *
     * ResultConfiguration and ManagedQueryResultsConfiguration cannot be set at the same time
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-managedqueryresultsconfiguration)
     */
    public fun managedQueryResultsConfiguration(): Any? =
        unwrap(this).getManagedQueryResultsConfiguration()

    /**
     * Indicates that the Amazon CloudWatch metrics are enabled for the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-publishcloudwatchmetricsenabled)
     */
    public fun publishCloudWatchMetricsEnabled(): Any? =
        unwrap(this).getPublishCloudWatchMetricsEnabled()

    /**
     * Indicates that the data usage control limit per query is removed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-removebytesscannedcutoffperquery)
     */
    public fun removeBytesScannedCutoffPerQuery(): Any? =
        unwrap(this).getRemoveBytesScannedCutoffPerQuery()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-removecustomercontentencryptionconfiguration)
     */
    public fun removeCustomerContentEncryptionConfiguration(): Any? =
        unwrap(this).getRemoveCustomerContentEncryptionConfiguration()

    /**
     * If set to true, allows members assigned to a workgroup to reference Amazon S3 Requester Pays
     * buckets in queries.
     *
     * If set to false, workgroup members cannot query data from Requester Pays buckets, and queries
     * that retrieve data from Requester Pays buckets cause an error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-requesterpaysenabled)
     */
    public fun requesterPaysEnabled(): Any? = unwrap(this).getRequesterPaysEnabled()

    /**
     * The result configuration information about the queries in this workgroup that will be
     * updated.
     *
     * Includes the updated results location and an updated option for encrypting query results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-resultconfigurationupdates)
     */
    public fun resultConfigurationUpdates(): Any? = unwrap(this).getResultConfigurationUpdates()

    /**
     * A builder for [WorkGroupConfigurationUpdatesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param additionalConfiguration Additional Configuration that are passed to Athena Spark
       * Calculations running in this workgroup.
       */
      public fun additionalConfiguration(additionalConfiguration: String)

      /**
       * @param bytesScannedCutoffPerQuery The upper data usage limit (cutoff) for the amount of
       * bytes a single query in a workgroup is allowed to scan.
       */
      public fun bytesScannedCutoffPerQuery(bytesScannedCutoffPerQuery: Number)

      /**
       * @param customerContentEncryptionConfiguration Indicates the KMS key for encrypting notebook
       * content.
       */
      public
          fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: IResolvable)

      /**
       * @param customerContentEncryptionConfiguration Indicates the KMS key for encrypting notebook
       * content.
       */
      public
          fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: CustomerContentEncryptionConfigurationProperty)

      /**
       * @param customerContentEncryptionConfiguration Indicates the KMS key for encrypting notebook
       * content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("776733b5dc97dd9df75355f3312a80aa992a5329bee56f4284ed4dbe88d5f39b")
      public
          fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: CustomerContentEncryptionConfigurationProperty.Builder.() -> Unit)

      /**
       * @param enforceWorkGroupConfiguration If set to "true", the settings for the workgroup
       * override client-side settings.
       * If set to "false", client-side settings are used
       */
      public fun enforceWorkGroupConfiguration(enforceWorkGroupConfiguration: Boolean)

      /**
       * @param enforceWorkGroupConfiguration If set to "true", the settings for the workgroup
       * override client-side settings.
       * If set to "false", client-side settings are used
       */
      public fun enforceWorkGroupConfiguration(enforceWorkGroupConfiguration: IResolvable)

      /**
       * @param engineVersion The Athena engine version for running queries.
       */
      public fun engineVersion(engineVersion: IResolvable)

      /**
       * @param engineVersion The Athena engine version for running queries.
       */
      public fun engineVersion(engineVersion: EngineVersionProperty)

      /**
       * @param engineVersion The Athena engine version for running queries.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0b286f7f543152c6f37cc53f1379386fbf11a01c719cab1ead34d128875b08eb")
      public fun engineVersion(engineVersion: EngineVersionProperty.Builder.() -> Unit)

      /**
       * @param executionRole Execution Role ARN required to run Athena Spark Calculations.
       */
      public fun executionRole(executionRole: String)

      /**
       * @param managedQueryResultsConfiguration The configuration for the managed query results and
       * encryption option.
       * ResultConfiguration and ManagedQueryResultsConfiguration cannot be set at the same time
       */
      public fun managedQueryResultsConfiguration(managedQueryResultsConfiguration: IResolvable)

      /**
       * @param managedQueryResultsConfiguration The configuration for the managed query results and
       * encryption option.
       * ResultConfiguration and ManagedQueryResultsConfiguration cannot be set at the same time
       */
      public
          fun managedQueryResultsConfiguration(managedQueryResultsConfiguration: ManagedQueryResultsConfigurationProperty)

      /**
       * @param managedQueryResultsConfiguration The configuration for the managed query results and
       * encryption option.
       * ResultConfiguration and ManagedQueryResultsConfiguration cannot be set at the same time
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3831ce400185dd57774edfad68967b4684748a619b7f3d0b1a69777870b536ff")
      public
          fun managedQueryResultsConfiguration(managedQueryResultsConfiguration: ManagedQueryResultsConfigurationProperty.Builder.() -> Unit)

      /**
       * @param publishCloudWatchMetricsEnabled Indicates that the Amazon CloudWatch metrics are
       * enabled for the workgroup.
       */
      public fun publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled: Boolean)

      /**
       * @param publishCloudWatchMetricsEnabled Indicates that the Amazon CloudWatch metrics are
       * enabled for the workgroup.
       */
      public fun publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled: IResolvable)

      /**
       * @param removeBytesScannedCutoffPerQuery Indicates that the data usage control limit per
       * query is removed.
       */
      public fun removeBytesScannedCutoffPerQuery(removeBytesScannedCutoffPerQuery: Boolean)

      /**
       * @param removeBytesScannedCutoffPerQuery Indicates that the data usage control limit per
       * query is removed.
       */
      public fun removeBytesScannedCutoffPerQuery(removeBytesScannedCutoffPerQuery: IResolvable)

      /**
       * @param removeCustomerContentEncryptionConfiguration the value to be set.
       */
      public
          fun removeCustomerContentEncryptionConfiguration(removeCustomerContentEncryptionConfiguration: Boolean)

      /**
       * @param removeCustomerContentEncryptionConfiguration the value to be set.
       */
      public
          fun removeCustomerContentEncryptionConfiguration(removeCustomerContentEncryptionConfiguration: IResolvable)

      /**
       * @param requesterPaysEnabled If set to true, allows members assigned to a workgroup to
       * reference Amazon S3 Requester Pays buckets in queries.
       * If set to false, workgroup members cannot query data from Requester Pays buckets, and
       * queries that retrieve data from Requester Pays buckets cause an error.
       */
      public fun requesterPaysEnabled(requesterPaysEnabled: Boolean)

      /**
       * @param requesterPaysEnabled If set to true, allows members assigned to a workgroup to
       * reference Amazon S3 Requester Pays buckets in queries.
       * If set to false, workgroup members cannot query data from Requester Pays buckets, and
       * queries that retrieve data from Requester Pays buckets cause an error.
       */
      public fun requesterPaysEnabled(requesterPaysEnabled: IResolvable)

      /**
       * @param resultConfigurationUpdates The result configuration information about the queries in
       * this workgroup that will be updated.
       * Includes the updated results location and an updated option for encrypting query results.
       */
      public fun resultConfigurationUpdates(resultConfigurationUpdates: IResolvable)

      /**
       * @param resultConfigurationUpdates The result configuration information about the queries in
       * this workgroup that will be updated.
       * Includes the updated results location and an updated option for encrypting query results.
       */
      public
          fun resultConfigurationUpdates(resultConfigurationUpdates: ResultConfigurationUpdatesProperty)

      /**
       * @param resultConfigurationUpdates The result configuration information about the queries in
       * this workgroup that will be updated.
       * Includes the updated results location and an updated option for encrypting query results.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac011ddfd0736211190b806a9feab225d5f224d06c649c15660ec65cbe3cd716")
      public
          fun resultConfigurationUpdates(resultConfigurationUpdates: ResultConfigurationUpdatesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationUpdatesProperty.Builder
          =
          software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationUpdatesProperty.builder()

      /**
       * @param additionalConfiguration Additional Configuration that are passed to Athena Spark
       * Calculations running in this workgroup.
       */
      override fun additionalConfiguration(additionalConfiguration: String) {
        cdkBuilder.additionalConfiguration(additionalConfiguration)
      }

      /**
       * @param bytesScannedCutoffPerQuery The upper data usage limit (cutoff) for the amount of
       * bytes a single query in a workgroup is allowed to scan.
       */
      override fun bytesScannedCutoffPerQuery(bytesScannedCutoffPerQuery: Number) {
        cdkBuilder.bytesScannedCutoffPerQuery(bytesScannedCutoffPerQuery)
      }

      /**
       * @param customerContentEncryptionConfiguration Indicates the KMS key for encrypting notebook
       * content.
       */
      override
          fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: IResolvable) {
        cdkBuilder.customerContentEncryptionConfiguration(customerContentEncryptionConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customerContentEncryptionConfiguration Indicates the KMS key for encrypting notebook
       * content.
       */
      override
          fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: CustomerContentEncryptionConfigurationProperty) {
        cdkBuilder.customerContentEncryptionConfiguration(customerContentEncryptionConfiguration.let(CustomerContentEncryptionConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param customerContentEncryptionConfiguration Indicates the KMS key for encrypting notebook
       * content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("776733b5dc97dd9df75355f3312a80aa992a5329bee56f4284ed4dbe88d5f39b")
      override
          fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: CustomerContentEncryptionConfigurationProperty.Builder.() -> Unit):
          Unit =
          customerContentEncryptionConfiguration(CustomerContentEncryptionConfigurationProperty(customerContentEncryptionConfiguration))

      /**
       * @param enforceWorkGroupConfiguration If set to "true", the settings for the workgroup
       * override client-side settings.
       * If set to "false", client-side settings are used
       */
      override fun enforceWorkGroupConfiguration(enforceWorkGroupConfiguration: Boolean) {
        cdkBuilder.enforceWorkGroupConfiguration(enforceWorkGroupConfiguration)
      }

      /**
       * @param enforceWorkGroupConfiguration If set to "true", the settings for the workgroup
       * override client-side settings.
       * If set to "false", client-side settings are used
       */
      override fun enforceWorkGroupConfiguration(enforceWorkGroupConfiguration: IResolvable) {
        cdkBuilder.enforceWorkGroupConfiguration(enforceWorkGroupConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param engineVersion The Athena engine version for running queries.
       */
      override fun engineVersion(engineVersion: IResolvable) {
        cdkBuilder.engineVersion(engineVersion.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param engineVersion The Athena engine version for running queries.
       */
      override fun engineVersion(engineVersion: EngineVersionProperty) {
        cdkBuilder.engineVersion(engineVersion.let(EngineVersionProperty.Companion::unwrap))
      }

      /**
       * @param engineVersion The Athena engine version for running queries.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0b286f7f543152c6f37cc53f1379386fbf11a01c719cab1ead34d128875b08eb")
      override fun engineVersion(engineVersion: EngineVersionProperty.Builder.() -> Unit): Unit =
          engineVersion(EngineVersionProperty(engineVersion))

      /**
       * @param executionRole Execution Role ARN required to run Athena Spark Calculations.
       */
      override fun executionRole(executionRole: String) {
        cdkBuilder.executionRole(executionRole)
      }

      /**
       * @param managedQueryResultsConfiguration The configuration for the managed query results and
       * encryption option.
       * ResultConfiguration and ManagedQueryResultsConfiguration cannot be set at the same time
       */
      override fun managedQueryResultsConfiguration(managedQueryResultsConfiguration: IResolvable) {
        cdkBuilder.managedQueryResultsConfiguration(managedQueryResultsConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param managedQueryResultsConfiguration The configuration for the managed query results and
       * encryption option.
       * ResultConfiguration and ManagedQueryResultsConfiguration cannot be set at the same time
       */
      override
          fun managedQueryResultsConfiguration(managedQueryResultsConfiguration: ManagedQueryResultsConfigurationProperty) {
        cdkBuilder.managedQueryResultsConfiguration(managedQueryResultsConfiguration.let(ManagedQueryResultsConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param managedQueryResultsConfiguration The configuration for the managed query results and
       * encryption option.
       * ResultConfiguration and ManagedQueryResultsConfiguration cannot be set at the same time
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3831ce400185dd57774edfad68967b4684748a619b7f3d0b1a69777870b536ff")
      override
          fun managedQueryResultsConfiguration(managedQueryResultsConfiguration: ManagedQueryResultsConfigurationProperty.Builder.() -> Unit):
          Unit =
          managedQueryResultsConfiguration(ManagedQueryResultsConfigurationProperty(managedQueryResultsConfiguration))

      /**
       * @param publishCloudWatchMetricsEnabled Indicates that the Amazon CloudWatch metrics are
       * enabled for the workgroup.
       */
      override fun publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled: Boolean) {
        cdkBuilder.publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled)
      }

      /**
       * @param publishCloudWatchMetricsEnabled Indicates that the Amazon CloudWatch metrics are
       * enabled for the workgroup.
       */
      override fun publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled: IResolvable) {
        cdkBuilder.publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param removeBytesScannedCutoffPerQuery Indicates that the data usage control limit per
       * query is removed.
       */
      override fun removeBytesScannedCutoffPerQuery(removeBytesScannedCutoffPerQuery: Boolean) {
        cdkBuilder.removeBytesScannedCutoffPerQuery(removeBytesScannedCutoffPerQuery)
      }

      /**
       * @param removeBytesScannedCutoffPerQuery Indicates that the data usage control limit per
       * query is removed.
       */
      override fun removeBytesScannedCutoffPerQuery(removeBytesScannedCutoffPerQuery: IResolvable) {
        cdkBuilder.removeBytesScannedCutoffPerQuery(removeBytesScannedCutoffPerQuery.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param removeCustomerContentEncryptionConfiguration the value to be set.
       */
      override
          fun removeCustomerContentEncryptionConfiguration(removeCustomerContentEncryptionConfiguration: Boolean) {
        cdkBuilder.removeCustomerContentEncryptionConfiguration(removeCustomerContentEncryptionConfiguration)
      }

      /**
       * @param removeCustomerContentEncryptionConfiguration the value to be set.
       */
      override
          fun removeCustomerContentEncryptionConfiguration(removeCustomerContentEncryptionConfiguration: IResolvable) {
        cdkBuilder.removeCustomerContentEncryptionConfiguration(removeCustomerContentEncryptionConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param requesterPaysEnabled If set to true, allows members assigned to a workgroup to
       * reference Amazon S3 Requester Pays buckets in queries.
       * If set to false, workgroup members cannot query data from Requester Pays buckets, and
       * queries that retrieve data from Requester Pays buckets cause an error.
       */
      override fun requesterPaysEnabled(requesterPaysEnabled: Boolean) {
        cdkBuilder.requesterPaysEnabled(requesterPaysEnabled)
      }

      /**
       * @param requesterPaysEnabled If set to true, allows members assigned to a workgroup to
       * reference Amazon S3 Requester Pays buckets in queries.
       * If set to false, workgroup members cannot query data from Requester Pays buckets, and
       * queries that retrieve data from Requester Pays buckets cause an error.
       */
      override fun requesterPaysEnabled(requesterPaysEnabled: IResolvable) {
        cdkBuilder.requesterPaysEnabled(requesterPaysEnabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param resultConfigurationUpdates The result configuration information about the queries in
       * this workgroup that will be updated.
       * Includes the updated results location and an updated option for encrypting query results.
       */
      override fun resultConfigurationUpdates(resultConfigurationUpdates: IResolvable) {
        cdkBuilder.resultConfigurationUpdates(resultConfigurationUpdates.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param resultConfigurationUpdates The result configuration information about the queries in
       * this workgroup that will be updated.
       * Includes the updated results location and an updated option for encrypting query results.
       */
      override
          fun resultConfigurationUpdates(resultConfigurationUpdates: ResultConfigurationUpdatesProperty) {
        cdkBuilder.resultConfigurationUpdates(resultConfigurationUpdates.let(ResultConfigurationUpdatesProperty.Companion::unwrap))
      }

      /**
       * @param resultConfigurationUpdates The result configuration information about the queries in
       * this workgroup that will be updated.
       * Includes the updated results location and an updated option for encrypting query results.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac011ddfd0736211190b806a9feab225d5f224d06c649c15660ec65cbe3cd716")
      override
          fun resultConfigurationUpdates(resultConfigurationUpdates: ResultConfigurationUpdatesProperty.Builder.() -> Unit):
          Unit =
          resultConfigurationUpdates(ResultConfigurationUpdatesProperty(resultConfigurationUpdates))

      public fun build():
          software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationUpdatesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationUpdatesProperty,
    ) : CdkObject(cdkObject),
        WorkGroupConfigurationUpdatesProperty {
      /**
       * Additional Configuration that are passed to Athena Spark Calculations running in this
       * workgroup.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-additionalconfiguration)
       */
      override fun additionalConfiguration(): String? = unwrap(this).getAdditionalConfiguration()

      /**
       * The upper data usage limit (cutoff) for the amount of bytes a single query in a workgroup
       * is allowed to scan.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-bytesscannedcutoffperquery)
       */
      override fun bytesScannedCutoffPerQuery(): Number? =
          unwrap(this).getBytesScannedCutoffPerQuery()

      /**
       * Indicates the KMS key for encrypting notebook content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-customercontentencryptionconfiguration)
       */
      override fun customerContentEncryptionConfiguration(): Any? =
          unwrap(this).getCustomerContentEncryptionConfiguration()

      /**
       * If set to "true", the settings for the workgroup override client-side settings.
       *
       * If set to "false", client-side settings are used
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-enforceworkgroupconfiguration)
       */
      override fun enforceWorkGroupConfiguration(): Any? =
          unwrap(this).getEnforceWorkGroupConfiguration()

      /**
       * The Athena engine version for running queries.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-engineversion)
       */
      override fun engineVersion(): Any? = unwrap(this).getEngineVersion()

      /**
       * Execution Role ARN required to run Athena Spark Calculations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-executionrole)
       */
      override fun executionRole(): String? = unwrap(this).getExecutionRole()

      /**
       * The configuration for the managed query results and encryption option.
       *
       * ResultConfiguration and ManagedQueryResultsConfiguration cannot be set at the same time
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-managedqueryresultsconfiguration)
       */
      override fun managedQueryResultsConfiguration(): Any? =
          unwrap(this).getManagedQueryResultsConfiguration()

      /**
       * Indicates that the Amazon CloudWatch metrics are enabled for the workgroup.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-publishcloudwatchmetricsenabled)
       */
      override fun publishCloudWatchMetricsEnabled(): Any? =
          unwrap(this).getPublishCloudWatchMetricsEnabled()

      /**
       * Indicates that the data usage control limit per query is removed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-removebytesscannedcutoffperquery)
       */
      override fun removeBytesScannedCutoffPerQuery(): Any? =
          unwrap(this).getRemoveBytesScannedCutoffPerQuery()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-removecustomercontentencryptionconfiguration)
       */
      override fun removeCustomerContentEncryptionConfiguration(): Any? =
          unwrap(this).getRemoveCustomerContentEncryptionConfiguration()

      /**
       * If set to true, allows members assigned to a workgroup to reference Amazon S3 Requester
       * Pays buckets in queries.
       *
       * If set to false, workgroup members cannot query data from Requester Pays buckets, and
       * queries that retrieve data from Requester Pays buckets cause an error.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-requesterpaysenabled)
       */
      override fun requesterPaysEnabled(): Any? = unwrap(this).getRequesterPaysEnabled()

      /**
       * The result configuration information about the queries in this workgroup that will be
       * updated.
       *
       * Includes the updated results location and an updated option for encrypting query results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html#cfn-athena-workgroup-workgroupconfigurationupdates-resultconfigurationupdates)
       */
      override fun resultConfigurationUpdates(): Any? = unwrap(this).getResultConfigurationUpdates()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          WorkGroupConfigurationUpdatesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationUpdatesProperty):
          WorkGroupConfigurationUpdatesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          WorkGroupConfigurationUpdatesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkGroupConfigurationUpdatesProperty):
          software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationUpdatesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationUpdatesProperty
    }
  }
}
