@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The color map that determines the color options for a particular element.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DataPathColorProperty dataPathColorProperty = DataPathColorProperty.builder()
 * .color("color")
 * .element(DataPathValueProperty.builder()
 * .fieldId("fieldId")
 * .fieldValue("fieldValue")
 * .build())
 * // the properties below are optional
 * .timeGranularity("timeGranularity")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-datapathcolor.html)
 */
@CdkDslMarker
public class CfnDashboardDataPathColorPropertyDsl {
  private val cdkBuilder: CfnDashboard.DataPathColorProperty.Builder =
      CfnDashboard.DataPathColorProperty.builder()

  /**
   * @param color The color that needs to be applied to the element. 
   */
  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  /**
   * @param element The element that the color needs to be applied to. 
   */
  public fun element(element: IResolvable) {
    cdkBuilder.element(element)
  }

  /**
   * @param element The element that the color needs to be applied to. 
   */
  public fun element(element: CfnDashboard.DataPathValueProperty) {
    cdkBuilder.element(element)
  }

  /**
   * @param timeGranularity The time granularity of the field that the color needs to be applied to.
   */
  public fun timeGranularity(timeGranularity: String) {
    cdkBuilder.timeGranularity(timeGranularity)
  }

  public fun build(): CfnDashboard.DataPathColorProperty = cdkBuilder.build()
}
