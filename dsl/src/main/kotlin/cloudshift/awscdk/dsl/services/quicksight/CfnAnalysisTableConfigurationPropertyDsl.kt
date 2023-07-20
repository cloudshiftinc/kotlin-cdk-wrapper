@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisTableConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.TableConfigurationProperty.Builder =
      CfnAnalysis.TableConfigurationProperty.builder()

  private val _tableInlineVisualizations: MutableList<Any> = mutableListOf()

  public fun fieldOptions(fieldOptions: IResolvable) {
    cdkBuilder.fieldOptions(fieldOptions)
  }

  public fun fieldOptions(fieldOptions: CfnAnalysis.TableFieldOptionsProperty) {
    cdkBuilder.fieldOptions(fieldOptions)
  }

  public fun fieldWells(fieldWells: IResolvable) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun fieldWells(fieldWells: CfnAnalysis.TableFieldWellsProperty) {
    cdkBuilder.fieldWells(fieldWells)
  }

  public fun paginatedReportOptions(paginatedReportOptions: IResolvable) {
    cdkBuilder.paginatedReportOptions(paginatedReportOptions)
  }

  public
      fun paginatedReportOptions(paginatedReportOptions: CfnAnalysis.TablePaginatedReportOptionsProperty) {
    cdkBuilder.paginatedReportOptions(paginatedReportOptions)
  }

  public fun sortConfiguration(sortConfiguration: IResolvable) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun sortConfiguration(sortConfiguration: CfnAnalysis.TableSortConfigurationProperty) {
    cdkBuilder.sortConfiguration(sortConfiguration)
  }

  public fun tableInlineVisualizations(vararg tableInlineVisualizations: Any) {
    _tableInlineVisualizations.addAll(listOf(*tableInlineVisualizations))
  }

  public fun tableInlineVisualizations(tableInlineVisualizations: Collection<Any>) {
    _tableInlineVisualizations.addAll(tableInlineVisualizations)
  }

  public fun tableInlineVisualizations(tableInlineVisualizations: IResolvable) {
    cdkBuilder.tableInlineVisualizations(tableInlineVisualizations)
  }

  public fun tableOptions(tableOptions: IResolvable) {
    cdkBuilder.tableOptions(tableOptions)
  }

  public fun tableOptions(tableOptions: CfnAnalysis.TableOptionsProperty) {
    cdkBuilder.tableOptions(tableOptions)
  }

  public fun totalOptions(totalOptions: IResolvable) {
    cdkBuilder.totalOptions(totalOptions)
  }

  public fun totalOptions(totalOptions: CfnAnalysis.TotalOptionsProperty) {
    cdkBuilder.totalOptions(totalOptions)
  }

  public fun build(): CfnAnalysis.TableConfigurationProperty {
    if(_tableInlineVisualizations.isNotEmpty())
        cdkBuilder.tableInlineVisualizations(_tableInlineVisualizations)
    return cdkBuilder.build()
  }
}
