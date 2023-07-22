@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.inspectorv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.inspectorv2.CfnFilter

@CdkDslMarker
public class CfnFilterMapFilterPropertyDsl {
  private val cdkBuilder: CfnFilter.MapFilterProperty.Builder =
      CfnFilter.MapFilterProperty.builder()

  /**
   * @param comparison The operator to use when comparing values in the filter. 
   */
  public fun comparison(comparison: String) {
    cdkBuilder.comparison(comparison)
  }

  /**
   * @param key The tag key used in the filter.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The tag value used in the filter.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnFilter.MapFilterProperty = cdkBuilder.build()
}
