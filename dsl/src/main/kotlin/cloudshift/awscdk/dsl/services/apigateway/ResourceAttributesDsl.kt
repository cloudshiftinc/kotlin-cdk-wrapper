@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.apigateway.ResourceAttributes

/**
 * Attributes that can be specified when importing a Resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * RestApi restApi;
 * ResourceAttributes resourceAttributes = ResourceAttributes.builder()
 * .path("path")
 * .resourceId("resourceId")
 * .restApi(restApi)
 * .build();
 * ```
 */
@CdkDslMarker
public class ResourceAttributesDsl {
    private val cdkBuilder: ResourceAttributes.Builder = ResourceAttributes.builder()

    /** @param path The full path of this resource. */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /** @param resourceId The ID of the resource. */
    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    /** @param restApi The rest API that this resource is part of. */
    public fun restApi(restApi: IRestApi) {
        cdkBuilder.restApi(restApi)
    }

    public fun build(): ResourceAttributes = cdkBuilder.build()
}
