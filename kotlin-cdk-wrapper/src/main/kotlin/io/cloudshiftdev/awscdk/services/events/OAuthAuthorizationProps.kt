@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface OAuthAuthorizationProps {
  public fun authorizationEndpoint(): String

  public fun bodyParameters(): Map<String, HttpParameter> =
      unwrap(this).getBodyParameters()?.mapValues{HttpParameter.wrap(it.value)} ?: emptyMap()

  public fun clientId(): String

  public fun clientSecret(): SecretValue

  public fun headerParameters(): Map<String, HttpParameter> =
      unwrap(this).getHeaderParameters()?.mapValues{HttpParameter.wrap(it.value)} ?: emptyMap()

  public fun httpMethod(): HttpMethod

  public fun queryStringParameters(): Map<String, HttpParameter> =
      unwrap(this).getQueryStringParameters()?.mapValues{HttpParameter.wrap(it.value)} ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun authorizationEndpoint(authorizationEndpoint: String)

    public fun bodyParameters(bodyParameters: Map<String, HttpParameter>)

    public fun clientId(clientId: String)

    public fun clientSecret(clientSecret: SecretValue)

    public fun headerParameters(headerParameters: Map<String, HttpParameter>)

    public fun httpMethod(httpMethod: HttpMethod)

    public fun queryStringParameters(queryStringParameters: Map<String, HttpParameter>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.OAuthAuthorizationProps.Builder =
        software.amazon.awscdk.services.events.OAuthAuthorizationProps.builder()

    override fun authorizationEndpoint(authorizationEndpoint: String) {
      cdkBuilder.authorizationEndpoint(authorizationEndpoint)
    }

    override fun bodyParameters(bodyParameters: Map<String, HttpParameter>) {
      cdkBuilder.bodyParameters(bodyParameters.mapValues{HttpParameter.unwrap(it.value)})
    }

    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    override fun clientSecret(clientSecret: SecretValue) {
      cdkBuilder.clientSecret(clientSecret.let(SecretValue::unwrap))
    }

    override fun headerParameters(headerParameters: Map<String, HttpParameter>) {
      cdkBuilder.headerParameters(headerParameters.mapValues{HttpParameter.unwrap(it.value)})
    }

    override fun httpMethod(httpMethod: HttpMethod) {
      cdkBuilder.httpMethod(httpMethod.let(HttpMethod::unwrap))
    }

    override fun queryStringParameters(queryStringParameters: Map<String, HttpParameter>) {
      cdkBuilder.queryStringParameters(queryStringParameters.mapValues{HttpParameter.unwrap(it.value)})
    }

    public fun build(): software.amazon.awscdk.services.events.OAuthAuthorizationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.OAuthAuthorizationProps,
  ) : CdkObject(cdkObject), OAuthAuthorizationProps {
    override fun authorizationEndpoint(): String = unwrap(this).getAuthorizationEndpoint()

    override fun bodyParameters(): Map<String, HttpParameter> =
        unwrap(this).getBodyParameters()?.mapValues{HttpParameter.wrap(it.value)} ?: emptyMap()

    override fun clientId(): String = unwrap(this).getClientId()

    override fun clientSecret(): SecretValue = unwrap(this).getClientSecret().let(SecretValue::wrap)

    override fun headerParameters(): Map<String, HttpParameter> =
        unwrap(this).getHeaderParameters()?.mapValues{HttpParameter.wrap(it.value)} ?: emptyMap()

    override fun httpMethod(): HttpMethod = unwrap(this).getHttpMethod().let(HttpMethod::wrap)

    override fun queryStringParameters(): Map<String, HttpParameter> =
        unwrap(this).getQueryStringParameters()?.mapValues{HttpParameter.wrap(it.value)} ?:
        emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OAuthAuthorizationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.OAuthAuthorizationProps):
        OAuthAuthorizationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OAuthAuthorizationProps):
        software.amazon.awscdk.services.events.OAuthAuthorizationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.OAuthAuthorizationProps
  }
}
