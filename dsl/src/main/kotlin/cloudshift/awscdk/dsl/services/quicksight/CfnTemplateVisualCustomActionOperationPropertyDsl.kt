@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateVisualCustomActionOperationPropertyDsl {
  private val cdkBuilder: CfnTemplate.VisualCustomActionOperationProperty.Builder =
      CfnTemplate.VisualCustomActionOperationProperty.builder()

  public fun filterOperation(filterOperation: IResolvable) {
    cdkBuilder.filterOperation(filterOperation)
  }

  public fun filterOperation(filterOperation: CfnTemplate.CustomActionFilterOperationProperty) {
    cdkBuilder.filterOperation(filterOperation)
  }

  public fun navigationOperation(navigationOperation: IResolvable) {
    cdkBuilder.navigationOperation(navigationOperation)
  }

  public
      fun navigationOperation(navigationOperation: CfnTemplate.CustomActionNavigationOperationProperty) {
    cdkBuilder.navigationOperation(navigationOperation)
  }

  public fun setParametersOperation(setParametersOperation: IResolvable) {
    cdkBuilder.setParametersOperation(setParametersOperation)
  }

  public
      fun setParametersOperation(setParametersOperation: CfnTemplate.CustomActionSetParametersOperationProperty) {
    cdkBuilder.setParametersOperation(setParametersOperation)
  }

  public fun urlOperation(urlOperation: IResolvable) {
    cdkBuilder.urlOperation(urlOperation)
  }

  public fun urlOperation(urlOperation: CfnTemplate.CustomActionURLOperationProperty) {
    cdkBuilder.urlOperation(urlOperation)
  }

  public fun build(): CfnTemplate.VisualCustomActionOperationProperty = cdkBuilder.build()
}
