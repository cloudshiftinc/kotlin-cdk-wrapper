@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTemplateVersionDefinitionPropertyDsl {
  private val cdkBuilder: CfnTemplate.TemplateVersionDefinitionProperty.Builder =
      CfnTemplate.TemplateVersionDefinitionProperty.builder()

  private val _calculatedFields: MutableList<Any> = mutableListOf()

  private val _columnConfigurations: MutableList<Any> = mutableListOf()

  private val _dataSetConfigurations: MutableList<Any> = mutableListOf()

  private val _filterGroups: MutableList<Any> = mutableListOf()

  private val _parameterDeclarations: MutableList<Any> = mutableListOf()

  private val _sheets: MutableList<Any> = mutableListOf()

  public fun analysisDefaults(analysisDefaults: IResolvable) {
    cdkBuilder.analysisDefaults(analysisDefaults)
  }

  public fun analysisDefaults(analysisDefaults: CfnTemplate.AnalysisDefaultsProperty) {
    cdkBuilder.analysisDefaults(analysisDefaults)
  }

  public fun calculatedFields(vararg calculatedFields: Any) {
    _calculatedFields.addAll(listOf(*calculatedFields))
  }

  public fun calculatedFields(calculatedFields: Collection<Any>) {
    _calculatedFields.addAll(calculatedFields)
  }

  public fun calculatedFields(calculatedFields: IResolvable) {
    cdkBuilder.calculatedFields(calculatedFields)
  }

  public fun columnConfigurations(vararg columnConfigurations: Any) {
    _columnConfigurations.addAll(listOf(*columnConfigurations))
  }

  public fun columnConfigurations(columnConfigurations: Collection<Any>) {
    _columnConfigurations.addAll(columnConfigurations)
  }

  public fun columnConfigurations(columnConfigurations: IResolvable) {
    cdkBuilder.columnConfigurations(columnConfigurations)
  }

  public fun dataSetConfigurations(vararg dataSetConfigurations: Any) {
    _dataSetConfigurations.addAll(listOf(*dataSetConfigurations))
  }

  public fun dataSetConfigurations(dataSetConfigurations: Collection<Any>) {
    _dataSetConfigurations.addAll(dataSetConfigurations)
  }

  public fun dataSetConfigurations(dataSetConfigurations: IResolvable) {
    cdkBuilder.dataSetConfigurations(dataSetConfigurations)
  }

  public fun filterGroups(vararg filterGroups: Any) {
    _filterGroups.addAll(listOf(*filterGroups))
  }

  public fun filterGroups(filterGroups: Collection<Any>) {
    _filterGroups.addAll(filterGroups)
  }

  public fun filterGroups(filterGroups: IResolvable) {
    cdkBuilder.filterGroups(filterGroups)
  }

  public fun parameterDeclarations(vararg parameterDeclarations: Any) {
    _parameterDeclarations.addAll(listOf(*parameterDeclarations))
  }

  public fun parameterDeclarations(parameterDeclarations: Collection<Any>) {
    _parameterDeclarations.addAll(parameterDeclarations)
  }

  public fun parameterDeclarations(parameterDeclarations: IResolvable) {
    cdkBuilder.parameterDeclarations(parameterDeclarations)
  }

  public fun sheets(vararg sheets: Any) {
    _sheets.addAll(listOf(*sheets))
  }

  public fun sheets(sheets: Collection<Any>) {
    _sheets.addAll(sheets)
  }

  public fun sheets(sheets: IResolvable) {
    cdkBuilder.sheets(sheets)
  }

  public fun build(): CfnTemplate.TemplateVersionDefinitionProperty {
    if(_calculatedFields.isNotEmpty()) cdkBuilder.calculatedFields(_calculatedFields)
    if(_columnConfigurations.isNotEmpty()) cdkBuilder.columnConfigurations(_columnConfigurations)
    if(_dataSetConfigurations.isNotEmpty()) cdkBuilder.dataSetConfigurations(_dataSetConfigurations)
    if(_filterGroups.isNotEmpty()) cdkBuilder.filterGroups(_filterGroups)
    if(_parameterDeclarations.isNotEmpty()) cdkBuilder.parameterDeclarations(_parameterDeclarations)
    if(_sheets.isNotEmpty()) cdkBuilder.sheets(_sheets)
    return cdkBuilder.build()
  }
}
