@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens

@CdkDslMarker
public class CfnStorageLensAdvancedDataProtectionMetricsPropertyDsl {
  private val cdkBuilder: CfnStorageLens.AdvancedDataProtectionMetricsProperty.Builder =
      CfnStorageLens.AdvancedDataProtectionMetricsProperty.builder()

  /**
   * @param isEnabled Indicates whether advanced data protection metrics are enabled.
   */
  public fun isEnabled(isEnabled: Boolean) {
    cdkBuilder.isEnabled(isEnabled)
  }

  /**
   * @param isEnabled Indicates whether advanced data protection metrics are enabled.
   */
  public fun isEnabled(isEnabled: IResolvable) {
    cdkBuilder.isEnabled(isEnabled)
  }

  public fun build(): CfnStorageLens.AdvancedDataProtectionMetricsProperty = cdkBuilder.build()
}
