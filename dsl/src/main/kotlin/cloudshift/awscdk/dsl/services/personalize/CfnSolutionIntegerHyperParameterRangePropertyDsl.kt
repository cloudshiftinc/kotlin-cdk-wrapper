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

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.personalize.CfnSolution
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnSolutionIntegerHyperParameterRangePropertyDsl {
    private val cdkBuilder: CfnSolution.IntegerHyperParameterRangeProperty.Builder =
        CfnSolution.IntegerHyperParameterRangeProperty.builder()

    public fun maxValue(maxValue: Number) {
        cdkBuilder.maxValue(maxValue)
    }

    public fun minValue(minValue: Number) {
        cdkBuilder.minValue(minValue)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnSolution.IntegerHyperParameterRangeProperty = cdkBuilder.build()
}
