@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteAuthorizerBindOptions
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteAuthorizerConfig
import io.cloudshiftdev.awscdk.services.apigatewayv2.IHttpRouteAuthorizer
import io.cloudshiftdev.awscdk.services.cognito.IUserPoolClient
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.awscdk.services.cognito.IUserPool as CloudshiftdevAwscdkServicesCognitoIUserPool
import software.amazon.awscdk.services.cognito.IUserPool as AmazonAwscdkServicesCognitoIUserPool

/**
 * Authorize Http Api routes on whether the requester is registered as part of an AWS Cognito user
 * pool.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizer;
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegration;
 * UserPool userPool = new UserPool(this, "UserPool");
 * HttpUserPoolAuthorizer authorizer = new HttpUserPoolAuthorizer("BooksAuthorizer", userPool);
 * HttpApi api = new HttpApi(this, "HttpApi");
 * api.addRoutes(AddRoutesOptions.builder()
 * .integration(new HttpUrlIntegration("BooksIntegration", "https://get-books-proxy.example.com"))
 * .path("/books")
 * .authorizer(authorizer)
 * .build());
 * ```
 */
public open class HttpUserPoolAuthorizer internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizer,
) : CdkObject(cdkObject), IHttpRouteAuthorizer {
  public constructor(id: String, pool: CloudshiftdevAwscdkServicesCognitoIUserPool) :
      this(software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizer(id,
      pool.let(CloudshiftdevAwscdkServicesCognitoIUserPool::unwrap))
  )

  public constructor(
    id: String,
    pool: CloudshiftdevAwscdkServicesCognitoIUserPool,
    props: HttpUserPoolAuthorizerProps,
  ) : this(software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizer(id,
      pool.let(CloudshiftdevAwscdkServicesCognitoIUserPool::unwrap),
      props.let(HttpUserPoolAuthorizerProps::unwrap))
  )

  public constructor(
    id: String,
    pool: CloudshiftdevAwscdkServicesCognitoIUserPool,
    props: HttpUserPoolAuthorizerProps.Builder.() -> Unit,
  ) : this(id, pool, HttpUserPoolAuthorizerProps(props)
  )

  /**
   * Bind this authorizer to a specified Http route.
   *
   * @param options 
   */
  public override fun bind(options: HttpRouteAuthorizerBindOptions): HttpRouteAuthorizerConfig =
      unwrap(this).bind(options.let(HttpRouteAuthorizerBindOptions::unwrap)).let(HttpRouteAuthorizerConfig::wrap)

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
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Friendly name of the authorizer.
     *
     * Default: - same value as `id` passed in the constructor
     *
     * @param authorizerName Friendly name of the authorizer. 
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
     * The user pool clients that should be used to authorize requests with the user pool.
     *
     * Default: - a new client will be created for the given user pool
     *
     * @param userPoolClients The user pool clients that should be used to authorize requests with
     * the user pool. 
     */
    public fun userPoolClients(userPoolClients: List<IUserPoolClient>)

    /**
     * The user pool clients that should be used to authorize requests with the user pool.
     *
     * Default: - a new client will be created for the given user pool
     *
     * @param userPoolClients The user pool clients that should be used to authorize requests with
     * the user pool. 
     */
    public fun userPoolClients(vararg userPoolClients: IUserPoolClient)

    /**
     * The AWS region in which the user pool is present.
     *
     * Default: - same region as the Route the authorizer is attached to.
     *
     * @param userPoolRegion The AWS region in which the user pool is present. 
     */
    public fun userPoolRegion(userPoolRegion: String)
  }

  private class BuilderImpl(
    id: String,
    pool: AmazonAwscdkServicesCognitoIUserPool,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizer.Builder =
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizer.Builder.create(id,
        pool)

    /**
     * Friendly name of the authorizer.
     *
     * Default: - same value as `id` passed in the constructor
     *
     * @param authorizerName Friendly name of the authorizer. 
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
     * The user pool clients that should be used to authorize requests with the user pool.
     *
     * Default: - a new client will be created for the given user pool
     *
     * @param userPoolClients The user pool clients that should be used to authorize requests with
     * the user pool. 
     */
    override fun userPoolClients(userPoolClients: List<IUserPoolClient>) {
      cdkBuilder.userPoolClients(userPoolClients.map(IUserPoolClient::unwrap))
    }

    /**
     * The user pool clients that should be used to authorize requests with the user pool.
     *
     * Default: - a new client will be created for the given user pool
     *
     * @param userPoolClients The user pool clients that should be used to authorize requests with
     * the user pool. 
     */
    override fun userPoolClients(vararg userPoolClients: IUserPoolClient): Unit =
        userPoolClients(userPoolClients.toList())

    /**
     * The AWS region in which the user pool is present.
     *
     * Default: - same region as the Route the authorizer is attached to.
     *
     * @param userPoolRegion The AWS region in which the user pool is present. 
     */
    override fun userPoolRegion(userPoolRegion: String) {
      cdkBuilder.userPoolRegion(userPoolRegion)
    }

    public fun build(): software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizer =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      id: String,
      pool: CloudshiftdevAwscdkServicesCognitoIUserPool,
      block: Builder.() -> Unit = {},
    ): HttpUserPoolAuthorizer {
      val builderImpl = BuilderImpl(id, CloudshiftdevAwscdkServicesCognitoIUserPool.unwrap(pool))
      return HttpUserPoolAuthorizer(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizer):
        HttpUserPoolAuthorizer = HttpUserPoolAuthorizer(cdkObject)

    internal fun unwrap(wrapped: HttpUserPoolAuthorizer):
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizer =
        wrapped.cdkObject
  }
}
