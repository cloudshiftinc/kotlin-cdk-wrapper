@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateSelectedSheetsFilterScopeConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.SelectedSheetsFilterScopeConfigurationProperty.Builder =
      CfnTemplate.SelectedSheetsFilterScopeConfigurationProperty.builder()

  private val _sheetVisualScopingConfigurations: MutableList<Any> = mutableListOf()

  /**
   * @param sheetVisualScopingConfigurations The sheet ID and visual IDs of the sheet and visuals
   * that the filter is applied to.
   */
  public fun sheetVisualScopingConfigurations(vararg sheetVisualScopingConfigurations: Any) {
    _sheetVisualScopingConfigurations.addAll(listOf(*sheetVisualScopingConfigurations))
  }

  /**
   * @param sheetVisualScopingConfigurations The sheet ID and visual IDs of the sheet and visuals
   * that the filter is applied to.
   */
  public fun sheetVisualScopingConfigurations(sheetVisualScopingConfigurations: Collection<Any>) {
    _sheetVisualScopingConfigurations.addAll(sheetVisualScopingConfigurations)
  }

  /**
   * @param sheetVisualScopingConfigurations The sheet ID and visual IDs of the sheet and visuals
   * that the filter is applied to.
   */
  public fun sheetVisualScopingConfigurations(sheetVisualScopingConfigurations: IResolvable) {
    cdkBuilder.sheetVisualScopingConfigurations(sheetVisualScopingConfigurations)
  }

  public fun build(): CfnTemplate.SelectedSheetsFilterScopeConfigurationProperty {
    if(_sheetVisualScopingConfigurations.isNotEmpty())
        cdkBuilder.sheetVisualScopingConfigurations(_sheetVisualScopingConfigurations)
    return cdkBuilder.build()
  }
}
