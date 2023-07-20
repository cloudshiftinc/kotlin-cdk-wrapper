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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig
import kotlin.String

@CdkDslMarker
public class CfnEndpointConfigClarifyTextConfigPropertyDsl {
    private val cdkBuilder: CfnEndpointConfig.ClarifyTextConfigProperty.Builder =
        CfnEndpointConfig.ClarifyTextConfigProperty.builder()

    public fun granularity(granularity: String) {
        cdkBuilder.granularity(granularity)
    }

    public fun language(language: String) {
        cdkBuilder.language(language)
    }

    public fun build(): CfnEndpointConfig.ClarifyTextConfigProperty = cdkBuilder.build()
}
