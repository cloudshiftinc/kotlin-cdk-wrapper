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
import software.amazon.awscdk.services.apigateway.ApiMappingOptions
import kotlin.String

@CdkDslMarker
public class ApiMappingOptionsDsl {
    private val cdkBuilder: ApiMappingOptions.Builder = ApiMappingOptions.builder()

    public fun basePath(basePath: String) {
        cdkBuilder.basePath(basePath)
    }

    public fun build(): ApiMappingOptions = cdkBuilder.build()
}
