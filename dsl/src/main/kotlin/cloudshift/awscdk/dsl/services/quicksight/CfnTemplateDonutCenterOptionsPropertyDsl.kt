@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The label options of the label that is displayed in the center of a donut chart.
 *
 * This option isn't available for pie charts.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DonutCenterOptionsProperty donutCenterOptionsProperty = DonutCenterOptionsProperty.builder()
 * .labelVisibility("labelVisibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-donutcenteroptions.html)
 */
@CdkDslMarker
public class CfnTemplateDonutCenterOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.DonutCenterOptionsProperty.Builder =
      CfnTemplate.DonutCenterOptionsProperty.builder()

  /**
   * @param labelVisibility Determines the visibility of the label in a donut chart.
   * In the Amazon QuickSight console, this option is called `'Show total'` .
   */
  public fun labelVisibility(labelVisibility: String) {
    cdkBuilder.labelVisibility(labelVisibility)
  }

  public fun build(): CfnTemplate.DonutCenterOptionsProperty = cdkBuilder.build()
}
