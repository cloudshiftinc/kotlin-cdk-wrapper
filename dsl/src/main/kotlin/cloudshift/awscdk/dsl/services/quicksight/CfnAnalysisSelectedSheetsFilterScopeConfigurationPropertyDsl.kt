@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisSelectedSheetsFilterScopeConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.SelectedSheetsFilterScopeConfigurationProperty.Builder =
      CfnAnalysis.SelectedSheetsFilterScopeConfigurationProperty.builder()

  private val _sheetVisualScopingConfigurations: MutableList<Any> = mutableListOf()

  public fun sheetVisualScopingConfigurations(vararg sheetVisualScopingConfigurations: Any) {
    _sheetVisualScopingConfigurations.addAll(listOf(*sheetVisualScopingConfigurations))
  }

  public fun sheetVisualScopingConfigurations(sheetVisualScopingConfigurations: Collection<Any>) {
    _sheetVisualScopingConfigurations.addAll(sheetVisualScopingConfigurations)
  }

  public fun sheetVisualScopingConfigurations(sheetVisualScopingConfigurations: IResolvable) {
    cdkBuilder.sheetVisualScopingConfigurations(sheetVisualScopingConfigurations)
  }

  public fun build(): CfnAnalysis.SelectedSheetsFilterScopeConfigurationProperty {
    if(_sheetVisualScopingConfigurations.isNotEmpty())
        cdkBuilder.sheetVisualScopingConfigurations(_sheetVisualScopingConfigurations)
    return cdkBuilder.build()
  }
}
