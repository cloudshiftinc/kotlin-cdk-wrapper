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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnHttpApi
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnHttpApiMutualTlsAuthenticationPropertyDsl {
    private val cdkBuilder: CfnHttpApi.MutualTlsAuthenticationProperty.Builder =
        CfnHttpApi.MutualTlsAuthenticationProperty.builder()

    public fun truststoreUri(truststoreUri: String) {
        cdkBuilder.truststoreUri(truststoreUri)
    }

    public fun truststoreVersion(truststoreVersion: Boolean) {
        cdkBuilder.truststoreVersion(truststoreVersion)
    }

    public fun truststoreVersion(truststoreVersion: IResolvable) {
        cdkBuilder.truststoreVersion(truststoreVersion)
    }

    public fun build(): CfnHttpApi.MutualTlsAuthenticationProperty = cdkBuilder.build()
}
