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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnStackSet
import kotlin.String

@CdkDslMarker
public class CfnStackSetParameterPropertyDsl {
    private val cdkBuilder: CfnStackSet.ParameterProperty.Builder =
        CfnStackSet.ParameterProperty.builder()

    public fun parameterKey(parameterKey: String) {
        cdkBuilder.parameterKey(parameterKey)
    }

    public fun parameterValue(parameterValue: String) {
        cdkBuilder.parameterValue(parameterValue)
    }

    public fun build(): CfnStackSet.ParameterProperty = cdkBuilder.build()
}
