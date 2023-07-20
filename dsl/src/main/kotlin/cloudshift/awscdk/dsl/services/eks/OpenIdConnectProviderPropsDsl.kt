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

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.eks.OpenIdConnectProviderProps
import kotlin.String

@CdkDslMarker
public class OpenIdConnectProviderPropsDsl {
    private val cdkBuilder: OpenIdConnectProviderProps.Builder = OpenIdConnectProviderProps.builder()

    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    public fun build(): OpenIdConnectProviderProps = cdkBuilder.build()
}
