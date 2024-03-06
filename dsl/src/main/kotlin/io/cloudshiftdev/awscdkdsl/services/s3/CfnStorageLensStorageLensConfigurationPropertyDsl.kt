@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens

/**
 * This is the property of the Amazon S3 Storage Lens configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * Object sses3;
 * StorageLensConfigurationProperty storageLensConfigurationProperty =
 * StorageLensConfigurationProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-storagelensconfiguration.html)
 */
@CdkDslMarker
public class CfnStorageLensStorageLensConfigurationPropertyDsl {
    private val cdkBuilder: CfnStorageLens.StorageLensConfigurationProperty.Builder =
        CfnStorageLens.StorageLensConfigurationProperty.builder()

    /**
     * @param accountLevel This property contains the details of the account-level metrics for
     *   Amazon S3 Storage Lens configuration.
     */
    public fun accountLevel(accountLevel: IResolvable) {
        cdkBuilder.accountLevel(accountLevel)
    }

    /**
     * @param accountLevel This property contains the details of the account-level metrics for
     *   Amazon S3 Storage Lens configuration.
     */
    public fun accountLevel(accountLevel: CfnStorageLens.AccountLevelProperty) {
        cdkBuilder.accountLevel(accountLevel)
    }

    /**
     * @param awsOrg This property contains the details of the AWS Organization for the S3 Storage
     *   Lens configuration.
     */
    public fun awsOrg(awsOrg: IResolvable) {
        cdkBuilder.awsOrg(awsOrg)
    }

    /**
     * @param awsOrg This property contains the details of the AWS Organization for the S3 Storage
     *   Lens configuration.
     */
    public fun awsOrg(awsOrg: CfnStorageLens.AwsOrgProperty) {
        cdkBuilder.awsOrg(awsOrg)
    }

    /**
     * @param dataExport This property contains the details of this S3 Storage Lens configuration's
     *   metrics export.
     */
    public fun dataExport(dataExport: IResolvable) {
        cdkBuilder.dataExport(dataExport)
    }

    /**
     * @param dataExport This property contains the details of this S3 Storage Lens configuration's
     *   metrics export.
     */
    public fun dataExport(dataExport: CfnStorageLens.DataExportProperty) {
        cdkBuilder.dataExport(dataExport)
    }

    /**
     * @param exclude This property contains the details of the bucket and or Regions excluded for
     *   Amazon S3 Storage Lens configuration.
     */
    public fun exclude(exclude: IResolvable) {
        cdkBuilder.exclude(exclude)
    }

    /**
     * @param exclude This property contains the details of the bucket and or Regions excluded for
     *   Amazon S3 Storage Lens configuration.
     */
    public fun exclude(exclude: CfnStorageLens.BucketsAndRegionsProperty) {
        cdkBuilder.exclude(exclude)
    }

    /**
     * @param id This property contains the details of the ID of the S3 Storage Lens configuration.
     */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /**
     * @param include This property contains the details of the bucket and or Regions included for
     *   Amazon S3 Storage Lens configuration.
     */
    public fun include(include: IResolvable) {
        cdkBuilder.include(include)
    }

    /**
     * @param include This property contains the details of the bucket and or Regions included for
     *   Amazon S3 Storage Lens configuration.
     */
    public fun include(include: CfnStorageLens.BucketsAndRegionsProperty) {
        cdkBuilder.include(include)
    }

    /**
     * @param isEnabled This property contains the details of whether the Amazon S3 Storage Lens
     *   configuration is enabled.
     */
    public fun isEnabled(isEnabled: Boolean) {
        cdkBuilder.isEnabled(isEnabled)
    }

    /**
     * @param isEnabled This property contains the details of whether the Amazon S3 Storage Lens
     *   configuration is enabled.
     */
    public fun isEnabled(isEnabled: IResolvable) {
        cdkBuilder.isEnabled(isEnabled)
    }

    /**
     * @param storageLensArn This property contains the details of the ARN of the S3 Storage Lens
     *   configuration. This property is read-only.
     */
    public fun storageLensArn(storageLensArn: String) {
        cdkBuilder.storageLensArn(storageLensArn)
    }

    public fun build(): CfnStorageLens.StorageLensConfigurationProperty = cdkBuilder.build()
}
