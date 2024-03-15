@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface RequestValidatorProps : RequestValidatorOptions {
  public fun restApi(): IRestApi

  @CdkDslMarker
  public interface Builder {
    public fun requestValidatorName(requestValidatorName: String)

    public fun restApi(restApi: IRestApi)

    public fun validateRequestBody(validateRequestBody: Boolean)

    public fun validateRequestParameters(validateRequestParameters: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.RequestValidatorProps.Builder
        = software.amazon.awscdk.services.apigateway.RequestValidatorProps.builder()

    override fun requestValidatorName(requestValidatorName: String) {
      cdkBuilder.requestValidatorName(requestValidatorName)
    }

    override fun restApi(restApi: IRestApi) {
      cdkBuilder.restApi(restApi.let(IRestApi::unwrap))
    }

    override fun validateRequestBody(validateRequestBody: Boolean) {
      cdkBuilder.validateRequestBody(validateRequestBody)
    }

    override fun validateRequestParameters(validateRequestParameters: Boolean) {
      cdkBuilder.validateRequestParameters(validateRequestParameters)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.RequestValidatorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.RequestValidatorProps,
  ) : CdkObject(cdkObject), RequestValidatorProps {
    override fun requestValidatorName(): String? = unwrap(this).getRequestValidatorName()

    override fun restApi(): IRestApi = unwrap(this).getRestApi().let(IRestApi::wrap)

    override fun validateRequestBody(): Boolean? = unwrap(this).getValidateRequestBody()

    override fun validateRequestParameters(): Boolean? = unwrap(this).getValidateRequestParameters()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RequestValidatorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.RequestValidatorProps):
        RequestValidatorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RequestValidatorProps):
        software.amazon.awscdk.services.apigateway.RequestValidatorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.RequestValidatorProps
  }
}
