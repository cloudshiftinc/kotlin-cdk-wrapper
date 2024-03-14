package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface LambdaIntegrationOptions : IntegrationOptions {
  public fun allowTestInvoke(): Boolean? = unwrap(this).getAllowTestInvoke()

  public fun proxy(): Boolean? = unwrap(this).getProxy()

  public interface Builder {
    public fun allowTestInvoke(allowTestInvoke: Boolean)

    public fun cacheKeyParameters(cacheKeyParameters: List<String>)

    public fun cacheNamespace(cacheNamespace: String)

    public fun connectionType(connectionType: ConnectionType)

    public fun contentHandling(contentHandling: ContentHandling)

    public fun credentialsPassthrough(credentialsPassthrough: Boolean)

    public fun credentialsRole(credentialsRole: IRole)

    public fun integrationResponses(integrationResponses: List<IntegrationResponse>)

    public fun passthroughBehavior(passthroughBehavior: PassthroughBehavior)

    public fun proxy(proxy: Boolean)

    public fun requestParameters(requestParameters: Map<String, String>)

    public fun requestTemplates(requestTemplates: Map<String, String>)

    public fun timeout(timeout: Duration)

    public fun vpcLink(vpcLink: IVpcLink)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions.Builder =
        software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions.builder()

    override fun allowTestInvoke(allowTestInvoke: Boolean) {
      cdkBuilder.allowTestInvoke(allowTestInvoke)
    }

    override fun cacheKeyParameters(cacheKeyParameters: List<String>) {
      cdkBuilder.cacheKeyParameters(cacheKeyParameters)
    }

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

    override fun integrationResponses(integrationResponses: List<IntegrationResponse>) {
      cdkBuilder.integrationResponses(integrationResponses.map(IntegrationResponse::unwrap))
    }

    override fun passthroughBehavior(passthroughBehavior: PassthroughBehavior) {
      cdkBuilder.passthroughBehavior(passthroughBehavior.let(PassthroughBehavior::unwrap))
    }

    override fun proxy(proxy: Boolean) {
      cdkBuilder.proxy(proxy)
    }

    override fun requestParameters(requestParameters: Map<String, String>) {
      cdkBuilder.requestParameters(requestParameters)
    }

    override fun requestTemplates(requestTemplates: Map<String, String>) {
      cdkBuilder.requestTemplates(requestTemplates)
    }

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    override fun vpcLink(vpcLink: IVpcLink) {
      cdkBuilder.vpcLink(vpcLink.let(IVpcLink::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions,
  ) : LambdaIntegrationOptions {
    override fun allowTestInvoke(): Boolean? = unwrap(this).getAllowTestInvoke()

    override fun cacheKeyParameters(): List<String> = unwrap(this).getCacheKeyParameters() ?:
        emptyList()

    override fun cacheNamespace(): String? = unwrap(this).getCacheNamespace()

    override fun connectionType(): ConnectionType? =
        unwrap(this).getConnectionType()?.let(ConnectionType::wrap)

    override fun contentHandling(): ContentHandling? =
        unwrap(this).getContentHandling()?.let(ContentHandling::wrap)

    override fun credentialsPassthrough(): Boolean? = unwrap(this).getCredentialsPassthrough()

    override fun credentialsRole(): IRole? = unwrap(this).getCredentialsRole()?.let(IRole::wrap)

    override fun integrationResponses(): List<IntegrationResponse> =
        unwrap(this).getIntegrationResponses()?.map(IntegrationResponse::wrap) ?: emptyList()

    override fun passthroughBehavior(): PassthroughBehavior? =
        unwrap(this).getPassthroughBehavior()?.let(PassthroughBehavior::wrap)

    override fun proxy(): Boolean? = unwrap(this).getProxy()

    override fun requestParameters(): Map<String, String> = unwrap(this).getRequestParameters() ?:
        emptyMap()

    override fun requestTemplates(): Map<String, String> = unwrap(this).getRequestTemplates() ?:
        emptyMap()

    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    override fun vpcLink(): IVpcLink? = unwrap(this).getVpcLink()?.let(IVpcLink::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaIntegrationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions):
        LambdaIntegrationOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaIntegrationOptions):
        software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions = (wrapped as
        Wrapper).cdkObject
  }
}
