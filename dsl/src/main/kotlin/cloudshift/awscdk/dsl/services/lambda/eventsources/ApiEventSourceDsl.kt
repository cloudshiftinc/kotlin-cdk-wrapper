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

package cloudshift.awscdk.dsl.services.lambda.eventsources

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.apigateway.MethodResponseDsl
import cloudshift.awscdk.dsl.services.apigateway.RequestValidatorOptionsDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.apigateway.AuthorizationType
import software.amazon.awscdk.services.apigateway.IAuthorizer
import software.amazon.awscdk.services.apigateway.IModel
import software.amazon.awscdk.services.apigateway.IRequestValidator
import software.amazon.awscdk.services.apigateway.MethodResponse
import software.amazon.awscdk.services.apigateway.RequestValidatorOptions
import software.amazon.awscdk.services.lambda.eventsources.ApiEventSource

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * import software.amazon.awscdk.services.lambda.eventsources.*;
 * Authorizer authorizer;
 * Model model;
 * RequestValidator requestValidator;
 * ApiEventSource apiEventSource = ApiEventSource.Builder.create("method", "path")
 * .apiKeyRequired(false)
 * .authorizationScopes(List.of("authorizationScopes"))
 * .authorizationType(AuthorizationType.NONE)
 * .authorizer(authorizer)
 * .methodResponses(List.of(MethodResponse.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .responseModels(Map.of(
 * "responseModelsKey", model))
 * .responseParameters(Map.of(
 * "responseParametersKey", false))
 * .build()))
 * .operationName("operationName")
 * .requestModels(Map.of(
 * "requestModelsKey", model))
 * .requestParameters(Map.of(
 * "requestParametersKey", false))
 * .requestValidator(requestValidator)
 * .requestValidatorOptions(RequestValidatorOptions.builder()
 * .requestValidatorName("requestValidatorName")
 * .validateRequestBody(false)
 * .validateRequestParameters(false)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class ApiEventSourceDsl(
    method: String,
    path: String,
) {
    private val cdkBuilder: ApiEventSource.Builder = ApiEventSource.Builder.create(method, path)

    private val _authorizationScopes: MutableList<String> = mutableListOf()

    private val _methodResponses: MutableList<MethodResponse> = mutableListOf()

    /**
     * Indicates whether the method requires clients to submit a valid API key.
     *
     * Default: false
     *
     * @param apiKeyRequired Indicates whether the method requires clients to submit a valid API
     *   key.
     */
    public fun apiKeyRequired(apiKeyRequired: Boolean) {
        cdkBuilder.apiKeyRequired(apiKeyRequired)
    }

    /**
     * A list of authorization scopes configured on the method.
     *
     * The scopes are used with a COGNITO_USER_POOLS authorizer to authorize the method invocation.
     *
     * Default: - no authorization scopes
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationscopes)
     *
     * @param authorizationScopes A list of authorization scopes configured on the method.
     */
    public fun authorizationScopes(vararg authorizationScopes: String) {
        _authorizationScopes.addAll(listOf(*authorizationScopes))
    }

    /**
     * A list of authorization scopes configured on the method.
     *
     * The scopes are used with a COGNITO_USER_POOLS authorizer to authorize the method invocation.
     *
     * Default: - no authorization scopes
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationscopes)
     *
     * @param authorizationScopes A list of authorization scopes configured on the method.
     */
    public fun authorizationScopes(authorizationScopes: Collection<String>) {
        _authorizationScopes.addAll(authorizationScopes)
    }

    /**
     * Method authorization. If the value is set of `Custom`, an `authorizer` must also be
     * specified.
     *
     * If you're using one of the authorizers that are available via the `Authorizer` class, such as
     * `Authorizer#token()`, it is recommended that this option not be specified. The authorizer
     * will take care of setting the correct authorization type. However, specifying an
     * authorization type using this property that conflicts with what is expected by the
     * `Authorizer` will result in an error.
     *
     * Default: - open access unless `authorizer` is specified
     *
     * @param authorizationType Method authorization. If the value is set of `Custom`, an
     *   `authorizer` must also be specified.
     */
    public fun authorizationType(authorizationType: AuthorizationType) {
        cdkBuilder.authorizationType(authorizationType)
    }

    /**
     * If `authorizationType` is `Custom`, this specifies the ID of the method authorizer resource.
     *
     * If specified, the value of `authorizationType` must be set to `Custom`
     *
     * @param authorizer If `authorizationType` is `Custom`, this specifies the ID of the method
     *   authorizer resource.
     */
    public fun authorizer(authorizer: IAuthorizer) {
        cdkBuilder.authorizer(authorizer)
    }

    /**
     * The responses that can be sent to the client who calls the method.
     *
     * Default: None This property is not required, but if these are not supplied for a Lambda proxy
     * integration, the Lambda function must return a value of the correct format, for the
     * integration response to be correctly mapped to a response to the client.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-method-settings-method-response.html)
     *
     * @param methodResponses The responses that can be sent to the client who calls the method.
     */
    public fun methodResponses(methodResponses: MethodResponseDsl.() -> Unit) {
        _methodResponses.add(MethodResponseDsl().apply(methodResponses).build())
    }

    /**
     * The responses that can be sent to the client who calls the method.
     *
     * Default: None This property is not required, but if these are not supplied for a Lambda proxy
     * integration, the Lambda function must return a value of the correct format, for the
     * integration response to be correctly mapped to a response to the client.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-method-settings-method-response.html)
     *
     * @param methodResponses The responses that can be sent to the client who calls the method.
     */
    public fun methodResponses(methodResponses: Collection<MethodResponse>) {
        _methodResponses.addAll(methodResponses)
    }

    /**
     * A friendly operation name for the method.
     *
     * For example, you can assign the OperationName of ListPets for the GET /pets method.
     *
     * @param operationName A friendly operation name for the method.
     */
    public fun operationName(operationName: String) {
        cdkBuilder.operationName(operationName)
    }

    /**
     * The models which describe data structure of request payload.
     *
     * When combined with `requestValidator` or `requestValidatorOptions`, the service will validate
     * the API request payload before it reaches the API's Integration (including proxies). Specify
     * `requestModels` as key-value pairs, with a content type (e.g. `'application/json'`) as the
     * key and an API Gateway Model as the value.
     *
     * Example:
     * ```
     * RestApi api;
     * Function userLambda;
     * Model userModel = api.addModel("UserModel", ModelOptions.builder()
     * .schema(JsonSchema.builder()
     * .type(JsonSchemaType.OBJECT)
     * .properties(Map.of(
     * "userId", JsonSchema.builder()
     * .type(JsonSchemaType.STRING)
     * .build(),
     * "name", JsonSchema.builder()
     * .type(JsonSchemaType.STRING)
     * .build()))
     * .required(List.of("userId"))
     * .build())
     * .build());
     * api.root.addResource("user").addMethod("POST",
     * new LambdaIntegration(userLambda), MethodOptions.builder()
     * .requestModels(Map.of(
     * "application/json", userModel))
     * .build());
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-method-settings-method-request.html#setup-method-request-model)
     *
     * @param requestModels The models which describe data structure of request payload.
     */
    public fun requestModels(requestModels: Map<String, IModel>) {
        cdkBuilder.requestModels(requestModels)
    }

    /**
     * The request parameters that API Gateway accepts.
     *
     * Specify request parameters as key-value pairs (string-to-Boolean mapping), with a source as
     * the key and a Boolean as the value. The Boolean specifies whether a parameter is required. A
     * source must match the format method.request.location.name, where the location is querystring,
     * path, or header, and name is a valid, unique parameter name.
     *
     * Default: None
     *
     * @param requestParameters The request parameters that API Gateway accepts.
     */
    public fun requestParameters(requestParameters: Map<String, Boolean>) {
        cdkBuilder.requestParameters(requestParameters)
    }

    /**
     * The ID of the associated request validator.
     *
     * Only one of `requestValidator` or `requestValidatorOptions` must be specified. Works together
     * with `requestModels` or `requestParameters` to validate the request before it reaches
     * integration like Lambda Proxy Integration.
     *
     * Default: - No default validator
     *
     * @param requestValidator The ID of the associated request validator.
     */
    public fun requestValidator(requestValidator: IRequestValidator) {
        cdkBuilder.requestValidator(requestValidator)
    }

    /**
     * Request validator options to create new validator Only one of `requestValidator` or
     * `requestValidatorOptions` must be specified.
     *
     * Works together with `requestModels` or `requestParameters` to validate the request before it
     * reaches integration like Lambda Proxy Integration.
     *
     * Default: - No default validator
     *
     * @param requestValidatorOptions Request validator options to create new validator Only one of
     *   `requestValidator` or `requestValidatorOptions` must be specified.
     */
    public fun requestValidatorOptions(
        requestValidatorOptions: RequestValidatorOptionsDsl.() -> Unit = {}
    ) {
        val builder = RequestValidatorOptionsDsl()
        builder.apply(requestValidatorOptions)
        cdkBuilder.requestValidatorOptions(builder.build())
    }

    /**
     * Request validator options to create new validator Only one of `requestValidator` or
     * `requestValidatorOptions` must be specified.
     *
     * Works together with `requestModels` or `requestParameters` to validate the request before it
     * reaches integration like Lambda Proxy Integration.
     *
     * Default: - No default validator
     *
     * @param requestValidatorOptions Request validator options to create new validator Only one of
     *   `requestValidator` or `requestValidatorOptions` must be specified.
     */
    public fun requestValidatorOptions(requestValidatorOptions: RequestValidatorOptions) {
        cdkBuilder.requestValidatorOptions(requestValidatorOptions)
    }

    public fun build(): ApiEventSource {
        if (_authorizationScopes.isNotEmpty()) cdkBuilder.authorizationScopes(_authorizationScopes)
        if (_methodResponses.isNotEmpty()) cdkBuilder.methodResponses(_methodResponses)
        return cdkBuilder.build()
    }
}
