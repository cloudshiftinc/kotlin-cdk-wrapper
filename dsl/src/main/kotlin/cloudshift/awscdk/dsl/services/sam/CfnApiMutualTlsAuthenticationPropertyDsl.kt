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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sam.CfnApi
import kotlin.String

@CdkDslMarker
public class CfnApiMutualTlsAuthenticationPropertyDsl {
    private val cdkBuilder: CfnApi.MutualTlsAuthenticationProperty.Builder =
        CfnApi.MutualTlsAuthenticationProperty.builder()

    public fun truststoreUri(truststoreUri: String) {
        cdkBuilder.truststoreUri(truststoreUri)
    }

    public fun truststoreVersion(truststoreVersion: String) {
        cdkBuilder.truststoreVersion(truststoreVersion)
    }

    public fun build(): CfnApi.MutualTlsAuthenticationProperty = cdkBuilder.build()
}
