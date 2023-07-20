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
public class CfnAnalysisReferenceLineDataConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ReferenceLineDataConfigurationProperty.Builder =
        CfnAnalysis.ReferenceLineDataConfigurationProperty.builder()

    public fun axisBinding(axisBinding: String) {
        cdkBuilder.axisBinding(axisBinding)
    }

    public fun dynamicConfiguration(dynamicConfiguration: IResolvable) {
        cdkBuilder.dynamicConfiguration(dynamicConfiguration)
    }

    public fun dynamicConfiguration(dynamicConfiguration: CfnAnalysis.ReferenceLineDynamicDataConfigurationProperty) {
        cdkBuilder.dynamicConfiguration(dynamicConfiguration)
    }

    public fun staticConfiguration(staticConfiguration: IResolvable) {
        cdkBuilder.staticConfiguration(staticConfiguration)
    }

    public fun staticConfiguration(staticConfiguration: CfnAnalysis.ReferenceLineStaticDataConfigurationProperty) {
        cdkBuilder.staticConfiguration(staticConfiguration)
    }

    public fun build(): CfnAnalysis.ReferenceLineDataConfigurationProperty = cdkBuilder.build()
}
