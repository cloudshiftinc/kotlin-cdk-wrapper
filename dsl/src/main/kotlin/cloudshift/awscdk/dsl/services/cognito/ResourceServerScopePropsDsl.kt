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
import software.amazon.awscdk.services.cognito.ResourceServerScopeProps
import kotlin.String

@CdkDslMarker
public class ResourceServerScopePropsDsl {
    private val cdkBuilder: ResourceServerScopeProps.Builder = ResourceServerScopeProps.builder()

    public fun scopeDescription(scopeDescription: String) {
        cdkBuilder.scopeDescription(scopeDescription)
    }

    public fun scopeName(scopeName: String) {
        cdkBuilder.scopeName(scopeName)
    }

    public fun build(): ResourceServerScopeProps = cdkBuilder.build()
}
