@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

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

  public fun contentType(contentType: String) {
    cdkBuilder.contentType(contentType)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun filterControls(vararg filterControls: Any) {
    _filterControls.addAll(listOf(*filterControls))
  }

  public fun filterControls(filterControls: Collection<Any>) {
    _filterControls.addAll(filterControls)
  }

  public fun filterControls(filterControls: IResolvable) {
    cdkBuilder.filterControls(filterControls)
  }

  public fun layouts(vararg layouts: Any) {
    _layouts.addAll(listOf(*layouts))
  }

  public fun layouts(layouts: Collection<Any>) {
    _layouts.addAll(layouts)
  }

  public fun layouts(layouts: IResolvable) {
    cdkBuilder.layouts(layouts)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun parameterControls(vararg parameterControls: Any) {
    _parameterControls.addAll(listOf(*parameterControls))
  }

  public fun parameterControls(parameterControls: Collection<Any>) {
    _parameterControls.addAll(parameterControls)
  }

  public fun parameterControls(parameterControls: IResolvable) {
    cdkBuilder.parameterControls(parameterControls)
  }

  public fun sheetControlLayouts(vararg sheetControlLayouts: Any) {
    _sheetControlLayouts.addAll(listOf(*sheetControlLayouts))
  }

  public fun sheetControlLayouts(sheetControlLayouts: Collection<Any>) {
    _sheetControlLayouts.addAll(sheetControlLayouts)
  }

  public fun sheetControlLayouts(sheetControlLayouts: IResolvable) {
    cdkBuilder.sheetControlLayouts(sheetControlLayouts)
  }

  public fun sheetId(sheetId: String) {
    cdkBuilder.sheetId(sheetId)
  }

  public fun textBoxes(vararg textBoxes: Any) {
    _textBoxes.addAll(listOf(*textBoxes))
  }

  public fun textBoxes(textBoxes: Collection<Any>) {
    _textBoxes.addAll(textBoxes)
  }

  public fun textBoxes(textBoxes: IResolvable) {
    cdkBuilder.textBoxes(textBoxes)
  }

  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  public fun visuals(vararg visuals: Any) {
    _visuals.addAll(listOf(*visuals))
  }

  public fun visuals(visuals: Collection<Any>) {
    _visuals.addAll(visuals)
  }

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
