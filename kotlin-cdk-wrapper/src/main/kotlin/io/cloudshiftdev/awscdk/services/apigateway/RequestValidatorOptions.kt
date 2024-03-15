@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface RequestValidatorOptions {
  public fun requestValidatorName(): String? = unwrap(this).getRequestValidatorName()

  public fun validateRequestBody(): Boolean? = unwrap(this).getValidateRequestBody()

  public fun validateRequestParameters(): Boolean? = unwrap(this).getValidateRequestParameters()

  @CdkDslMarker
  public interface Builder {
    public fun requestValidatorName(requestValidatorName: String)

    public fun validateRequestBody(validateRequestBody: Boolean)

    public fun validateRequestParameters(validateRequestParameters: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.RequestValidatorOptions.Builder =
        software.amazon.awscdk.services.apigateway.RequestValidatorOptions.builder()

    override fun requestValidatorName(requestValidatorName: String) {
      cdkBuilder.requestValidatorName(requestValidatorName)
    }

    override fun validateRequestBody(validateRequestBody: Boolean) {
      cdkBuilder.validateRequestBody(validateRequestBody)
    }

    override fun validateRequestParameters(validateRequestParameters: Boolean) {
      cdkBuilder.validateRequestParameters(validateRequestParameters)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.RequestValidatorOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.RequestValidatorOptions,
  ) : CdkObject(cdkObject), RequestValidatorOptions {
    override fun requestValidatorName(): String? = unwrap(this).getRequestValidatorName()

    override fun validateRequestBody(): Boolean? = unwrap(this).getValidateRequestBody()

    override fun validateRequestParameters(): Boolean? = unwrap(this).getValidateRequestParameters()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RequestValidatorOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.RequestValidatorOptions):
        RequestValidatorOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RequestValidatorOptions):
        software.amazon.awscdk.services.apigateway.RequestValidatorOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.RequestValidatorOptions
  }
}
