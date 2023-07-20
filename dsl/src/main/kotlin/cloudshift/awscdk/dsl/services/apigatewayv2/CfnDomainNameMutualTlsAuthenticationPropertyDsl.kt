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
import software.amazon.awscdk.services.apigatewayv2.CfnDomainName
import kotlin.String

@CdkDslMarker
public class CfnDomainNameMutualTlsAuthenticationPropertyDsl {
    private val cdkBuilder: CfnDomainName.MutualTlsAuthenticationProperty.Builder =
        CfnDomainName.MutualTlsAuthenticationProperty.builder()

    public fun truststoreUri(truststoreUri: String) {
        cdkBuilder.truststoreUri(truststoreUri)
    }

    public fun truststoreVersion(truststoreVersion: String) {
        cdkBuilder.truststoreVersion(truststoreVersion)
    }

    public fun build(): CfnDomainName.MutualTlsAuthenticationProperty = cdkBuilder.build()
}
