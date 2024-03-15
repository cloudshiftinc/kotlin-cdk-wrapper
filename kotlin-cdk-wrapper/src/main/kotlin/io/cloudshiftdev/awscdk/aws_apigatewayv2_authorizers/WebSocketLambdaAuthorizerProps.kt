@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface WebSocketLambdaAuthorizerProps {
  public fun authorizerName(): String? = unwrap(this).getAuthorizerName()

  public fun identitySource(): List<String> = unwrap(this).getIdentitySource() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun authorizerName(authorizerName: String)

    public fun identitySource(identitySource: List<String>)

    public fun identitySource(vararg identitySource: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizerProps.Builder =
        software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizerProps.builder()

    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    override fun identitySource(identitySource: List<String>) {
      cdkBuilder.identitySource(identitySource)
    }

    override fun identitySource(vararg identitySource: String): Unit =
        identitySource(identitySource.toList())

    public fun build():
        software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizerProps,
  ) : CdkObject(cdkObject), WebSocketLambdaAuthorizerProps {
    override fun authorizerName(): String? = unwrap(this).getAuthorizerName()

    override fun identitySource(): List<String> = unwrap(this).getIdentitySource() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WebSocketLambdaAuthorizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizerProps):
        WebSocketLambdaAuthorizerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketLambdaAuthorizerProps):
        software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizerProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizerProps
  }
}
