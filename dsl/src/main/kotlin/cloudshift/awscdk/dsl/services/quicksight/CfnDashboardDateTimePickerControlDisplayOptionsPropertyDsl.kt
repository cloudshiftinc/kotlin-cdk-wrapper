@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The display options of a control.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DateTimePickerControlDisplayOptionsProperty dateTimePickerControlDisplayOptionsProperty =
 * DateTimePickerControlDisplayOptionsProperty.builder()
 * .dateTimeFormat("dateTimeFormat")
 * .titleOptions(LabelOptionsProperty.builder()
 * .customLabel("customLabel")
 * .fontConfiguration(FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * .visibility("visibility")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-datetimepickercontroldisplayoptions.html)
 */
@CdkDslMarker
public class CfnDashboardDateTimePickerControlDisplayOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.DateTimePickerControlDisplayOptionsProperty.Builder =
      CfnDashboard.DateTimePickerControlDisplayOptionsProperty.builder()

  /**
   * @param dateTimeFormat Customize how dates are formatted in controls.
   */
  public fun dateTimeFormat(dateTimeFormat: String) {
    cdkBuilder.dateTimeFormat(dateTimeFormat)
  }

  /**
   * @param titleOptions The options to configure the title visibility, name, and font size.
   */
  public fun titleOptions(titleOptions: IResolvable) {
    cdkBuilder.titleOptions(titleOptions)
  }

  /**
   * @param titleOptions The options to configure the title visibility, name, and font size.
   */
  public fun titleOptions(titleOptions: CfnDashboard.LabelOptionsProperty) {
    cdkBuilder.titleOptions(titleOptions)
  }

  public fun build(): CfnDashboard.DateTimePickerControlDisplayOptionsProperty = cdkBuilder.build()
}
