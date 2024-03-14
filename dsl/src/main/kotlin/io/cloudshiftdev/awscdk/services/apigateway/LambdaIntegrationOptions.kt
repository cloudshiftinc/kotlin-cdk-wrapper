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
    public fun allowTestInvoke(allowTestInvoke: Boolean) {
    }

    public fun cacheKeyParameters(cacheKeyParameters: List<String>) {
    }

    public fun cacheNamespace(cacheNamespace: String) {
    }

    public fun connectionType(connectionType: ConnectionType) {
    }

    public fun contentHandling(contentHandling: ContentHandling) {
    }

    public fun credentialsPassthrough(credentialsPassthrough: Boolean) {
    }

    public fun credentialsRole(credentialsRole: IRole) {
    }

    public fun integrationResponses(integrationResponses: List<IntegrationResponse>) {
    }

    public fun passthroughBehavior(passthroughBehavior: PassthroughBehavior) {
    }

    public fun proxy(proxy: Boolean) {
    }

    public fun requestParameters(requestParameters: Map<String, String>) {
    }

    public fun requestTemplates(requestTemplates: Map<String, String>) {
    }

    public fun timeout(timeout: Duration) {
    }

    public fun vpcLink(vpcLink: IVpcLink) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions.Builder =
        software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions.builder()

    public override fun allowTestInvoke(allowTestInvoke: Boolean) {
      cdkBuilder.allowTestInvoke(allowTestInvoke)
    }

    public override fun cacheKeyParameters(cacheKeyParameters: List<String>) {
      cdkBuilder.cacheKeyParameters(cacheKeyParameters)
    }

    public override fun cacheNamespace(cacheNamespace: String) {
      cdkBuilder.cacheNamespace(cacheNamespace)
    }

    public override fun connectionType(connectionType: ConnectionType) {
      cdkBuilder.connectionType(connectionType.let(ConnectionType::unwrap))
    }

    public override fun contentHandling(contentHandling: ContentHandling) {
      cdkBuilder.contentHandling(contentHandling.let(ContentHandling::unwrap))
    }

    public override fun credentialsPassthrough(credentialsPassthrough: Boolean) {
      cdkBuilder.credentialsPassthrough(credentialsPassthrough)
    }

    public override fun credentialsRole(credentialsRole: IRole) {
      cdkBuilder.credentialsRole(credentialsRole.let(IRole::unwrap))
    }

    public override fun integrationResponses(integrationResponses: List<IntegrationResponse>) {
      cdkBuilder.integrationResponses(integrationResponses.map(IntegrationResponse::unwrap))
    }

    public override fun passthroughBehavior(passthroughBehavior: PassthroughBehavior) {
      cdkBuilder.passthroughBehavior(passthroughBehavior.let(PassthroughBehavior::unwrap))
    }

    public override fun proxy(proxy: Boolean) {
      cdkBuilder.proxy(proxy)
    }

    public override fun requestParameters(requestParameters: Map<String, String>) {
      cdkBuilder.requestParameters(requestParameters)
    }

    public override fun requestTemplates(requestTemplates: Map<String, String>) {
      cdkBuilder.requestTemplates(requestTemplates)
    }

    public override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public override fun vpcLink(vpcLink: IVpcLink) {
      cdkBuilder.vpcLink(vpcLink.let(IVpcLink::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions,
  ) : LambdaIntegrationOptions {
    public override fun allowTestInvoke(): Boolean? = unwrap(this).getAllowTestInvoke()

    public override fun cacheKeyParameters(): List<String> = unwrap(this).getCacheKeyParameters() ?:
        emptyList()

    public override fun cacheNamespace(): String? = unwrap(this).getCacheNamespace()

    public override fun connectionType(): ConnectionType? =
        unwrap(this).getConnectionType()?.let(ConnectionType::wrap)

    public override fun contentHandling(): ContentHandling? =
        unwrap(this).getContentHandling()?.let(ContentHandling::wrap)

    public override fun credentialsPassthrough(): Boolean? =
        unwrap(this).getCredentialsPassthrough()

    public override fun credentialsRole(): IRole? =
        unwrap(this).getCredentialsRole()?.let(IRole::wrap)

    public override fun integrationResponses(): List<IntegrationResponse> =
        unwrap(this).getIntegrationResponses()?.map(IntegrationResponse::wrap) ?: emptyList()

    public override fun passthroughBehavior(): PassthroughBehavior? =
        unwrap(this).getPassthroughBehavior()?.let(PassthroughBehavior::wrap)

    public override fun proxy(): Boolean? = unwrap(this).getProxy()

    public override fun requestParameters(): Map<String, String> =
        unwrap(this).getRequestParameters() ?: emptyMap()

    public override fun requestTemplates(): Map<String, String> = unwrap(this).getRequestTemplates()
        ?: emptyMap()

    public override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    public override fun vpcLink(): IVpcLink? = unwrap(this).getVpcLink()?.let(IVpcLink::wrap)
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
