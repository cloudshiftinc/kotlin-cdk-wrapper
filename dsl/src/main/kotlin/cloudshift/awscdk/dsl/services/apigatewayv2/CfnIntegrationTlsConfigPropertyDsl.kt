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

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.apigatewayv2.CfnIntegration
import kotlin.String

@CdkDslMarker
public class CfnIntegrationTlsConfigPropertyDsl {
    private val cdkBuilder: CfnIntegration.TlsConfigProperty.Builder =
        CfnIntegration.TlsConfigProperty.builder()

    public fun serverNameToVerify(serverNameToVerify: String) {
        cdkBuilder.serverNameToVerify(serverNameToVerify)
    }

    public fun build(): CfnIntegration.TlsConfigProperty = cdkBuilder.build()
}
