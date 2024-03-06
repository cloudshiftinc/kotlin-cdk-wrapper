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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens

/**
 * This resource contains the details of the account-level metrics for Amazon S3 Storage Lens.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * AccountLevelProperty accountLevelProperty = AccountLevelProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-accountlevel.html)
 */
@CdkDslMarker
public class CfnStorageLensAccountLevelPropertyDsl {
    private val cdkBuilder: CfnStorageLens.AccountLevelProperty.Builder =
        CfnStorageLens.AccountLevelProperty.builder()

    /**
     * @param activityMetrics This property contains the details of account-level activity metrics
     *   for S3 Storage Lens.
     */
    public fun activityMetrics(activityMetrics: IResolvable) {
        cdkBuilder.activityMetrics(activityMetrics)
    }

    /**
     * @param activityMetrics This property contains the details of account-level activity metrics
     *   for S3 Storage Lens.
     */
    public fun activityMetrics(activityMetrics: CfnStorageLens.ActivityMetricsProperty) {
        cdkBuilder.activityMetrics(activityMetrics)
    }

    /**
     * @param advancedCostOptimizationMetrics This property contains the details of account-level
     *   advanced cost optimization metrics for S3 Storage Lens.
     */
    public fun advancedCostOptimizationMetrics(advancedCostOptimizationMetrics: IResolvable) {
        cdkBuilder.advancedCostOptimizationMetrics(advancedCostOptimizationMetrics)
    }

    /**
     * @param advancedCostOptimizationMetrics This property contains the details of account-level
     *   advanced cost optimization metrics for S3 Storage Lens.
     */
    public fun advancedCostOptimizationMetrics(
        advancedCostOptimizationMetrics: CfnStorageLens.AdvancedCostOptimizationMetricsProperty
    ) {
        cdkBuilder.advancedCostOptimizationMetrics(advancedCostOptimizationMetrics)
    }

    /**
     * @param advancedDataProtectionMetrics This property contains the details of account-level
     *   advanced data protection metrics for S3 Storage Lens.
     */
    public fun advancedDataProtectionMetrics(advancedDataProtectionMetrics: IResolvable) {
        cdkBuilder.advancedDataProtectionMetrics(advancedDataProtectionMetrics)
    }

    /**
     * @param advancedDataProtectionMetrics This property contains the details of account-level
     *   advanced data protection metrics for S3 Storage Lens.
     */
    public fun advancedDataProtectionMetrics(
        advancedDataProtectionMetrics: CfnStorageLens.AdvancedDataProtectionMetricsProperty
    ) {
        cdkBuilder.advancedDataProtectionMetrics(advancedDataProtectionMetrics)
    }

    /**
     * @param bucketLevel This property contains the details of the account-level bucket-level
     *   configurations for Amazon S3 Storage Lens.
     */
    public fun bucketLevel(bucketLevel: IResolvable) {
        cdkBuilder.bucketLevel(bucketLevel)
    }

    /**
     * @param bucketLevel This property contains the details of the account-level bucket-level
     *   configurations for Amazon S3 Storage Lens.
     */
    public fun bucketLevel(bucketLevel: CfnStorageLens.BucketLevelProperty) {
        cdkBuilder.bucketLevel(bucketLevel)
    }

    /**
     * @param detailedStatusCodesMetrics This property contains the details of account-level
     *   detailed status code metrics for S3 Storage Lens.
     */
    public fun detailedStatusCodesMetrics(detailedStatusCodesMetrics: IResolvable) {
        cdkBuilder.detailedStatusCodesMetrics(detailedStatusCodesMetrics)
    }

    /**
     * @param detailedStatusCodesMetrics This property contains the details of account-level
     *   detailed status code metrics for S3 Storage Lens.
     */
    public fun detailedStatusCodesMetrics(
        detailedStatusCodesMetrics: CfnStorageLens.DetailedStatusCodesMetricsProperty
    ) {
        cdkBuilder.detailedStatusCodesMetrics(detailedStatusCodesMetrics)
    }

    /**
     * @param storageLensGroupLevel This property determines the scope of Storage Lens group data
     *   that is displayed in the Storage Lens dashboard.
     */
    public fun storageLensGroupLevel(storageLensGroupLevel: IResolvable) {
        cdkBuilder.storageLensGroupLevel(storageLensGroupLevel)
    }

    /**
     * @param storageLensGroupLevel This property determines the scope of Storage Lens group data
     *   that is displayed in the Storage Lens dashboard.
     */
    public fun storageLensGroupLevel(
        storageLensGroupLevel: CfnStorageLens.StorageLensGroupLevelProperty
    ) {
        cdkBuilder.storageLensGroupLevel(storageLensGroupLevel)
    }

    public fun build(): CfnStorageLens.AccountLevelProperty = cdkBuilder.build()
}
