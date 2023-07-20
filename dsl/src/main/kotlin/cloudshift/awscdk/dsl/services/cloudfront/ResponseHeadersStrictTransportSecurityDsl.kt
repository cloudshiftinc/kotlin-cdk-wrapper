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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity
import kotlin.Boolean

@CdkDslMarker
public class ResponseHeadersStrictTransportSecurityDsl {
    private val cdkBuilder: ResponseHeadersStrictTransportSecurity.Builder =
        ResponseHeadersStrictTransportSecurity.builder()

    public fun accessControlMaxAge(accessControlMaxAge: Duration) {
        cdkBuilder.accessControlMaxAge(accessControlMaxAge)
    }

    public fun includeSubdomains(includeSubdomains: Boolean) {
        cdkBuilder.includeSubdomains(includeSubdomains)
    }

    public fun `override`(`override`: Boolean) {
        cdkBuilder.`override`(`override`)
    }

    public fun preload(preload: Boolean) {
        cdkBuilder.preload(preload)
    }

    public fun build(): ResponseHeadersStrictTransportSecurity = cdkBuilder.build()
}
