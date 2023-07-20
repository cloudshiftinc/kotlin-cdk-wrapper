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
import software.amazon.awscdk.services.eks.OpenIdConnectProvider
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class OpenIdConnectProviderDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: OpenIdConnectProvider.Builder =
        OpenIdConnectProvider.Builder.create(scope, id)

    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    public fun build(): OpenIdConnectProvider = cdkBuilder.build()
}
