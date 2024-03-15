@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnGatewayResponseProps {
  public fun responseParameters(): Any? = unwrap(this).getResponseParameters()

  public fun responseTemplates(): Any? = unwrap(this).getResponseTemplates()

  public fun responseType(): String

  public fun restApiId(): String

  public fun statusCode(): String? = unwrap(this).getStatusCode()

  @CdkDslMarker
  public interface Builder {
    public fun responseParameters(responseParameters: IResolvable)

    public fun responseParameters(responseParameters: Map<String, String>)

    public fun responseTemplates(responseTemplates: IResolvable)

    public fun responseTemplates(responseTemplates: Map<String, String>)

    public fun responseType(responseType: String)

    public fun restApiId(restApiId: String)

    public fun statusCode(statusCode: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.CfnGatewayResponseProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnGatewayResponseProps.builder()

    override fun responseParameters(responseParameters: IResolvable) {
      cdkBuilder.responseParameters(responseParameters.let(IResolvable::unwrap))
    }

    override fun responseParameters(responseParameters: Map<String, String>) {
      cdkBuilder.responseParameters(responseParameters)
    }

    override fun responseTemplates(responseTemplates: IResolvable) {
      cdkBuilder.responseTemplates(responseTemplates.let(IResolvable::unwrap))
    }

    override fun responseTemplates(responseTemplates: Map<String, String>) {
      cdkBuilder.responseTemplates(responseTemplates)
    }

    override fun responseType(responseType: String) {
      cdkBuilder.responseType(responseType)
    }

    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    override fun statusCode(statusCode: String) {
      cdkBuilder.statusCode(statusCode)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnGatewayResponseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnGatewayResponseProps,
  ) : CdkObject(cdkObject), CfnGatewayResponseProps {
    override fun responseParameters(): Any? = unwrap(this).getResponseParameters()

    override fun responseTemplates(): Any? = unwrap(this).getResponseTemplates()

    override fun responseType(): String = unwrap(this).getResponseType()

    override fun restApiId(): String = unwrap(this).getRestApiId()

    override fun statusCode(): String? = unwrap(this).getStatusCode()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGatewayResponseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnGatewayResponseProps):
        CfnGatewayResponseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGatewayResponseProps):
        software.amazon.awscdk.services.apigateway.CfnGatewayResponseProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnGatewayResponseProps
  }
}
