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

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.apigateway.CfnDomainName
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
