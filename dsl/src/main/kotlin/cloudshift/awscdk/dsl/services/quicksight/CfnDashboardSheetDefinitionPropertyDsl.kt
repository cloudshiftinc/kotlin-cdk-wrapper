@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * A sheet is an object that contains a set of visuals that are viewed together on one page in a
 * paginated report.
 *
 * Every analysis and dashboard must contain at least one sheet.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-sheetdefinition.html)
 */
@CdkDslMarker
public class CfnDashboardSheetDefinitionPropertyDsl {
  private val cdkBuilder: CfnDashboard.SheetDefinitionProperty.Builder =
      CfnDashboard.SheetDefinitionProperty.builder()

  private val _filterControls: MutableList<Any> = mutableListOf()

  private val _layouts: MutableList<Any> = mutableListOf()

  private val _parameterControls: MutableList<Any> = mutableListOf()

  private val _sheetControlLayouts: MutableList<Any> = mutableListOf()

  private val _textBoxes: MutableList<Any> = mutableListOf()

  private val _visuals: MutableList<Any> = mutableListOf()

  /**
   * @param contentType The layout content type of the sheet. Choose one of the following options:.
   * * `PAGINATED` : Creates a sheet for a paginated report.
   * * `INTERACTIVE` : Creates a sheet for an interactive dashboard.
   */
  public fun contentType(contentType: String) {
    cdkBuilder.contentType(contentType)
  }

  /**
   * @param description A description of the sheet.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param filterControls The list of filter controls that are on a sheet.
   * For more information, see [Adding filter controls to analysis
   * sheets](https://docs.aws.amazon.com/quicksight/latest/user/filter-controls.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun filterControls(vararg filterControls: Any) {
    _filterControls.addAll(listOf(*filterControls))
  }

  /**
   * @param filterControls The list of filter controls that are on a sheet.
   * For more information, see [Adding filter controls to analysis
   * sheets](https://docs.aws.amazon.com/quicksight/latest/user/filter-controls.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun filterControls(filterControls: Collection<Any>) {
    _filterControls.addAll(filterControls)
  }

  /**
   * @param filterControls The list of filter controls that are on a sheet.
   * For more information, see [Adding filter controls to analysis
   * sheets](https://docs.aws.amazon.com/quicksight/latest/user/filter-controls.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun filterControls(filterControls: IResolvable) {
    cdkBuilder.filterControls(filterControls)
  }

  /**
   * @param layouts Layouts define how the components of a sheet are arranged.
   * For more information, see [Types of
   * layout](https://docs.aws.amazon.com/quicksight/latest/user/types-of-layout.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun layouts(vararg layouts: Any) {
    _layouts.addAll(listOf(*layouts))
  }

  /**
   * @param layouts Layouts define how the components of a sheet are arranged.
   * For more information, see [Types of
   * layout](https://docs.aws.amazon.com/quicksight/latest/user/types-of-layout.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun layouts(layouts: Collection<Any>) {
    _layouts.addAll(layouts)
  }

  /**
   * @param layouts Layouts define how the components of a sheet are arranged.
   * For more information, see [Types of
   * layout](https://docs.aws.amazon.com/quicksight/latest/user/types-of-layout.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun layouts(layouts: IResolvable) {
    cdkBuilder.layouts(layouts)
  }

  /**
   * @param name The name of the sheet.
   * This name is displayed on the sheet's tab in the Amazon QuickSight console.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param parameterControls The list of parameter controls that are on a sheet.
   * For more information, see [Using a Control with a Parameter in Amazon
   * QuickSight](https://docs.aws.amazon.com/quicksight/latest/user/parameters-controls.html) in the
   * *Amazon QuickSight User Guide* .
   */
  public fun parameterControls(vararg parameterControls: Any) {
    _parameterControls.addAll(listOf(*parameterControls))
  }

  /**
   * @param parameterControls The list of parameter controls that are on a sheet.
   * For more information, see [Using a Control with a Parameter in Amazon
   * QuickSight](https://docs.aws.amazon.com/quicksight/latest/user/parameters-controls.html) in the
   * *Amazon QuickSight User Guide* .
   */
  public fun parameterControls(parameterControls: Collection<Any>) {
    _parameterControls.addAll(parameterControls)
  }

  /**
   * @param parameterControls The list of parameter controls that are on a sheet.
   * For more information, see [Using a Control with a Parameter in Amazon
   * QuickSight](https://docs.aws.amazon.com/quicksight/latest/user/parameters-controls.html) in the
   * *Amazon QuickSight User Guide* .
   */
  public fun parameterControls(parameterControls: IResolvable) {
    cdkBuilder.parameterControls(parameterControls)
  }

  /**
   * @param sheetControlLayouts The control layouts of the sheet.
   */
  public fun sheetControlLayouts(vararg sheetControlLayouts: Any) {
    _sheetControlLayouts.addAll(listOf(*sheetControlLayouts))
  }

  /**
   * @param sheetControlLayouts The control layouts of the sheet.
   */
  public fun sheetControlLayouts(sheetControlLayouts: Collection<Any>) {
    _sheetControlLayouts.addAll(sheetControlLayouts)
  }

  /**
   * @param sheetControlLayouts The control layouts of the sheet.
   */
  public fun sheetControlLayouts(sheetControlLayouts: IResolvable) {
    cdkBuilder.sheetControlLayouts(sheetControlLayouts)
  }

  /**
   * @param sheetId The unique identifier of a sheet. 
   */
  public fun sheetId(sheetId: String) {
    cdkBuilder.sheetId(sheetId)
  }

  /**
   * @param textBoxes The text boxes that are on a sheet.
   */
  public fun textBoxes(vararg textBoxes: Any) {
    _textBoxes.addAll(listOf(*textBoxes))
  }

  /**
   * @param textBoxes The text boxes that are on a sheet.
   */
  public fun textBoxes(textBoxes: Collection<Any>) {
    _textBoxes.addAll(textBoxes)
  }

  /**
   * @param textBoxes The text boxes that are on a sheet.
   */
  public fun textBoxes(textBoxes: IResolvable) {
    cdkBuilder.textBoxes(textBoxes)
  }

  /**
   * @param title The title of the sheet.
   */
  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  /**
   * @param visuals A list of the visuals that are on a sheet.
   * Visual placement is determined by the layout of the sheet.
   */
  public fun visuals(vararg visuals: Any) {
    _visuals.addAll(listOf(*visuals))
  }

  /**
   * @param visuals A list of the visuals that are on a sheet.
   * Visual placement is determined by the layout of the sheet.
   */
  public fun visuals(visuals: Collection<Any>) {
    _visuals.addAll(visuals)
  }

  /**
   * @param visuals A list of the visuals that are on a sheet.
   * Visual placement is determined by the layout of the sheet.
   */
  public fun visuals(visuals: IResolvable) {
    cdkBuilder.visuals(visuals)
  }

  public fun build(): CfnDashboard.SheetDefinitionProperty {
    if(_filterControls.isNotEmpty()) cdkBuilder.filterControls(_filterControls)
    if(_layouts.isNotEmpty()) cdkBuilder.layouts(_layouts)
    if(_parameterControls.isNotEmpty()) cdkBuilder.parameterControls(_parameterControls)
    if(_sheetControlLayouts.isNotEmpty()) cdkBuilder.sheetControlLayouts(_sheetControlLayouts)
    if(_textBoxes.isNotEmpty()) cdkBuilder.textBoxes(_textBoxes)
    if(_visuals.isNotEmpty()) cdkBuilder.visuals(_visuals)
    return cdkBuilder.build()
  }
}
