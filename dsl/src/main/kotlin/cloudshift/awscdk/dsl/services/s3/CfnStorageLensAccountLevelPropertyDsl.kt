@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens

@CdkDslMarker
public class CfnStorageLensAccountLevelPropertyDsl {
  private val cdkBuilder: CfnStorageLens.AccountLevelProperty.Builder =
      CfnStorageLens.AccountLevelProperty.builder()

  public fun activityMetrics(activityMetrics: IResolvable) {
    cdkBuilder.activityMetrics(activityMetrics)
  }

  public fun activityMetrics(activityMetrics: CfnStorageLens.ActivityMetricsProperty) {
    cdkBuilder.activityMetrics(activityMetrics)
  }

  public fun advancedCostOptimizationMetrics(advancedCostOptimizationMetrics: IResolvable) {
    cdkBuilder.advancedCostOptimizationMetrics(advancedCostOptimizationMetrics)
  }

  public
      fun advancedCostOptimizationMetrics(advancedCostOptimizationMetrics: CfnStorageLens.AdvancedCostOptimizationMetricsProperty) {
    cdkBuilder.advancedCostOptimizationMetrics(advancedCostOptimizationMetrics)
  }

  public fun advancedDataProtectionMetrics(advancedDataProtectionMetrics: IResolvable) {
    cdkBuilder.advancedDataProtectionMetrics(advancedDataProtectionMetrics)
  }

  public
      fun advancedDataProtectionMetrics(advancedDataProtectionMetrics: CfnStorageLens.AdvancedDataProtectionMetricsProperty) {
    cdkBuilder.advancedDataProtectionMetrics(advancedDataProtectionMetrics)
  }

  public fun bucketLevel(bucketLevel: IResolvable) {
    cdkBuilder.bucketLevel(bucketLevel)
  }

  public fun bucketLevel(bucketLevel: CfnStorageLens.BucketLevelProperty) {
    cdkBuilder.bucketLevel(bucketLevel)
  }

  public fun detailedStatusCodesMetrics(detailedStatusCodesMetrics: IResolvable) {
    cdkBuilder.detailedStatusCodesMetrics(detailedStatusCodesMetrics)
  }

  public
      fun detailedStatusCodesMetrics(detailedStatusCodesMetrics: CfnStorageLens.DetailedStatusCodesMetricsProperty) {
    cdkBuilder.detailedStatusCodesMetrics(detailedStatusCodesMetrics)
  }

  public fun build(): CfnStorageLens.AccountLevelProperty = cdkBuilder.build()
}
