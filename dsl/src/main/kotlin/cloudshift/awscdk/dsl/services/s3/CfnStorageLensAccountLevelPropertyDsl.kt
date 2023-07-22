@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens

@CdkDslMarker
public class CfnStorageLensAccountLevelPropertyDsl {
  private val cdkBuilder: CfnStorageLens.AccountLevelProperty.Builder =
      CfnStorageLens.AccountLevelProperty.builder()

  /**
   * @param activityMetrics This property contains the details of account-level activity metrics for
   * S3 Storage Lens.
   */
  public fun activityMetrics(activityMetrics: IResolvable) {
    cdkBuilder.activityMetrics(activityMetrics)
  }

  /**
   * @param activityMetrics This property contains the details of account-level activity metrics for
   * S3 Storage Lens.
   */
  public fun activityMetrics(activityMetrics: CfnStorageLens.ActivityMetricsProperty) {
    cdkBuilder.activityMetrics(activityMetrics)
  }

  /**
   * @param advancedCostOptimizationMetrics This property contains the details of account-level
   * advanced cost optimization metrics for S3 Storage Lens.
   */
  public fun advancedCostOptimizationMetrics(advancedCostOptimizationMetrics: IResolvable) {
    cdkBuilder.advancedCostOptimizationMetrics(advancedCostOptimizationMetrics)
  }

  /**
   * @param advancedCostOptimizationMetrics This property contains the details of account-level
   * advanced cost optimization metrics for S3 Storage Lens.
   */
  public
      fun advancedCostOptimizationMetrics(advancedCostOptimizationMetrics: CfnStorageLens.AdvancedCostOptimizationMetricsProperty) {
    cdkBuilder.advancedCostOptimizationMetrics(advancedCostOptimizationMetrics)
  }

  /**
   * @param advancedDataProtectionMetrics This property contains the details of account-level
   * advanced data protection metrics for S3 Storage Lens.
   */
  public fun advancedDataProtectionMetrics(advancedDataProtectionMetrics: IResolvable) {
    cdkBuilder.advancedDataProtectionMetrics(advancedDataProtectionMetrics)
  }

  /**
   * @param advancedDataProtectionMetrics This property contains the details of account-level
   * advanced data protection metrics for S3 Storage Lens.
   */
  public
      fun advancedDataProtectionMetrics(advancedDataProtectionMetrics: CfnStorageLens.AdvancedDataProtectionMetricsProperty) {
    cdkBuilder.advancedDataProtectionMetrics(advancedDataProtectionMetrics)
  }

  /**
   * @param bucketLevel This property contains the details of the account-level bucket-level
   * configurations for Amazon S3 Storage Lens. 
   */
  public fun bucketLevel(bucketLevel: IResolvable) {
    cdkBuilder.bucketLevel(bucketLevel)
  }

  /**
   * @param bucketLevel This property contains the details of the account-level bucket-level
   * configurations for Amazon S3 Storage Lens. 
   */
  public fun bucketLevel(bucketLevel: CfnStorageLens.BucketLevelProperty) {
    cdkBuilder.bucketLevel(bucketLevel)
  }

  /**
   * @param detailedStatusCodesMetrics This property contains the details of account-level detailed
   * status code metrics for S3 Storage Lens.
   */
  public fun detailedStatusCodesMetrics(detailedStatusCodesMetrics: IResolvable) {
    cdkBuilder.detailedStatusCodesMetrics(detailedStatusCodesMetrics)
  }

  /**
   * @param detailedStatusCodesMetrics This property contains the details of account-level detailed
   * status code metrics for S3 Storage Lens.
   */
  public
      fun detailedStatusCodesMetrics(detailedStatusCodesMetrics: CfnStorageLens.DetailedStatusCodesMetricsProperty) {
    cdkBuilder.detailedStatusCodesMetrics(detailedStatusCodesMetrics)
  }

  public fun build(): CfnStorageLens.AccountLevelProperty = cdkBuilder.build()
}
