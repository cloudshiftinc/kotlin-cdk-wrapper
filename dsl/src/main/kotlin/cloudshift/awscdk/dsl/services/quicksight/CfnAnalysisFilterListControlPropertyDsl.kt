@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisFilterListControlPropertyDsl {
  private val cdkBuilder: CfnAnalysis.FilterListControlProperty.Builder =
      CfnAnalysis.FilterListControlProperty.builder()

  public fun cascadingControlConfiguration(cascadingControlConfiguration: IResolvable) {
    cdkBuilder.cascadingControlConfiguration(cascadingControlConfiguration)
  }

  public
      fun cascadingControlConfiguration(cascadingControlConfiguration: CfnAnalysis.CascadingControlConfigurationProperty) {
    cdkBuilder.cascadingControlConfiguration(cascadingControlConfiguration)
  }

  public fun displayOptions(displayOptions: IResolvable) {
    cdkBuilder.displayOptions(displayOptions)
  }

  public fun displayOptions(displayOptions: CfnAnalysis.ListControlDisplayOptionsProperty) {
    cdkBuilder.displayOptions(displayOptions)
  }

  public fun filterControlId(filterControlId: String) {
    cdkBuilder.filterControlId(filterControlId)
  }

  public fun selectableValues(selectableValues: IResolvable) {
    cdkBuilder.selectableValues(selectableValues)
  }

  public fun selectableValues(selectableValues: CfnAnalysis.FilterSelectableValuesProperty) {
    cdkBuilder.selectableValues(selectableValues)
  }

  public fun sourceFilterId(sourceFilterId: String) {
    cdkBuilder.sourceFilterId(sourceFilterId)
  }

  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnAnalysis.FilterListControlProperty = cdkBuilder.build()
}
