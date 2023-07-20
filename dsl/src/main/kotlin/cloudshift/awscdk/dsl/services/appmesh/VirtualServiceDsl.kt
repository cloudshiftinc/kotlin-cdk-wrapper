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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appmesh.VirtualService
import software.amazon.awscdk.services.appmesh.VirtualServiceProvider
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class VirtualServiceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: VirtualService.Builder = VirtualService.Builder.create(scope, id)

    public fun virtualServiceName(virtualServiceName: String) {
        cdkBuilder.virtualServiceName(virtualServiceName)
    }

    public fun virtualServiceProvider(virtualServiceProvider: VirtualServiceProvider) {
        cdkBuilder.virtualServiceProvider(virtualServiceProvider)
    }

    public fun build(): VirtualService = cdkBuilder.build()
}
