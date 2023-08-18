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
import software.amazon.awscdk.services.apigateway.CfnDocumentationPart

/**
 * The `Location` property specifies the location of the Amazon API Gateway API entity that the
 * documentation applies to.
 *
 * `Location` is a property of the
 * [AWS::ApiGateway::DocumentationPart](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html)
 * resource.
 *
 * For more information about each property, including constraints and valid values, see
 * [DocumentationPart](https://docs.aws.amazon.com/apigateway/latest/api/API_DocumentationPartLocation.html)
 * in the *Amazon API Gateway REST API Reference* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * LocationProperty locationProperty = LocationProperty.builder()
 * .method("method")
 * .name("name")
 * .path("path")
 * .statusCode("statusCode")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html)
 */
@CdkDslMarker
public class CfnDocumentationPartLocationPropertyDsl {
    private val cdkBuilder: CfnDocumentationPart.LocationProperty.Builder =
        CfnDocumentationPart.LocationProperty.builder()

    /**
     * @param method The HTTP verb of a method. It is a valid field for the API entity types of
     *   `METHOD` , `PATH_PARAMETER` , `QUERY_PARAMETER` , `REQUEST_HEADER` , `REQUEST_BODY` ,
     *   `RESPONSE` , `RESPONSE_HEADER` , and `RESPONSE_BODY` . The default value is `*` for any
     *   method. When an applicable child entity inherits the content of an entity of the same type
     *   with more general specifications of the other `location` attributes, the child entity's
     *   `method` attribute must match that of the parent entity exactly.
     */
    public fun method(method: String) {
        cdkBuilder.method(method)
    }

    /**
     * @param name The name of the targeted API entity. It is a valid and required field for the API
     *   entity types of `AUTHORIZER` , `MODEL` , `PATH_PARAMETER` , `QUERY_PARAMETER` ,
     *   `REQUEST_HEADER` , `REQUEST_BODY` and `RESPONSE_HEADER` . It is an invalid field for any
     *   other entity type.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param path The URL path of the target. It is a valid field for the API entity types of
     *   `RESOURCE` , `METHOD` , `PATH_PARAMETER` , `QUERY_PARAMETER` , `REQUEST_HEADER` ,
     *   `REQUEST_BODY` , `RESPONSE` , `RESPONSE_HEADER` , and `RESPONSE_BODY` . The default value
     *   is `/` for the root resource. When an applicable child entity inherits the content of
     *   another entity of the same type with more general specifications of the other `location`
     *   attributes, the child entity's `path` attribute must match that of the parent entity as a
     *   prefix.
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /**
     * @param statusCode The HTTP status code of a response. It is a valid field for the API entity
     *   types of `RESPONSE` , `RESPONSE_HEADER` , and `RESPONSE_BODY` . The default value is `*`
     *   for any status code. When an applicable child entity inherits the content of an entity of
     *   the same type with more general specifications of the other `location` attributes, the
     *   child entity's `statusCode` attribute must match that of the parent entity exactly.
     */
    public fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
    }

    /**
     * @param type The type of API entity to which the documentation content applies. Valid values
     *   are `API` , `AUTHORIZER` , `MODEL` , `RESOURCE` , `METHOD` , `PATH_PARAMETER` ,
     *   `QUERY_PARAMETER` , `REQUEST_HEADER` , `REQUEST_BODY` , `RESPONSE` , `RESPONSE_HEADER` ,
     *   and `RESPONSE_BODY` . Content inheritance does not apply to any entity of the `API` ,
     *   `AUTHORIZER` , `METHOD` , `MODEL` , `REQUEST_BODY` , or `RESOURCE` type.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDocumentationPart.LocationProperty = cdkBuilder.build()
}
