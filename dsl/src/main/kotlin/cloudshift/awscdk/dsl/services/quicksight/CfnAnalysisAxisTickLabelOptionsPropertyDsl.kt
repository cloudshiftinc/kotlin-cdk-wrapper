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
import kotlin.Number

@CdkDslMarker
public class CfnAnalysisAxisTickLabelOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.AxisTickLabelOptionsProperty.Builder =
        CfnAnalysis.AxisTickLabelOptionsProperty.builder()

    public fun labelOptions(labelOptions: IResolvable) {
        cdkBuilder.labelOptions(labelOptions)
    }

    public fun labelOptions(labelOptions: CfnAnalysis.LabelOptionsProperty) {
        cdkBuilder.labelOptions(labelOptions)
    }

    public fun rotationAngle(rotationAngle: Number) {
        cdkBuilder.rotationAngle(rotationAngle)
    }

    public fun build(): CfnAnalysis.AxisTickLabelOptionsProperty = cdkBuilder.build()
}
