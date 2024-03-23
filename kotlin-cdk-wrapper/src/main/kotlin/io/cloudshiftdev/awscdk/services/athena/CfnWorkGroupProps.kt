@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.athena

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnWorkGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.athena.*;
 * CfnWorkGroupProps cfnWorkGroupProps = CfnWorkGroupProps.builder()
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
public interface CfnWorkGroupProps {
  /**
   * The workgroup description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The workgroup name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-name)
   */
  public fun name(): String

  /**
   * The option to delete a workgroup and its contents even if the workgroup contains any named
   * queries.
   *
   * The default is false.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-recursivedeleteoption)
   */
  public fun recursiveDeleteOption(): Any? = unwrap(this).getRecursiveDeleteOption()

  /**
   * The state of the workgroup: ENABLED or DISABLED.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-state)
   */
  public fun state(): String? = unwrap(this).getState()

  /**
   * The tags (key-value pairs) to associate with this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
   */
  public fun workGroupConfiguration(): Any? = unwrap(this).getWorkGroupConfiguration()

  /**
   * (deprecated) The configuration information that will be updated for this workgroup, which
   * includes the location in Amazon S3 where query results are stored, the encryption option, if any,
   * used for query results, whether the Amazon CloudWatch Metrics are enabled for the workgroup,
   * whether the workgroup settings override the client-side settings, and the data usage limit for the
   * amount of bytes scanned per query, if it is specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-workgroupconfigurationupdates)
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun workGroupConfigurationUpdates(): Any? = unwrap(this).getWorkGroupConfigurationUpdates()

  /**
   * A builder for [CfnWorkGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The workgroup description.
     */
    public fun description(description: String)

    /**
     * @param name The workgroup name. 
     */
    public fun name(name: String)

    /**
     * @param recursiveDeleteOption The option to delete a workgroup and its contents even if the
     * workgroup contains any named queries.
     * The default is false.
     */
    public fun recursiveDeleteOption(recursiveDeleteOption: Boolean)

    /**
     * @param recursiveDeleteOption The option to delete a workgroup and its contents even if the
     * workgroup contains any named queries.
     * The default is false.
     */
    public fun recursiveDeleteOption(recursiveDeleteOption: IResolvable)

    /**
     * @param state The state of the workgroup: ENABLED or DISABLED.
     */
    public fun state(state: String)

    /**
     * @param tags The tags (key-value pairs) to associate with this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags (key-value pairs) to associate with this resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param workGroupConfiguration The configuration of the workgroup, which includes the location
     * in Amazon S3 where query results are stored, the encryption option, if any, used for query
     * results, whether Amazon CloudWatch Metrics are enabled for the workgroup, and the limit for the
     * amount of bytes scanned (cutoff) per query, if it is specified.
     * The `EnforceWorkGroupConfiguration` option determines whether workgroup settings override
     * client-side query settings.
     */
    public fun workGroupConfiguration(workGroupConfiguration: IResolvable)

    /**
     * @param workGroupConfiguration The configuration of the workgroup, which includes the location
     * in Amazon S3 where query results are stored, the encryption option, if any, used for query
     * results, whether Amazon CloudWatch Metrics are enabled for the workgroup, and the limit for the
     * amount of bytes scanned (cutoff) per query, if it is specified.
     * The `EnforceWorkGroupConfiguration` option determines whether workgroup settings override
     * client-side query settings.
     */
    public
        fun workGroupConfiguration(workGroupConfiguration: CfnWorkGroup.WorkGroupConfigurationProperty)

    /**
     * @param workGroupConfiguration The configuration of the workgroup, which includes the location
     * in Amazon S3 where query results are stored, the encryption option, if any, used for query
     * results, whether Amazon CloudWatch Metrics are enabled for the workgroup, and the limit for the
     * amount of bytes scanned (cutoff) per query, if it is specified.
     * The `EnforceWorkGroupConfiguration` option determines whether workgroup settings override
     * client-side query settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1286b8e844700d4de120ceee24d1ad5e8ba74d54cd7f2f806bfc22f1d110c39e")
    public
        fun workGroupConfiguration(workGroupConfiguration: CfnWorkGroup.WorkGroupConfigurationProperty.Builder.() -> Unit)

    /**
     * @param workGroupConfigurationUpdates The configuration information that will be updated for
     * this workgroup, which includes the location in Amazon S3 where query results are stored, the
     * encryption option, if any, used for query results, whether the Amazon CloudWatch Metrics are
     * enabled for the workgroup, whether the workgroup settings override the client-side settings, and
     * the data usage limit for the amount of bytes scanned per query, if it is specified.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: IResolvable)

    /**
     * @param workGroupConfigurationUpdates The configuration information that will be updated for
     * this workgroup, which includes the location in Amazon S3 where query results are stored, the
     * encryption option, if any, used for query results, whether the Amazon CloudWatch Metrics are
     * enabled for the workgroup, whether the workgroup settings override the client-side settings, and
     * the data usage limit for the amount of bytes scanned per query, if it is specified.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public
        fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: CfnWorkGroup.WorkGroupConfigurationUpdatesProperty)

    /**
     * @param workGroupConfigurationUpdates The configuration information that will be updated for
     * this workgroup, which includes the location in Amazon S3 where query results are stored, the
     * encryption option, if any, used for query results, whether the Amazon CloudWatch Metrics are
     * enabled for the workgroup, whether the workgroup settings override the client-side settings, and
     * the data usage limit for the amount of bytes scanned per query, if it is specified.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb27a197a13edf01c0beb8d22a3712f3a63156b7060ff0e26ee2b39b3dad6e2e")
    public
        fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: CfnWorkGroup.WorkGroupConfigurationUpdatesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.athena.CfnWorkGroupProps.Builder =
        software.amazon.awscdk.services.athena.CfnWorkGroupProps.builder()

    /**
     * @param description The workgroup description.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The workgroup name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param recursiveDeleteOption The option to delete a workgroup and its contents even if the
     * workgroup contains any named queries.
     * The default is false.
     */
    override fun recursiveDeleteOption(recursiveDeleteOption: Boolean) {
      cdkBuilder.recursiveDeleteOption(recursiveDeleteOption)
    }

    /**
     * @param recursiveDeleteOption The option to delete a workgroup and its contents even if the
     * workgroup contains any named queries.
     * The default is false.
     */
    override fun recursiveDeleteOption(recursiveDeleteOption: IResolvable) {
      cdkBuilder.recursiveDeleteOption(recursiveDeleteOption.let(IResolvable::unwrap))
    }

    /**
     * @param state The state of the workgroup: ENABLED or DISABLED.
     */
    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    /**
     * @param tags The tags (key-value pairs) to associate with this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags (key-value pairs) to associate with this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param workGroupConfiguration The configuration of the workgroup, which includes the location
     * in Amazon S3 where query results are stored, the encryption option, if any, used for query
     * results, whether Amazon CloudWatch Metrics are enabled for the workgroup, and the limit for the
     * amount of bytes scanned (cutoff) per query, if it is specified.
     * The `EnforceWorkGroupConfiguration` option determines whether workgroup settings override
     * client-side query settings.
     */
    override fun workGroupConfiguration(workGroupConfiguration: IResolvable) {
      cdkBuilder.workGroupConfiguration(workGroupConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param workGroupConfiguration The configuration of the workgroup, which includes the location
     * in Amazon S3 where query results are stored, the encryption option, if any, used for query
     * results, whether Amazon CloudWatch Metrics are enabled for the workgroup, and the limit for the
     * amount of bytes scanned (cutoff) per query, if it is specified.
     * The `EnforceWorkGroupConfiguration` option determines whether workgroup settings override
     * client-side query settings.
     */
    override
        fun workGroupConfiguration(workGroupConfiguration: CfnWorkGroup.WorkGroupConfigurationProperty) {
      cdkBuilder.workGroupConfiguration(workGroupConfiguration.let(CfnWorkGroup.WorkGroupConfigurationProperty::unwrap))
    }

    /**
     * @param workGroupConfiguration The configuration of the workgroup, which includes the location
     * in Amazon S3 where query results are stored, the encryption option, if any, used for query
     * results, whether Amazon CloudWatch Metrics are enabled for the workgroup, and the limit for the
     * amount of bytes scanned (cutoff) per query, if it is specified.
     * The `EnforceWorkGroupConfiguration` option determines whether workgroup settings override
     * client-side query settings.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1286b8e844700d4de120ceee24d1ad5e8ba74d54cd7f2f806bfc22f1d110c39e")
    override
        fun workGroupConfiguration(workGroupConfiguration: CfnWorkGroup.WorkGroupConfigurationProperty.Builder.() -> Unit):
        Unit =
        workGroupConfiguration(CfnWorkGroup.WorkGroupConfigurationProperty(workGroupConfiguration))

    /**
     * @param workGroupConfigurationUpdates The configuration information that will be updated for
     * this workgroup, which includes the location in Amazon S3 where query results are stored, the
     * encryption option, if any, used for query results, whether the Amazon CloudWatch Metrics are
     * enabled for the workgroup, whether the workgroup settings override the client-side settings, and
     * the data usage limit for the amount of bytes scanned per query, if it is specified.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: IResolvable) {
      cdkBuilder.workGroupConfigurationUpdates(workGroupConfigurationUpdates.let(IResolvable::unwrap))
    }

    /**
     * @param workGroupConfigurationUpdates The configuration information that will be updated for
     * this workgroup, which includes the location in Amazon S3 where query results are stored, the
     * encryption option, if any, used for query results, whether the Amazon CloudWatch Metrics are
     * enabled for the workgroup, whether the workgroup settings override the client-side settings, and
     * the data usage limit for the amount of bytes scanned per query, if it is specified.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override
        fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: CfnWorkGroup.WorkGroupConfigurationUpdatesProperty) {
      cdkBuilder.workGroupConfigurationUpdates(workGroupConfigurationUpdates.let(CfnWorkGroup.WorkGroupConfigurationUpdatesProperty::unwrap))
    }

    /**
     * @param workGroupConfigurationUpdates The configuration information that will be updated for
     * this workgroup, which includes the location in Amazon S3 where query results are stored, the
     * encryption option, if any, used for query results, whether the Amazon CloudWatch Metrics are
     * enabled for the workgroup, whether the workgroup settings override the client-side settings, and
     * the data usage limit for the amount of bytes scanned per query, if it is specified.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb27a197a13edf01c0beb8d22a3712f3a63156b7060ff0e26ee2b39b3dad6e2e")
    override
        fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: CfnWorkGroup.WorkGroupConfigurationUpdatesProperty.Builder.() -> Unit):
        Unit =
        workGroupConfigurationUpdates(CfnWorkGroup.WorkGroupConfigurationUpdatesProperty(workGroupConfigurationUpdates))

    public fun build(): software.amazon.awscdk.services.athena.CfnWorkGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroupProps,
  ) : CdkObject(cdkObject), CfnWorkGroupProps {
    /**
     * The workgroup description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The workgroup name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The option to delete a workgroup and its contents even if the workgroup contains any named
     * queries.
     *
     * The default is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-recursivedeleteoption)
     */
    override fun recursiveDeleteOption(): Any? = unwrap(this).getRecursiveDeleteOption()

    /**
     * The state of the workgroup: ENABLED or DISABLED.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-state)
     */
    override fun state(): String? = unwrap(this).getState()

    /**
     * The tags (key-value pairs) to associate with this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
     */
    override fun workGroupConfiguration(): Any? = unwrap(this).getWorkGroupConfiguration()

    /**
     * (deprecated) The configuration information that will be updated for this workgroup, which
     * includes the location in Amazon S3 where query results are stored, the encryption option, if
     * any, used for query results, whether the Amazon CloudWatch Metrics are enabled for the
     * workgroup, whether the workgroup settings override the client-side settings, and the data usage
     * limit for the amount of bytes scanned per query, if it is specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-workgroup.html#cfn-athena-workgroup-workgroupconfigurationupdates)
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun workGroupConfigurationUpdates(): Any? =
        unwrap(this).getWorkGroupConfigurationUpdates()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWorkGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroupProps):
        CfnWorkGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnWorkGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWorkGroupProps):
        software.amazon.awscdk.services.athena.CfnWorkGroupProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.athena.CfnWorkGroupProps
  }
}
