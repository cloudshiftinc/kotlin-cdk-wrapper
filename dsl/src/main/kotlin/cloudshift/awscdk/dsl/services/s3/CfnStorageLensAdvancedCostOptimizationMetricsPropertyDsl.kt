@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens

@CdkDslMarker
public class CfnStorageLensAdvancedCostOptimizationMetricsPropertyDsl {
  private val cdkBuilder: CfnStorageLens.AdvancedCostOptimizationMetricsProperty.Builder =
      CfnStorageLens.AdvancedCostOptimizationMetricsProperty.builder()

  /**
   * @param isEnabled Indicates whether advanced cost optimization metrics are enabled.
   */
  public fun isEnabled(isEnabled: Boolean) {
    cdkBuilder.isEnabled(isEnabled)
  }

  /**
   * @param isEnabled Indicates whether advanced cost optimization metrics are enabled.
   */
  public fun isEnabled(isEnabled: IResolvable) {
    cdkBuilder.isEnabled(isEnabled)
  }

  public fun build(): CfnStorageLens.AdvancedCostOptimizationMetricsProperty = cdkBuilder.build()
}
