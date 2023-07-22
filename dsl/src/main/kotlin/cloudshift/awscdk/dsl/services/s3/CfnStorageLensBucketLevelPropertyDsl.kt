@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens

@CdkDslMarker
public class CfnStorageLensBucketLevelPropertyDsl {
  private val cdkBuilder: CfnStorageLens.BucketLevelProperty.Builder =
      CfnStorageLens.BucketLevelProperty.builder()

  /**
   * @param activityMetrics A property for bucket-level activity metrics for S3 Storage Lens.
   */
  public fun activityMetrics(activityMetrics: IResolvable) {
    cdkBuilder.activityMetrics(activityMetrics)
  }

  /**
   * @param activityMetrics A property for bucket-level activity metrics for S3 Storage Lens.
   */
  public fun activityMetrics(activityMetrics: CfnStorageLens.ActivityMetricsProperty) {
    cdkBuilder.activityMetrics(activityMetrics)
  }

  /**
   * @param advancedCostOptimizationMetrics A property for bucket-level advanced cost optimization
   * metrics for S3 Storage Lens.
   */
  public fun advancedCostOptimizationMetrics(advancedCostOptimizationMetrics: IResolvable) {
    cdkBuilder.advancedCostOptimizationMetrics(advancedCostOptimizationMetrics)
  }

  /**
   * @param advancedCostOptimizationMetrics A property for bucket-level advanced cost optimization
   * metrics for S3 Storage Lens.
   */
  public
      fun advancedCostOptimizationMetrics(advancedCostOptimizationMetrics: CfnStorageLens.AdvancedCostOptimizationMetricsProperty) {
    cdkBuilder.advancedCostOptimizationMetrics(advancedCostOptimizationMetrics)
  }

  /**
   * @param advancedDataProtectionMetrics A property for bucket-level advanced data protection
   * metrics for S3 Storage Lens.
   */
  public fun advancedDataProtectionMetrics(advancedDataProtectionMetrics: IResolvable) {
    cdkBuilder.advancedDataProtectionMetrics(advancedDataProtectionMetrics)
  }

  /**
   * @param advancedDataProtectionMetrics A property for bucket-level advanced data protection
   * metrics for S3 Storage Lens.
   */
  public
      fun advancedDataProtectionMetrics(advancedDataProtectionMetrics: CfnStorageLens.AdvancedDataProtectionMetricsProperty) {
    cdkBuilder.advancedDataProtectionMetrics(advancedDataProtectionMetrics)
  }

  /**
   * @param detailedStatusCodesMetrics A property for bucket-level detailed status code metrics for
   * S3 Storage Lens.
   */
  public fun detailedStatusCodesMetrics(detailedStatusCodesMetrics: IResolvable) {
    cdkBuilder.detailedStatusCodesMetrics(detailedStatusCodesMetrics)
  }

  /**
   * @param detailedStatusCodesMetrics A property for bucket-level detailed status code metrics for
   * S3 Storage Lens.
   */
  public
      fun detailedStatusCodesMetrics(detailedStatusCodesMetrics: CfnStorageLens.DetailedStatusCodesMetricsProperty) {
    cdkBuilder.detailedStatusCodesMetrics(detailedStatusCodesMetrics)
  }

  /**
   * @param prefixLevel A property for bucket-level prefix-level storage metrics for S3 Storage
   * Lens.
   */
  public fun prefixLevel(prefixLevel: IResolvable) {
    cdkBuilder.prefixLevel(prefixLevel)
  }

  /**
   * @param prefixLevel A property for bucket-level prefix-level storage metrics for S3 Storage
   * Lens.
   */
  public fun prefixLevel(prefixLevel: CfnStorageLens.PrefixLevelProperty) {
    cdkBuilder.prefixLevel(prefixLevel)
  }

  public fun build(): CfnStorageLens.BucketLevelProperty = cdkBuilder.build()
}
