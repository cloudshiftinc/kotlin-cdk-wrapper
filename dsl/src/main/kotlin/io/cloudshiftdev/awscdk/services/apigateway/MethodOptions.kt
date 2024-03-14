package io.cloudshiftdev.awscdk.services.apigateway

import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface MethodOptions {
  public fun apiKeyRequired(): Boolean? = unwrap(this).getApiKeyRequired()

  public fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
      emptyList()

  public fun authorizationType(): AuthorizationType? =
      unwrap(this).getAuthorizationType()?.let(AuthorizationType::wrap)

  public fun authorizer(): IAuthorizer? = unwrap(this).getAuthorizer()?.let(IAuthorizer::wrap)

  public fun methodResponses(): List<MethodResponse> =
      unwrap(this).getMethodResponses()?.map(MethodResponse::wrap) ?: emptyList()

  public fun operationName(): String? = unwrap(this).getOperationName()

  public fun requestModels(): Map<String, IModel> =
      unwrap(this).getRequestModels()?.mapValues{IModel.wrap(it.value)} ?: emptyMap()

  public fun requestParameters(): Map<String, Boolean> = unwrap(this).getRequestParameters() ?:
      emptyMap()

  public fun requestValidator(): IRequestValidator? =
      unwrap(this).getRequestValidator()?.let(IRequestValidator::wrap)

  public fun requestValidatorOptions(): RequestValidatorOptions? =
      unwrap(this).getRequestValidatorOptions()?.let(RequestValidatorOptions::wrap)

  public interface Builder {
    public fun apiKeyRequired(apiKeyRequired: Boolean)

    public fun authorizationScopes(authorizationScopes: List<String>)

    public fun authorizationType(authorizationType: AuthorizationType)

    public fun authorizer(authorizer: IAuthorizer)

    public fun methodResponses(methodResponses: List<MethodResponse>)

    public fun operationName(operationName: String)

    public fun requestModels(requestModels: Map<String, IModel>)

    public fun requestParameters(requestParameters: Map<String, Boolean>)

    public fun requestValidator(requestValidator: IRequestValidator)

    public fun requestValidatorOptions(requestValidatorOptions: RequestValidatorOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95dab34537cb47aff16f4f714f8179958adf7ff05b148ddefd50412b1016f8e9")
    public
        fun requestValidatorOptions(requestValidatorOptions: RequestValidatorOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.MethodOptions.Builder =
        software.amazon.awscdk.services.apigateway.MethodOptions.builder()

    override fun apiKeyRequired(apiKeyRequired: Boolean) {
      cdkBuilder.apiKeyRequired(apiKeyRequired)
    }

    override fun authorizationScopes(authorizationScopes: List<String>) {
      cdkBuilder.authorizationScopes(authorizationScopes)
    }

    override fun authorizationType(authorizationType: AuthorizationType) {
      cdkBuilder.authorizationType(authorizationType.let(AuthorizationType::unwrap))
    }

    override fun authorizer(authorizer: IAuthorizer) {
      cdkBuilder.authorizer(authorizer.let(IAuthorizer::unwrap))
    }

    override fun methodResponses(methodResponses: List<MethodResponse>) {
      cdkBuilder.methodResponses(methodResponses.map(MethodResponse::unwrap))
    }

    override fun operationName(operationName: String) {
      cdkBuilder.operationName(operationName)
    }

    override fun requestModels(requestModels: Map<String, IModel>) {
      cdkBuilder.requestModels(requestModels.mapValues{IModel.unwrap(it.value)})
    }

    override fun requestParameters(requestParameters: Map<String, Boolean>) {
      cdkBuilder.requestParameters(requestParameters)
    }

    override fun requestValidator(requestValidator: IRequestValidator) {
      cdkBuilder.requestValidator(requestValidator.let(IRequestValidator::unwrap))
    }

    override fun requestValidatorOptions(requestValidatorOptions: RequestValidatorOptions) {
      cdkBuilder.requestValidatorOptions(requestValidatorOptions.let(RequestValidatorOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95dab34537cb47aff16f4f714f8179958adf7ff05b148ddefd50412b1016f8e9")
    override
        fun requestValidatorOptions(requestValidatorOptions: RequestValidatorOptions.Builder.() -> Unit):
        Unit = requestValidatorOptions(RequestValidatorOptions(requestValidatorOptions))

    public fun build(): software.amazon.awscdk.services.apigateway.MethodOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.MethodOptions,
  ) : MethodOptions {
    override fun apiKeyRequired(): Boolean? = unwrap(this).getApiKeyRequired()

    override fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
        emptyList()

    override fun authorizationType(): AuthorizationType? =
        unwrap(this).getAuthorizationType()?.let(AuthorizationType::wrap)

    override fun authorizer(): IAuthorizer? = unwrap(this).getAuthorizer()?.let(IAuthorizer::wrap)

    override fun methodResponses(): List<MethodResponse> =
        unwrap(this).getMethodResponses()?.map(MethodResponse::wrap) ?: emptyList()

    override fun operationName(): String? = unwrap(this).getOperationName()

    override fun requestModels(): Map<String, IModel> =
        unwrap(this).getRequestModels()?.mapValues{IModel.wrap(it.value)} ?: emptyMap()

    override fun requestParameters(): Map<String, Boolean> = unwrap(this).getRequestParameters() ?:
        emptyMap()

    override fun requestValidator(): IRequestValidator? =
        unwrap(this).getRequestValidator()?.let(IRequestValidator::wrap)

    override fun requestValidatorOptions(): RequestValidatorOptions? =
        unwrap(this).getRequestValidatorOptions()?.let(RequestValidatorOptions::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): MethodOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.MethodOptions):
        MethodOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MethodOptions):
        software.amazon.awscdk.services.apigateway.MethodOptions = (wrapped as Wrapper).cdkObject
  }
}
