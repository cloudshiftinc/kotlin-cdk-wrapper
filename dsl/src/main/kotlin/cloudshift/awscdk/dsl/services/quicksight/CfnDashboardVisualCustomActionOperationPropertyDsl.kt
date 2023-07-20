@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardVisualCustomActionOperationPropertyDsl {
    private val cdkBuilder: CfnDashboard.VisualCustomActionOperationProperty.Builder =
        CfnDashboard.VisualCustomActionOperationProperty.builder()

    public fun filterOperation(filterOperation: IResolvable) {
        cdkBuilder.filterOperation(filterOperation)
    }

    public fun filterOperation(filterOperation: CfnDashboard.CustomActionFilterOperationProperty) {
        cdkBuilder.filterOperation(filterOperation)
    }

    public fun navigationOperation(navigationOperation: IResolvable) {
        cdkBuilder.navigationOperation(navigationOperation)
    }

    public fun navigationOperation(navigationOperation: CfnDashboard.CustomActionNavigationOperationProperty) {
        cdkBuilder.navigationOperation(navigationOperation)
    }

    public fun setParametersOperation(setParametersOperation: IResolvable) {
        cdkBuilder.setParametersOperation(setParametersOperation)
    }

    public fun setParametersOperation(setParametersOperation: CfnDashboard.CustomActionSetParametersOperationProperty) {
        cdkBuilder.setParametersOperation(setParametersOperation)
    }

    public fun urlOperation(urlOperation: IResolvable) {
        cdkBuilder.urlOperation(urlOperation)
    }

    public fun urlOperation(urlOperation: CfnDashboard.CustomActionURLOperationProperty) {
        cdkBuilder.urlOperation(urlOperation)
    }

    public fun build(): CfnDashboard.VisualCustomActionOperationProperty = cdkBuilder.build()
}
