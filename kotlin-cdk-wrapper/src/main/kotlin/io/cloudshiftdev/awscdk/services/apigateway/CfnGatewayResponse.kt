@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGatewayResponse internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.CfnGatewayResponse,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun responseParameters(): Any? = unwrap(this).getResponseParameters()

  public open fun responseParameters(`value`: IResolvable) {
    unwrap(this).setResponseParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun responseParameters(`value`: Map<String, String>) {
    unwrap(this).setResponseParameters(`value`)
  }

  public open fun responseTemplates(): Any? = unwrap(this).getResponseTemplates()

  public open fun responseTemplates(`value`: IResolvable) {
    unwrap(this).setResponseTemplates(`value`.let(IResolvable::unwrap))
  }

  public open fun responseTemplates(`value`: Map<String, String>) {
    unwrap(this).setResponseTemplates(`value`)
  }

  public open fun responseType(): String = unwrap(this).getResponseType()

  public open fun responseType(`value`: String) {
    unwrap(this).setResponseType(`value`)
  }

  public open fun restApiId(): String = unwrap(this).getRestApiId()

  public open fun restApiId(`value`: String) {
    unwrap(this).setRestApiId(`value`)
  }

  public open fun statusCode(): String? = unwrap(this).getStatusCode()

  public open fun statusCode(`value`: String) {
    unwrap(this).setStatusCode(`value`)
  }

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnGatewayResponse.Builder =
        software.amazon.awscdk.services.apigateway.CfnGatewayResponse.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.apigateway.CfnGatewayResponse =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigateway.CfnGatewayResponse.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGatewayResponse {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGatewayResponse(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnGatewayResponse):
        CfnGatewayResponse = CfnGatewayResponse(cdkObject)

    internal fun unwrap(wrapped: CfnGatewayResponse):
        software.amazon.awscdk.services.apigateway.CfnGatewayResponse = wrapped.cdkObject
  }
}
