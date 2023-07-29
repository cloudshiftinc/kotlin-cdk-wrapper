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
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnMethod
import software.amazon.awscdk.services.apigateway.CfnMethodProps

/**
 * Properties for defining a `CfnMethod`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * CfnMethodProps cfnMethodProps = CfnMethodProps.builder()
 * .httpMethod("httpMethod")
 * .resourceId("resourceId")
 * .restApiId("restApiId")
 * // the properties below are optional
 * .apiKeyRequired(false)
 * .authorizationScopes(List.of("authorizationScopes"))
 * .authorizationType("authorizationType")
 * .authorizerId("authorizerId")
 * .integration(IntegrationProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .cacheKeyParameters(List.of("cacheKeyParameters"))
 * .cacheNamespace("cacheNamespace")
 * .connectionId("connectionId")
 * .connectionType("connectionType")
 * .contentHandling("contentHandling")
 * .credentials("credentials")
 * .integrationHttpMethod("integrationHttpMethod")
 * .integrationResponses(List.of(IntegrationResponseProperty.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .contentHandling("contentHandling")
 * .responseParameters(Map.of(
 * "responseParametersKey", "responseParameters"))
 * .responseTemplates(Map.of(
 * "responseTemplatesKey", "responseTemplates"))
 * .selectionPattern("selectionPattern")
 * .build()))
 * .passthroughBehavior("passthroughBehavior")
 * .requestParameters(Map.of(
 * "requestParametersKey", "requestParameters"))
 * .requestTemplates(Map.of(
 * "requestTemplatesKey", "requestTemplates"))
 * .timeoutInMillis(123)
 * .uri("uri")
 * .build())
 * .methodResponses(List.of(MethodResponseProperty.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .responseModels(Map.of(
 * "responseModelsKey", "responseModels"))
 * .responseParameters(Map.of(
 * "responseParametersKey", false))
 * .build()))
 * .operationName("operationName")
 * .requestModels(Map.of(
 * "requestModelsKey", "requestModels"))
 * .requestParameters(Map.of(
 * "requestParametersKey", false))
 * .requestValidatorId("requestValidatorId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html)
 */
@CdkDslMarker
public class CfnMethodPropsDsl {
    private val cdkBuilder: CfnMethodProps.Builder = CfnMethodProps.builder()

    private val _authorizationScopes: MutableList<String> = mutableListOf()

    private val _methodResponses: MutableList<Any> = mutableListOf()

    /**
     * @param apiKeyRequired A boolean flag specifying whether a valid ApiKey is required to invoke
     *   this method.
     */
    public fun apiKeyRequired(apiKeyRequired: Boolean) {
        cdkBuilder.apiKeyRequired(apiKeyRequired)
    }

    /**
     * @param apiKeyRequired A boolean flag specifying whether a valid ApiKey is required to invoke
     *   this method.
     */
    public fun apiKeyRequired(apiKeyRequired: IResolvable) {
        cdkBuilder.apiKeyRequired(apiKeyRequired)
    }

    /**
     * @param authorizationScopes A list of authorization scopes configured on the method. The
     *   scopes are used with a `COGNITO_USER_POOLS` authorizer to authorize the method invocation.
     *   The authorization works by matching the method scopes against the scopes parsed from the
     *   access token in the incoming request. The method invocation is authorized if any method
     *   scopes matches a claimed scope in the access token. Otherwise, the invocation is not
     *   authorized. When the method scope is configured, the client must provide an access token
     *   instead of an identity token for authorization purposes.
     */
    public fun authorizationScopes(vararg authorizationScopes: String) {
        _authorizationScopes.addAll(listOf(*authorizationScopes))
    }

    /**
     * @param authorizationScopes A list of authorization scopes configured on the method. The
     *   scopes are used with a `COGNITO_USER_POOLS` authorizer to authorize the method invocation.
     *   The authorization works by matching the method scopes against the scopes parsed from the
     *   access token in the incoming request. The method invocation is authorized if any method
     *   scopes matches a claimed scope in the access token. Otherwise, the invocation is not
     *   authorized. When the method scope is configured, the client must provide an access token
     *   instead of an identity token for authorization purposes.
     */
    public fun authorizationScopes(authorizationScopes: Collection<String>) {
        _authorizationScopes.addAll(authorizationScopes)
    }

    /**
     * @param authorizationType The method's authorization type. For valid values, see
     *   [Method](https://docs.aws.amazon.com/apigateway/latest/api/API_Method.html) in the *API
     *   Gateway API Reference* .
     *
     * If you specify the `AuthorizerId` property, specify `CUSTOM` or `COGNITO_USER_POOLS` for this
     * property.
     */
    public fun authorizationType(authorizationType: String) {
        cdkBuilder.authorizationType(authorizationType)
    }

    /**
     * @param authorizerId The identifier of an authorizer to use on this method. The method's
     *   authorization type must be `CUSTOM` or `COGNITO_USER_POOLS` .
     */
    public fun authorizerId(authorizerId: String) {
        cdkBuilder.authorizerId(authorizerId)
    }

    /** @param httpMethod The method's HTTP verb. */
    public fun httpMethod(httpMethod: String) {
        cdkBuilder.httpMethod(httpMethod)
    }

    /**
     * @param integration Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock
     *   integration.
     */
    public fun integration(integration: IResolvable) {
        cdkBuilder.integration(integration)
    }

    /**
     * @param integration Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock
     *   integration.
     */
    public fun integration(integration: CfnMethod.IntegrationProperty) {
        cdkBuilder.integration(integration)
    }

    /** @param methodResponses Gets a method response associated with a given HTTP status code. */
    public fun methodResponses(vararg methodResponses: Any) {
        _methodResponses.addAll(listOf(*methodResponses))
    }

    /** @param methodResponses Gets a method response associated with a given HTTP status code. */
    public fun methodResponses(methodResponses: Collection<Any>) {
        _methodResponses.addAll(methodResponses)
    }

    /** @param methodResponses Gets a method response associated with a given HTTP status code. */
    public fun methodResponses(methodResponses: IResolvable) {
        cdkBuilder.methodResponses(methodResponses)
    }

    /**
     * @param operationName A human-friendly operation identifier for the method. For example, you
     *   can assign the `operationName` of `ListPets` for the `GET /pets` method in the `PetStore`
     *   example.
     */
    public fun operationName(operationName: String) {
        cdkBuilder.operationName(operationName)
    }

    /**
     * @param requestModels A key-value map specifying data schemas, represented by Model resources,
     *   (as the mapped value) of the request payloads of given content types (as the mapping key).
     */
    public fun requestModels(requestModels: Map<String, String>) {
        cdkBuilder.requestModels(requestModels)
    }

    /**
     * @param requestModels A key-value map specifying data schemas, represented by Model resources,
     *   (as the mapped value) of the request payloads of given content types (as the mapping key).
     */
    public fun requestModels(requestModels: IResolvable) {
        cdkBuilder.requestModels(requestModels)
    }

    /**
     * @param requestParameters A key-value map defining required or optional method request
     *   parameters that can be accepted by API Gateway. A key is a method request parameter name
     *   matching the pattern of `method.request.{location}.{name}` , where `location` is
     *   `querystring` , `path` , or `header` and `name` is a valid and unique parameter name. The
     *   value associated with the key is a Boolean flag indicating whether the parameter is
     *   required ( `true` ) or optional ( `false` ). The method request parameter names defined
     *   here are available in Integration to be mapped to integration request parameters or
     *   templates.
     */
    public fun requestParameters(requestParameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(requestParameters)
        cdkBuilder.requestParameters(builder.map)
    }

    /**
     * @param requestParameters A key-value map defining required or optional method request
     *   parameters that can be accepted by API Gateway. A key is a method request parameter name
     *   matching the pattern of `method.request.{location}.{name}` , where `location` is
     *   `querystring` , `path` , or `header` and `name` is a valid and unique parameter name. The
     *   value associated with the key is a Boolean flag indicating whether the parameter is
     *   required ( `true` ) or optional ( `false` ). The method request parameter names defined
     *   here are available in Integration to be mapped to integration request parameters or
     *   templates.
     */
    public fun requestParameters(requestParameters: Map<String, Any>) {
        cdkBuilder.requestParameters(requestParameters)
    }

    /**
     * @param requestParameters A key-value map defining required or optional method request
     *   parameters that can be accepted by API Gateway. A key is a method request parameter name
     *   matching the pattern of `method.request.{location}.{name}` , where `location` is
     *   `querystring` , `path` , or `header` and `name` is a valid and unique parameter name. The
     *   value associated with the key is a Boolean flag indicating whether the parameter is
     *   required ( `true` ) or optional ( `false` ). The method request parameter names defined
     *   here are available in Integration to be mapped to integration request parameters or
     *   templates.
     */
    public fun requestParameters(requestParameters: IResolvable) {
        cdkBuilder.requestParameters(requestParameters)
    }

    /** @param requestValidatorId The identifier of a RequestValidator for request validation. */
    public fun requestValidatorId(requestValidatorId: String) {
        cdkBuilder.requestValidatorId(requestValidatorId)
    }

    /** @param resourceId The Resource identifier for the MethodResponse resource. */
    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    /** @param restApiId The string identifier of the associated RestApi. */
    public fun restApiId(restApiId: String) {
        cdkBuilder.restApiId(restApiId)
    }

    public fun build(): CfnMethodProps {
        if (_authorizationScopes.isNotEmpty()) cdkBuilder.authorizationScopes(_authorizationScopes)
        if (_methodResponses.isNotEmpty()) cdkBuilder.methodResponses(_methodResponses)
        return cdkBuilder.build()
    }
}
