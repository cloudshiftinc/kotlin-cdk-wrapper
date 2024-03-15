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

public open class HttpUserPoolAuthorizer internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizer,
) : CdkObject(cdkObject), IHttpRouteAuthorizer {
  public override fun bind(options: HttpRouteAuthorizerBindOptions): HttpRouteAuthorizerConfig =
      unwrap(this).bind(options.let(HttpRouteAuthorizerBindOptions::unwrap)).let(HttpRouteAuthorizerConfig::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7264f1d1173f23e66027e915fda55df480ab8eab246316ad2f01f98a1f9a28cc")
  public override fun bind(options: HttpRouteAuthorizerBindOptions.Builder.() -> Unit):
      HttpRouteAuthorizerConfig = bind(HttpRouteAuthorizerBindOptions(options))

  @CdkDslMarker
  public interface Builder {
    public fun authorizerName(authorizerName: String)

    public fun identitySource(identitySource: List<String>)

    public fun identitySource(vararg identitySource: String)

    public fun userPoolClients(userPoolClients: List<IUserPoolClient>)

    public fun userPoolClients(vararg userPoolClients: IUserPoolClient)

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

    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    override fun identitySource(identitySource: List<String>) {
      cdkBuilder.identitySource(identitySource)
    }

    override fun identitySource(vararg identitySource: String): Unit =
        identitySource(identitySource.toList())

    override fun userPoolClients(userPoolClients: List<IUserPoolClient>) {
      cdkBuilder.userPoolClients(userPoolClients.map(IUserPoolClient::unwrap))
    }

    override fun userPoolClients(vararg userPoolClients: IUserPoolClient): Unit =
        userPoolClients(userPoolClients.toList())

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
