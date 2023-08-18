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

package io.cloudshiftdev.awscdkdsl.services.apigateway

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnDocumentationPart
import software.constructs.Construct

/**
 * The `AWS::ApiGateway::DocumentationPart` resource creates a documentation part for an API.
 *
 * For more information, see
 * [Representation of API Documentation in API Gateway](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-documenting-api-content-representation.html)
 * in the *API Gateway Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * CfnDocumentationPart cfnDocumentationPart = CfnDocumentationPart.Builder.create(this,
 * "MyCfnDocumentationPart")
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
public class CfnDocumentationPartDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDocumentationPart.Builder =
        CfnDocumentationPart.Builder.create(scope, id)

    /**
     * The location of the targeted API entity of the to-be-created documentation part.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-location)
     *
     * @param location The location of the targeted API entity of the to-be-created documentation
     *   part.
     */
    public fun location(location: IResolvable) {
        cdkBuilder.location(location)
    }

    /**
     * The location of the targeted API entity of the to-be-created documentation part.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-location)
     *
     * @param location The location of the targeted API entity of the to-be-created documentation
     *   part.
     */
    public fun location(location: CfnDocumentationPart.LocationProperty) {
        cdkBuilder.location(location)
    }

    /**
     * The new documentation content map of the targeted API entity.
     *
     * Enclosed key-value pairs are API-specific, but only OpenAPI-compliant key-value pairs can be
     * exported and, hence, published.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-properties)
     *
     * @param properties The new documentation content map of the targeted API entity.
     */
    public fun properties(properties: String) {
        cdkBuilder.properties(properties)
    }

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-restapiid)
     *
     * @param restApiId The string identifier of the associated RestApi.
     */
    public fun restApiId(restApiId: String) {
        cdkBuilder.restApiId(restApiId)
    }

    public fun build(): CfnDocumentationPart = cdkBuilder.build()
}
