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
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.apigateway.ResourceAttributes
import kotlin.String

@CdkDslMarker
public class ResourceAttributesDsl {
    private val cdkBuilder: ResourceAttributes.Builder = ResourceAttributes.builder()

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    public fun restApi(restApi: IRestApi) {
        cdkBuilder.restApi(restApi)
    }

    public fun build(): ResourceAttributes = cdkBuilder.build()
}
