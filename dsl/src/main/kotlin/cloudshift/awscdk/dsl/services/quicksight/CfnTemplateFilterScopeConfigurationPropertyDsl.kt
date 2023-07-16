@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFilterScopeConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.FilterScopeConfigurationProperty.Builder =
      CfnTemplate.FilterScopeConfigurationProperty.builder()

  public fun selectedSheets(selectedSheets: IResolvable) {
    cdkBuilder.selectedSheets(selectedSheets)
  }

  public
      fun selectedSheets(selectedSheets: CfnTemplate.SelectedSheetsFilterScopeConfigurationProperty) {
    cdkBuilder.selectedSheets(selectedSheets)
  }

  public fun build(): CfnTemplate.FilterScopeConfigurationProperty = cdkBuilder.build()
}
