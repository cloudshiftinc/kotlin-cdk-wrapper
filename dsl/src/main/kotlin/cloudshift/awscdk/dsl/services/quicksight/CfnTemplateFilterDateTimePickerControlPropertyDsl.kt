@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFilterDateTimePickerControlPropertyDsl {
  private val cdkBuilder: CfnTemplate.FilterDateTimePickerControlProperty.Builder =
      CfnTemplate.FilterDateTimePickerControlProperty.builder()

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
      fun displayOptions(displayOptions: CfnTemplate.DateTimePickerControlDisplayOptionsProperty) {
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

  public fun build(): CfnTemplate.FilterDateTimePickerControlProperty = cdkBuilder.build()
}
