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
public class CfnEndpointConfigClarifyShapBaselineConfigPropertyDsl {
    private val cdkBuilder: CfnEndpointConfig.ClarifyShapBaselineConfigProperty.Builder =
        CfnEndpointConfig.ClarifyShapBaselineConfigProperty.builder()

    public fun mimeType(mimeType: String) {
        cdkBuilder.mimeType(mimeType)
    }

    public fun shapBaseline(shapBaseline: String) {
        cdkBuilder.shapBaseline(shapBaseline)
    }

    public fun shapBaselineUri(shapBaselineUri: String) {
        cdkBuilder.shapBaselineUri(shapBaselineUri)
    }

    public fun build(): CfnEndpointConfig.ClarifyShapBaselineConfigProperty = cdkBuilder.build()
}
