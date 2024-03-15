@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties to initialize HttpJwtAuthorizer.
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
public interface HttpJwtAuthorizerProps {
  /**
   * The name of the authorizer.
   *
   * Default: - same value as `id` passed in the constructor
   */
  public fun authorizerName(): String? = unwrap(this).getAuthorizerName()

  /**
   * The identity source for which authorization is requested.
   *
   * Default: ['$request.header.Authorization']
   */
  public fun identitySource(): List<String> = unwrap(this).getIdentitySource() ?: emptyList()

  /**
   * A list of the intended recipients of the JWT.
   *
   * A valid JWT must provide an aud that matches at least one entry in this list.
   */
  public fun jwtAudience(): List<String>

  /**
   * A builder for [HttpJwtAuthorizerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorizerName The name of the authorizer.
     */
    public fun authorizerName(authorizerName: String)

    /**
     * @param identitySource The identity source for which authorization is requested.
     */
    public fun identitySource(identitySource: List<String>)

    /**
     * @param identitySource The identity source for which authorization is requested.
     */
    public fun identitySource(vararg identitySource: String)

    /**
     * @param jwtAudience A list of the intended recipients of the JWT. 
     * A valid JWT must provide an aud that matches at least one entry in this list.
     */
    public fun jwtAudience(jwtAudience: List<String>)

    /**
     * @param jwtAudience A list of the intended recipients of the JWT. 
     * A valid JWT must provide an aud that matches at least one entry in this list.
     */
    public fun jwtAudience(vararg jwtAudience: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizerProps.Builder =
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizerProps.builder()

    /**
     * @param authorizerName The name of the authorizer.
     */
    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    /**
     * @param identitySource The identity source for which authorization is requested.
     */
    override fun identitySource(identitySource: List<String>) {
      cdkBuilder.identitySource(identitySource)
    }

    /**
     * @param identitySource The identity source for which authorization is requested.
     */
    override fun identitySource(vararg identitySource: String): Unit =
        identitySource(identitySource.toList())

    /**
     * @param jwtAudience A list of the intended recipients of the JWT. 
     * A valid JWT must provide an aud that matches at least one entry in this list.
     */
    override fun jwtAudience(jwtAudience: List<String>) {
      cdkBuilder.jwtAudience(jwtAudience)
    }

    /**
     * @param jwtAudience A list of the intended recipients of the JWT. 
     * A valid JWT must provide an aud that matches at least one entry in this list.
     */
    override fun jwtAudience(vararg jwtAudience: String): Unit = jwtAudience(jwtAudience.toList())

    public fun build(): software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizerProps,
  ) : CdkObject(cdkObject), HttpJwtAuthorizerProps {
    /**
     * The name of the authorizer.
     *
     * Default: - same value as `id` passed in the constructor
     */
    override fun authorizerName(): String? = unwrap(this).getAuthorizerName()

    /**
     * The identity source for which authorization is requested.
     *
     * Default: ['$request.header.Authorization']
     */
    override fun identitySource(): List<String> = unwrap(this).getIdentitySource() ?: emptyList()

    /**
     * A list of the intended recipients of the JWT.
     *
     * A valid JWT must provide an aud that matches at least one entry in this list.
     */
    override fun jwtAudience(): List<String> = unwrap(this).getJwtAudience()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpJwtAuthorizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizerProps):
        HttpJwtAuthorizerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpJwtAuthorizerProps):
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizerProps
  }
}
