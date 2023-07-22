@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnSecurityProfile

/**
 * The dimension of the metric.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * MetricDimensionProperty metricDimensionProperty = MetricDimensionProperty.builder()
 * .dimensionName("dimensionName")
 * // the properties below are optional
 * .operator("operator")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metricdimension.html)
 */
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
