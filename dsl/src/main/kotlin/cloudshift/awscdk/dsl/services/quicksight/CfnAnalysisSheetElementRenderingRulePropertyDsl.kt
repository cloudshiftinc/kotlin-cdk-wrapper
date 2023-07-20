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
import kotlin.String

@CdkDslMarker
public class CfnAnalysisSheetElementRenderingRulePropertyDsl {
    private val cdkBuilder: CfnAnalysis.SheetElementRenderingRuleProperty.Builder =
        CfnAnalysis.SheetElementRenderingRuleProperty.builder()

    public fun configurationOverrides(configurationOverrides: IResolvable) {
        cdkBuilder.configurationOverrides(configurationOverrides)
    }

    public fun configurationOverrides(configurationOverrides: CfnAnalysis.SheetElementConfigurationOverridesProperty) {
        cdkBuilder.configurationOverrides(configurationOverrides)
    }

    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    public fun build(): CfnAnalysis.SheetElementRenderingRuleProperty = cdkBuilder.build()
}
