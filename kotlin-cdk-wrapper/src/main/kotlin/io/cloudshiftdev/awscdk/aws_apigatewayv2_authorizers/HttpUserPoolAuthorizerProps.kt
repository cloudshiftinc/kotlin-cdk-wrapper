@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cognito.IUserPoolClient
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties to initialize HttpUserPoolAuthorizer.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers.*;
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * UserPoolClient userPoolClient;
 * HttpUserPoolAuthorizerProps httpUserPoolAuthorizerProps = HttpUserPoolAuthorizerProps.builder()
 * .authorizerName("authorizerName")
 * .identitySource(List.of("identitySource"))
 * .userPoolClients(List.of(userPoolClient))
 * .userPoolRegion("userPoolRegion")
 * .build();
 * ```
 */
public interface HttpUserPoolAuthorizerProps {
  /**
   * Friendly name of the authorizer.
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
   * The user pool clients that should be used to authorize requests with the user pool.
   *
   * Default: - a new client will be created for the given user pool
   */
  public fun userPoolClients(): List<IUserPoolClient> =
      unwrap(this).getUserPoolClients()?.map(IUserPoolClient::wrap) ?: emptyList()

  /**
   * The AWS region in which the user pool is present.
   *
   * Default: - same region as the Route the authorizer is attached to.
   */
  public fun userPoolRegion(): String? = unwrap(this).getUserPoolRegion()

  /**
   * A builder for [HttpUserPoolAuthorizerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorizerName Friendly name of the authorizer.
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
     * @param userPoolClients The user pool clients that should be used to authorize requests with
     * the user pool.
     */
    public fun userPoolClients(userPoolClients: List<IUserPoolClient>)

    /**
     * @param userPoolClients The user pool clients that should be used to authorize requests with
     * the user pool.
     */
    public fun userPoolClients(vararg userPoolClients: IUserPoolClient)

    /**
     * @param userPoolRegion The AWS region in which the user pool is present.
     */
    public fun userPoolRegion(userPoolRegion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizerProps.Builder =
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizerProps.builder()

    /**
     * @param authorizerName Friendly name of the authorizer.
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
     * @param userPoolClients The user pool clients that should be used to authorize requests with
     * the user pool.
     */
    override fun userPoolClients(userPoolClients: List<IUserPoolClient>) {
      cdkBuilder.userPoolClients(userPoolClients.map(IUserPoolClient::unwrap))
    }

    /**
     * @param userPoolClients The user pool clients that should be used to authorize requests with
     * the user pool.
     */
    override fun userPoolClients(vararg userPoolClients: IUserPoolClient): Unit =
        userPoolClients(userPoolClients.toList())

    /**
     * @param userPoolRegion The AWS region in which the user pool is present.
     */
    override fun userPoolRegion(userPoolRegion: String) {
      cdkBuilder.userPoolRegion(userPoolRegion)
    }

    public fun build():
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizerProps,
  ) : CdkObject(cdkObject), HttpUserPoolAuthorizerProps {
    /**
     * Friendly name of the authorizer.
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
     * The user pool clients that should be used to authorize requests with the user pool.
     *
     * Default: - a new client will be created for the given user pool
     */
    override fun userPoolClients(): List<IUserPoolClient> =
        unwrap(this).getUserPoolClients()?.map(IUserPoolClient::wrap) ?: emptyList()

    /**
     * The AWS region in which the user pool is present.
     *
     * Default: - same region as the Route the authorizer is attached to.
     */
    override fun userPoolRegion(): String? = unwrap(this).getUserPoolRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpUserPoolAuthorizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizerProps):
        HttpUserPoolAuthorizerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpUserPoolAuthorizerProps):
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizerProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizerProps
  }
}
