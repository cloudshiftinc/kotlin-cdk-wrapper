@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public open class MockIntegration internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.MockIntegration,
) : Integration(cdkObject) {
  @CdkDslMarker
  public interface Builder {
    public fun cacheKeyParameters(cacheKeyParameters: List<String>)

    public fun cacheKeyParameters(vararg cacheKeyParameters: String)

    public fun cacheNamespace(cacheNamespace: String)

    public fun connectionType(connectionType: ConnectionType)

    public fun contentHandling(contentHandling: ContentHandling)

    public fun credentialsPassthrough(credentialsPassthrough: Boolean)

    public fun credentialsRole(credentialsRole: IRole)

    public fun integrationResponses(integrationResponses: List<IntegrationResponse>)

    public fun integrationResponses(vararg integrationResponses: IntegrationResponse)

    public fun passthroughBehavior(passthroughBehavior: PassthroughBehavior)

    public fun requestParameters(requestParameters: Map<String, String>)

    public fun requestTemplates(requestTemplates: Map<String, String>)

    public fun timeout(timeout: Duration)

    public fun vpcLink(vpcLink: IVpcLink)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.MockIntegration.Builder =
        software.amazon.awscdk.services.apigateway.MockIntegration.Builder.create()

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

    override fun integrationResponses(integrationResponses: List<IntegrationResponse>) {
      cdkBuilder.integrationResponses(integrationResponses.map(IntegrationResponse::unwrap))
    }

    override fun integrationResponses(vararg integrationResponses: IntegrationResponse): Unit =
        integrationResponses(integrationResponses.toList())

    override fun passthroughBehavior(passthroughBehavior: PassthroughBehavior) {
      cdkBuilder.passthroughBehavior(passthroughBehavior.let(PassthroughBehavior::unwrap))
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

    public fun build(): software.amazon.awscdk.services.apigateway.MockIntegration =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MockIntegration {
      val builderImpl = BuilderImpl()
      return MockIntegration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.MockIntegration):
        MockIntegration = MockIntegration(cdkObject)

    internal fun unwrap(wrapped: MockIntegration):
        software.amazon.awscdk.services.apigateway.MockIntegration = wrapped.cdkObject
  }
}
