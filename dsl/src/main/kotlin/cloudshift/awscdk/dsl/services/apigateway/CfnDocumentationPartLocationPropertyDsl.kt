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
import software.amazon.awscdk.services.apigateway.CfnDocumentationPart
import kotlin.String

@CdkDslMarker
public class CfnDocumentationPartLocationPropertyDsl {
    private val cdkBuilder: CfnDocumentationPart.LocationProperty.Builder =
        CfnDocumentationPart.LocationProperty.builder()

    public fun method(method: String) {
        cdkBuilder.method(method)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDocumentationPart.LocationProperty = cdkBuilder.build()
}
