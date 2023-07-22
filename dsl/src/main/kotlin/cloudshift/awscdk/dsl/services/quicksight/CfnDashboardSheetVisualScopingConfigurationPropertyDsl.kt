@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardSheetVisualScopingConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.SheetVisualScopingConfigurationProperty.Builder =
      CfnDashboard.SheetVisualScopingConfigurationProperty.builder()

  private val _visualIds: MutableList<String> = mutableListOf()

  /**
   * @param scope The scope of the applied entities. Choose one of the following options:. 
   * * `ALL_VISUALS`
   * * `SELECTED_VISUALS`
   */
  public fun scope(scope: String) {
    cdkBuilder.scope(scope)
  }

  /**
   * @param sheetId The selected sheet that the filter is applied to. 
   */
  public fun sheetId(sheetId: String) {
    cdkBuilder.sheetId(sheetId)
  }

  /**
   * @param visualIds The selected visuals that the filter is applied to.
   */
  public fun visualIds(vararg visualIds: String) {
    _visualIds.addAll(listOf(*visualIds))
  }

  /**
   * @param visualIds The selected visuals that the filter is applied to.
   */
  public fun visualIds(visualIds: Collection<String>) {
    _visualIds.addAll(visualIds)
  }

  public fun build(): CfnDashboard.SheetVisualScopingConfigurationProperty {
    if(_visualIds.isNotEmpty()) cdkBuilder.visualIds(_visualIds)
    return cdkBuilder.build()
  }
}
