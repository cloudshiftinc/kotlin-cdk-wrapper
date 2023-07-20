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
public class CfnAnalysisCustomActionNavigationOperationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.CustomActionNavigationOperationProperty.Builder =
        CfnAnalysis.CustomActionNavigationOperationProperty.builder()

    public fun localNavigationConfiguration(localNavigationConfiguration: IResolvable) {
        cdkBuilder.localNavigationConfiguration(localNavigationConfiguration)
    }

    public fun localNavigationConfiguration(localNavigationConfiguration: CfnAnalysis.LocalNavigationConfigurationProperty) {
        cdkBuilder.localNavigationConfiguration(localNavigationConfiguration)
    }

    public fun build(): CfnAnalysis.CustomActionNavigationOperationProperty = cdkBuilder.build()
}
