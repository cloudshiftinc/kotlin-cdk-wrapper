@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisFilterRelativeDateTimeControlPropertyDsl {
  private val cdkBuilder: CfnAnalysis.FilterRelativeDateTimeControlProperty.Builder =
      CfnAnalysis.FilterRelativeDateTimeControlProperty.builder()

  public fun displayOptions(displayOptions: IResolvable) {
    cdkBuilder.displayOptions(displayOptions)
  }

  public
      fun displayOptions(displayOptions: CfnAnalysis.RelativeDateTimeControlDisplayOptionsProperty) {
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

  public fun build(): CfnAnalysis.FilterRelativeDateTimeControlProperty = cdkBuilder.build()
}
