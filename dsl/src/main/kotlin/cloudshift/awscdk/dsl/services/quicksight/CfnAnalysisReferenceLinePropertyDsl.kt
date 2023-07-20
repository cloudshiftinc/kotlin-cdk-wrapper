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
public class CfnAnalysisReferenceLinePropertyDsl {
    private val cdkBuilder: CfnAnalysis.ReferenceLineProperty.Builder =
        CfnAnalysis.ReferenceLineProperty.builder()

    public fun dataConfiguration(dataConfiguration: IResolvable) {
        cdkBuilder.dataConfiguration(dataConfiguration)
    }

    public fun dataConfiguration(dataConfiguration: CfnAnalysis.ReferenceLineDataConfigurationProperty) {
        cdkBuilder.dataConfiguration(dataConfiguration)
    }

    public fun labelConfiguration(labelConfiguration: IResolvable) {
        cdkBuilder.labelConfiguration(labelConfiguration)
    }

    public fun labelConfiguration(labelConfiguration: CfnAnalysis.ReferenceLineLabelConfigurationProperty) {
        cdkBuilder.labelConfiguration(labelConfiguration)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun styleConfiguration(styleConfiguration: IResolvable) {
        cdkBuilder.styleConfiguration(styleConfiguration)
    }

    public fun styleConfiguration(styleConfiguration: CfnAnalysis.ReferenceLineStyleConfigurationProperty) {
        cdkBuilder.styleConfiguration(styleConfiguration)
    }

    public fun build(): CfnAnalysis.ReferenceLineProperty = cdkBuilder.build()
}
