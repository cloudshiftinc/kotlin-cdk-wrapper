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
public class CfnAnalysisArcAxisConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ArcAxisConfigurationProperty.Builder =
        CfnAnalysis.ArcAxisConfigurationProperty.builder()

    public fun range(range: IResolvable) {
        cdkBuilder.range(range)
    }

    public fun range(range: CfnAnalysis.ArcAxisDisplayRangeProperty) {
        cdkBuilder.range(range)
    }

    public fun reserveRange(reserveRange: Number) {
        cdkBuilder.reserveRange(reserveRange)
    }

    public fun build(): CfnAnalysis.ArcAxisConfigurationProperty = cdkBuilder.build()
}
