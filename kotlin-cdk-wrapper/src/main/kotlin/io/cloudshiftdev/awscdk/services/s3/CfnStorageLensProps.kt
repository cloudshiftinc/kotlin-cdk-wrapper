@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnStorageLens`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Object sses3;
 * CfnStorageLensProps cfnStorageLensProps = CfnStorageLensProps.builder()
 * .storageLensConfiguration(StorageLensConfigurationProperty.builder()
 * .accountLevel(AccountLevelProperty.builder()
 * .bucketLevel(BucketLevelProperty.builder()
 * .activityMetrics(ActivityMetricsProperty.builder()
 * .isEnabled(false)
 * .build())
 * .advancedCostOptimizationMetrics(AdvancedCostOptimizationMetricsProperty.builder()
 * .isEnabled(false)
 * .build())
 * .advancedDataProtectionMetrics(AdvancedDataProtectionMetricsProperty.builder()
 * .isEnabled(false)
 * .build())
 * .detailedStatusCodesMetrics(DetailedStatusCodesMetricsProperty.builder()
 * .isEnabled(false)
 * .build())
 * .prefixLevel(PrefixLevelProperty.builder()
 * .storageMetrics(PrefixLevelStorageMetricsProperty.builder()
 * .isEnabled(false)
 * .selectionCriteria(SelectionCriteriaProperty.builder()
 * .delimiter("delimiter")
 * .maxDepth(123)
 * .minStorageBytesPercentage(123)
 * .build())
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .activityMetrics(ActivityMetricsProperty.builder()
 * .isEnabled(false)
 * .build())
 * .advancedCostOptimizationMetrics(AdvancedCostOptimizationMetricsProperty.builder()
 * .isEnabled(false)
 * .build())
 * .advancedDataProtectionMetrics(AdvancedDataProtectionMetricsProperty.builder()
 * .isEnabled(false)
 * .build())
 * .detailedStatusCodesMetrics(DetailedStatusCodesMetricsProperty.builder()
 * .isEnabled(false)
 * .build())
 * .storageLensGroupLevel(StorageLensGroupLevelProperty.builder()
 * .storageLensGroupSelectionCriteria(StorageLensGroupSelectionCriteriaProperty.builder()
 * .exclude(List.of("exclude"))
 * .include(List.of("include"))
 * .build())
 * .build())
 * .build())
 * .id("id")
 * .isEnabled(false)
 * // the properties below are optional
 * .awsOrg(AwsOrgProperty.builder()
 * .arn("arn")
 * .build())
 * .dataExport(DataExportProperty.builder()
 * .cloudWatchMetrics(CloudWatchMetricsProperty.builder()
 * .isEnabled(false)
 * .build())
 * .s3BucketDestination(S3BucketDestinationProperty.builder()
 * .accountId("accountId")
 * .arn("arn")
 * .format("format")
 * .outputSchemaVersion("outputSchemaVersion")
 * // the properties below are optional
 * .encryption(EncryptionProperty.builder()
 * .ssekms(SSEKMSProperty.builder()
 * .keyId("keyId")
 * .build())
 * .sses3(sses3)
 * .build())
 * .prefix("prefix")
 * .build())
 * .build())
 * .exclude(BucketsAndRegionsProperty.builder()
 * .buckets(List.of("buckets"))
 * .regions(List.of("regions"))
 * .build())
 * .include(BucketsAndRegionsProperty.builder()
 * .buckets(List.of("buckets"))
 * .regions(List.of("regions"))
 * .build())
 * .storageLensArn("storageLensArn")
 * .build())
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelens.html)
 */
public interface CfnStorageLensProps {
  /**
   * This resource contains the details Amazon S3 Storage Lens configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelens.html#cfn-s3-storagelens-storagelensconfiguration)
   */
  public fun storageLensConfiguration(): Any

  /**
   * A set of tags (key–value pairs) to associate with the Storage Lens configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelens.html#cfn-s3-storagelens-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnStorageLensProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param storageLensConfiguration This resource contains the details Amazon S3 Storage Lens
     * configuration. 
     */
    public fun storageLensConfiguration(storageLensConfiguration: IResolvable)

    /**
     * @param storageLensConfiguration This resource contains the details Amazon S3 Storage Lens
     * configuration. 
     */
    public
        fun storageLensConfiguration(storageLensConfiguration: CfnStorageLens.StorageLensConfigurationProperty)

    /**
     * @param storageLensConfiguration This resource contains the details Amazon S3 Storage Lens
     * configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b28c891acedc066585e8d67f043aeddb36a05c451ee1e66097cafe3a3ad52376")
    public
        fun storageLensConfiguration(storageLensConfiguration: CfnStorageLens.StorageLensConfigurationProperty.Builder.() -> Unit)

    /**
     * @param tags A set of tags (key–value pairs) to associate with the Storage Lens configuration.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A set of tags (key–value pairs) to associate with the Storage Lens configuration.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnStorageLensProps.Builder =
        software.amazon.awscdk.services.s3.CfnStorageLensProps.builder()

    /**
     * @param storageLensConfiguration This resource contains the details Amazon S3 Storage Lens
     * configuration. 
     */
    override fun storageLensConfiguration(storageLensConfiguration: IResolvable) {
      cdkBuilder.storageLensConfiguration(storageLensConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param storageLensConfiguration This resource contains the details Amazon S3 Storage Lens
     * configuration. 
     */
    override
        fun storageLensConfiguration(storageLensConfiguration: CfnStorageLens.StorageLensConfigurationProperty) {
      cdkBuilder.storageLensConfiguration(storageLensConfiguration.let(CfnStorageLens.StorageLensConfigurationProperty::unwrap))
    }

    /**
     * @param storageLensConfiguration This resource contains the details Amazon S3 Storage Lens
     * configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b28c891acedc066585e8d67f043aeddb36a05c451ee1e66097cafe3a3ad52376")
    override
        fun storageLensConfiguration(storageLensConfiguration: CfnStorageLens.StorageLensConfigurationProperty.Builder.() -> Unit):
        Unit =
        storageLensConfiguration(CfnStorageLens.StorageLensConfigurationProperty(storageLensConfiguration))

    /**
     * @param tags A set of tags (key–value pairs) to associate with the Storage Lens configuration.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A set of tags (key–value pairs) to associate with the Storage Lens configuration.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.s3.CfnStorageLensProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensProps,
  ) : CdkObject(cdkObject), CfnStorageLensProps {
    /**
     * This resource contains the details Amazon S3 Storage Lens configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelens.html#cfn-s3-storagelens-storagelensconfiguration)
     */
    override fun storageLensConfiguration(): Any = unwrap(this).getStorageLensConfiguration()

    /**
     * A set of tags (key–value pairs) to associate with the Storage Lens configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-storagelens.html#cfn-s3-storagelens-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStorageLensProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensProps):
        CfnStorageLensProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStorageLensProps):
        software.amazon.awscdk.services.s3.CfnStorageLensProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.s3.CfnStorageLensProps
  }
}
