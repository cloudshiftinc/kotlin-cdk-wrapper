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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnDocumentationPart
import software.amazon.awscdk.services.apigateway.CfnDocumentationPartProps

/**
 * Properties for defining a `CfnDocumentationPart`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * CfnDocumentationPartProps cfnDocumentationPartProps = CfnDocumentationPartProps.builder()
 * .location(LocationProperty.builder()
 * .method("method")
 * .name("name")
 * .path("path")
 * .statusCode("statusCode")
 * .type("type")
 * .build())
 * .properties("properties")
 * .restApiId("restApiId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html)
 */
@CdkDslMarker
public class CfnDocumentationPartPropsDsl {
    private val cdkBuilder: CfnDocumentationPartProps.Builder = CfnDocumentationPartProps.builder()

    /**
     * @param location The location of the targeted API entity of the to-be-created documentation
     *   part.
     */
    public fun location(location: IResolvable) {
        cdkBuilder.location(location)
    }

    /**
     * @param location The location of the targeted API entity of the to-be-created documentation
     *   part.
     */
    public fun location(location: CfnDocumentationPart.LocationProperty) {
        cdkBuilder.location(location)
    }

    /**
     * @param properties The new documentation content map of the targeted API entity. Enclosed
     *   key-value pairs are API-specific, but only OpenAPI-compliant key-value pairs can be
     *   exported and, hence, published.
     */
    public fun properties(properties: String) {
        cdkBuilder.properties(properties)
    }

    /** @param restApiId The string identifier of the associated RestApi. */
    public fun restApiId(restApiId: String) {
        cdkBuilder.restApiId(restApiId)
    }

    public fun build(): CfnDocumentationPartProps = cdkBuilder.build()
}
