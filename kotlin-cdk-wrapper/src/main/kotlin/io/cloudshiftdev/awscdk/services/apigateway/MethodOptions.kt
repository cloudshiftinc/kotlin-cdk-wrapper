@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
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
 */
public interface MethodOptions {
  /**
   * Indicates whether the method requires clients to submit a valid API key.
   *
   * Default: false
   */
  public fun apiKeyRequired(): Boolean? = unwrap(this).getApiKeyRequired()

  /**
   * A list of authorization scopes configured on the method.
   *
   * The scopes are used with
   * a COGNITO_USER_POOLS authorizer to authorize the method invocation.
   *
   * Default: - no authorization scopes
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationscopes)
   */
  public fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
      emptyList()

  /**
   * Method authorization. If the value is set of `Custom`, an `authorizer` must also be specified.
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
   */
  public fun authorizationType(): AuthorizationType? =
      unwrap(this).getAuthorizationType()?.let(AuthorizationType::wrap)

  /**
   * If `authorizationType` is `Custom`, this specifies the ID of the method authorizer resource.
   *
   * If specified, the value of `authorizationType` must be set to `Custom`
   */
  public fun authorizer(): IAuthorizer? = unwrap(this).getAuthorizer()?.let(IAuthorizer::wrap)

  /**
   * The responses that can be sent to the client who calls the method.
   *
   * Default: None
   * This property is not required, but if these are not supplied for a Lambda
   * proxy integration, the Lambda function must return a value of the correct format,
   * for the integration response to be correctly mapped to a response to the client.
   *
   * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-method-settings-method-response.html)
   */
  public fun methodResponses(): List<MethodResponse> =
      unwrap(this).getMethodResponses()?.map(MethodResponse::wrap) ?: emptyList()

  /**
   * A friendly operation name for the method.
   *
   * For example, you can assign the
   * OperationName of ListPets for the GET /pets method.
   */
  public fun operationName(): String? = unwrap(this).getOperationName()

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
   */
  public fun requestModels(): Map<String, IModel> =
      unwrap(this).getRequestModels()?.mapValues{IModel.wrap(it.value)} ?: emptyMap()

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
   */
  public fun requestParameters(): Map<String, Boolean> = unwrap(this).getRequestParameters() ?:
      emptyMap()

  /**
   * The ID of the associated request validator.
   *
   * Only one of `requestValidator` or `requestValidatorOptions` must be specified.
   * Works together with `requestModels` or `requestParameters` to validate
   * the request before it reaches integration like Lambda Proxy Integration.
   *
   * Default: - No default validator
   */
  public fun requestValidator(): IRequestValidator? =
      unwrap(this).getRequestValidator()?.let(IRequestValidator::wrap)

  /**
   * Request validator options to create new validator Only one of `requestValidator` or
   * `requestValidatorOptions` must be specified.
   *
   * Works together with `requestModels` or `requestParameters` to validate
   * the request before it reaches integration like Lambda Proxy Integration.
   *
   * Default: - No default validator
   */
  public fun requestValidatorOptions(): RequestValidatorOptions? =
      unwrap(this).getRequestValidatorOptions()?.let(RequestValidatorOptions::wrap)

  /**
   * A builder for [MethodOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiKeyRequired Indicates whether the method requires clients to submit a valid API
     * key.
     */
    public fun apiKeyRequired(apiKeyRequired: Boolean)

    /**
     * @param authorizationScopes A list of authorization scopes configured on the method.
     * The scopes are used with
     * a COGNITO_USER_POOLS authorizer to authorize the method invocation.
     */
    public fun authorizationScopes(authorizationScopes: List<String>)

    /**
     * @param authorizationScopes A list of authorization scopes configured on the method.
     * The scopes are used with
     * a COGNITO_USER_POOLS authorizer to authorize the method invocation.
     */
    public fun authorizationScopes(vararg authorizationScopes: String)

    /**
     * @param authorizationType Method authorization. If the value is set of `Custom`, an
     * `authorizer` must also be specified.
     * If you're using one of the authorizers that are available via the `Authorizer` class, such as
     * `Authorizer#token()`,
     * it is recommended that this option not be specified. The authorizer will take care of setting
     * the correct authorization type.
     * However, specifying an authorization type using this property that conflicts with what is
     * expected by the `Authorizer`
     * will result in an error.
     */
    public fun authorizationType(authorizationType: AuthorizationType)

    /**
     * @param authorizer If `authorizationType` is `Custom`, this specifies the ID of the method
     * authorizer resource.
     * If specified, the value of `authorizationType` must be set to `Custom`
     */
    public fun authorizer(authorizer: IAuthorizer)

    /**
     * @param methodResponses The responses that can be sent to the client who calls the method.
     */
    public fun methodResponses(methodResponses: List<MethodResponse>)

    /**
     * @param methodResponses The responses that can be sent to the client who calls the method.
     */
    public fun methodResponses(vararg methodResponses: MethodResponse)

    /**
     * @param operationName A friendly operation name for the method.
     * For example, you can assign the
     * OperationName of ListPets for the GET /pets method.
     */
    public fun operationName(operationName: String)

    /**
     * @param requestModels The models which describe data structure of request payload.
     * When
     * combined with `requestValidator` or `requestValidatorOptions`, the service
     * will validate the API request payload before it reaches the API's Integration (including
     * proxies).
     * Specify `requestModels` as key-value pairs, with a content type
     * (e.g. `'application/json'`) as the key and an API Gateway Model as the value.
     */
    public fun requestModels(requestModels: Map<String, IModel>)

    /**
     * @param requestParameters The request parameters that API Gateway accepts.
     * Specify request parameters
     * as key-value pairs (string-to-Boolean mapping), with a source as the key and
     * a Boolean as the value. The Boolean specifies whether a parameter is required.
     * A source must match the format method.request.location.name, where the location
     * is querystring, path, or header, and name is a valid, unique parameter name.
     */
    public fun requestParameters(requestParameters: Map<String, Boolean>)

    /**
     * @param requestValidator The ID of the associated request validator.
     * Only one of `requestValidator` or `requestValidatorOptions` must be specified.
     * Works together with `requestModels` or `requestParameters` to validate
     * the request before it reaches integration like Lambda Proxy Integration.
     */
    public fun requestValidator(requestValidator: IRequestValidator)

    /**
     * @param requestValidatorOptions Request validator options to create new validator Only one of
     * `requestValidator` or `requestValidatorOptions` must be specified.
     * Works together with `requestModels` or `requestParameters` to validate
     * the request before it reaches integration like Lambda Proxy Integration.
     */
    public fun requestValidatorOptions(requestValidatorOptions: RequestValidatorOptions)

    /**
     * @param requestValidatorOptions Request validator options to create new validator Only one of
     * `requestValidator` or `requestValidatorOptions` must be specified.
     * Works together with `requestModels` or `requestParameters` to validate
     * the request before it reaches integration like Lambda Proxy Integration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95dab34537cb47aff16f4f714f8179958adf7ff05b148ddefd50412b1016f8e9")
    public
        fun requestValidatorOptions(requestValidatorOptions: RequestValidatorOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.MethodOptions.Builder =
        software.amazon.awscdk.services.apigateway.MethodOptions.builder()

    /**
     * @param apiKeyRequired Indicates whether the method requires clients to submit a valid API
     * key.
     */
    override fun apiKeyRequired(apiKeyRequired: Boolean) {
      cdkBuilder.apiKeyRequired(apiKeyRequired)
    }

    /**
     * @param authorizationScopes A list of authorization scopes configured on the method.
     * The scopes are used with
     * a COGNITO_USER_POOLS authorizer to authorize the method invocation.
     */
    override fun authorizationScopes(authorizationScopes: List<String>) {
      cdkBuilder.authorizationScopes(authorizationScopes)
    }

    /**
     * @param authorizationScopes A list of authorization scopes configured on the method.
     * The scopes are used with
     * a COGNITO_USER_POOLS authorizer to authorize the method invocation.
     */
    override fun authorizationScopes(vararg authorizationScopes: String): Unit =
        authorizationScopes(authorizationScopes.toList())

    /**
     * @param authorizationType Method authorization. If the value is set of `Custom`, an
     * `authorizer` must also be specified.
     * If you're using one of the authorizers that are available via the `Authorizer` class, such as
     * `Authorizer#token()`,
     * it is recommended that this option not be specified. The authorizer will take care of setting
     * the correct authorization type.
     * However, specifying an authorization type using this property that conflicts with what is
     * expected by the `Authorizer`
     * will result in an error.
     */
    override fun authorizationType(authorizationType: AuthorizationType) {
      cdkBuilder.authorizationType(authorizationType.let(AuthorizationType.Companion::unwrap))
    }

    /**
     * @param authorizer If `authorizationType` is `Custom`, this specifies the ID of the method
     * authorizer resource.
     * If specified, the value of `authorizationType` must be set to `Custom`
     */
    override fun authorizer(authorizer: IAuthorizer) {
      cdkBuilder.authorizer(authorizer.let(IAuthorizer.Companion::unwrap))
    }

    /**
     * @param methodResponses The responses that can be sent to the client who calls the method.
     */
    override fun methodResponses(methodResponses: List<MethodResponse>) {
      cdkBuilder.methodResponses(methodResponses.map(MethodResponse.Companion::unwrap))
    }

    /**
     * @param methodResponses The responses that can be sent to the client who calls the method.
     */
    override fun methodResponses(vararg methodResponses: MethodResponse): Unit =
        methodResponses(methodResponses.toList())

    /**
     * @param operationName A friendly operation name for the method.
     * For example, you can assign the
     * OperationName of ListPets for the GET /pets method.
     */
    override fun operationName(operationName: String) {
      cdkBuilder.operationName(operationName)
    }

    /**
     * @param requestModels The models which describe data structure of request payload.
     * When
     * combined with `requestValidator` or `requestValidatorOptions`, the service
     * will validate the API request payload before it reaches the API's Integration (including
     * proxies).
     * Specify `requestModels` as key-value pairs, with a content type
     * (e.g. `'application/json'`) as the key and an API Gateway Model as the value.
     */
    override fun requestModels(requestModels: Map<String, IModel>) {
      cdkBuilder.requestModels(requestModels.mapValues{IModel.unwrap(it.value)})
    }

    /**
     * @param requestParameters The request parameters that API Gateway accepts.
     * Specify request parameters
     * as key-value pairs (string-to-Boolean mapping), with a source as the key and
     * a Boolean as the value. The Boolean specifies whether a parameter is required.
     * A source must match the format method.request.location.name, where the location
     * is querystring, path, or header, and name is a valid, unique parameter name.
     */
    override fun requestParameters(requestParameters: Map<String, Boolean>) {
      cdkBuilder.requestParameters(requestParameters)
    }

    /**
     * @param requestValidator The ID of the associated request validator.
     * Only one of `requestValidator` or `requestValidatorOptions` must be specified.
     * Works together with `requestModels` or `requestParameters` to validate
     * the request before it reaches integration like Lambda Proxy Integration.
     */
    override fun requestValidator(requestValidator: IRequestValidator) {
      cdkBuilder.requestValidator(requestValidator.let(IRequestValidator.Companion::unwrap))
    }

    /**
     * @param requestValidatorOptions Request validator options to create new validator Only one of
     * `requestValidator` or `requestValidatorOptions` must be specified.
     * Works together with `requestModels` or `requestParameters` to validate
     * the request before it reaches integration like Lambda Proxy Integration.
     */
    override fun requestValidatorOptions(requestValidatorOptions: RequestValidatorOptions) {
      cdkBuilder.requestValidatorOptions(requestValidatorOptions.let(RequestValidatorOptions.Companion::unwrap))
    }

    /**
     * @param requestValidatorOptions Request validator options to create new validator Only one of
     * `requestValidator` or `requestValidatorOptions` must be specified.
     * Works together with `requestModels` or `requestParameters` to validate
     * the request before it reaches integration like Lambda Proxy Integration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95dab34537cb47aff16f4f714f8179958adf7ff05b148ddefd50412b1016f8e9")
    override
        fun requestValidatorOptions(requestValidatorOptions: RequestValidatorOptions.Builder.() -> Unit):
        Unit = requestValidatorOptions(RequestValidatorOptions(requestValidatorOptions))

    public fun build(): software.amazon.awscdk.services.apigateway.MethodOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.MethodOptions,
  ) : CdkObject(cdkObject),
      MethodOptions {
    /**
     * Indicates whether the method requires clients to submit a valid API key.
     *
     * Default: false
     */
    override fun apiKeyRequired(): Boolean? = unwrap(this).getApiKeyRequired()

    /**
     * A list of authorization scopes configured on the method.
     *
     * The scopes are used with
     * a COGNITO_USER_POOLS authorizer to authorize the method invocation.
     *
     * Default: - no authorization scopes
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationscopes)
     */
    override fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
        emptyList()

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
     */
    override fun authorizationType(): AuthorizationType? =
        unwrap(this).getAuthorizationType()?.let(AuthorizationType::wrap)

    /**
     * If `authorizationType` is `Custom`, this specifies the ID of the method authorizer resource.
     *
     * If specified, the value of `authorizationType` must be set to `Custom`
     */
    override fun authorizer(): IAuthorizer? = unwrap(this).getAuthorizer()?.let(IAuthorizer::wrap)

    /**
     * The responses that can be sent to the client who calls the method.
     *
     * Default: None
     * This property is not required, but if these are not supplied for a Lambda
     * proxy integration, the Lambda function must return a value of the correct format,
     * for the integration response to be correctly mapped to a response to the client.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-method-settings-method-response.html)
     */
    override fun methodResponses(): List<MethodResponse> =
        unwrap(this).getMethodResponses()?.map(MethodResponse::wrap) ?: emptyList()

    /**
     * A friendly operation name for the method.
     *
     * For example, you can assign the
     * OperationName of ListPets for the GET /pets method.
     */
    override fun operationName(): String? = unwrap(this).getOperationName()

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
     */
    override fun requestModels(): Map<String, IModel> =
        unwrap(this).getRequestModels()?.mapValues{IModel.wrap(it.value)} ?: emptyMap()

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
     */
    override fun requestParameters(): Map<String, Boolean> = unwrap(this).getRequestParameters() ?:
        emptyMap()

    /**
     * The ID of the associated request validator.
     *
     * Only one of `requestValidator` or `requestValidatorOptions` must be specified.
     * Works together with `requestModels` or `requestParameters` to validate
     * the request before it reaches integration like Lambda Proxy Integration.
     *
     * Default: - No default validator
     */
    override fun requestValidator(): IRequestValidator? =
        unwrap(this).getRequestValidator()?.let(IRequestValidator::wrap)

    /**
     * Request validator options to create new validator Only one of `requestValidator` or
     * `requestValidatorOptions` must be specified.
     *
     * Works together with `requestModels` or `requestParameters` to validate
     * the request before it reaches integration like Lambda Proxy Integration.
     *
     * Default: - No default validator
     */
    override fun requestValidatorOptions(): RequestValidatorOptions? =
        unwrap(this).getRequestValidatorOptions()?.let(RequestValidatorOptions::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MethodOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.MethodOptions):
        MethodOptions = CdkObjectWrappers.wrap(cdkObject) as? MethodOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: MethodOptions):
        software.amazon.awscdk.services.apigateway.MethodOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigateway.MethodOptions
  }
}
