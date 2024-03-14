package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class RequestValidator internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.RequestValidator,
) : Resource(cdkObject), IRequestValidator {
  /**
   * ID of the request validator, such as abc123.
   */
  public override fun requestValidatorId(): String = unwrap(this).getRequestValidatorId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.RequestValidator].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of this request validator.
     *
     * Default: None
     *
     * @param requestValidatorName The name of this request validator. 
     */
    public fun requestValidatorName(requestValidatorName: String)

    /**
     * The rest API that this model is part of.
     *
     * The reason we need the RestApi object itself and not just the ID is because the model
     * is being tracked by the top-level RestApi object for the purpose of calculating it's
     * hash to determine the ID of the deployment. This allows us to automatically update
     * the deployment when the model of the REST API changes.
     *
     * @param restApi The rest API that this model is part of. 
     */
    public fun restApi(restApi: IRestApi)

    /**
     * Indicates whether to validate the request body according to the configured schema for the
     * targeted API and method.
     *
     * Default: false
     *
     * @param validateRequestBody Indicates whether to validate the request body according to the
     * configured schema for the targeted API and method. 
     */
    public fun validateRequestBody(validateRequestBody: Boolean)

    /**
     * Indicates whether to validate request parameters.
     *
     * Default: false
     *
     * @param validateRequestParameters Indicates whether to validate request parameters. 
     */
    public fun validateRequestParameters(validateRequestParameters: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.RequestValidator.Builder =
        software.amazon.awscdk.services.apigateway.RequestValidator.Builder.create(scope, id)

    /**
     * The name of this request validator.
     *
     * Default: None
     *
     * @param requestValidatorName The name of this request validator. 
     */
    override fun requestValidatorName(requestValidatorName: String) {
      cdkBuilder.requestValidatorName(requestValidatorName)
    }

    /**
     * The rest API that this model is part of.
     *
     * The reason we need the RestApi object itself and not just the ID is because the model
     * is being tracked by the top-level RestApi object for the purpose of calculating it's
     * hash to determine the ID of the deployment. This allows us to automatically update
     * the deployment when the model of the REST API changes.
     *
     * @param restApi The rest API that this model is part of. 
     */
    override fun restApi(restApi: IRestApi) {
      cdkBuilder.restApi(restApi.let(IRestApi::unwrap))
    }

    /**
     * Indicates whether to validate the request body according to the configured schema for the
     * targeted API and method.
     *
     * Default: false
     *
     * @param validateRequestBody Indicates whether to validate the request body according to the
     * configured schema for the targeted API and method. 
     */
    override fun validateRequestBody(validateRequestBody: Boolean) {
      cdkBuilder.validateRequestBody(validateRequestBody)
    }

    /**
     * Indicates whether to validate request parameters.
     *
     * Default: false
     *
     * @param validateRequestParameters Indicates whether to validate request parameters. 
     */
    override fun validateRequestParameters(validateRequestParameters: Boolean) {
      cdkBuilder.validateRequestParameters(validateRequestParameters)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.RequestValidator =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromRequestValidatorId(
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
