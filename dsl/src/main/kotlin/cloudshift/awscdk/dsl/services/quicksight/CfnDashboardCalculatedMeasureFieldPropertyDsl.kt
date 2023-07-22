@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The table calculation measure field for pivot tables.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CalculatedMeasureFieldProperty calculatedMeasureFieldProperty =
 * CalculatedMeasureFieldProperty.builder()
 * .expression("expression")
 * .fieldId("fieldId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-calculatedmeasurefield.html)
 */
@CdkDslMarker
public class CfnDashboardCalculatedMeasureFieldPropertyDsl {
  private val cdkBuilder: CfnDashboard.CalculatedMeasureFieldProperty.Builder =
      CfnDashboard.CalculatedMeasureFieldProperty.builder()

  /**
   * @param expression The expression in the table calculation. 
   */
  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  /**
   * @param fieldId The custom field ID. 
   */
  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun build(): CfnDashboard.CalculatedMeasureFieldProperty = cdkBuilder.build()
}
