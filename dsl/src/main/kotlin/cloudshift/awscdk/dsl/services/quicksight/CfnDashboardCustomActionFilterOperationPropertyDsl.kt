@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The filter operation that filters data included in a visual or in an entire sheet.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CustomActionFilterOperationProperty customActionFilterOperationProperty =
 * CustomActionFilterOperationProperty.builder()
 * .selectedFieldsConfiguration(FilterOperationSelectedFieldsConfigurationProperty.builder()
 * .selectedColumns(List.of(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build()))
 * .selectedFieldOptions("selectedFieldOptions")
 * .selectedFields(List.of("selectedFields"))
 * .build())
 * .targetVisualsConfiguration(FilterOperationTargetVisualsConfigurationProperty.builder()
 * .sameSheetTargetVisualConfiguration(SameSheetTargetVisualConfigurationProperty.builder()
 * .targetVisualOptions("targetVisualOptions")
 * .targetVisuals(List.of("targetVisuals"))
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-customactionfilteroperation.html)
 */
@CdkDslMarker
public class CfnDashboardCustomActionFilterOperationPropertyDsl {
  private val cdkBuilder: CfnDashboard.CustomActionFilterOperationProperty.Builder =
      CfnDashboard.CustomActionFilterOperationProperty.builder()

  /**
   * @param selectedFieldsConfiguration The configuration that chooses the fields to be filtered. 
   */
  public fun selectedFieldsConfiguration(selectedFieldsConfiguration: IResolvable) {
    cdkBuilder.selectedFieldsConfiguration(selectedFieldsConfiguration)
  }

  /**
   * @param selectedFieldsConfiguration The configuration that chooses the fields to be filtered. 
   */
  public
      fun selectedFieldsConfiguration(selectedFieldsConfiguration: CfnDashboard.FilterOperationSelectedFieldsConfigurationProperty) {
    cdkBuilder.selectedFieldsConfiguration(selectedFieldsConfiguration)
  }

  /**
   * @param targetVisualsConfiguration The configuration that chooses the target visuals to be
   * filtered. 
   */
  public fun targetVisualsConfiguration(targetVisualsConfiguration: IResolvable) {
    cdkBuilder.targetVisualsConfiguration(targetVisualsConfiguration)
  }

  /**
   * @param targetVisualsConfiguration The configuration that chooses the target visuals to be
   * filtered. 
   */
  public
      fun targetVisualsConfiguration(targetVisualsConfiguration: CfnDashboard.FilterOperationTargetVisualsConfigurationProperty) {
    cdkBuilder.targetVisualsConfiguration(targetVisualsConfiguration)
  }

  public fun build(): CfnDashboard.CustomActionFilterOperationProperty = cdkBuilder.build()
}
