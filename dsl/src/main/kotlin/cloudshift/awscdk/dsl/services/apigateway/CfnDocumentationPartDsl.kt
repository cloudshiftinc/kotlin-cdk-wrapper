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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnDocumentationPart
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnDocumentationPartDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDocumentationPart.Builder = CfnDocumentationPart.Builder.create(
        scope,
        id,
    )

    public fun location(location: IResolvable) {
        cdkBuilder.location(location)
    }

    public fun location(location: CfnDocumentationPart.LocationProperty) {
        cdkBuilder.location(location)
    }

    public fun properties(properties: String) {
        cdkBuilder.properties(properties)
    }

    public fun restApiId(restApiId: String) {
        cdkBuilder.restApiId(restApiId)
    }

    public fun build(): CfnDocumentationPart = cdkBuilder.build()
}
