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

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ssm.CommonStringParameterAttributes
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CommonStringParameterAttributesDsl {
    private val cdkBuilder: CommonStringParameterAttributes.Builder =
        CommonStringParameterAttributes.builder()

    public fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
    }

    public fun simpleName(simpleName: Boolean) {
        cdkBuilder.simpleName(simpleName)
    }

    public fun build(): CommonStringParameterAttributes = cdkBuilder.build()
}
