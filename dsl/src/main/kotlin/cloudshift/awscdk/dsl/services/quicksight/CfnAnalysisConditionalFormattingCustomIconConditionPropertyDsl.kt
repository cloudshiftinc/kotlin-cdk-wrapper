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
public class CfnAnalysisConditionalFormattingCustomIconConditionPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ConditionalFormattingCustomIconConditionProperty.Builder =
        CfnAnalysis.ConditionalFormattingCustomIconConditionProperty.builder()

    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    public fun displayConfiguration(displayConfiguration: IResolvable) {
        cdkBuilder.displayConfiguration(displayConfiguration)
    }

    public fun displayConfiguration(displayConfiguration: CfnAnalysis.ConditionalFormattingIconDisplayConfigurationProperty) {
        cdkBuilder.displayConfiguration(displayConfiguration)
    }

    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    public fun iconOptions(iconOptions: IResolvable) {
        cdkBuilder.iconOptions(iconOptions)
    }

    public fun iconOptions(iconOptions: CfnAnalysis.ConditionalFormattingCustomIconOptionsProperty) {
        cdkBuilder.iconOptions(iconOptions)
    }

    public fun build(): CfnAnalysis.ConditionalFormattingCustomIconConditionProperty =
        cdkBuilder.build()
}
