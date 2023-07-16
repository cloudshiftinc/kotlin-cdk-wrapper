@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens

@CdkDslMarker
public class CfnStorageLensBucketLevelPropertyDsl {
  private val cdkBuilder: CfnStorageLens.BucketLevelProperty.Builder =
      CfnStorageLens.BucketLevelProperty.builder()

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

  public fun detailedStatusCodesMetrics(detailedStatusCodesMetrics: IResolvable) {
    cdkBuilder.detailedStatusCodesMetrics(detailedStatusCodesMetrics)
  }

  public
      fun detailedStatusCodesMetrics(detailedStatusCodesMetrics: CfnStorageLens.DetailedStatusCodesMetricsProperty) {
    cdkBuilder.detailedStatusCodesMetrics(detailedStatusCodesMetrics)
  }

  public fun prefixLevel(prefixLevel: IResolvable) {
    cdkBuilder.prefixLevel(prefixLevel)
  }

  public fun prefixLevel(prefixLevel: CfnStorageLens.PrefixLevelProperty) {
    cdkBuilder.prefixLevel(prefixLevel)
  }

  public fun build(): CfnStorageLens.BucketLevelProperty = cdkBuilder.build()
}
