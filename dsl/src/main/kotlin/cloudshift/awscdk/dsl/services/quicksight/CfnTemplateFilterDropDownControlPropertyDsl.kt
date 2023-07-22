@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFilterDropDownControlPropertyDsl {
  private val cdkBuilder: CfnTemplate.FilterDropDownControlProperty.Builder =
      CfnTemplate.FilterDropDownControlProperty.builder()

  /**
   * @param cascadingControlConfiguration The values that are displayed in a control can be
   * configured to only show values that are valid based on what's selected in other controls.
   */
  public fun cascadingControlConfiguration(cascadingControlConfiguration: IResolvable) {
    cdkBuilder.cascadingControlConfiguration(cascadingControlConfiguration)
  }

  /**
   * @param cascadingControlConfiguration The values that are displayed in a control can be
   * configured to only show values that are valid based on what's selected in other controls.
   */
  public
      fun cascadingControlConfiguration(cascadingControlConfiguration: CfnTemplate.CascadingControlConfigurationProperty) {
    cdkBuilder.cascadingControlConfiguration(cascadingControlConfiguration)
  }

  /**
   * @param displayOptions The display options of the `FilterDropDownControl` .
   */
  public fun displayOptions(displayOptions: IResolvable) {
    cdkBuilder.displayOptions(displayOptions)
  }

  /**
   * @param displayOptions The display options of the `FilterDropDownControl` .
   */
  public fun displayOptions(displayOptions: CfnTemplate.DropDownControlDisplayOptionsProperty) {
    cdkBuilder.displayOptions(displayOptions)
  }

  /**
   * @param filterControlId The ID of the `FilterDropDownControl` . 
   */
  public fun filterControlId(filterControlId: String) {
    cdkBuilder.filterControlId(filterControlId)
  }

  /**
   * @param selectableValues A list of selectable values that are used in a control.
   */
  public fun selectableValues(selectableValues: IResolvable) {
    cdkBuilder.selectableValues(selectableValues)
  }

  /**
   * @param selectableValues A list of selectable values that are used in a control.
   */
  public fun selectableValues(selectableValues: CfnTemplate.FilterSelectableValuesProperty) {
    cdkBuilder.selectableValues(selectableValues)
  }

  /**
   * @param sourceFilterId The source filter ID of the `FilterDropDownControl` . 
   */
  public fun sourceFilterId(sourceFilterId: String) {
    cdkBuilder.sourceFilterId(sourceFilterId)
  }

  /**
   * @param title The title of the `FilterDropDownControl` . 
   */
  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  /**
   * @param type The type of the `FilterDropDownControl` . Choose one of the following options:.
   * * `MULTI_SELECT` : The user can select multiple entries from a dropdown menu.
   * * `SINGLE_SELECT` : The user can select a single entry from a dropdown menu.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnTemplate.FilterDropDownControlProperty = cdkBuilder.build()
}
