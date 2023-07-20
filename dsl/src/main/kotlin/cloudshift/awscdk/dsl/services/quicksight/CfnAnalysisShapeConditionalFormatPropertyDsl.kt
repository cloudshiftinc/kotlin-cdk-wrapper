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
public class CfnAnalysisShapeConditionalFormatPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ShapeConditionalFormatProperty.Builder =
        CfnAnalysis.ShapeConditionalFormatProperty.builder()

    public fun backgroundColor(backgroundColor: IResolvable) {
        cdkBuilder.backgroundColor(backgroundColor)
    }

    public fun backgroundColor(backgroundColor: CfnAnalysis.ConditionalFormattingColorProperty) {
        cdkBuilder.backgroundColor(backgroundColor)
    }

    public fun build(): CfnAnalysis.ShapeConditionalFormatProperty = cdkBuilder.build()
}
