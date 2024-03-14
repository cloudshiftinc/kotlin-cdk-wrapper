package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class RequestValidator internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.RequestValidator,
) : Resource(cdkObject), IRequestValidator {
  public override fun requestValidatorId(): String = unwrap(this).getRequestValidatorId()

  public interface Builder {
    public fun requestValidatorName(requestValidatorName: String) {
    }

    public fun restApi(restApi: IRestApi) {
    }

    public fun validateRequestBody(validateRequestBody: Boolean) {
    }

    public fun validateRequestParameters(validateRequestParameters: Boolean) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.RequestValidator.Builder =
        software.amazon.awscdk.services.apigateway.RequestValidator.Builder.create(scope, id)

    public override fun requestValidatorName(requestValidatorName: String) {
      cdkBuilder.requestValidatorName(requestValidatorName)
    }

    public override fun restApi(restApi: IRestApi) {
      cdkBuilder.restApi(restApi.let(IRestApi::unwrap))
    }

    public override fun validateRequestBody(validateRequestBody: Boolean) {
      cdkBuilder.validateRequestBody(validateRequestBody)
    }

    public override fun validateRequestParameters(validateRequestParameters: Boolean) {
      cdkBuilder.validateRequestParameters(validateRequestParameters)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.RequestValidator =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromRequestValidatorId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      requestValidatorId: String,
    ): IRequestValidator =
        software.amazon.awscdk.services.apigateway.RequestValidator.fromRequestValidatorId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, requestValidatorId).let(IRequestValidator::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): RequestValidator {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return RequestValidator(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.RequestValidator):
        RequestValidator = RequestValidator(cdkObject)

    internal fun unwrap(wrapped: RequestValidator):
        software.amazon.awscdk.services.apigateway.RequestValidator = wrapped.cdkObject
  }
}
