@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnCampaign

/**
 * Specifies metric-based criteria for including or excluding endpoints from a segment.
 *
 * These criteria derive from custom metrics that you define for endpoints.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * MetricDimensionProperty metricDimensionProperty = MetricDimensionProperty.builder()
 * .comparisonOperator("comparisonOperator")
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-metricdimension.html)
 */
@CdkDslMarker
public class CfnCampaignMetricDimensionPropertyDsl {
  private val cdkBuilder: CfnCampaign.MetricDimensionProperty.Builder =
      CfnCampaign.MetricDimensionProperty.builder()

  /**
   * @param comparisonOperator The operator to use when comparing metric values.
   * Valid values are: `GREATER_THAN` , `LESS_THAN` , `GREATER_THAN_OR_EQUAL` , `LESS_THAN_OR_EQUAL`
   * , and `EQUAL` .
   */
  public fun comparisonOperator(comparisonOperator: String) {
    cdkBuilder.comparisonOperator(comparisonOperator)
  }

  /**
   * @param value The value to compare.
   */
  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnCampaign.MetricDimensionProperty = cdkBuilder.build()
}
