@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDashboardPublishOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.DashboardPublishOptionsProperty.Builder =
      CfnDashboard.DashboardPublishOptionsProperty.builder()

  public fun adHocFilteringOption(adHocFilteringOption: IResolvable) {
    cdkBuilder.adHocFilteringOption(adHocFilteringOption)
  }

  public fun adHocFilteringOption(adHocFilteringOption: CfnDashboard.AdHocFilteringOptionProperty) {
    cdkBuilder.adHocFilteringOption(adHocFilteringOption)
  }

  public fun dataPointDrillUpDownOption(dataPointDrillUpDownOption: IResolvable) {
    cdkBuilder.dataPointDrillUpDownOption(dataPointDrillUpDownOption)
  }

  public
      fun dataPointDrillUpDownOption(dataPointDrillUpDownOption: CfnDashboard.DataPointDrillUpDownOptionProperty) {
    cdkBuilder.dataPointDrillUpDownOption(dataPointDrillUpDownOption)
  }

  public fun dataPointMenuLabelOption(dataPointMenuLabelOption: IResolvable) {
    cdkBuilder.dataPointMenuLabelOption(dataPointMenuLabelOption)
  }

  public
      fun dataPointMenuLabelOption(dataPointMenuLabelOption: CfnDashboard.DataPointMenuLabelOptionProperty) {
    cdkBuilder.dataPointMenuLabelOption(dataPointMenuLabelOption)
  }

  public fun dataPointTooltipOption(dataPointTooltipOption: IResolvable) {
    cdkBuilder.dataPointTooltipOption(dataPointTooltipOption)
  }

  public
      fun dataPointTooltipOption(dataPointTooltipOption: CfnDashboard.DataPointTooltipOptionProperty) {
    cdkBuilder.dataPointTooltipOption(dataPointTooltipOption)
  }

  public fun exportToCsvOption(exportToCsvOption: IResolvable) {
    cdkBuilder.exportToCsvOption(exportToCsvOption)
  }

  public fun exportToCsvOption(exportToCsvOption: CfnDashboard.ExportToCSVOptionProperty) {
    cdkBuilder.exportToCsvOption(exportToCsvOption)
  }

  public fun exportWithHiddenFieldsOption(exportWithHiddenFieldsOption: IResolvable) {
    cdkBuilder.exportWithHiddenFieldsOption(exportWithHiddenFieldsOption)
  }

  public
      fun exportWithHiddenFieldsOption(exportWithHiddenFieldsOption: CfnDashboard.ExportWithHiddenFieldsOptionProperty) {
    cdkBuilder.exportWithHiddenFieldsOption(exportWithHiddenFieldsOption)
  }

  public fun sheetControlsOption(sheetControlsOption: IResolvable) {
    cdkBuilder.sheetControlsOption(sheetControlsOption)
  }

  public fun sheetControlsOption(sheetControlsOption: CfnDashboard.SheetControlsOptionProperty) {
    cdkBuilder.sheetControlsOption(sheetControlsOption)
  }

  public
      fun sheetLayoutElementMaximizationOption(sheetLayoutElementMaximizationOption: IResolvable) {
    cdkBuilder.sheetLayoutElementMaximizationOption(sheetLayoutElementMaximizationOption)
  }

  public
      fun sheetLayoutElementMaximizationOption(sheetLayoutElementMaximizationOption: CfnDashboard.SheetLayoutElementMaximizationOptionProperty) {
    cdkBuilder.sheetLayoutElementMaximizationOption(sheetLayoutElementMaximizationOption)
  }

  public fun visualAxisSortOption(visualAxisSortOption: IResolvable) {
    cdkBuilder.visualAxisSortOption(visualAxisSortOption)
  }

  public fun visualAxisSortOption(visualAxisSortOption: CfnDashboard.VisualAxisSortOptionProperty) {
    cdkBuilder.visualAxisSortOption(visualAxisSortOption)
  }

  public fun visualMenuOption(visualMenuOption: IResolvable) {
    cdkBuilder.visualMenuOption(visualMenuOption)
  }

  public fun visualMenuOption(visualMenuOption: CfnDashboard.VisualMenuOptionProperty) {
    cdkBuilder.visualMenuOption(visualMenuOption)
  }

  public fun visualPublishOptions(visualPublishOptions: IResolvable) {
    cdkBuilder.visualPublishOptions(visualPublishOptions)
  }

  public
      fun visualPublishOptions(visualPublishOptions: CfnDashboard.DashboardVisualPublishOptionsProperty) {
    cdkBuilder.visualPublishOptions(visualPublishOptions)
  }

  public fun build(): CfnDashboard.DashboardPublishOptionsProperty = cdkBuilder.build()
}
