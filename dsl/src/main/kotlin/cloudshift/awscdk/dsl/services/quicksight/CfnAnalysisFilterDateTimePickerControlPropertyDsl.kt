@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisFilterDateTimePickerControlPropertyDsl {
  private val cdkBuilder: CfnAnalysis.FilterDateTimePickerControlProperty.Builder =
      CfnAnalysis.FilterDateTimePickerControlProperty.builder()

  public fun displayOptions(displayOptions: IResolvable) {
    cdkBuilder.displayOptions(displayOptions)
  }

  public
      fun displayOptions(displayOptions: CfnAnalysis.DateTimePickerControlDisplayOptionsProperty) {
    cdkBuilder.displayOptions(displayOptions)
  }

  public fun filterControlId(filterControlId: String) {
    cdkBuilder.filterControlId(filterControlId)
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

  public fun build(): CfnAnalysis.FilterDateTimePickerControlProperty = cdkBuilder.build()
}
