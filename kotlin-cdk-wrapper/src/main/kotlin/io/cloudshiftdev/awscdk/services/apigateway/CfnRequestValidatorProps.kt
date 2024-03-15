@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnRequestValidatorProps {
  public fun name(): String? = unwrap(this).getName()

  public fun restApiId(): String

  public fun validateRequestBody(): Any? = unwrap(this).getValidateRequestBody()

  public fun validateRequestParameters(): Any? = unwrap(this).getValidateRequestParameters()

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun restApiId(restApiId: String)

    public fun validateRequestBody(validateRequestBody: Boolean)

    public fun validateRequestBody(validateRequestBody: IResolvable)

    public fun validateRequestParameters(validateRequestParameters: Boolean)

    public fun validateRequestParameters(validateRequestParameters: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.CfnRequestValidatorProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnRequestValidatorProps.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    override fun validateRequestBody(validateRequestBody: Boolean) {
      cdkBuilder.validateRequestBody(validateRequestBody)
    }

    override fun validateRequestBody(validateRequestBody: IResolvable) {
      cdkBuilder.validateRequestBody(validateRequestBody.let(IResolvable::unwrap))
    }

    override fun validateRequestParameters(validateRequestParameters: Boolean) {
      cdkBuilder.validateRequestParameters(validateRequestParameters)
    }

    override fun validateRequestParameters(validateRequestParameters: IResolvable) {
      cdkBuilder.validateRequestParameters(validateRequestParameters.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnRequestValidatorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnRequestValidatorProps,
  ) : CdkObject(cdkObject), CfnRequestValidatorProps {
    override fun name(): String? = unwrap(this).getName()

    override fun restApiId(): String = unwrap(this).getRestApiId()

    override fun validateRequestBody(): Any? = unwrap(this).getValidateRequestBody()

    override fun validateRequestParameters(): Any? = unwrap(this).getValidateRequestParameters()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRequestValidatorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnRequestValidatorProps):
        CfnRequestValidatorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRequestValidatorProps):
        software.amazon.awscdk.services.apigateway.CfnRequestValidatorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnRequestValidatorProps
  }
}
