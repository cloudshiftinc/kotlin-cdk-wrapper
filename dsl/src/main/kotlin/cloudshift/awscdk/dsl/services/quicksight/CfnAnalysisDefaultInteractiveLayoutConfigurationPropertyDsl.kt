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
public class CfnAnalysisDefaultInteractiveLayoutConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.DefaultInteractiveLayoutConfigurationProperty.Builder =
        CfnAnalysis.DefaultInteractiveLayoutConfigurationProperty.builder()

    public fun freeForm(freeForm: IResolvable) {
        cdkBuilder.freeForm(freeForm)
    }

    public fun freeForm(freeForm: CfnAnalysis.DefaultFreeFormLayoutConfigurationProperty) {
        cdkBuilder.freeForm(freeForm)
    }

    public fun grid(grid: IResolvable) {
        cdkBuilder.grid(grid)
    }

    public fun grid(grid: CfnAnalysis.DefaultGridLayoutConfigurationProperty) {
        cdkBuilder.grid(grid)
    }

    public fun build(): CfnAnalysis.DefaultInteractiveLayoutConfigurationProperty = cdkBuilder.build()
}
