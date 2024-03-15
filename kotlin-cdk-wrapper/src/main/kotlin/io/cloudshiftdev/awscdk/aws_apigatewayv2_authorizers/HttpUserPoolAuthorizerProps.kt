@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cognito.IUserPoolClient
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface HttpUserPoolAuthorizerProps {
  public fun authorizerName(): String? = unwrap(this).getAuthorizerName()

  public fun identitySource(): List<String> = unwrap(this).getIdentitySource() ?: emptyList()

  public fun userPoolClients(): List<IUserPoolClient> =
      unwrap(this).getUserPoolClients()?.map(IUserPoolClient::wrap) ?: emptyList()

  public fun userPoolRegion(): String? = unwrap(this).getUserPoolRegion()

  @CdkDslMarker
  public interface Builder {
    public fun authorizerName(authorizerName: String)

    public fun identitySource(identitySource: List<String>)

    public fun identitySource(vararg identitySource: String)

    public fun userPoolClients(userPoolClients: List<IUserPoolClient>)

    public fun userPoolClients(vararg userPoolClients: IUserPoolClient)

    public fun userPoolRegion(userPoolRegion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizerProps.Builder =
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizerProps.builder()

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

    public fun build():
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizerProps,
  ) : CdkObject(cdkObject), HttpUserPoolAuthorizerProps {
    override fun authorizerName(): String? = unwrap(this).getAuthorizerName()

    override fun identitySource(): List<String> = unwrap(this).getIdentitySource() ?: emptyList()

    override fun userPoolClients(): List<IUserPoolClient> =
        unwrap(this).getUserPoolClients()?.map(IUserPoolClient::wrap) ?: emptyList()

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
