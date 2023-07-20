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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisCustomActionFilterOperationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.CustomActionFilterOperationProperty.Builder =
        CfnAnalysis.CustomActionFilterOperationProperty.builder()

    public fun selectedFieldsConfiguration(selectedFieldsConfiguration: IResolvable) {
        cdkBuilder.selectedFieldsConfiguration(selectedFieldsConfiguration)
    }

    public fun selectedFieldsConfiguration(selectedFieldsConfiguration: CfnAnalysis.FilterOperationSelectedFieldsConfigurationProperty) {
        cdkBuilder.selectedFieldsConfiguration(selectedFieldsConfiguration)
    }

    public fun targetVisualsConfiguration(targetVisualsConfiguration: IResolvable) {
        cdkBuilder.targetVisualsConfiguration(targetVisualsConfiguration)
    }

    public fun targetVisualsConfiguration(targetVisualsConfiguration: CfnAnalysis.FilterOperationTargetVisualsConfigurationProperty) {
        cdkBuilder.targetVisualsConfiguration(targetVisualsConfiguration)
    }

    public fun build(): CfnAnalysis.CustomActionFilterOperationProperty = cdkBuilder.build()
}
