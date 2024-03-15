@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public open class ApiEventSource internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lambda.eventsources.ApiEventSource,
) : CdkObject(cdkObject), IEventSource {
  public override fun bind(target: IFunction) {
    unwrap(this).bind(target.let(IFunction::unwrap))
  }

  @CdkDslMarker
  public interface Builder {
    public fun apiKeyRequired(apiKeyRequired: Boolean)

    public fun authorizationScopes(authorizationScopes: List<String>)

    public fun authorizationScopes(vararg authorizationScopes: String)

    public fun authorizationType(authorizationType: AuthorizationType)

    public fun authorizer(authorizer: IAuthorizer)

    public fun methodResponses(methodResponses: List<MethodResponse>)

    public fun methodResponses(vararg methodResponses: MethodResponse)

    public fun operationName(operationName: String)

    public fun requestModels(requestModels: Map<String, IModel>)

    public fun requestParameters(requestParameters: Map<String, Boolean>)

    public fun requestValidator(requestValidator: IRequestValidator)

    public fun requestValidatorOptions(requestValidatorOptions: RequestValidatorOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

    override fun apiKeyRequired(apiKeyRequired: Boolean) {
      cdkBuilder.apiKeyRequired(apiKeyRequired)
    }

    override fun authorizationScopes(authorizationScopes: List<String>) {
      cdkBuilder.authorizationScopes(authorizationScopes)
    }

    override fun authorizationScopes(vararg authorizationScopes: String): Unit =
        authorizationScopes(authorizationScopes.toList())

    override fun authorizationType(authorizationType: AuthorizationType) {
      cdkBuilder.authorizationType(authorizationType.let(AuthorizationType::unwrap))
    }

    override fun authorizer(authorizer: IAuthorizer) {
      cdkBuilder.authorizer(authorizer.let(IAuthorizer::unwrap))
    }

    override fun methodResponses(methodResponses: List<MethodResponse>) {
      cdkBuilder.methodResponses(methodResponses.map(MethodResponse::unwrap))
    }

    override fun methodResponses(vararg methodResponses: MethodResponse): Unit =
        methodResponses(methodResponses.toList())

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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
