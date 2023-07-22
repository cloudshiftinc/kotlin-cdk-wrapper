@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * A control from a date filter that is used to specify date and time.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FilterDateTimePickerControlProperty filterDateTimePickerControlProperty =
 * FilterDateTimePickerControlProperty.builder()
 * .filterControlId("filterControlId")
 * .sourceFilterId("sourceFilterId")
 * .title("title")
 * // the properties below are optional
 * .displayOptions(DateTimePickerControlDisplayOptionsProperty.builder()
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
 * .build())
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-filterdatetimepickercontrol.html)
 */
@CdkDslMarker
public class CfnAnalysisFilterDateTimePickerControlPropertyDsl {
  private val cdkBuilder: CfnAnalysis.FilterDateTimePickerControlProperty.Builder =
      CfnAnalysis.FilterDateTimePickerControlProperty.builder()

  /**
   * @param displayOptions The display options of a control.
   */
  public fun displayOptions(displayOptions: IResolvable) {
    cdkBuilder.displayOptions(displayOptions)
  }

  /**
   * @param displayOptions The display options of a control.
   */
  public
      fun displayOptions(displayOptions: CfnAnalysis.DateTimePickerControlDisplayOptionsProperty) {
    cdkBuilder.displayOptions(displayOptions)
  }

  /**
   * @param filterControlId The ID of the `FilterDateTimePickerControl` . 
   */
  public fun filterControlId(filterControlId: String) {
    cdkBuilder.filterControlId(filterControlId)
  }

  /**
   * @param sourceFilterId The source filter ID of the `FilterDateTimePickerControl` . 
   */
  public fun sourceFilterId(sourceFilterId: String) {
    cdkBuilder.sourceFilterId(sourceFilterId)
  }

  /**
   * @param title The title of the `FilterDateTimePickerControl` . 
   */
  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  /**
   * @param type The date time picker type of a `FilterDateTimePickerControl` . Choose one of the
   * following options:.
   * * `SINGLE_VALUED` : The filter condition is a fixed date.
   * * `DATE_RANGE` : The filter condition is a date time range.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnAnalysis.FilterDateTimePickerControlProperty = cdkBuilder.build()
}
