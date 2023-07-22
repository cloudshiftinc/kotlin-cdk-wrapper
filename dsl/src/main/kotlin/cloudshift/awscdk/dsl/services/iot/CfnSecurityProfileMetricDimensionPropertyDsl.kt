@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnSecurityProfile

@CdkDslMarker
public class CfnSecurityProfileMetricDimensionPropertyDsl {
  private val cdkBuilder: CfnSecurityProfile.MetricDimensionProperty.Builder =
      CfnSecurityProfile.MetricDimensionProperty.builder()

  /**
   * @param dimensionName The name of the dimension. 
   */
  public fun dimensionName(dimensionName: String) {
    cdkBuilder.dimensionName(dimensionName)
  }

  /**
   * @param operator Operators are constructs that perform logical operations.
   * Valid values are `IN` and `NOT_IN` .
   */
  public fun `operator`(`operator`: String) {
    cdkBuilder.`operator`(`operator`)
  }

  public fun build(): CfnSecurityProfile.MetricDimensionProperty = cdkBuilder.build()
}
