@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisVisualCustomActionOperationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.VisualCustomActionOperationProperty.Builder =
      CfnAnalysis.VisualCustomActionOperationProperty.builder()

  public fun filterOperation(filterOperation: IResolvable) {
    cdkBuilder.filterOperation(filterOperation)
  }

  public fun filterOperation(filterOperation: CfnAnalysis.CustomActionFilterOperationProperty) {
    cdkBuilder.filterOperation(filterOperation)
  }

  public fun navigationOperation(navigationOperation: IResolvable) {
    cdkBuilder.navigationOperation(navigationOperation)
  }

  public
      fun navigationOperation(navigationOperation: CfnAnalysis.CustomActionNavigationOperationProperty) {
    cdkBuilder.navigationOperation(navigationOperation)
  }

  public fun setParametersOperation(setParametersOperation: IResolvable) {
    cdkBuilder.setParametersOperation(setParametersOperation)
  }

  public
      fun setParametersOperation(setParametersOperation: CfnAnalysis.CustomActionSetParametersOperationProperty) {
    cdkBuilder.setParametersOperation(setParametersOperation)
  }

  public fun urlOperation(urlOperation: IResolvable) {
    cdkBuilder.urlOperation(urlOperation)
  }

  public fun urlOperation(urlOperation: CfnAnalysis.CustomActionURLOperationProperty) {
    cdkBuilder.urlOperation(urlOperation)
  }

  public fun build(): CfnAnalysis.VisualCustomActionOperationProperty = cdkBuilder.build()
}
