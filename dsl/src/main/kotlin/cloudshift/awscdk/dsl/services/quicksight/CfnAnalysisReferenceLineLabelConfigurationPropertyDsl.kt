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
public class CfnAnalysisReferenceLineLabelConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ReferenceLineLabelConfigurationProperty.Builder =
        CfnAnalysis.ReferenceLineLabelConfigurationProperty.builder()

    public fun customLabelConfiguration(customLabelConfiguration: IResolvable) {
        cdkBuilder.customLabelConfiguration(customLabelConfiguration)
    }

    public fun customLabelConfiguration(customLabelConfiguration: CfnAnalysis.ReferenceLineCustomLabelConfigurationProperty) {
        cdkBuilder.customLabelConfiguration(customLabelConfiguration)
    }

    public fun fontColor(fontColor: String) {
        cdkBuilder.fontColor(fontColor)
    }

    public fun fontConfiguration(fontConfiguration: IResolvable) {
        cdkBuilder.fontConfiguration(fontConfiguration)
    }

    public fun fontConfiguration(fontConfiguration: CfnAnalysis.FontConfigurationProperty) {
        cdkBuilder.fontConfiguration(fontConfiguration)
    }

    public fun horizontalPosition(horizontalPosition: String) {
        cdkBuilder.horizontalPosition(horizontalPosition)
    }

    public fun valueLabelConfiguration(valueLabelConfiguration: IResolvable) {
        cdkBuilder.valueLabelConfiguration(valueLabelConfiguration)
    }

    public fun valueLabelConfiguration(valueLabelConfiguration: CfnAnalysis.ReferenceLineValueLabelConfigurationProperty) {
        cdkBuilder.valueLabelConfiguration(valueLabelConfiguration)
    }

    public fun verticalPosition(verticalPosition: String) {
        cdkBuilder.verticalPosition(verticalPosition)
    }

    public fun build(): CfnAnalysis.ReferenceLineLabelConfigurationProperty = cdkBuilder.build()
}
