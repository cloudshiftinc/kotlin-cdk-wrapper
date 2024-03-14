package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.apigateway.AuthorizationType
import io.cloudshiftdev.awscdk.services.apigateway.IAuthorizer
import io.cloudshiftdev.awscdk.services.apigateway.IModel
import io.cloudshiftdev.awscdk.services.apigateway.IRequestValidator
import io.cloudshiftdev.awscdk.services.apigateway.MethodResponse
import io.cloudshiftdev.awscdk.services.apigateway.RequestValidatorOptions
import io.cloudshiftdev.awscdk.services.lambda.IEventSource
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public open class ApiEventSource internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lambda.eventsources.ApiEventSource,
) : CdkObject(cdkObject), IEventSource {
  /**
   * Called by `lambda.addEventSource` to allow the event source to bind to this function.
   *
   * @param target 
   */
  public override fun bind(target: IFunction) {
    unwrap(this).bind(target.let(IFunction::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.eventsources.ApiEventSource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Indicates whether the method requires clients to submit a valid API key.
     *
     * Default: false
     *
     * @param apiKeyRequired Indicates whether the method requires clients to submit a valid API
     * key. 
     */
    public fun apiKeyRequired(apiKeyRequired: Boolean)

    /**
     * A list of authorization scopes configured on the method.
     *
     * The scopes are used with
     * a COGNITO_USER_POOLS authorizer to authorize the method invocation.
     *
     * Default: - no authorization scopes
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationscopes)
     * @param authorizationScopes A list of authorization scopes configured on the method. 
     */
    public fun authorizationScopes(authorizationScopes: List<String>)

    /**
     * A list of authorization scopes configured on the method.
     *
     * The scopes are used with
     * a COGNITO_USER_POOLS authorizer to authorize the method invocation.
     *
     * Default: - no authorization scopes
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationscopes)
     * @param authorizationScopes A list of authorization scopes configured on the method. 
     */
    public fun authorizationScopes(vararg authorizationScopes: String)

    /**
     * Method authorization. If the value is set of `Custom`, an `authorizer` must also be
     * specified.
     *
     * If you're using one of the authorizers that are available via the `Authorizer` class, such as
     * `Authorizer#token()`,
     * it is recommended that this option not be specified. The authorizer will take care of setting
     * the correct authorization type.
     * However, specifying an authorization type using this property that conflicts with what is
     * expected by the `Authorizer`
     * will result in an error.
     *
     * Default: - open access unless `authorizer` is specified
     *
     * @param authorizationType Method authorization. If the value is set of `Custom`, an
     * `authorizer` must also be specified. 
     */
    public fun authorizationType(authorizationType: AuthorizationType)

    /**
     * If `authorizationType` is `Custom`, this specifies the ID of the method authorizer resource.
     *
     * If specified, the value of `authorizationType` must be set to `Custom`
     *
     * @param authorizer If `authorizationType` is `Custom`, this specifies the ID of the method
     * authorizer resource. 
     */
    public fun authorizer(authorizer: IAuthorizer)

    /**
     * The responses that can be sent to the client who calls the method.
     *
     * Default: None
     * This property is not required, but if these are not supplied for a Lambda
     * proxy integration, the Lambda function must return a value of the correct format,
     * for the integration response to be correctly mapped to a response to the client.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-method-settings-method-response.html)
     * @param methodResponses The responses that can be sent to the client who calls the method. 
     */
    public fun methodResponses(methodResponses: List<MethodResponse>)

    /**
     * The responses that can be sent to the client who calls the method.
     *
     * Default: None
     * This property is not required, but if these are not supplied for a Lambda
     * proxy integration, the Lambda function must return a value of the correct format,
     * for the integration response to be correctly mapped to a response to the client.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-method-settings-method-response.html)
     * @param methodResponses The responses that can be sent to the client who calls the method. 
     */
    public fun methodResponses(vararg methodResponses: MethodResponse)

    /**
     * A friendly operation name for the method.
     *
     * For example, you can assign the
     * OperationName of ListPets for the GET /pets method.
     *
     * @param operationName A friendly operation name for the method. 
     */
    public fun operationName(operationName: String)

    /**
     * The models which describe data structure of request payload.
     *
     * When
     * combined with `requestValidator` or `requestValidatorOptions`, the service
     * will validate the API request payload before it reaches the API's Integration (including
     * proxies).
     * Specify `requestModels` as key-value pairs, with a content type
     * (e.g. `'application/json'`) as the key and an API Gateway Model as the value.
     *
     * Example:
     *
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
     * @param requestModels The models which describe data structure of request payload. 
     */
    public fun requestModels(requestModels: Map<String, IModel>)

    /**
     * The request parameters that API Gateway accepts.
     *
     * Specify request parameters
     * as key-value pairs (string-to-Boolean mapping), with a source as the key and
     * a Boolean as the value. The Boolean specifies whether a parameter is required.
     * A source must match the format method.request.location.name, where the location
     * is querystring, path, or header, and name is a valid, unique parameter name.
     *
     * Default: None
     *
     * @param requestParameters The request parameters that API Gateway accepts. 
     */
    public fun requestParameters(requestParameters: Map<String, Boolean>)

    /**
     * The ID of the associated request validator.
     *
     * Only one of `requestValidator` or `requestValidatorOptions` must be specified.
     * Works together with `requestModels` or `requestParameters` to validate
     * the request before it reaches integration like Lambda Proxy Integration.
     *
     * Default: - No default validator
     *
     * @param requestValidator The ID of the associated request validator. 
     */
    public fun requestValidator(requestValidator: IRequestValidator)

    /**
     * Request validator options to create new validator Only one of `requestValidator` or
     * `requestValidatorOptions` must be specified.
     *
     * Works together with `requestModels` or `requestParameters` to validate
     * the request before it reaches integration like Lambda Proxy Integration.
     *
     * Default: - No default validator
     *
     * @param requestValidatorOptions Request validator options to create new validator Only one of
     * `requestValidator` or `requestValidatorOptions` must be specified. 
     */
    public fun requestValidatorOptions(requestValidatorOptions: RequestValidatorOptions)

    /**
     * Request validator options to create new validator Only one of `requestValidator` or
     * `requestValidatorOptions` must be specified.
     *
     * Works together with `requestModels` or `requestParameters` to validate
     * the request before it reaches integration like Lambda Proxy Integration.
     *
     * Default: - No default validator
     *
     * @param requestValidatorOptions Request validator options to create new validator Only one of
     * `requestValidator` or `requestValidatorOptions` must be specified. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc599238a5d06e78e9d5937c774a97f691b3d2736a888b3f5fa287164b8d9773")
    public
        fun requestValidatorOptions(requestValidatorOptions: RequestValidatorOptions.Builder.() -> Unit)
  }

  private class BuilderImpl(
    method: String,
    path: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.ApiEventSource.Builder =
        software.amazon.awscdk.services.lambda.eventsources.ApiEventSource.Builder.create(method,
        path)

    /**
     * Indicates whether the method requires clients to submit a valid API key.
     *
     * Default: false
     *
     * @param apiKeyRequired Indicates whether the method requires clients to submit a valid API
     * key. 
     */
    override fun apiKeyRequired(apiKeyRequired: Boolean) {
      cdkBuilder.apiKeyRequired(apiKeyRequired)
    }

    /**
     * A list of authorization scopes configured on the method.
     *
     * The scopes are used with
     * a COGNITO_USER_POOLS authorizer to authorize the method invocation.
     *
     * Default: - no authorization scopes
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationscopes)
     * @param authorizationScopes A list of authorization scopes configured on the method. 
     */
    override fun authorizationScopes(authorizationScopes: List<String>) {
      cdkBuilder.authorizationScopes(authorizationScopes)
    }

    /**
     * A list of authorization scopes configured on the method.
     *
     * The scopes are used with
     * a COGNITO_USER_POOLS authorizer to authorize the method invocation.
     *
     * Default: - no authorization scopes
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationscopes)
     * @param authorizationScopes A list of authorization scopes configured on the method. 
     */
    override fun authorizationScopes(vararg authorizationScopes: String): Unit =
        authorizationScopes(authorizationScopes.toList())

    /**
     * Method authorization. If the value is set of `Custom`, an `authorizer` must also be
     * specified.
     *
     * If you're using one of the authorizers that are available via the `Authorizer` class, such as
     * `Authorizer#token()`,
     * it is recommended that this option not be specified. The authorizer will take care of setting
     * the correct authorization type.
     * However, specifying an authorization type using this property that conflicts with what is
     * expected by the `Authorizer`
     * will result in an error.
     *
     * Default: - open access unless `authorizer` is specified
     *
     * @param authorizationType Method authorization. If the value is set of `Custom`, an
     * `authorizer` must also be specified. 
     */
    override fun authorizationType(authorizationType: AuthorizationType) {
      cdkBuilder.authorizationType(authorizationType.let(AuthorizationType::unwrap))
    }

    /**
     * If `authorizationType` is `Custom`, this specifies the ID of the method authorizer resource.
     *
     * If specified, the value of `authorizationType` must be set to `Custom`
     *
     * @param authorizer If `authorizationType` is `Custom`, this specifies the ID of the method
     * authorizer resource. 
     */
    override fun authorizer(authorizer: IAuthorizer) {
      cdkBuilder.authorizer(authorizer.let(IAuthorizer::unwrap))
    }

    /**
     * The responses that can be sent to the client who calls the method.
     *
     * Default: None
     * This property is not required, but if these are not supplied for a Lambda
     * proxy integration, the Lambda function must return a value of the correct format,
     * for the integration response to be correctly mapped to a response to the client.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-method-settings-method-response.html)
     * @param methodResponses The responses that can be sent to the client who calls the method. 
     */
    override fun methodResponses(methodResponses: List<MethodResponse>) {
      cdkBuilder.methodResponses(methodResponses.map(MethodResponse::unwrap))
    }

    /**
     * The responses that can be sent to the client who calls the method.
     *
     * Default: None
     * This property is not required, but if these are not supplied for a Lambda
     * proxy integration, the Lambda function must return a value of the correct format,
     * for the integration response to be correctly mapped to a response to the client.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-method-settings-method-response.html)
     * @param methodResponses The responses that can be sent to the client who calls the method. 
     */
    override fun methodResponses(vararg methodResponses: MethodResponse): Unit =
        methodResponses(methodResponses.toList())

    /**
     * A friendly operation name for the method.
     *
     * For example, you can assign the
     * OperationName of ListPets for the GET /pets method.
     *
     * @param operationName A friendly operation name for the method. 
     */
    override fun operationName(operationName: String) {
      cdkBuilder.operationName(operationName)
    }

    /**
     * The models which describe data structure of request payload.
     *
     * When
     * combined with `requestValidator` or `requestValidatorOptions`, the service
     * will validate the API request payload before it reaches the API's Integration (including
     * proxies).
     * Specify `requestModels` as key-value pairs, with a content type
     * (e.g. `'application/json'`) as the key and an API Gateway Model as the value.
     *
     * Example:
     *
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
     * @param requestModels The models which describe data structure of request payload. 
     */
    override fun requestModels(requestModels: Map<String, IModel>) {
      cdkBuilder.requestModels(requestModels.mapValues{IModel.unwrap(it.value)})
    }

    /**
     * The request parameters that API Gateway accepts.
     *
     * Specify request parameters
     * as key-value pairs (string-to-Boolean mapping), with a source as the key and
     * a Boolean as the value. The Boolean specifies whether a parameter is required.
     * A source must match the format method.request.location.name, where the location
     * is querystring, path, or header, and name is a valid, unique parameter name.
     *
     * Default: None
     *
     * @param requestParameters The request parameters that API Gateway accepts. 
     */
    override fun requestParameters(requestParameters: Map<String, Boolean>) {
      cdkBuilder.requestParameters(requestParameters)
    }

    /**
     * The ID of the associated request validator.
     *
     * Only one of `requestValidator` or `requestValidatorOptions` must be specified.
     * Works together with `requestModels` or `requestParameters` to validate
     * the request before it reaches integration like Lambda Proxy Integration.
     *
     * Default: - No default validator
     *
     * @param requestValidator The ID of the associated request validator. 
     */
    override fun requestValidator(requestValidator: IRequestValidator) {
      cdkBuilder.requestValidator(requestValidator.let(IRequestValidator::unwrap))
    }

    /**
     * Request validator options to create new validator Only one of `requestValidator` or
     * `requestValidatorOptions` must be specified.
     *
     * Works together with `requestModels` or `requestParameters` to validate
     * the request before it reaches integration like Lambda Proxy Integration.
     *
     * Default: - No default validator
     *
     * @param requestValidatorOptions Request validator options to create new validator Only one of
     * `requestValidator` or `requestValidatorOptions` must be specified. 
     */
    override fun requestValidatorOptions(requestValidatorOptions: RequestValidatorOptions) {
      cdkBuilder.requestValidatorOptions(requestValidatorOptions.let(RequestValidatorOptions::unwrap))
    }

    /**
     * Request validator options to create new validator Only one of `requestValidator` or
     * `requestValidatorOptions` must be specified.
     *
     * Works together with `requestModels` or `requestParameters` to validate
     * the request before it reaches integration like Lambda Proxy Integration.
     *
     * Default: - No default validator
     *
     * @param requestValidatorOptions Request validator options to create new validator Only one of
     * `requestValidator` or `requestValidatorOptions` must be specified. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc599238a5d06e78e9d5937c774a97f691b3d2736a888b3f5fa287164b8d9773")
    override
        fun requestValidatorOptions(requestValidatorOptions: RequestValidatorOptions.Builder.() -> Unit):
        Unit = requestValidatorOptions(RequestValidatorOptions(requestValidatorOptions))

    public fun build(): software.amazon.awscdk.services.lambda.eventsources.ApiEventSource =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      method: String,
      path: String,
      block: Builder.() -> Unit = {},
    ): ApiEventSource {
      val builderImpl = BuilderImpl(method, path)
      return ApiEventSource(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.ApiEventSource):
        ApiEventSource = ApiEventSource(cdkObject)

    internal fun unwrap(wrapped: ApiEventSource):
        software.amazon.awscdk.services.lambda.eventsources.ApiEventSource = wrapped.cdkObject
  }
}
