@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface StepFunctionsExecutionIntegrationOptions : IntegrationOptions {
  public fun authorizer(): Boolean? = unwrap(this).getAuthorizer()

  public fun headers(): Boolean? = unwrap(this).getHeaders()

  public fun path(): Boolean? = unwrap(this).getPath()

  public fun querystring(): Boolean? = unwrap(this).getQuerystring()

  public fun requestContext(): RequestContext? =
      unwrap(this).getRequestContext()?.let(RequestContext::wrap)

  public fun useDefaultMethodResponses(): Boolean? = unwrap(this).getUseDefaultMethodResponses()

  @CdkDslMarker
  public interface Builder {
    public fun authorizer(authorizer: Boolean)

    public fun cacheKeyParameters(cacheKeyParameters: List<String>)

    public fun cacheKeyParameters(vararg cacheKeyParameters: String)

    public fun cacheNamespace(cacheNamespace: String)

    public fun connectionType(connectionType: ConnectionType)

    public fun contentHandling(contentHandling: ContentHandling)

    public fun credentialsPassthrough(credentialsPassthrough: Boolean)

    public fun credentialsRole(credentialsRole: IRole)

    public fun headers(headers: Boolean)

    public fun integrationResponses(integrationResponses: List<IntegrationResponse>)

    public fun integrationResponses(vararg integrationResponses: IntegrationResponse)

    public fun passthroughBehavior(passthroughBehavior: PassthroughBehavior)

    public fun path(path: Boolean)

    public fun querystring(querystring: Boolean)

    public fun requestContext(requestContext: RequestContext)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0a283ac1399fd6cdf4573ac3d8efb4c70df15df9273c4c8493a5e9a97fbcbe46")
    public fun requestContext(requestContext: RequestContext.Builder.() -> Unit)

    public fun requestParameters(requestParameters: Map<String, String>)

    public fun requestTemplates(requestTemplates: Map<String, String>)

    public fun timeout(timeout: Duration)

    public fun useDefaultMethodResponses(useDefaultMethodResponses: Boolean)

    public fun vpcLink(vpcLink: IVpcLink)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.StepFunctionsExecutionIntegrationOptions.Builder
        =
        software.amazon.awscdk.services.apigateway.StepFunctionsExecutionIntegrationOptions.builder()

    override fun authorizer(authorizer: Boolean) {
      cdkBuilder.authorizer(authorizer)
    }

    override fun cacheKeyParameters(cacheKeyParameters: List<String>) {
      cdkBuilder.cacheKeyParameters(cacheKeyParameters)
    }

    override fun cacheKeyParameters(vararg cacheKeyParameters: String): Unit =
        cacheKeyParameters(cacheKeyParameters.toList())

    override fun cacheNamespace(cacheNamespace: String) {
      cdkBuilder.cacheNamespace(cacheNamespace)
    }

    override fun connectionType(connectionType: ConnectionType) {
      cdkBuilder.connectionType(connectionType.let(ConnectionType::unwrap))
    }

    override fun contentHandling(contentHandling: ContentHandling) {
      cdkBuilder.contentHandling(contentHandling.let(ContentHandling::unwrap))
    }

    override fun credentialsPassthrough(credentialsPassthrough: Boolean) {
      cdkBuilder.credentialsPassthrough(credentialsPassthrough)
    }

    override fun credentialsRole(credentialsRole: IRole) {
      cdkBuilder.credentialsRole(credentialsRole.let(IRole::unwrap))
    }

    override fun headers(headers: Boolean) {
      cdkBuilder.headers(headers)
    }

    override fun integrationResponses(integrationResponses: List<IntegrationResponse>) {
      cdkBuilder.integrationResponses(integrationResponses.map(IntegrationResponse::unwrap))
    }

    override fun integrationResponses(vararg integrationResponses: IntegrationResponse): Unit =
        integrationResponses(integrationResponses.toList())

    override fun passthroughBehavior(passthroughBehavior: PassthroughBehavior) {
      cdkBuilder.passthroughBehavior(passthroughBehavior.let(PassthroughBehavior::unwrap))
    }

    override fun path(path: Boolean) {
      cdkBuilder.path(path)
    }

    override fun querystring(querystring: Boolean) {
      cdkBuilder.querystring(querystring)
    }

    override fun requestContext(requestContext: RequestContext) {
      cdkBuilder.requestContext(requestContext.let(RequestContext::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0a283ac1399fd6cdf4573ac3d8efb4c70df15df9273c4c8493a5e9a97fbcbe46")
    override fun requestContext(requestContext: RequestContext.Builder.() -> Unit): Unit =
        requestContext(RequestContext(requestContext))

    override fun requestParameters(requestParameters: Map<String, String>) {
      cdkBuilder.requestParameters(requestParameters)
    }

    override fun requestTemplates(requestTemplates: Map<String, String>) {
      cdkBuilder.requestTemplates(requestTemplates)
    }

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    override fun useDefaultMethodResponses(useDefaultMethodResponses: Boolean) {
      cdkBuilder.useDefaultMethodResponses(useDefaultMethodResponses)
    }

    override fun vpcLink(vpcLink: IVpcLink) {
      cdkBuilder.vpcLink(vpcLink.let(IVpcLink::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.apigateway.StepFunctionsExecutionIntegrationOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.apigateway.StepFunctionsExecutionIntegrationOptions,
  ) : CdkObject(cdkObject), StepFunctionsExecutionIntegrationOptions {
    override fun authorizer(): Boolean? = unwrap(this).getAuthorizer()

    override fun cacheKeyParameters(): List<String> = unwrap(this).getCacheKeyParameters() ?:
        emptyList()

    override fun cacheNamespace(): String? = unwrap(this).getCacheNamespace()

    override fun connectionType(): ConnectionType? =
        unwrap(this).getConnectionType()?.let(ConnectionType::wrap)

    override fun contentHandling(): ContentHandling? =
        unwrap(this).getContentHandling()?.let(ContentHandling::wrap)

    override fun credentialsPassthrough(): Boolean? = unwrap(this).getCredentialsPassthrough()

    override fun credentialsRole(): IRole? = unwrap(this).getCredentialsRole()?.let(IRole::wrap)

    override fun headers(): Boolean? = unwrap(this).getHeaders()

    override fun integrationResponses(): List<IntegrationResponse> =
        unwrap(this).getIntegrationResponses()?.map(IntegrationResponse::wrap) ?: emptyList()

    override fun passthroughBehavior(): PassthroughBehavior? =
        unwrap(this).getPassthroughBehavior()?.let(PassthroughBehavior::wrap)

    override fun path(): Boolean? = unwrap(this).getPath()

    override fun querystring(): Boolean? = unwrap(this).getQuerystring()

    override fun requestContext(): RequestContext? =
        unwrap(this).getRequestContext()?.let(RequestContext::wrap)

    override fun requestParameters(): Map<String, String> = unwrap(this).getRequestParameters() ?:
        emptyMap()

    override fun requestTemplates(): Map<String, String> = unwrap(this).getRequestTemplates() ?:
        emptyMap()

    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    override fun useDefaultMethodResponses(): Boolean? = unwrap(this).getUseDefaultMethodResponses()

    override fun vpcLink(): IVpcLink? = unwrap(this).getVpcLink()?.let(IVpcLink::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        StepFunctionsExecutionIntegrationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.StepFunctionsExecutionIntegrationOptions):
        StepFunctionsExecutionIntegrationOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StepFunctionsExecutionIntegrationOptions):
        software.amazon.awscdk.services.apigateway.StepFunctionsExecutionIntegrationOptions =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.apigateway.StepFunctionsExecutionIntegrationOptions
  }
}
