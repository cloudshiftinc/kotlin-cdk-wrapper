@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteAuthorizerBindOptions
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteAuthorizerConfig
import io.cloudshiftdev.awscdk.services.apigatewayv2.IHttpRouteAuthorizer
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Authorize Http Api routes on whether the requester is registered as part of an AWS Cognito user
 * pool.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizer;
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegration;
 * String issuer = "https://test.us.auth0.com";
 * HttpJwtAuthorizer authorizer = HttpJwtAuthorizer.Builder.create("BooksAuthorizer", issuer)
 * .jwtAudience(List.of("3131231"))
 * .build();
 * HttpApi api = new HttpApi(this, "HttpApi");
 * api.addRoutes(AddRoutesOptions.builder()
 * .integration(new HttpUrlIntegration("BooksIntegration", "https://get-books-proxy.example.com"))
 * .path("/books")
 * .authorizer(authorizer)
 * .build());
 * ```
 */
public open class HttpJwtAuthorizer(
  cdkObject: software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizer,
) : CdkObject(cdkObject),
    IHttpRouteAuthorizer {
  public constructor(
    id: String,
    jwtIssuer: String,
    props: HttpJwtAuthorizerProps,
  ) : this(software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizer(id, jwtIssuer,
      props.let(HttpJwtAuthorizerProps.Companion::unwrap))
  )

  public constructor(
    id: String,
    jwtIssuer: String,
    props: HttpJwtAuthorizerProps.Builder.() -> Unit,
  ) : this(id, jwtIssuer, HttpJwtAuthorizerProps(props)
  )

  /**
   * The authorizationType used for JWT Authorizer.
   */
  public open fun authorizationType(): String = unwrap(this).getAuthorizationType()

  /**
   * Return the id of the authorizer if it's been constructed.
   */
  public open fun authorizerId(): String = unwrap(this).getAuthorizerId()

  /**
   * Bind this authorizer to a specified Http route.
   *
   * @param options 
   */
  public override fun bind(options: HttpRouteAuthorizerBindOptions): HttpRouteAuthorizerConfig =
      unwrap(this).bind(options.let(HttpRouteAuthorizerBindOptions.Companion::unwrap)).let(HttpRouteAuthorizerConfig::wrap)

  /**
   * Bind this authorizer to a specified Http route.
   *
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7264f1d1173f23e66027e915fda55df480ab8eab246316ad2f01f98a1f9a28cc")
  public override fun bind(options: HttpRouteAuthorizerBindOptions.Builder.() -> Unit):
      HttpRouteAuthorizerConfig = bind(HttpRouteAuthorizerBindOptions(options))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the authorizer.
     *
     * Default: - same value as `id` passed in the constructor
     *
     * @param authorizerName The name of the authorizer. 
     */
    public fun authorizerName(authorizerName: String)

    /**
     * The identity source for which authorization is requested.
     *
     * Default: ['$request.header.Authorization']
     *
     * @param identitySource The identity source for which authorization is requested. 
     */
    public fun identitySource(identitySource: List<String>)

    /**
     * The identity source for which authorization is requested.
     *
     * Default: ['$request.header.Authorization']
     *
     * @param identitySource The identity source for which authorization is requested. 
     */
    public fun identitySource(vararg identitySource: String)

    /**
     * A list of the intended recipients of the JWT.
     *
     * A valid JWT must provide an aud that matches at least one entry in this list.
     *
     * @param jwtAudience A list of the intended recipients of the JWT. 
     */
    public fun jwtAudience(jwtAudience: List<String>)

    /**
     * A list of the intended recipients of the JWT.
     *
     * A valid JWT must provide an aud that matches at least one entry in this list.
     *
     * @param jwtAudience A list of the intended recipients of the JWT. 
     */
    public fun jwtAudience(vararg jwtAudience: String)
  }

  private class BuilderImpl(
    id: String,
    jwtIssuer: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizer.Builder =
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizer.Builder.create(id,
        jwtIssuer)

    /**
     * The name of the authorizer.
     *
     * Default: - same value as `id` passed in the constructor
     *
     * @param authorizerName The name of the authorizer. 
     */
    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    /**
     * The identity source for which authorization is requested.
     *
     * Default: ['$request.header.Authorization']
     *
     * @param identitySource The identity source for which authorization is requested. 
     */
    override fun identitySource(identitySource: List<String>) {
      cdkBuilder.identitySource(identitySource)
    }

    /**
     * The identity source for which authorization is requested.
     *
     * Default: ['$request.header.Authorization']
     *
     * @param identitySource The identity source for which authorization is requested. 
     */
    override fun identitySource(vararg identitySource: String): Unit =
        identitySource(identitySource.toList())

    /**
     * A list of the intended recipients of the JWT.
     *
     * A valid JWT must provide an aud that matches at least one entry in this list.
     *
     * @param jwtAudience A list of the intended recipients of the JWT. 
     */
    override fun jwtAudience(jwtAudience: List<String>) {
      cdkBuilder.jwtAudience(jwtAudience)
    }

    /**
     * A list of the intended recipients of the JWT.
     *
     * A valid JWT must provide an aud that matches at least one entry in this list.
     *
     * @param jwtAudience A list of the intended recipients of the JWT. 
     */
    override fun jwtAudience(vararg jwtAudience: String): Unit = jwtAudience(jwtAudience.toList())

    public fun build(): software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizer =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      id: String,
      jwtIssuer: String,
      block: Builder.() -> Unit = {},
    ): HttpJwtAuthorizer {
      val builderImpl = BuilderImpl(id, jwtIssuer)
      return HttpJwtAuthorizer(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizer):
        HttpJwtAuthorizer = HttpJwtAuthorizer(cdkObject)

    internal fun unwrap(wrapped: HttpJwtAuthorizer):
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizer = wrapped.cdkObject as
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizer
  }
}
