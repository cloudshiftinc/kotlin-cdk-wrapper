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
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

@CdkDslMarker
public class CfnAnalysisReferenceLineCustomLabelConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ReferenceLineCustomLabelConfigurationProperty.Builder =
        CfnAnalysis.ReferenceLineCustomLabelConfigurationProperty.builder()

    public fun customLabel(customLabel: String) {
        cdkBuilder.customLabel(customLabel)
    }

    public fun build(): CfnAnalysis.ReferenceLineCustomLabelConfigurationProperty = cdkBuilder.build()
}
