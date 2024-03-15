@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface HttpAuthorizerProps {
  public fun authorizerName(): String? = unwrap(this).getAuthorizerName()

  public fun authorizerUri(): String? = unwrap(this).getAuthorizerUri()

  public fun enableSimpleResponses(): Boolean? = unwrap(this).getEnableSimpleResponses()

  public fun httpApi(): IHttpApi

  public fun identitySource(): List<String>

  public fun jwtAudience(): List<String> = unwrap(this).getJwtAudience() ?: emptyList()

  public fun jwtIssuer(): String? = unwrap(this).getJwtIssuer()

  public fun payloadFormatVersion(): AuthorizerPayloadVersion? =
      unwrap(this).getPayloadFormatVersion()?.let(AuthorizerPayloadVersion::wrap)

  public fun resultsCacheTtl(): Duration? = unwrap(this).getResultsCacheTtl()?.let(Duration::wrap)

  public fun type(): HttpAuthorizerType

  @CdkDslMarker
  public interface Builder {
    public fun authorizerName(authorizerName: String)

    public fun authorizerUri(authorizerUri: String)

    public fun enableSimpleResponses(enableSimpleResponses: Boolean)

    public fun httpApi(httpApi: IHttpApi)

    public fun identitySource(identitySource: List<String>)

    public fun identitySource(vararg identitySource: String)

    public fun jwtAudience(jwtAudience: List<String>)

    public fun jwtAudience(vararg jwtAudience: String)

    public fun jwtIssuer(jwtIssuer: String)

    public fun payloadFormatVersion(payloadFormatVersion: AuthorizerPayloadVersion)

    public fun resultsCacheTtl(resultsCacheTtl: Duration)

    public fun type(type: HttpAuthorizerType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerProps.Builder
        = software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerProps.builder()

    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    override fun authorizerUri(authorizerUri: String) {
      cdkBuilder.authorizerUri(authorizerUri)
    }

    override fun enableSimpleResponses(enableSimpleResponses: Boolean) {
      cdkBuilder.enableSimpleResponses(enableSimpleResponses)
    }

    override fun httpApi(httpApi: IHttpApi) {
      cdkBuilder.httpApi(httpApi.let(IHttpApi::unwrap))
    }

    override fun identitySource(identitySource: List<String>) {
      cdkBuilder.identitySource(identitySource)
    }

    override fun identitySource(vararg identitySource: String): Unit =
        identitySource(identitySource.toList())

    override fun jwtAudience(jwtAudience: List<String>) {
      cdkBuilder.jwtAudience(jwtAudience)
    }

    override fun jwtAudience(vararg jwtAudience: String): Unit = jwtAudience(jwtAudience.toList())

    override fun jwtIssuer(jwtIssuer: String) {
      cdkBuilder.jwtIssuer(jwtIssuer)
    }

    override fun payloadFormatVersion(payloadFormatVersion: AuthorizerPayloadVersion) {
      cdkBuilder.payloadFormatVersion(payloadFormatVersion.let(AuthorizerPayloadVersion::unwrap))
    }

    override fun resultsCacheTtl(resultsCacheTtl: Duration) {
      cdkBuilder.resultsCacheTtl(resultsCacheTtl.let(Duration::unwrap))
    }

    override fun type(type: HttpAuthorizerType) {
      cdkBuilder.type(type.let(HttpAuthorizerType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerProps,
  ) : CdkObject(cdkObject), HttpAuthorizerProps {
    override fun authorizerName(): String? = unwrap(this).getAuthorizerName()

    override fun authorizerUri(): String? = unwrap(this).getAuthorizerUri()

    override fun enableSimpleResponses(): Boolean? = unwrap(this).getEnableSimpleResponses()

    override fun httpApi(): IHttpApi = unwrap(this).getHttpApi().let(IHttpApi::wrap)

    override fun identitySource(): List<String> = unwrap(this).getIdentitySource()

    override fun jwtAudience(): List<String> = unwrap(this).getJwtAudience() ?: emptyList()

    override fun jwtIssuer(): String? = unwrap(this).getJwtIssuer()

    override fun payloadFormatVersion(): AuthorizerPayloadVersion? =
        unwrap(this).getPayloadFormatVersion()?.let(AuthorizerPayloadVersion::wrap)

    override fun resultsCacheTtl(): Duration? =
        unwrap(this).getResultsCacheTtl()?.let(Duration::wrap)

    override fun type(): HttpAuthorizerType = unwrap(this).getType().let(HttpAuthorizerType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpAuthorizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerProps):
        HttpAuthorizerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpAuthorizerProps):
        software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerProps
  }
}
