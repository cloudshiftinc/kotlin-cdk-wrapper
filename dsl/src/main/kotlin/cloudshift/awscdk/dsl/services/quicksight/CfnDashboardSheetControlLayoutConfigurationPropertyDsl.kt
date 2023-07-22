@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The configuration that determines the elements and canvas size options of sheet control.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SheetControlLayoutConfigurationProperty sheetControlLayoutConfigurationProperty =
 * SheetControlLayoutConfigurationProperty.builder()
 * .gridLayout(GridLayoutConfigurationProperty.builder()
 * .elements(List.of(GridLayoutElementProperty.builder()
 * .columnSpan(123)
 * .elementId("elementId")
 * .elementType("elementType")
 * .rowSpan(123)
 * // the properties below are optional
 * .columnIndex(123)
 * .rowIndex(123)
 * .build()))
 * // the properties below are optional
 * .canvasSizeOptions(GridLayoutCanvasSizeOptionsProperty.builder()
 * .screenCanvasSizeOptions(GridLayoutScreenCanvasSizeOptionsProperty.builder()
 * .resizeOption("resizeOption")
 * // the properties below are optional
 * .optimizedViewPortWidth("optimizedViewPortWidth")
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-sheetcontrollayoutconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardSheetControlLayoutConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.SheetControlLayoutConfigurationProperty.Builder =
      CfnDashboard.SheetControlLayoutConfigurationProperty.builder()

  /**
   * @param gridLayout The configuration that determines the elements and canvas size options of
   * sheet control.
   */
  public fun gridLayout(gridLayout: IResolvable) {
    cdkBuilder.gridLayout(gridLayout)
  }

  /**
   * @param gridLayout The configuration that determines the elements and canvas size options of
   * sheet control.
   */
  public fun gridLayout(gridLayout: CfnDashboard.GridLayoutConfigurationProperty) {
    cdkBuilder.gridLayout(gridLayout)
  }

  public fun build(): CfnDashboard.SheetControlLayoutConfigurationProperty = cdkBuilder.build()
}
