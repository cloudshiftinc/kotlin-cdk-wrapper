@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The minimum and maximum setup for an axis display range.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * AxisDisplayMinMaxRangeProperty axisDisplayMinMaxRangeProperty =
 * AxisDisplayMinMaxRangeProperty.builder()
 * .maximum(123)
 * .minimum(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-axisdisplayminmaxrange.html)
 */
@CdkDslMarker
public class CfnAnalysisAxisDisplayMinMaxRangePropertyDsl {
  private val cdkBuilder: CfnAnalysis.AxisDisplayMinMaxRangeProperty.Builder =
      CfnAnalysis.AxisDisplayMinMaxRangeProperty.builder()

  /**
   * @param maximum The maximum setup for an axis display range.
   */
  public fun maximum(maximum: Number) {
    cdkBuilder.maximum(maximum)
  }

  /**
   * @param minimum The minimum setup for an axis display range.
   */
  public fun minimum(minimum: Number) {
    cdkBuilder.minimum(minimum)
  }

  public fun build(): CfnAnalysis.AxisDisplayMinMaxRangeProperty = cdkBuilder.build()
}
