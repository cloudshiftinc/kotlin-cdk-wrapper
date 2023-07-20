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

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.config.CfnOrganizationConformancePack
import kotlin.String

@CdkDslMarker
public class CfnOrganizationConformancePackConformancePackInputParameterPropertyDsl {
    private val cdkBuilder:
        CfnOrganizationConformancePack.ConformancePackInputParameterProperty.Builder =
        CfnOrganizationConformancePack.ConformancePackInputParameterProperty.builder()

    public fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
    }

    public fun parameterValue(parameterValue: String) {
        cdkBuilder.parameterValue(parameterValue)
    }

    public fun build(): CfnOrganizationConformancePack.ConformancePackInputParameterProperty =
        cdkBuilder.build()
}
