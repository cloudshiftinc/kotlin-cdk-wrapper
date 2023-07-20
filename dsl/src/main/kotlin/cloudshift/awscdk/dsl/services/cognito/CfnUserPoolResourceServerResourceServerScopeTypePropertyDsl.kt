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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer
import kotlin.String

@CdkDslMarker
public class CfnUserPoolResourceServerResourceServerScopeTypePropertyDsl {
    private val cdkBuilder: CfnUserPoolResourceServer.ResourceServerScopeTypeProperty.Builder =
        CfnUserPoolResourceServer.ResourceServerScopeTypeProperty.builder()

    public fun scopeDescription(scopeDescription: String) {
        cdkBuilder.scopeDescription(scopeDescription)
    }

    public fun scopeName(scopeName: String) {
        cdkBuilder.scopeName(scopeName)
    }

    public fun build(): CfnUserPoolResourceServer.ResourceServerScopeTypeProperty = cdkBuilder.build()
}
