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

package cloudshift.awscdk.dsl.services.refactorspaces

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.refactorspaces.CfnService
import kotlin.String

@CdkDslMarker
public class CfnServiceUrlEndpointInputPropertyDsl {
    private val cdkBuilder: CfnService.UrlEndpointInputProperty.Builder =
        CfnService.UrlEndpointInputProperty.builder()

    public fun healthUrl(healthUrl: String) {
        cdkBuilder.healthUrl(healthUrl)
    }

    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    public fun build(): CfnService.UrlEndpointInputProperty = cdkBuilder.build()
}
