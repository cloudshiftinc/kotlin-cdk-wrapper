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
import software.amazon.awscdk.services.apigateway.RestApiAttributes
import kotlin.String

@CdkDslMarker
public class RestApiAttributesDsl {
    private val cdkBuilder: RestApiAttributes.Builder = RestApiAttributes.builder()

    public fun restApiId(restApiId: String) {
        cdkBuilder.restApiId(restApiId)
    }

    public fun restApiName(restApiName: String) {
        cdkBuilder.restApiName(restApiName)
    }

    public fun rootResourceId(rootResourceId: String) {
        cdkBuilder.rootResourceId(rootResourceId)
    }

    public fun build(): RestApiAttributes = cdkBuilder.build()
}
