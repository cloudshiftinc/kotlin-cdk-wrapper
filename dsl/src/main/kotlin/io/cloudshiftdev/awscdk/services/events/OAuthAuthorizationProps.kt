package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface OAuthAuthorizationProps {
  /**
   * The URL to the authorization endpoint.
   */
  public fun authorizationEndpoint(): String

  /**
   * Additional string parameters to add to the OAuth request body.
   *
   * Default: - No additional parameters
   */
  public fun bodyParameters(): Map<String, HttpParameter> =
      unwrap(this).getBodyParameters()?.mapValues{HttpParameter.wrap(it.value)} ?: emptyMap()

  /**
   * The client ID to use for OAuth authorization for the connection.
   */
  public fun clientId(): String

  /**
   * The client secret associated with the client ID to use for OAuth authorization for the
   * connection.
   */
  public fun clientSecret(): SecretValue

  /**
   * Additional string parameters to add to the OAuth request header.
   *
   * Default: - No additional parameters
   */
  public fun headerParameters(): Map<String, HttpParameter> =
      unwrap(this).getHeaderParameters()?.mapValues{HttpParameter.wrap(it.value)} ?: emptyMap()

  /**
   * The method to use for the authorization request.
   *
   * (Can only choose POST, GET or PUT).
   */
  public fun httpMethod(): HttpMethod

  /**
   * Additional string parameters to add to the OAuth request query string.
   *
   * Default: - No additional parameters
   */
  public fun queryStringParameters(): Map<String, HttpParameter> =
      unwrap(this).getQueryStringParameters()?.mapValues{HttpParameter.wrap(it.value)} ?: emptyMap()

  /**
   * A builder for [OAuthAuthorizationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorizationEndpoint The URL to the authorization endpoint. 
     */
    public fun authorizationEndpoint(authorizationEndpoint: String)

    /**
     * @param bodyParameters Additional string parameters to add to the OAuth request body.
     */
    public fun bodyParameters(bodyParameters: Map<String, HttpParameter>)

    /**
     * @param clientId The client ID to use for OAuth authorization for the connection. 
     */
    public fun clientId(clientId: String)

    /**
     * @param clientSecret The client secret associated with the client ID to use for OAuth
     * authorization for the connection. 
     */
    public fun clientSecret(clientSecret: SecretValue)

    /**
     * @param headerParameters Additional string parameters to add to the OAuth request header.
     */
    public fun headerParameters(headerParameters: Map<String, HttpParameter>)

    /**
     * @param httpMethod The method to use for the authorization request. 
     * (Can only choose POST, GET or PUT).
     */
    public fun httpMethod(httpMethod: HttpMethod)

    /**
     * @param queryStringParameters Additional string parameters to add to the OAuth request query
     * string.
     */
    public fun queryStringParameters(queryStringParameters: Map<String, HttpParameter>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.OAuthAuthorizationProps.Builder =
        software.amazon.awscdk.services.events.OAuthAuthorizationProps.builder()

    /**
     * @param authorizationEndpoint The URL to the authorization endpoint. 
     */
    override fun authorizationEndpoint(authorizationEndpoint: String) {
      cdkBuilder.authorizationEndpoint(authorizationEndpoint)
    }

    /**
     * @param bodyParameters Additional string parameters to add to the OAuth request body.
     */
    override fun bodyParameters(bodyParameters: Map<String, HttpParameter>) {
      cdkBuilder.bodyParameters(bodyParameters.mapValues{HttpParameter.unwrap(it.value)})
    }

    /**
     * @param clientId The client ID to use for OAuth authorization for the connection. 
     */
    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    /**
     * @param clientSecret The client secret associated with the client ID to use for OAuth
     * authorization for the connection. 
     */
    override fun clientSecret(clientSecret: SecretValue) {
      cdkBuilder.clientSecret(clientSecret.let(SecretValue::unwrap))
    }

    /**
     * @param headerParameters Additional string parameters to add to the OAuth request header.
     */
    override fun headerParameters(headerParameters: Map<String, HttpParameter>) {
      cdkBuilder.headerParameters(headerParameters.mapValues{HttpParameter.unwrap(it.value)})
    }

    /**
     * @param httpMethod The method to use for the authorization request. 
     * (Can only choose POST, GET or PUT).
     */
    override fun httpMethod(httpMethod: HttpMethod) {
      cdkBuilder.httpMethod(httpMethod.let(HttpMethod::unwrap))
    }

    /**
     * @param queryStringParameters Additional string parameters to add to the OAuth request query
     * string.
     */
    override fun queryStringParameters(queryStringParameters: Map<String, HttpParameter>) {
      cdkBuilder.queryStringParameters(queryStringParameters.mapValues{HttpParameter.unwrap(it.value)})
    }

    public fun build(): software.amazon.awscdk.services.events.OAuthAuthorizationProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.events.OAuthAuthorizationProps,
  ) : OAuthAuthorizationProps {
    /**
     * The URL to the authorization endpoint.
     */
    override fun authorizationEndpoint(): String = unwrap(this).getAuthorizationEndpoint()

    /**
     * Additional string parameters to add to the OAuth request body.
     *
     * Default: - No additional parameters
     */
    override fun bodyParameters(): Map<String, HttpParameter> =
        unwrap(this).getBodyParameters()?.mapValues{HttpParameter.wrap(it.value)} ?: emptyMap()

    /**
     * The client ID to use for OAuth authorization for the connection.
     */
    override fun clientId(): String = unwrap(this).getClientId()

    /**
     * The client secret associated with the client ID to use for OAuth authorization for the
     * connection.
     */
    override fun clientSecret(): SecretValue = unwrap(this).getClientSecret().let(SecretValue::wrap)

    /**
     * Additional string parameters to add to the OAuth request header.
     *
     * Default: - No additional parameters
     */
    override fun headerParameters(): Map<String, HttpParameter> =
        unwrap(this).getHeaderParameters()?.mapValues{HttpParameter.wrap(it.value)} ?: emptyMap()

    /**
     * The method to use for the authorization request.
     *
     * (Can only choose POST, GET or PUT).
     */
    override fun httpMethod(): HttpMethod = unwrap(this).getHttpMethod().let(HttpMethod::wrap)

    /**
     * Additional string parameters to add to the OAuth request query string.
     *
     * Default: - No additional parameters
     */
    override fun queryStringParameters(): Map<String, HttpParameter> =
        unwrap(this).getQueryStringParameters()?.mapValues{HttpParameter.wrap(it.value)} ?:
        emptyMap()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): OAuthAuthorizationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.OAuthAuthorizationProps):
        OAuthAuthorizationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OAuthAuthorizationProps):
        software.amazon.awscdk.services.events.OAuthAuthorizationProps = (wrapped as
        Wrapper).cdkObject
  }
}
